package proxy;
import javax.servlet.http.HttpServletRequest;

import command.Receiver;
import lombok.Data;
import service.CustomerServiceImpl;

@Data
public class Pagination implements Proxy{
	
	private int pageNum, pageSize, blockSize,
			startRow, endRow, startPage, endPage,
			prevBlock, nextBlock, rowCount;
	private boolean existPrev, existNext;
	
	@Override
	public void carryOut(Object o) {
		System.out.println("Pagination CarryOut 내부");
		HttpServletRequest request = (HttpServletRequest)o;
		
		String _pageNum = request.getParameter("page_num");
		pageNum = (_pageNum == null) ? 1 : Integer.parseInt(_pageNum);
		System.out.println("Pagination안에 페이지넘버"+pageNum);
		
		String _pageSize = request.getParameter("page_size");
		pageSize = (_pageSize == null) ? 5 : Integer.parseInt(_pageSize);
		System.out.println("Pagination안에 페이지사이즈"+pageSize);
				
		rowCount = CustomerServiceImpl.getInstance().countCustomer(null);
		System.out.println("전체카운트::::"+rowCount);
		
		int pageCount = rowCount / pageSize;//페이지
		System.out.println("전체 페이지수:"+pageCount);
		
		startRow = (pageNum -1) * pageSize +1;
		System.out.println("StartRow"+startRow);
		
		endRow =(rowCount > pageNum * pageSize)? pageNum * pageSize : rowCount;
		System.out.println("endRow"+endRow);
		System.out.println("스타트로우는::::"+startRow);
		System.out.println("앤드로우::::"+endRow);
		
		if(existPrev) {
			startPage = (pageNum-1)/blockSize*blockSize+1;
		}else {
			startPage = 1;
		}
	
		endPage = startPage + 4;
		
		
		existPrev = (startPage - pageSize) > 0;
		existNext = (startPage + pageSize) <= pageCount;		
		prevBlock = startRow - pageSize;
		nextBlock = startRow + pageSize;
		
		
		System.out.println(":::::::::::::::::::::::pageNum="+pageNum);
		System.out.println(":::::::::::::::::::::::pageSize="+pageSize);
		System.out.println(":::::::::::::::::::::::blockSize="+blockSize);
		System.out.println(":::::::::::::::::::::::startRow="+startRow);
		System.out.println(":::::::::::::::::::::::endRow="+endRow);
		System.out.println(":::::::::::::::::::::::startPage="+startPage);
		System.out.println(":::::::::::::::::::::::prevBlock="+prevBlock);
		System.out.println(":::::::::::::::::::::::nextBlock="+nextBlock);
		System.out.println(":::::::::::::::::::::::rowCount="+rowCount);
		
		
		
		
		
		
		
	}
}
