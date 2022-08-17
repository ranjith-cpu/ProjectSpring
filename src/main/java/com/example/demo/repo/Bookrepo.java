package com.example.demo.repo;
import java.util.ArrayList;

import java.util.List;
import java.util.Iterator;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
import com.example.demo.dto.Book;
@Component
public class Bookrepo {
    
    static List<Book> stuList =new ArrayList<Book>() ;
    
    static {
        
        stuList.add(new Book("cor java","rama","java", 564, 1001));
        stuList.add(new Book("spring","krishana","spring", 566, 1002));
        stuList.add(new Book("angular","ranjith","Typescript", 568, 1003));
        
        		}
    
    public List<Book> getAllBooks(){
        
        return stuList;
    }

	public void addbook(Book stu) {
		// TODO Auto-generated method stub
		stuList.add(stu);
		
	}

	public void updatebook(Book stu) {
		// TODO Auto-generated method stub
		int index = getListIndex(stu.getBid());
        stuList.set(index, stu);
    
		
	}

	private int getListIndex(int bid) {
		// TODO Auto-generated method stub
		Iterator<Book> itr = stuList.iterator();
        Book eachbook;
        int index=0;
        while(itr.hasNext())
        {
            
            eachbook = itr.next();
            if(eachbook.getBid() == bid) {
             return index;
            }
            index++;
        }
		return 0;
	}

	public void deletebook(int id) {
		// TODO Auto-generated method stub
		int index = getListIndex(id);
        stuList.remove(index);
   
		
	}
}
