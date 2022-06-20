
public class KalkulatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kalkulator cal = new AdvanceCalculator();
		 
		System.out.println("Hasil Penjumlahan = " + cal.penjumlahan(1,3));
		System.out.println("Hasil Pengurangan = " + cal.pengurangan(5,7) );
		System.out.println("Hasil Pembagian = " + cal.pembagian(15, 3));
		System.out.println("Hasil Perkalian = " + cal.perkalian(5, 3));
		System.out.println("Hasil Pangkat = " + ((AdvanceCalculator)cal).pangkat(2, 5));
		System.out.println("Hasil Modulus = " + ((AdvanceCalculator)cal).modulus(10, 2));
		System.out.println("Hasil akar = " + ((AdvanceCalculator)cal).akar(4));
	}

}
