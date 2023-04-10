package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;
import com.demo.repository.Bookrepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookController {
	
		@Autowired
		private Bookrepository srepository;
		
		@PostMapping("insert")
		@CrossOrigin(origins="http://localhost:4200/")
		public Book insert(@RequestBody Book smodel)
		{
			return srepository.save(smodel);
		}
		
		@PostMapping("update")
		@CrossOrigin(origins="http://localhost:4200")
		public Book update(@RequestBody Book sm)
		{
			return srepository.save(sm);
		}
		
		@PostMapping("delete")
		@CrossOrigin(origins="http://localhost:4200")
		public void delete(@RequestBody Book id)
		{
			srepository.delete(id);
		}
		
		@GetMapping("view")
		@CrossOrigin(origins="http://localhost:4200")
		public List<Book> view()
		{
			return this.srepository.findAll();
		}

}
