package com.crudOperation.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudOperation.model.Books;
import com.crudOperation.service.BooksService;

@RestController
public class BooksController 
{

@Autowired
BooksService booksService;

@GetMapping("/book")
private List<Books> getAllBooks() 
{
return booksService.getAllBooks();
}
//for mapping http get request on specific handler
@GetMapping("/book/{bookid}")
private Books getBooks(@PathVariable("bookid") int bookid)// 
{
return booksService.getBooksById(bookid);
}

@DeleteMapping("/book/{bookid}")
private void deleteBook(@PathVariable("bookid") int bookid) 
{
booksService.delete(bookid);
}

@PostMapping("/books")
private List<Books> saveBook(@RequestBody Books books) //it used to convert body of http request to java objects
{
booksService.saveOrUpdate(books);
return booksService.getAllBooks();
}
 
@PutMapping("/bookss")
private List<Books> update(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return booksService.getAllBooks();
}
}
