package dao;

import java.util.List;

import domain.OrderDetailDTO;

public class OrderDetailDAOImpl implements OrderDetailDAO{
	
	private static OrderDetailDAOImpl instance = new OrderDetailDAOImpl();
	private OrderDetailDAOImpl() {dao = OrderDetailDAOImpl.getInstance();}
	public static OrderDetailDAOImpl getInstance() {return instance;}
	OrderDetailDAOImpl dao;

	@Override
	public void insertOrderDetail(OrderDetailDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDetailDTO> selectOrderDetailList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetailDTO> selectOrderDetailByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetailDTO selectOrderDetail(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrderDetail() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateOrderDetail(OrderDetailDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrderDetail(OrderDetailDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
