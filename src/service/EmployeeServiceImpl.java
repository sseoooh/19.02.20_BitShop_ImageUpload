package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import domain.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService{
	
	private static EmployeeServiceImpl instance = new EmployeeServiceImpl();
	private EmployeeServiceImpl() {dao = EmployeeDAOImpl.getInstance();}	
	public static EmployeeServiceImpl getInstance() {return instance;}
	EmployeeDAO dao;

	@Override
	public void registEmployee(EmployeeDTO emp) {
		dao.insertEmployee(emp);
	}

	@Override
	public List<EmployeeDTO> bringEmployeeList() {
		return dao.selectEmployeeList();
	}

	@Override
	public List<EmployeeDTO> retrieveEmployeesByName(String SearchWord) {
		return dao.selectEmployeesByName(SearchWord);
	}

	@Override
	public EmployeeDTO retrieveEmployee(String SearchWord) {
		return dao.selectEmployee(SearchWord);
	}

	@Override
	public int countEmployees() {
		return 0;
	}

	@Override
	public boolean existsEmployee(EmployeeDTO emp) {
		return dao.existEmployee(emp);
	}

	@Override
	public void modifyEmployee(EmployeeDTO emp) {
		
	}

	@Override
	public void removeEmployee(EmployeeDTO emp) {
		
	}

}
