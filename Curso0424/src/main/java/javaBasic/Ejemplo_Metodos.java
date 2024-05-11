package javaBasic;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
	int resultado = suma (30,45);
	System.out.println(resultado);
	
	int resultado2 = suma (20,30,40);
	System.out.println(resultado2);
	
	String marca = carro (2);
	System.out.println(marca);

	}
	public static int suma (int a, int b) {
		int c = a + b ;
		return c;
	}
	public static int suma (int a, int b, int c) {
		int d = a + b + c ;
		return d;
	}
	
	public static String carro (int a ) {
		String[] cars = {"volvo", "BMW", "Ford"};
		return cars [a];
	}
	
}
