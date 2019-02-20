package proxy;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;

@Data
public class RequestProxy implements Proxy{
	private HttpServletRequest request;
	@Override
	public void carryOut(Object o) {
		System.out.println(":::(3)RequestProxy지나감");
		if((HttpServletRequest) o != null) {
			System.out.println("RequestProxy에서 o가 널아님");
			setRequest((HttpServletRequest)o);
		}else {
			System.out.println("RequestProxy에서 o가 널");
		}
	}

}
