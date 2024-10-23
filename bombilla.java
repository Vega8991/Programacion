package Bombillas;

public class bombilla {
	private static final int MAX_POT = 80;

	public void setPot(int potencia) {
		if (potencia > MAX_POT) {
			System.out.println("Cuidado chaval q te va a reventar la bombilla");
		} else {
			System.out.println("Potencia:" + potencia);
		}
	}

	public static void main(String[] args) {
		bombilla bombille = new bombilla();

		bombille.setPot(79);

	}
}
