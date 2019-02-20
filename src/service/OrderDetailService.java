package service;

import java.util.List;

import domain.EmployeeDTO;
import domain.OrderDetailDTO;

public interface OrderDetailService {
	public void registOrderDetail(OrderDetailDTO emp);
	//R
	public List<OrderDetailDTO> bringOrderDetailList();
	public List<OrderDetailDTO> retrieveOrderDetailByName(String SearchWord);
	public OrderDetailDTO retrieveOrderDetail(String SearchWord);
	public int countOrderDetail();
	public boolean existsOrderDetail(String searchWord);
	//U
	public void modifyOrderDetail(OrderDetailDTO emp);
	//D
	public void removeOrderDetail(OrderDetailDTO emp);
}
