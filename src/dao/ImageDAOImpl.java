package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.ImageDTO;
import enums.ImageSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.Proxy;

public class ImageDAOImpl implements ImageDAO{
	private static ImageDAOImpl instance = new ImageDAOImpl();
	public ImageDAOImpl() {dao = ImageDAOImpl.getInstance();}
	public static ImageDAOImpl getInstance() {return instance;}
	ImageDAOImpl dao;
	
	@Override
	public void insertImage(ImageDTO img) {
		try {
			PreparedStatement ps = DatabaseFactory
					.createDatabase(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(ImageSQL.CUST_FILE_UPLOAD.toString());
			ps.setString(1, img.getImgName());
			ps.setString(2, img.getImgExtention());
			ps.setString(3, img.getOwner());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ImageDTO> ImageList(Proxy pxy) {
		List<ImageDTO> list = new ArrayList<>();
		try {
			String sql = "";
			PreparedStatement ps = DatabaseFactory
								.createDatabase(Vendor.ORACLE)
								.getConnection()
								.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ImageDTO> selectImage(Proxy pxy) {
		List<ImageDTO> list = new ArrayList<>();
		try {
			String sql = "";
			PreparedStatement ps = DatabaseFactory
								.createDatabase(Vendor.ORACLE)
								.getConnection()
								.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ImageDTO select(ImageDTO img) {
		ImageDTO image = new ImageDTO();
		try {
			String sql = "SELECT * FROM IMAGE WHERE IMAGE_ID LIKE ?";
			PreparedStatement ps = DatabaseFactory
								.createDatabase(Vendor.ORACLE)
								.getConnection()
								.prepareStatement(sql);
			ps.setString(1, img.getImgSeq());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				image.setImgExtention(rs.getString("IMGEXTENTION"));
				image.setImgName(rs.getString("IMGNAME"));
				image.setOwner(rs.getString("OWNER"));
				image.setImgSeq(rs.getString("IMAGE_ID"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}

	@Override
	public int countImage(Proxy pxy) {
		int count = 0;
		String sql = "";
		try {
			PreparedStatement ps = DatabaseFactory
								.createDatabase(Vendor.ORACLE)
								.getConnection()
								.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				count = rs.getInt("COUNT");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void updateImage(ImageDTO img) {
		
	}

	@Override
	public void deleteImage(ImageDTO img) {
		
	}
	
	@Override
	public String lastImageSeq() {
		String lis = "";
		try {
			String sql = "SELECT MAX(IMAGE_ID) IMAGE_ID FROM IMAGE";
			PreparedStatement ps = DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection()
			.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				lis = rs.getString("IMAGE_ID");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lis;
	}

}
