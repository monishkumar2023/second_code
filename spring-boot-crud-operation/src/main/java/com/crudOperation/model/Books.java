package com.crudOperation.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Books
{

@Id
@Column
private int bookid;
@Column
private String bookname;
@Column
private String author;
@Column
private int price;
public Books()
{
	
}
public  Books(int bookid,String bookname,String author,int price)
{
	super();
	this.bookid=bookid;
	this.bookname=bookname;
	this.author=author;
	this.price=price;
}
public int getBookid() 
{
return bookid;
}
public void setBookid(int bookid)
{
	this.bookid=bookid;
}
public String getBookname()
{
return bookname;
}

public String getAuthor() 
{
return author;
}

public int getPrice() 
{
return price;
}


}