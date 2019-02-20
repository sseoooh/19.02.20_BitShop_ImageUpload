package service;

import java.util.List;

import domain.EmployeeDTO;

public interface EmployeeService {
	//C
	public void registEmployee(EmployeeDTO emp);
	//R
	public List<EmployeeDTO> bringEmployeeList();
	public List<EmployeeDTO> retrieveEmployeesByName(String SearchWord);
	public EmployeeDTO retrieveEmployee(String SearchWord);
	public int countEmployees();
	public boolean existsEmployee(EmployeeDTO emp);
	//U
	public void modifyEmployee(EmployeeDTO emp);
	//D
	public void removeEmployee(EmployeeDTO emp);
}
