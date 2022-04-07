import java.util.Arrays;
import java.util.Scanner;



public class DizideSiralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutunu yazýnýz : ");
		int n = input.nextInt();
		int [] dizi = new int[n];
		
		for(int i=0;i<dizi.length;i++)
		{
			System.out.print("Dizinin " + (i+1) + " .elemanlarýný yazýnýz : ");
			dizi[i] = input.nextInt();
		}
        System.out.println("Dizinin Sýralanmýþ Hali ");
		
		Arrays.sort(dizi);
		for(int i = 0; i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
	}

}
