package proxy;

import javax.servlet.http.HttpServletResponse;
import lombok.Data;

@Data
public class ResponseProxy implements Proxy{
	private HttpServletResponse response;
	@Override
	public void carryOut(Object o) {
		System.out.println(":::(4)ResponseProxy지나감:::");
		System.out.println("ResponseProxy에서 o가 널아님");
		setResponse((HttpServletResponse)o);
		
	}
}
