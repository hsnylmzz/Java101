import java.util.Arrays;
import java.util.Scanner;



public class DizideSiralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutunu yaz�n�z : ");
		int n = input.nextInt();
		int [] dizi = new int[n];
		
		for(int i=0;i<dizi.length;i++)
		{
			System.out.print("Dizinin " + (i+1) + " .elemanlar�n� yaz�n�z : ");
			dizi[i] = input.nextInt();
		}
        System.out.println("Dizinin S�ralanm�� Hali ");
		
		Arrays.sort(dizi);
		for(int i = 0; i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
	}

}
