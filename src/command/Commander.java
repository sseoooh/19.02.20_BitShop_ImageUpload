package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import enums.Action;
import proxy.Proxy;
import proxy.RequestProxy;

public class Commander {
	
	public static Command order(Map<String,Proxy> pxy) {
		System.out.println(":::(5)Commander지나감:::");
		Command cmd = null;
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		
		
		case MOVE:
			System.out.println("커맨더안에 move를 탐");
			cmd = new Command(pxy);
			break;
		case REGISTER : case SIGNUP :	
			System.out.println("커맨더안에 REGISTER를 탐");
			cmd = new CreateCommand(pxy);
			break;
		case ACCESS : case SIGNIN :		
			System.out.println("커맨더안에 ACCESS와 SIGNIN을 탐");
			cmd = new ExistCommand(pxy);
			break;
		case CUS_LIST:
			System.out.println("커맨더안에 CUS_LIST를 탐");
			cmd = new ListCommand(pxy);
			break;
		case CUS_RETRIEVE:
			System.out.println("커맨더안에 CUS_CUS_RETRIEVE를 탐");
			cmd = new RetrieveCommand(pxy);
			break;
		case CUS_UPDATE:
			System.out.println("커맨더안에 CUS_UPDATE를 탐");
			cmd = new UpdateCommand(pxy);
			break;
		case CUST_FILE_UPLOAD:
			System.out.println("커맨더안에 CUST_FILE_UPLOAD를 탐");
			cmd = new FileCommand(pxy);
			break;
		default: System.out.println("디폴트찍힘");
			break;
		}
		
		return cmd;
	}
}
