import java.util.Scanner;

public class EbobEkokBulmaWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("n1 say�s�n� giriniz :");
        int n1 = input.nextInt();
        System.out.print("n2 say�s�n� giriniz : ");
        int n2 = input.nextInt();

        int k = n1;
        int ebob = 1;
        int ekok = 1;

        while (k > 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                ekok = (n1 * n2) / ebob;
                break;
            }
            k--;


        }
        System.out.println(" Ebob : " + ebob + " Ekok : " + ekok);


    }


}


