import java.util.Scanner;

public class ArtıkYılHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Yıl Giriniz : ");
		int yıl = input.nextInt();
		if(yıl % 4 == 0)
		{
			if(yıl % 100 == 0 && yıl % 400 != 0)
			{
				System.out.println(yıl + " yılı artık yıl değildir");
			}
			else
			{
				System.out.println(yıl + " yılı artık yıldır");
			}
		}
		else
		{
			System.out.println(yıl + " yılı artık yıl değildir");
		}

	}

}
