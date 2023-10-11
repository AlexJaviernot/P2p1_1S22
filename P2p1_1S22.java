import java.util.Scanner;

public class P2p1_1S22{
	public static void main(String[] args) {
		int opc=3;
		int a,b,resultado;
		/*
		switch (opc) {
		case 1:
			System.out.println("esta es la primera opcion");
			break;
		case 2:
			System.out.println(" esta es la segunda opcion");
		case 3:
			break;
		default:
			System.out.println("esat es la tercera opcion");

		}
		char opc1='a';
		switch(opc1){
		case 'a':
			System.out.println("selecciono A ");
			break;
		case 'b':
			System.out.println("selecciono B ");
			break;
		case'c':
			System.out.println("Selecciono C ");
			break;
			default:
				System.out.println("No esta dentro de las opciones");

		}
		*/


		char opc2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("elija una opcion r,s,m,d");

		opc2 = teclado.next().charAt(0);
		switch(opc2){
	case's':
		System.out.println("aqui iran las operaciones de suma");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println(" introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a+b;
		System.out.println("el resultado es la suma " + resultado);
		break;
	case'r':
		System.out.println("aqui iran las operaciones de resta");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println("introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a-b;
		System.out.println("el resultado es" + resultado);
		break;
	case 'm':
		System.out.println("aqui iran las operaciones de multiplicacion");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println(" introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a*b;
		System.out.println("el resultado es" + resultado);
		break;
	case'd':
		System.out.println("aqui ira la operacion de la divicion");
		System.out.println("introducir el primer numero");
		a = teclado.nextInt();
		System.out.println(" introducir el segundo numero");
		b = teclado.nextInt();
		resultado = a/b;
		System.out.println("el resultado es" + resultado);
		break;
	default:
		System.out.println("No existe operacion a realizar");
       }

	}
}