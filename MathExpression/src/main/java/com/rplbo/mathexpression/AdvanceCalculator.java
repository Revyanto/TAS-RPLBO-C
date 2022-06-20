
public class AdvanceCalculator extends Kalkulator{
	
	//Method untuk Perpangkatan
	public double pangkat(int bil1, int bil2) {
		return Math.pow(bil1, bil2);
	}
	//Method untuk Modulus
	public int modulus(int bil1, int bil2) {
		return bil1 % bil2;
	}
	//Method untuk Akar
	public double akar(int bil1) {
		return Math.sqrt(bil1);
	}
}
