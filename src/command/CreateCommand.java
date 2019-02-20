package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import proxy.Proxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(Map<String,Proxy> pxy) {
		
		super(pxy);
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case REGISTER:		
		EmployeeDTO emp = new EmployeeDTO();
		emp.setBirthDate(request.getParameter("birthday"));
		emp.setName(request.getParameter("name"));
		emp.setEmployeeID(request.getParameter("employeeID"));
		emp.setManager(request.getParameter("manager"));
		emp.setNotes(request.getParameter("notes"));
		emp.setPhoto(request.getParameter("photo"));			
		EmployeeServiceImpl.getInstance().registEmployee(emp);//싱글톤
		break;
				
		case SIGNUP:
		CustomerDTO cus = new CustomerDTO();
		cus.setCustomerID(request.getParameter("customerID"));
		cus.setCustomerName(request.getParameter("customerName"));
		cus.setPassword(request.getParameter("password"));
		cus.setAddress(request.getParameter("address"));
		cus.setCity(request.getParameter("city"));
		cus.setPostalcode(request.getParameter("postalcode"));
		cus.setSsn(request.getParameter("ssn"));
		CustomerServiceImpl.getInstance().registCustomer(cus);
		break;
		
		default:
			break;
			
		}
	} 
}
