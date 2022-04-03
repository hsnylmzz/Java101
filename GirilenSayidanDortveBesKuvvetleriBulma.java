import java.util.Scanner;

public class GirilenSayidanDortveBesKuvvetleriBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int girilen_sayi;
		System.out.print("Bir sayi giriniz : ");
		girilen_sayi = input.nextInt();
		System.out.println("4'ün katlari ");
		for(int i = 1; i<= girilen_sayi ; i*=4)
		{
			System.out.println(i);
		}
		System.out.println("5'in katlari ");
		for(int i = 1; i<= girilen_sayi ; i*=5)
		{
			System.out.println(i);
		}
	}

}
