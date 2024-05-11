package javaBasic;

public class Ejemplo_Encap_Demo {

	public static void main(String[] args) {
		Ejemplo_Encap encap = new Ejemplo_Encap ();
		
		encap.setTipo (10);
		System.out.println("El tipo es: " + encap.getTipo ());

	}

}


// set: Asignar valor a la variable que es privada
// get: para poder leer el valor de la variable que es privada 