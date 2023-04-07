package Exercici2;

import java.util.ArrayList;

public class GenericMethods {

	public static <T> void imprimir(ArrayList<T> llista) {

		for (T element : llista) {

			System.out.println(element);

		}
	}
}
