import java.util.Scanner;

public class KdvTutarHesaplama {

	public static void main(String[] args) {
		double kdvliTutar,kdvTutar,tutar,kdvOran = 0.18;
		Scanner input = new Scanner(System.in);
		System.out.print("�cret Tutar�n� Giriniz : ");
		tutar = input.nextDouble();
		
		kdvTutar = tutar*kdvOran ;
        kdvliTutar = tutar+kdvTutar;
        kdvOran = (tutar * 0.18);

        System.out.println("Kdv'siz Tutar :"+tutar);
        System.out.println("Kdvli Tutar   :" +kdvliTutar);
        System.out.println("Kdv Tutar�    :"+kdvTutar);
        System.out.println("Kdv Oran�     :"+kdvOran);

	}

}
