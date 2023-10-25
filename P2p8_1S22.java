public class P2p8_1S22{
	public static void main(String[] args) {
		if(args.length == 3){
		int a,b,r=0;
		char operacion;
		operacion = args[1].charAt(0);
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[2]);
		switch(operacion){
		case 'x' : r = a*b;break;
		case '+' : r = a+b;break;
		case '-' : r = a-b;break;
		case '/' : r = a/b;break;	
		}
		System.out.println("el resultado de la operacion fue: "+r);
	}else{
		System.out.println("no se puede realizar la operacion");
	}
	}
}