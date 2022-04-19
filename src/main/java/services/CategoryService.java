package services;



import java.util.List;

import domain.Category;
import exceptions.EtBadRequestException;
import exceptions.EtResourceNotFoundException;

public interface CategoryService {

    List<java.util.Locale.Category> fetchAllCategories(Integer userId);

    java.util.Locale.Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    java.util.Locale.Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, java.util.Locale.Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

	void updateCategory(int userId, Integer categoryId, java.util.Locale.Category category);

}
