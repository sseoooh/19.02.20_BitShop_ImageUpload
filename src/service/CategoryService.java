package service;

import java.util.List;

import domain.CategoryDTO;


public interface CategoryService {
	//C
	public void registCategory(CategoryDTO emp);
	//R
	public List<CategoryDTO> bringCategoryList();
	public List<CategoryDTO> retrieveCategoryByName(String SearchWord);
	public CategoryDTO retrieveCategory(String SearchWord);
	public int countCategory();
	public boolean existsCategory(String searchWord);
	//U
	public void modifyCategory(CategoryDTO emp);
	//D
	public void removeCategory(CategoryDTO emp);
}
