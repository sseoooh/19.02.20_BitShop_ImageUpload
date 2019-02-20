package dao;

import java.util.List;

import domain.OrderDTO;

public class OrderDAOImpl implements OrderDAO{
	
	private static OrderDAOImpl instance = new OrderDAOImpl();
	private OrderDAOImpl() {dao = OrderDAOImpl.getInstance();}	
	public static OrderDAOImpl getInstance() {return instance;}
	OrderDAOImpl dao;

	@Override
	public void insertOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> selectOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> selectOrderByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO selectOrder(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
