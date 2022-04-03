import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int girilen_sayi,n,uslu_sayi = 1;
		System.out.print("Sayý Giriniz : ");
		girilen_sayi = input.nextInt();
		System.out.print("Üs Alýnacak Sayý Giriniz : ");
		n = input.nextInt();
		
		for(int i = 1; i<=n ; i++)
		{
			uslu_sayi *= girilen_sayi;
		}
      System.out.print("Sayýnýn Üssü : " + uslu_sayi);
	}

}
