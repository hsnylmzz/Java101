import java.util.Scanner;

public class Art�kY�lHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Y�l Giriniz : ");
		int y�l = input.nextInt();
		if(y�l % 4 == 0)
		{
			if(y�l % 100 == 0 && y�l % 400 != 0)
			{
				System.out.println(y�l + " y�l� art�k y�l de�ildir");
			}
			else
			{
				System.out.println(y�l + " y�l� art�k y�ld�r");
			}
		}
		else
		{
			System.out.println(y�l + " y�l� art�k y�l de�ildir");
		}

	}

}
