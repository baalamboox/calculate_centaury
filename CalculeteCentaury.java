public class CalculateCentaury {
	public static int centaury = 100; // Se crea una field llamada "centaury" y se inicializa en 100 que es, lo que equivale un siglo.
	public static int countCentaury = 1; // Se crea una field llamada "countCentaury" se inicializa en 1, ya que de ahí parte un siglo.
	public static int savedCentaury = 0; // Se crea una field llamada "savedCentaury" se inicializa en 0, donde se guardará el siglo que se encuentre con el año.
	
	// Se crea un método que retorna un valor entero (int) llamda "calcularSiglo" como parametros se requiere una variable de tipo entero, que es el año.
	public static int centaury(int year) {
		for(int i = 1; i < 4000; i++) {
			//System.out.println(i);
			if(i == (centaury + 1)) {
				//System.out.println(i);
				centaury = centaury + 100;
				countCentaury++;
			}
			if(i == year) {
				savedCentaury = countCentaury;
				break;
			}
			/*
			if(i <= centaury) {
				System.out.println(i);
				//continue;
			} else {
				System.out.println("----------------- Empieza nuevo siglo --------------");
				centaury = centaury + 100;
				countCentaury++;
			}
			if(i == year) {
				savedCentaury = countCentaury;
			}*/
		}
		return savedCentaury;
	}
	public static void main(String[] args) {
		int year = 1;
		System.out.println(year + " pertenece al siglo " + centaury(year));
	}
}