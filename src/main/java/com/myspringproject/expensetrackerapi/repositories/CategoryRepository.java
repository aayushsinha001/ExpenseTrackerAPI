package com.myspringproject.expensetrackerapi.repositories;

import com.myspringproject.expensetrackerapi.domain.Category;
import com.myspringproject.expensetrackerapi.exceptions.EtBadRequestException;
import com.myspringproject.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> fetchAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category);

    void removeId(Integer userId, Integer categoryId);
}
