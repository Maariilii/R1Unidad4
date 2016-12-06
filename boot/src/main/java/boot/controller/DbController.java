package boot.controller;


import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam; 

import boot.model.Db;
import boot.service.DbService;


@Controller
public class DbController {
	
	@Autowired
	private DbService dbService;
	
	@GetMapping("/all-dbs")
	public String allDb(HttpServletRequest request){
		request.setAttribute("dbs",dbService.findAll());
		request.setAttribute("mode","MODE_DBS");
		return "db";
	}
	
	@GetMapping("/new-db")
	public String newDb(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "db";
	}
	
	@PostMapping("/save-db")
	public String saveDb(@ModelAttribute Db db, BindingResult bidingResult, HttpServletRequest request){
		dbService.save(db);
		request.setAttribute("dbs", dbService.findAll());
		request.setAttribute("mode", "MODE_DBS");
		return "db";
		
	}
	
	@GetMapping("/update-db")
	public String updateDb(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("db", dbService.findDb(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "db";
	}
	
	@GetMapping("/delete-db")
	public String deleteDb(@RequestParam int id, HttpServletRequest request){
		dbService.delete(id);
		request.setAttribute("dbs", dbService.findAll());
		request.setAttribute("mode", "MODE_DBS");
		return "db";
	}

}
