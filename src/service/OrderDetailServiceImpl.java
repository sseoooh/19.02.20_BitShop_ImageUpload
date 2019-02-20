package service;

import java.util.List;

import domain.OrderDetailDTO;

public class OrderDetailServiceImpl implements OrderDetailService{
	
	private static OrderDetailServiceImpl instance = new OrderDetailServiceImpl();
	private OrderDetailServiceImpl() {dao = OrderDetailServiceImpl.getInstance();}
	public static OrderDetailServiceImpl getInstance() {return instance;}
	OrderDetailServiceImpl dao;
	
	@Override
	public void registOrderDetail(OrderDetailDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDetailDTO> bringOrderDetailList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetailDTO> retrieveOrderDetailByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetailDTO retrieveOrderDetail(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrderDetail() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsOrderDetail(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyOrderDetail(OrderDetailDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrderDetail(OrderDetailDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
