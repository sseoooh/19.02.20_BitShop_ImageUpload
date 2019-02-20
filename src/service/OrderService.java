package service;

import java.util.List;

import domain.OrderDTO;


public interface OrderService {
	public void registOrder(OrderDTO emp);
	//R
	public List<OrderDTO> bringOrderList();
	public List<OrderDTO> retrieveOrderByName(String SearchWord);
	public OrderDTO retrieveOrder(String SearchWord);
	public int countOrder();
	public boolean existsOrder(String searchWord);
	//U
	public void modifyOrder(OrderDTO emp);
	//D
	public void removeOrder(OrderDTO emp);
}
