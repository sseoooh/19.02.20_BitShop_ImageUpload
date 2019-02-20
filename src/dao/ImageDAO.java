package dao;

import java.util.List;

import domain.ImageDTO;
import proxy.Proxy;

public interface ImageDAO {
	public void insertImage(ImageDTO img);
	
	public List<ImageDTO> ImageList(Proxy pxy);
	public List<ImageDTO> selectImage(Proxy pxy);
	public ImageDTO select(ImageDTO img);
	public String lastImageSeq();
	public int countImage(Proxy pxy);
	
	public void updateImage(ImageDTO img);
	
	public void deleteImage(ImageDTO img);
}
