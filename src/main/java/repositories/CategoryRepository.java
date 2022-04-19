package repositories;



import java.util.List;

import domain.Category;
import exceptions.EtBadRequestException;
import exceptions.EtResourceNotFoundException;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

	Category findById1(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

	void update1(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

	Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

	void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

}
