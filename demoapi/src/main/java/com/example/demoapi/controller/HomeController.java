package com.example.demoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoapi.Repository.DemoapiModelRepo;
import com.example.demoapi.model.DemoapiModel;

@RestController
public class HomeController {
	
	@Autowired
	DemoapiModelRepo repo;
	
//	for add data
	@PostMapping(value="/add1")
	public DemoapiModel addform1(@RequestBody DemoapiModel model) {
		repo.save(model);
		return model;
	}
	
//	for showall data
	@GetMapping(value="/showall",produces= {"application/json"})
	public List<DemoapiModel> findalluser() {
		return repo.findAll();
	}
	
//	for show specific data
	@GetMapping(value="/show/{email}")
	public DemoapiModel finduser(@PathVariable String email){
		return repo.findByEmail(email);
	}
	
//	for show spcific data using body
	@PostMapping(value="/show1")
	public DemoapiModel finduser1(@RequestBody String email){
		System.out.println(repo.findByEmail(email));
		return repo.findByEmail(email);
	}
	
//	for delete data
	@DeleteMapping(value="/delete/{eid}")
	public String deleteuser(@PathVariable int eid) {
		@SuppressWarnings("deprecation")
		DemoapiModel d = repo.getOne(eid);
		repo.delete(d);
		return "deleted";
	}
	
	@PutMapping(path="/update/{eid}",consumes= {"application/json"})
	public String update(@RequestBody DemoapiModel demoapimodel) {
//		System.out.println(demoapimodel2[0].eid);
		repo.save(demoapimodel);
		return "update";
	}
	
	@PutMapping(path="/updateagain/{eid}",consumes= {"application/json"})
	public String updateagain(@PathVariable int eid, @RequestBody String email) {
		@SuppressWarnings("deprecation")
		Optional<DemoapiModel> demoapimodel = repo.findById(eid);
		System.out.println(eid);
		System.out.println(email);
		System.out.println(demoapimodel);
//		demoapimodel.email = email;
		return "updated";
	}

}
