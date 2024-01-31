package fr.dawan.calculator_jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.dawan.calculator.Calculator;

@SpringBootApplication
public class CalculatorJarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorJarApplication.class, args);
	}
	
	/*
	 * Créer un bean (objet) pour la classe Calculator. 
	 * */
	 @Bean
	 public Calculator calculator() {
	      return new Calculator();
	 }


}
