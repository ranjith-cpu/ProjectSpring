package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/dbs")
public class Controller {
	@Autowired
	BookService Bksv;

	@RequestMapping("/allBookInfo")
	public List<Book> fetchAllBooks() {
		return Bksv.GetallBooks();
	}
	
	@PostMapping("/add")
    public String insertNewRec(@RequestBody Book stu) {
		     Bksv.addNewStudent(stu);
        return "Successfully added new record!!!!!!!";
    }
    
    @PutMapping("/update")
    public String updateRec(@RequestBody Book stu) {
        
    	Bksv.updateRec(stu);
        return "Successfully updated student record!!!!!!!";
    }
    
    @DeleteMapping("/delete")
    public String delete(@RequestParam int id) {
        
    	Bksv.deleteRec(id);
        return "Successfully deleted student record!!!!!!!";
    }


}
