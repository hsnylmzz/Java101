import java.util.Scanner;

public class Ters��gen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Basamak Say�s� Gir : ");
		int n = input.nextInt();
		
		
		for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
		
		for(int i = n ; i > 0 ; i--)
		{
			for(int j = n ; j > i - 1 ; j--)
			{
				System.out.print(" ");
			}
			
			for(int k = 1 ; k <= 2 * i - 1 ; k++)
			{
                System.out.print("*");
            }
           System.out.println();
		}

	}

}
