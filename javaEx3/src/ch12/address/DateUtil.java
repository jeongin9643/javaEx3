package ch12.address;

import java.util.Calendar;


public class DateUtil {
	/**
	 * 날짜형식이 올바른지 판별
	 * @param date	날짜형식을 판별할 문자열
	 * @return		형식이 올바른지 여부(true/false)
	 */
	public boolean isValidDate(String date) {

		try {
			if(date.length() != 8 && date.length() != 10) {
				return false;	// date 길이가 8이 아니고 10이 아니면  false
			}
			date = date.replaceAll("(\\-|\\.|\\/)", "");
			if(date.length() != 8) {	// 부호를 없앤 후 8이 아니면 false
				return false;
			}
			int y = Integer.parseInt(date.substring(0,4));
			int m = Integer.parseInt(date.substring(4,6));
			int d = Integer.parseInt(date.substring(6));
			
			Calendar cal = Calendar.getInstance();
			cal.set(y, m-1,d);
//			System.out.println(m-1);
			
			int y1 = cal.get(Calendar.YEAR);
			int m1 = cal.get(Calendar.MONTH)+1;
			int d1 = cal.get(Calendar.DATE);
//			System.out.println(Calendar.MONTH);
			if(y != y1 || m !=m1 || d != d1) {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}

		return true;
	}

}