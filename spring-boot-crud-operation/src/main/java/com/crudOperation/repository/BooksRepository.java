package com.crudOperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.crudOperation.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
