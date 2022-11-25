package unico;

public class Ej_07 {

	public static void main(String[] args) {
		//Implementar un método recursivo que permita la suma de los n primeros números naturales.

		//sumar(5) = 1 + 2 + 3 + 4 + 5 = 15

		int n;
		String r;
		n= Util.leerInt("Introduce la cantidad de números a sumar: ");
		suma(n);

	}
	public static int suma(int n) {
		int r;
		if(n==1){
			r=1;
		}else {
			r= n + suma(n-1);
		}
		return r;
	} 
}
