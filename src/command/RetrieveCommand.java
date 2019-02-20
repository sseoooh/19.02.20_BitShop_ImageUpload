package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ImageDTO;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class RetrieveCommand extends Command{
	
	public RetrieveCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
			Proxy paging = new Pagination();
			paging.carryOut(request);
			Proxy pagePxy = new PageProxy();
			pagePxy.carryOut(paging);		
			CustomerDTO cus = new CustomerDTO();
			ImageDTO image= new ImageDTO();
			cus.setCustomerID(request.getParameter("customerID"));
			cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
			System.out.println("RetrieveCommand내부"+request.getParameter("customerID"));
			request.setAttribute("cus", cus);
			request.setAttribute("image", image);
			
	}
}
	