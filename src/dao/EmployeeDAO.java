package dao;

import java.util.List;

import domain.EmployeeDTO;

public interface EmployeeDAO {	
		public void insertEmployee(EmployeeDTO emp);
		public List<EmployeeDTO> selectEmployeeList();
		public List<EmployeeDTO> selectEmployeesByName(String SearchWord);
		public EmployeeDTO selectEmployee(String SearchWord);
		public int countEmployees();
		public boolean existEmployee(EmployeeDTO emp);
		public void updateEmployee(EmployeeDTO emp);
		public void deleteEmployee(EmployeeDTO emp);
	}


