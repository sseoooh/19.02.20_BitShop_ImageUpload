package dao;

import java.util.List;

import domain.OrderDTO;


public interface OrderDAO {
	public void insertOrder(OrderDTO emp);
	//R
	public List<OrderDTO> selectOrderList();
	public List<OrderDTO> selectOrderByName(String SearchWord);
	public OrderDTO selectOrder(String SearchWord);
	public int countOrder();

	//U
	public void updateOrder(OrderDTO emp);
	//D
	public void deleteOrder(OrderDTO emp);
}
