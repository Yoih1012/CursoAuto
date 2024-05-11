package javaBasic;

public class Ejemplo_Vehiculo_Demo {

	public static void main(String[] args) {
		Ejemplo_Vehiculo minivan = new Ejemplo_Vehiculo();
		int rango;
		
		//Asignar valores a las variables de minivan
		
		minivan.pasajeros = 9 ;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango asumiendo un tanque lleno
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + "kilometros");
		
		Ejemplo_Vehiculo carro = new Ejemplo_Vehiculo();
		carro.pasajeros = 4;
		System.out.println("Numeros en pasajeros en carro es:" + carro.pasajeros);

	}

}

// Nuestra clase es Ejemplo_Vehiculo y los objetos e instancias son "minivan" y "carro"
//Este ejemplo es para mostrar como se pueden mandar a llamar los objetos de otra clase 