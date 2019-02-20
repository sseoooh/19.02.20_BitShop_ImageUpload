package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import dao.CustomerDAOImpl;
import domain.CustomerDTO;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class UpdateCommand extends Command{
	public UpdateCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		
		String customerID = request.getParameter("customer_id");
		CustomerDTO cus = new CustomerDTO();
		cus.setCustomerID(customerID);
		System.out.println("******************"+customerID);
		cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
		System.out.println("수정하기전 회원정보:::::::::::::::::::::::::::::::::::::::::"+cus.toString());
		if(!request.getParameter("phone").equals(""))
			cus.setPhone(request.getParameter("phone"));
		if(!request.getParameter("city").equals(""))
			cus.setCity(request.getParameter("city"));
		if(!request.getParameter("address").equals(""))
			cus.setAddress(request.getParameter("address"));
		if(!request.getParameter("postal_code").equals(""))
			cus.setPostalcode(request.getParameter("postal_code"));
		if(!request.getParameter("password").equals(""))
			cus.setPassword(request.getParameter("password"));
		System.out.println("수정하려는 회원정보::::::"+cus.toString());
		
		CustomerServiceImpl.getInstance().modifyCustomer(cus);
	}		
		
}
