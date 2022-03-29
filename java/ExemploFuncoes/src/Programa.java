
public class Programa {

	public static void imprimir(String txt) {
		System.out.println(txt);
	}
	
	public static double somar(double a, double b) {
		double vlr = a + b;
		return vlr;
	}
	
	
	public static void main(String[] args) {
		
		double valor1 = 100;
		double valor2 = 80;
		//double resultado = valor1 + valor2;
		double resultado = somar(valor1, valor2);
		//System.out.println(valor);
		
		String texto = String.valueOf(resultado);
		imprimir(texto);
				
	}
	
}
