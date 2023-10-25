public class P2p3_1S22{
	public static void main(String[] args) {
		int a=0;

		while(a<=10){
			System.out.println("El valor de a vale "+a);
			a++;
		}

		a=0;
		while(true){
			System.out.println("Nuevamente a vale " +a);
			if (a>=10)break;
			a++;
		}

		boolean estado = false;
		while(estado){
			System.out.println("Se mostrara esta linea?");
		}
	}
}