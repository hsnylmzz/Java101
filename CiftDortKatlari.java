import java.util.Scanner;

public class CiftDortKatlari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
        int toplam= 0;

        do {
            System.out.print("Sayý Giriniz : ");
            n = input.nextInt();
            if (n % 2 == 0 && (n % 4 == 0))  {
                toplam += n;
            }
        } while (n > 0);
        System.out.println("Toplam : " + toplam);
	}

}
