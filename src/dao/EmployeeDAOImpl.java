package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.EmployeeDTO;
import enums.EmployeeSQL;
import enums.Vendor;
import factory.DatabaseFactory;

public class EmployeeDAOImpl implements EmployeeDAO{

	private static EmployeeDAOImpl instance = new EmployeeDAOImpl();
	private EmployeeDAOImpl() {dao = EmployeeDAOImpl.getInstance();}
	public static EmployeeDAOImpl getInstance() {return instance;}
	EmployeeDAOImpl dao;
	
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		try {
			System.out.println("DB설정입장");
			//입력순서 :  MANAGER, NAME, BIRTH_DATE, PHOTO, NOTES
			String sql = String.format(EmployeeSQL.REGISTER.toString(),
					emp.getManager(),emp.getName(),emp.getBirthDate(),emp.getPhoto(),emp.getNotes()
					);
			System.out.println("실행할쿼리:"+sql);
			Connection conn =
				DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection();
			
			/*EMPLOYEE_ID, MANAGER, NAME, BIRTH_DATE, PHOTO, NOTES*/
			
			PreparedStatement pstmt = conn
					.prepareStatement(sql);
			pstmt.setString(1,  emp.getManager());
			pstmt.setString(2,  emp.getName());
			pstmt.setString(3,  emp.getBirthDate());
			pstmt.setString(4,  emp.getPhoto());
			pstmt.setString(5,  emp.getNotes());
			int rs = pstmt.executeUpdate();
			
			System.out.println((rs==1) ? "입력성공":"입력실패");
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {
		List<EmployeeDTO> list = new ArrayList<>();
		String sql = "";
		try {
			 PreparedStatement ps = DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection()
			.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<EmployeeDTO> selectEmployeesByName(String SearchWord) {
		List<EmployeeDTO> list = new ArrayList<>();
		String sql = "";
		try {
			PreparedStatement ps = DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection()
			.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return list;
	}

	@Override
	public EmployeeDTO selectEmployee(String SearchWord) {
		
		return dao.selectEmployee(SearchWord);
	}

	@Override
	public int countEmployees() {
		return dao.countEmployees();
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		
	}
	@Override
	public boolean existEmployee(EmployeeDTO emp) {
		boolean ok = false;	
		try {
			PreparedStatement ps = DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection()
			.prepareStatement(EmployeeSQL.ACCESS.toString());
			ps.setString(1, emp.getEmployeeID());
			ps.setString(2, emp.getName());
			if(ps.executeQuery().next()) {ok = true;}
			ResultSet rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return ok;
	}

}
