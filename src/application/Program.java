package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Map<Product, Double> stock = new HashMap<>();

		Product p1 = new Product("Tv", 900.00);
		Product p2 = new Product("Notebook", 2700.00);
		Product p3 = new Product("Tablet", 400.00);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);

		Product ps = new Product("Tv", 900.00);
		// Usando a comparação de ponteiros, já que na minha classe 
		// personalizada não foi implementado o equals e hashCode.
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}
}
