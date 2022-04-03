import java.util.Scanner;

public class TamBolunenlerinOrtalamasiBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int girilen_sayi,sayac = 0,toplam = 0;
		System.out.print("Bir sayi giriniz : ");
		girilen_sayi = input.nextInt();
		
		for(int i = 1 ; i <= girilen_sayi ; i++)
		{
			if(i % 3 == 0 && i % 4 == 0)
			{
				sayac++;
				toplam += i;
			}
		}
		System.out.println("3'e ve 4'e tam bölünenlerin ortalamasý : " + (toplam/sayac));
	}

}
