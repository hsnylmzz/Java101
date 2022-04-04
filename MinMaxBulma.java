import java.util.Scanner;

public class MinMaxBulma {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int n, num, max = 0, min = 0;

	        System.out.println("Kaç adet sayý girmek istiyorsunuz? : ");
	        n = input.nextInt();


	        for (int i = 1; i <= n; i++) {
	            do {
	                System.out.println("Lütfen " + i + ".sayý giriniz : ");
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

	        System.out.println("Sayýnýn Minimum Deðeri : "+min);
	        System.out.println("Sayýnýn Maksimum Deðeri : "+max);

	}

}
