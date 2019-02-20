package dao;

import java.util.List;

import domain.CategoryDTO;

public interface CategoryDAO {
	public void insertCategory(CategoryDTO emp);
	public List<CategoryDTO> selectCategoryList();
	public List<CategoryDTO> selectCategoryByName(String SearchWord);
	public CategoryDTO selectCateory(String SearchWord);
	public int countCategory();
	
	public void updateCategory(CategoryDTO emp);
	public void deleteCategory(CategoryDTO emp);
}
