import java.util.Scanner;

public class AsalBulma {
	
	static int asal(int i,int sayi)
	{
		if(sayi == i)
		{
			return 0;
		}
		else if(sayi % i == 0)
		{
			return 1;
		}
		else {
			return asal(i+1,sayi);
		}
	}

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
        
	System.out.print("Sayiyi giriniz: ");
        int kontrol = input.nextInt();

        if (asal(2, kontrol)==0){
            System.out.print(kontrol+" Asal sayidir");
        }else {
            System.out.print(kontrol+" Asal degildir");
        }

    }

}
