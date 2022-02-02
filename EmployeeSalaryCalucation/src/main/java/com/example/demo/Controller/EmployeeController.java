package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/")
	public String viewhomepage(Model model) {
		model.addAttribute("employee", new Employee());
		return "index";
	}
	@PostMapping("/result")
	public String getresult(@ModelAttribute Employee employee,BindingResult result,Model model) {
		model.addAttribute("employee", employee);
		return "result";
	}
}
