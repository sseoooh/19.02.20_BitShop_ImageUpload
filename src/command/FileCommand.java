package command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ImageDTO;
import enums.Action;
import proxy.ImageProxy;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class FileCommand extends Command {

	public FileCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_FILE_UPLOAD :
			System.out.println("파일커맨드 파일업로드 진입");
			ImageProxy ipxy = new ImageProxy();
			ipxy.carryOut(request);
			
			
			
			String customerID = ipxy.getImg().getOwner();
			System.out.println("이게뭔데2??????????????????????????????????????????????"+customerID);
			
			// 1.파일업로드한 이미지를 insert해야함
			// 2.커스터머안에 photo에 대표이미지를 방금 인서트한 이미지로 바꿔야한다
			// 단 default_photo이미지로 되어있는 것 이미지의 seq 값으로 바꾼다
			// 3. 이후 고객의 정보
			// 4. 이미지에서 seq 에 따른 이미지 정보 두개를 가져온다
			Map<String, Object> map = CustomerServiceImpl.getInstance().fileUpload(ipxy);
			System.out.println("::::::::::::::img2:::::::::::::::::"+map.put("image", map.get("image")));
			System.out.println("::::::::::::::cus2:::::::::::::::::"+map.put("cus", map.get("cus")));
			request.setAttribute("cus", map.get("cus"));
			request.setAttribute("image", map.get("image"));
			break;
		default :
			break;
			}
		
		}
	}

