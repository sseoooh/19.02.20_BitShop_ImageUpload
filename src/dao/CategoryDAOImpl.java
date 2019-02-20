package dao;

import java.util.List;

import domain.CategoryDTO;

public class CategoryDAOImpl implements CategoryDAO{
	
	private static CategoryDAOImpl instance = new CategoryDAOImpl();
	private CategoryDAOImpl() {dao = CategoryDAOImpl.getInstance();}
	public static CategoryDAOImpl getInstance() {return instance;}
	CategoryDAOImpl dao;
	
	@Override
	public void insertCategory(CategoryDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> selectCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDTO> selectCategoryByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO selectCateory(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateCategory(CategoryDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(CategoryDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
