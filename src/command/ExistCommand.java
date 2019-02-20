package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import proxy.PageProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command{
	public ExistCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		
		HttpSession session = request.getSession();
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		
		case ACCESS:
			System.out.println("ExistCommand안에 ACCESS를 탐");	
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getInstance().existsEmployee(emp);
			if(exist) {
				System.out.println("접근 허용:::::::::::"+exist);
				Proxy paging = new Pagination();
				paging.carryOut(request);
				Proxy pagePxy = new PageProxy();
				pagePxy.carryOut(paging);				
				List<CustomerDTO> list = CustomerServiceImpl
						.getInstance()
						.bringCustomerList(pagePxy);
				/*System.out.println("접근허용뜨고난뒤 list값"+list.size());	
				System.out.println("가장최근에 가입한 회원"+list.get(0).getCustomerName());*/	
				request.setAttribute("list", list);
				request.setAttribute("pagination", paging);
			}else {
				System.out.println("접근 불가");
				super.setDomain("home");
				super.setPage("main");
				super.execute();
			}
			break;
		
			case SIGNIN:
				System.out.println("existCommand에 SIGNIN을 탐");
				CustomerDTO cus = new CustomerDTO();
				cus.setCustomerID(request.getParameter("customerID"));
				cus.setPassword(request.getParameter("password"));
				cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
				
				if(cus != null) {
					System.out.println("로그인 성공");
					session.setAttribute("customer", cus);
				}else {
					System.out.println("로그인 실패");
					super.setDomain("customer");
					super.setPage("signin");
					super.execute();
				}
				break;
				
		default :
			break;
		}
	}
}




















































/*public ExistCommand(HttpServletRequest request,
		HttpServletResponse response) {
	super(request, response);
	EmployeeDTO emp = new EmployeeDTO();
	emp.setEmployeeID(request.getParameter("empno"));
	emp.setName(request.getParameter("name"));
	boolean exist = EmployeeServiceImpl.getInstance().existsEmployee(emp);
	if(exist) {
		System.out.println("접근허용");
	}else {
		System.out.println("접근불가");
	}
}*/