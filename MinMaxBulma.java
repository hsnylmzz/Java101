import java.util.Scanner;

public class MinMaxBulma {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int n, num, max = 0, min = 0;

	        System.out.println("Ka� adet say� girmek istiyorsunuz? : ");
	        n = input.nextInt();


	        for (int i = 1; i <= n; i++) {
	            do {
	                System.out.println("L�tfen " + i + ".say� giriniz : ");
	                num = input.nextInt();
	            }
	            while (num < 0);


	            if (num > max) {
	                if (min == 0) {
	                    min = num;
	                }
	                max = num;
	            } else if (num < min) {

	                min = num;
	            }

	        }

	        System.out.println("Say�n�n Minimum De�eri : "+min);
	        System.out.println("Say�n�n Maksimum De�eri : "+max);

	}

}
