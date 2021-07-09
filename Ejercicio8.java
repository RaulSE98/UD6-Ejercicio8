import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimir(rellenar(10));
		

	}
	
	public static void imprimir(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En la posicion "+i+ " hay el valor "+lista[i]);
		}
	}
	
	public static int [] rellenar (int a) {
		Scanner sc = new Scanner(System.in);
		int num[]= new int [a];
		for(int i = 0; i < num.length; i++) {
			System.out.println("Introduce un nuevo valor");
			num[i] = sc.nextInt();
		}
		
		return num;
	}

}
