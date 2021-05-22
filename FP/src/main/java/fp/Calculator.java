package fp;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
	/*
	 * este metodo devuelve el Class del object que le pasamos
	 */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
	 * devuelve una lista con los n números de la serie de fibonacci.
	 */
	public static List<Integer> fibonacci(int n) {
		List<Integer> fibonnaciList = new ArrayList<Integer>();
		Integer n1 = 0, n2 = 1;
		fibonnaciList.add(1);

		for (int i = 0; i < n - 1; i++) {
			Integer summa = n1 + n2;
			n1 = n2;
			n2 = summa;
			fibonnaciList.add(summa);
		}

		return fibonnaciList;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		List<Integer> cadena = new ArrayList<>();
		while (number - step > 0){
			cadena.add(number = number - step);
		}
		return Conversor(cadena);
	}

	public static int[] Conversor(List<Integer> list) {
		int[] cadena = new int[list.size()];
		for (int i=0; i< list.size(); i++){
			cadena[i]= list.get(i);
		}
		return cadena;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		List<Integer> list = new ArrayList<>();
		if (n == 0)
			return null;
		if (n >= 0 && n <= 20) {
			int counter = 0;
			for (int i = 20; i > 0; i--) {
				if (n % i == 0) {
					list.add(i);
				}
			}

			return Conversor(list);
		}
		return new int[]{-1};
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {

	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
	}
}
