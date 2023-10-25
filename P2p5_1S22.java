import java.util.Scanner;

public class P2p5_1S22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char opc='0';
		while (opc !='S'){
			System.out.println("Menu de Operaciones");
			System.out.println("");
			System.out.println("S.- Suma");
			System.out.println("R.- Resta");
			System.out.println("D.- Division");
			System.out.println("M.- Multiplicar");
			System.out.println("X.- Salir");
			System.out.println("");
			System.out.println("Que opcion deseas");
			opc=teclado.nextLine().charAt(0);
			switch(opc){ 
		case 'S':System.out.println("Aqui realizamos la Suma");break;
		case 'R':System.out.println("Aqui realizamos la Resta");break;
		case 'D':System.out.println("Aqui realizamos la Division");break;
		case 'M':System.out.println("Aqui realizamos la Multiplicacion");break;
		case 'X':break;
		
		}
	 }
	}
}