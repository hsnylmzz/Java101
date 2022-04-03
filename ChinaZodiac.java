import java.util.Scanner;

public class ChinaZodiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yil;
		System.out.print("Doðum Yýlýnýzý Girin : ");
		yil = input.nextInt();
		
		if(yil % 12 == 0)
		{
			System.out.println("Zodyaðýnýz Maymun");
		}
        
		if(yil % 12 == 1)
		{
			System.out.println("Zodyaðýnýz Horoz");
		}
		
		if(yil % 12 == 2)
		{
			System.out.println("Zodyaðýnýz Köpek");
		}
		
		if(yil % 12 == 3)
		{
			System.out.println("Zodyaðýnýz Domuz");
		}
		
		if(yil % 12 == 4)
		{
			System.out.println("Zodyaðýnýz Fare");
		}
		
		if(yil % 12 == 5)
		{
			System.out.println("Zodyaðýnýz Öküz");
		}
		
		if(yil % 12 == 6)
		{
			System.out.println("Zodyaðýnýz Kaplan");
		}
		
		if(yil % 12 == 7)
		{
			System.out.println("Zodyaðýnýz Tavþan");
		}
		
		if(yil % 12 == 8)
		{
			System.out.println("Zodyaðýnýz Ejderha");
		}
		
		if(yil % 12 == 9)
		{
			System.out.println("Zodyaðýnýz Yýlan");
		}
		
		if(yil % 12 == 10)
		{
			System.out.println("Zodyaðýnýz At");
		}
		
		if(yil % 12 == 11)
		{
			System.out.println("Zodyaðýnýz Koyun");
		}
	}

}
