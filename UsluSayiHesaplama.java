import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int girilen_sayi,n,uslu_sayi = 1;
		System.out.print("Say� Giriniz : ");
		girilen_sayi = input.nextInt();
		System.out.print("�s Al�nacak Say� Giriniz : ");
		n = input.nextInt();
		
		for(int i = 1; i<=n ; i++)
		{
			uslu_sayi *= girilen_sayi;
		}
      System.out.print("Say�n�n �ss� : " + uslu_sayi);
	}

}
