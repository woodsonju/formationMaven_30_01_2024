package fr.dawan.calculator_jar.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.dawan.calculator_jar.metier.CalculatorMetier;

@Controller
public class CalculatorController {

	@Autowired
	private CalculatorMetier calculatorMetier;
	
	public CalculatorController() {
	}

	public CalculatorController(CalculatorMetier calculatorMetier) {
		super();
		this.calculatorMetier = calculatorMetier;
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/calculate")
	public String calculate(double num1, double num2, String operation, Model model) {
		double result;
		try {
			result = calculatorMetier.calculate(num1, num2, operation);
			model.addAttribute("result", result);
			
		} catch (Exception e) {
			model.addAttribute("error", "Division by zero is not allowed");
		}
		
		return "calculator";
	}
	
}
