package exercicios;

public class Calendario {
	public static boolean calularBi(int ano) {
		if ( ano%4 == 0 && (ano%100 != 0 || ano%400 == 0) ) {
			return true;
		}
		return false;
	}
}
