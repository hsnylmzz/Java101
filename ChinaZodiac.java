import java.util.Scanner;

public class ChinaZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yil;
		System.out.print("Do�um Y�l�n�z� Girin : ");
		yil = input.nextInt();
		
		if(yil % 12 == 0)
		{
			System.out.println("Zodya��n�z Maymun");
		}
        
		if(yil % 12 == 1)
		{
			System.out.println("Zodya��n�z Horoz");
		}
		
		if(yil % 12 == 2)
		{
			System.out.println("Zodya��n�z K�pek");
		}
		
		if(yil % 12 == 3)
		{
			System.out.println("Zodya��n�z Domuz");
		}
		
		if(yil % 12 == 4)
		{
			System.out.println("Zodya��n�z Fare");
		}
		
		if(yil % 12 == 5)
		{
			System.out.println("Zodya��n�z �k�z");
		}
		
		if(yil % 12 == 6)
		{
			System.out.println("Zodya��n�z Kaplan");
		}
		
		if(yil % 12 == 7)
		{
			System.out.println("Zodya��n�z Tav�an");
		}
		
		if(yil % 12 == 8)
		{
			System.out.println("Zodya��n�z Ejderha");
		}
		
		if(yil % 12 == 9)
		{
			System.out.println("Zodya��n�z Y�lan");
		}
		
		if(yil % 12 == 10)
		{
			System.out.println("Zodya��n�z At");
		}
		
		if(yil % 12 == 11)
		{
			System.out.println("Zodya��n�z Koyun");
		}
	}

}
