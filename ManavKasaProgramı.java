import java.util.Scanner;

public class ManavKasaProgramý {

	public static void main(String[] args) {
		double armut_kilo_fiyati = 2.14;
		double elma_kilo_fiyati = 3.67;
		double domates_kilo_fiyati = 1.11;
		double muz_kilo_fiyati = 0.95;
		double patlican_kilo_fiyati = 5.00;
		int armut_kilo,elma_kilo,domates_kilo,muz_kilo,patlican_kilo;
		Scanner input = new Scanner(System.in);
		System.out.print("Armut Kaç Kilo : ");
		armut_kilo = input.nextInt();
		System.out.print("Elma Kaç Kilo : ");
		elma_kilo = input.nextInt();
		System.out.print("Domates Kaç Kilo : ");
		domates_kilo = input.nextInt();
		System.out.print("Muz Kaç Kilo : ");
		muz_kilo = input.nextInt();
		System.out.print("Patlýcan Kaç Kilo : ");
		patlican_kilo = input.nextInt();
		
	    double toplam = (armut_kilo_fiyati * armut_kilo) + (elma_kilo_fiyati * elma_kilo) + (domates_kilo_fiyati * domates_kilo)
	    		        + (muz_kilo_fiyati * muz_kilo) + (patlican_kilo_fiyati * patlican_kilo);
	    System.out.println("Toplam Fiyatý : " + toplam);

	}

}
