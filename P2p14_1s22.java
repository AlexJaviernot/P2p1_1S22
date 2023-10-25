import java.util.Scanner;

public class practica_9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] Ma, Mb, Mc;
		int fa , ca , fb , cb , f , c , r , h;
		System.out.println("INgresa el numero de filas para la matriz A");
		fa=teclado.nextInt();
		System.out.println("INgresa el numero de columnas para la matriz A");
		ca=teclado.nextInt();
		System.out.println("INgresa el numero de filas para la matriz B");
		fb=teclado.nextInt();
		System.out.println("INgresa el numero de columnas para la matriz B");
		cb=teclado.nextInt();
		if (ca == fb) {
			Ma = int[fa][ca];
			Mb = int[fb][cb];
			Mc = int[fa][cb];
			for (f=0;f<fa;f++) {
				for (c=0;c<ca;c++) {
					System.out.println("Ingresa el valor para Ma ["+f+"]["+c+"]:");
					Ma [f][c]=teclado.nextInt();
				}
			}
			for (f=0;f<fb ;f++ ) {
				for (c=0;c<cd;c++) {
					System.out.println("Ingresa el valor para Mb["+f+"]["+c+"]:");
					Mb[f][c]=teclado.nextInt();
				}
			}
			for (f=0;f<fa;f++) {
				for (c=0;c=cb;c++) {
					for (h=0;h<fb;h++) {
						r=Ma[f][h]*Mb[c][h]				
					}
					Mc[f][c]=r;
				}
			}
		}else{
			System.out.println("No se puede realizar el proceso de multiplicacion");
		}
	}
}