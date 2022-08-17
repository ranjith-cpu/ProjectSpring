package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.repo.Bookrepo;
import com.example.demo.dto.Book;
@Component
public class BookService {
	
	@Autowired
	Bookrepo bkr ;
	public List<Book> GetallBooks(){
     return bkr.getAllBooks();
}
	public void addNewStudent(Book stu) {
		// TODO Auto-generated method stub
		 bkr.addbook(stu);
		
	}
	public void updateRec(Book stu) {
		// TODO Auto-generated method stub
		bkr.updatebook(stu);
		
	}
	public void deleteRec(int id) {
		// TODO Auto-generated method stub
		bkr.deletebook(id);
		
	}
}