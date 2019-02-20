package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import domain.CustomerDTO;
import proxy.Proxy;

public class CustomerServiceImpl implements CustomerService{
	
	private static CustomerServiceImpl instance = new CustomerServiceImpl();
	CustomerDAO dao;
	private CustomerServiceImpl() {
		dao = CustomerDAOImpl.getInstance();
	}
	public static CustomerServiceImpl getInstance() {return instance;}

	@Override
	public void registCustomer(CustomerDTO cus) {
		dao.insertCustomer(cus);
	}

	@Override
	public List<CustomerDTO> bringCustomerList(Proxy pxy) {
		return dao.selectCustomerList(pxy);
	}

	@Override
	public List<CustomerDTO> retrieveCustomerByName(Proxy pxy) {
		List<CustomerDTO> list = new ArrayList<>();
		return list;
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		CustomerDTO cdto = dao.selectCustomer(cus);
		return cdto;
	}

	@Override
	public int countCustomer(Proxy pxy) {
		
		return dao.countCustomer(pxy);
	}

	@Override
	public boolean existsCustomer(Proxy pxy) {
		boolean ok = false;
		return ok;
	}

	@Override
	public void modifyCustomer(CustomerDTO cus) {
		dao.updateCustomer(cus);
	}

	@Override
	public void removeCustomer(CustomerDTO cus) {
		
	}
	@Override
	public Map<String, Object> retrievePhone(Proxy pxy) {
		return dao.selectPhone(pxy);
	}
	@Override
	public Map<String,Object> fileUpload(Proxy pxy) {
		return dao.selectProfile(pxy);
	}


}
