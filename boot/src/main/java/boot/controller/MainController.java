package boot.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Task;
import boot.service.TaskService;

@Controller
public class MainController {
 
	
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("task")
	public String task(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "task";
	}
	
	@GetMapping("hat")
	public String hat(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "hat";
	}
	
	@GetMapping("db")
	public String db(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "db";
	}
	
	@GetMapping("product")
	public String product(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_PRODUCT");
		return "product";
	}
	
 }
