package ch12.address;

import java.util.Map;

public interface Address { 
	public void insertAddress(String tel, AddressVO vo)throws DuplicationException; 
	public AddressVO readAddress(String tel); // key
	public Map<String, AddressVO> listAddress();
	public Map<String, AddressVO> listAddress(String name);
	public boolean deleteAddress(String tel);
}
