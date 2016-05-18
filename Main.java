package juego;

public class Main {

	public static void main(String[] args) {
		Funciones obj = new Funciones();
		System.out.println("\n meter \n");
		obj.MeterCartas();
		System.out.println("\n barajado \n");
		obj.barajarCartas();
		System.out.println("\n Piramide \n");
		obj.Piramide();
		System.out.println("\n Mazo \n");
		obj.Mazo();
	}

}
