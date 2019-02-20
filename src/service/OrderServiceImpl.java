package service;

import java.util.List;

import domain.OrderDTO;

public class OrderServiceImpl implements OrderService{
	
	private static OrderServiceImpl instance = new OrderServiceImpl();
	private OrderServiceImpl() {dao = OrderServiceImpl.getInstance();}
	public static OrderServiceImpl getInstance() {return instance;}
	OrderServiceImpl dao;


	@Override
	public void registOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> bringOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> retrieveOrderByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO retrieveOrder(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsOrder(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
