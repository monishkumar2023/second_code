package com.crudOperation.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudOperation.model.Books;
import com.crudOperation.repository.BooksRepository;

@Service
public class BooksService 
{
@Autowired
BooksRepository booksRepository;
public List<Books> getAllBooks()
{
	List<Books>books=new ArrayList<Books>();
books=(List<Books>) booksRepository.findAll();//forEach(books1 -> books.add(books1));

return books;
}
//public static int booksCount=3;
 
// static List<Books> books = new ArrayList<>();
//static
//{
//	books.add(new Books(01,"the christmas pig","jk rowling",500));
//	books.add(new Books(02,"whereabout","jhumpa lahiri",650));
//	books.add(new Books(03, " the  india story","bimal jalal",700));
//}


public Books getBooksById(int id) 
{
return booksRepository.findById(id).get();
}

public void saveOrUpdate(Books book) 
{
	booksRepository.save(book);
//if(book.getBookid()==0) 
//{
//book.setBookid(++booksCount);	
//}
//books.add(book);
//return book;
}

public void delete(int id) 
{
booksRepository.deleteById(id);
}

public void update(Books books, int bookid) 
{
booksRepository.save(books);
}
}