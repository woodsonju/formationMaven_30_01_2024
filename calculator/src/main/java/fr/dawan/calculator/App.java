package fr.dawan.calculator;

import java.io.InputStream;
import java.util.Properties;

public class App {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		Properties properties = new Properties();

		//Solution : Finally
		//InputStream inputStream = null;

		//		try {
		//			inputStream = App.class.getResourceAsStream("/app.properties");
		//			properties.load(inputStream);
		//		} catch (IOException e) {
		//			e.printStackTrace();
		//		}finally {
		//			if(inputStream !=null) {
		//				try {
		//					inputStream.close();
		//				} catch (IOException e) {
		//					e.printStackTrace();
		//				}
		//			}
		//		}

		//Solution 2 : Utilisation de try-with-ressource 
		try(InputStream inputStream = App.class.getResourceAsStream("/app.properties"))
		{
			if(inputStream != null) {
				properties.load(inputStream);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Application version : " + properties.getProperty("fr.dawan.calculator.version", "?") + "\n");
		
		
		System.out.println("Addition : " + calculator.sum(5, 2));
		System.out.println("Soustraction : " + calculator.substract(5, 2));
		System.out.println("Multiplication : " + calculator.multiply(5, 2));
		System.out.println("Division : " + calculator.divide(5, 2));



	}

}
