package exercicios;

public class Calendario {
	public static boolean calularBi(int ano) {
		return ( ano%4 == 0 && (ano%100 != 0 || ano%400 == 0) );
	}
}
