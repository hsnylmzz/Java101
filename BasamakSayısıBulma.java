import java.util.Scanner;

public class BasamakSay�s�Bulma {

	public static void main(String[] args) {
		int girilen_sayi,basamak_sayisi = 0,toplam = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir say� giriniz : " );
		girilen_sayi = input.nextInt();
		
		while(girilen_sayi!=0)
		{
			int rakam = girilen_sayi % 10;
		    toplam = rakam + toplam;
		    girilen_sayi = girilen_sayi / 10;
		}
       System.out.print("Say�n�n Toplam� : " + toplam);
	}

}
