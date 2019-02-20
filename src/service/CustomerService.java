package service;

import java.util.List;
import java.util.Map;

import domain.CustomerDTO;
import proxy.Proxy;


public interface CustomerService {
	//C
	public void registCustomer(CustomerDTO emp);
	//R
	public List<CustomerDTO> bringCustomerList(Proxy pxy);
	public List<CustomerDTO> retrieveCustomerByName(Proxy pxy);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public int countCustomer(Proxy pxy);
	public boolean existsCustomer(Proxy pxy);
	//U
	public void modifyCustomer(CustomerDTO emp);
	public Map<String,Object> fileUpload(Proxy pxy);
	//D
	public void removeCustomer(CustomerDTO emp);
	public Map<String, Object> retrievePhone(Proxy pxy);
	
}
