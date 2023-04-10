package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Studentmodel;
import com.demo.repository.Studentrepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Studentcontroller
{
   /*
	@Autowired
	private Studentrepository srepository;
	
	@PostMapping("insert")
	@CrossOrigin(origins="http://localhost:4200")
	public Studentmodel insert(@RequestBody Studentmodel smodel)
	{
		return srepository.save(smodel);
	}
	
	@PostMapping("update")
	@CrossOrigin(origins="http://localhost:4200")
	public Studentmodel update(@RequestBody Studentmodel sm)
	{
		return srepository.save(sm);
	}
	
	@PostMapping("delete")
	@CrossOrigin(origins="http://localhost:4200")
	public void delete(@RequestBody Studentmodel id)
	{
		srepository.delete(id);
	}
	
	@GetMapping("view")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Studentmodel> view()
	{
		return this.srepository.findAll();
	}
	
	*/
	
}
