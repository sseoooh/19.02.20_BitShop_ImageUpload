package service;

import java.util.List;

import domain.CategoryDTO;

public class CategoryServiceImpl implements CategoryService{

	private static CategoryServiceImpl instance = new CategoryServiceImpl();
	private CategoryServiceImpl() {dao = CategoryServiceImpl.getInstance();}
	public static CategoryServiceImpl getInstance() {return instance;}
	CategoryServiceImpl dao;
	
	@Override
	public void registCategory(CategoryDTO emp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<CategoryDTO> bringCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<CategoryDTO> retrieveCategoryByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CategoryDTO retrieveCategory(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countCategory() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean existsCategory(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void modifyCategory(CategoryDTO emp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeCategory(CategoryDTO emp) {
		// TODO Auto-generated method stub
		
	}

	

}
