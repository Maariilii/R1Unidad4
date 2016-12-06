package boot.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



import boot.model.Hat;
import boot.service.HatService;

@Controller
public class HatController {
	
	@Autowired
	private HatService hatService;
	
	@GetMapping("/all-hats")
	public String allHats(HttpServletRequest request){
		request.setAttribute("hats",hatService.findAll());
		request.setAttribute("mode","MODE_HATS");
		return "hat";
	}
	
	@GetMapping("/new-hat")
	public String newHat(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "hat";
	}
	
	@PostMapping("/save-hat")
	public String saveHat(@ModelAttribute Hat hat, BindingResult bidingResult, HttpServletRequest request){
		hatService.save(hat);
		request.setAttribute("hats", hatService.findAll());
		request.setAttribute("mode", "MODE_HATS");
		return "hat";
		
	}
	
	@GetMapping("/update-hat")
	public String updateHat(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("hat", hatService.findHat(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "hat";
	}
	
	@GetMapping("/delete-hat")
	public String deleteHat(@RequestParam int id, HttpServletRequest request){
		hatService.delete(id);
		request.setAttribute("hats", hatService.findAll());
		request.setAttribute("mode", "MODE_HATS");
		return "hat";
	}



}
