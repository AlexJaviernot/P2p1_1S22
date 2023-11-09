import java .util.Scanner;

public class examen{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos valores  vas a capturar");
		int[] tamaño = teclado.nextInt();
		int[] valores = new int [tamaño];
		int a;
		System.out.println("Ingresa el valor #"+a+": ");
		for (a=0;a<tamaño;a++){
			valores[a]= teclado.nextInt();
		}
		int sumatoria=0;
		for (a=0;a<tamaño;a++){
			sumatoria+=valores[a];
		}
		int promedio=sumatoria/tamaño;
		System.out.println("la media arimetica es "+ promedio);	
		sumatoria=0;
		for (a=0;a<tamaño;a++){
			sumatoria+=Match.abs(valores[a]-promedio);
		}
		int dm = sumatoria/tamaño;
		System.out.println("La desviacion media " + dm);
}