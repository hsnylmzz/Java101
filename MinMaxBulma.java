import java.util.Scanner;

public class MinMaxBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi;
		System.out.println("Bir sayi giriniz: ");
		sayi = input.nextInt();
		int dizi[]= {15,12,788,-1,1,-778,2,0};
		int min = dizi[0];
		int max = dizi[dizi.length - 1];
		
		for(int i=0;i<dizi.length;i++)
		{
			if(dizi[i] < sayi)
			{
				min = dizi[i];
			}
		}
		
		for(int i=0;i<dizi.length;i++)
		{
			if(dizi[i] > sayi)
			{
				max = dizi[i];
			}
		}
       
		System.out.println("Girilen Sayýdan Küçük En Yakýn Sayý : " + min);
		System.out.println("Girilen Sayýdan Büyük En Yakýn Sayý : " + max);
	}

}
