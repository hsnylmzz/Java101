import java.util.Scanner;

public class UsAlma {

	static double UsHesapla(int taban, int us){
        if (us == 0) return 1;
        return UsHesapla(taban, us-1)*taban;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Taban Giriniz : ");
		int x = input.nextInt();
		System.out.print("Üs Giriniz : ");
		int y = input.nextInt();
		double result = UsHesapla(x,y);
		System.out.println("Sonuç : " + result);

	}

}
