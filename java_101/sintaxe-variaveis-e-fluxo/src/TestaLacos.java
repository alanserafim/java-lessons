
public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			
			System.out.print("Tabuada do " + multiplicador + ": ");
			
			for(int contador = 1; contador <= 10; contador++) {
				//System.out.println(contador + " x " + multiplicador + " = " + contador * multiplicador);
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
