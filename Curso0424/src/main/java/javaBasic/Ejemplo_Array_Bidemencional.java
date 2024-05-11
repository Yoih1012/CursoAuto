package javaBasic;

public class Ejemplo_Array_Bidemencional {

	public static void main(String[] args) {
		int arr [] [] = {{2,7,9} , {3,6,1}, {7,4,2}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3 ; j++) {
				System.out.print(arr [i] [j] + " "); //print imprimir en la misma linea 
			}
			System.out.println(); //println indica que se muestre en la siguiente línea 
		}

	}

}

//Se puede tomar en cuenta que un arreglo bidomencional es una forma de visualizar datos en forma de tablas 
//La variable "i" se asigna para determinar las posiciones
//La variable "j" se asigna para mostrar los datos 