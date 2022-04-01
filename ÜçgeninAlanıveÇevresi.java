import java.util.Scanner;

public class ÜçgeninAlanýveÇevresi {

	public static void main(String[] args) {
		int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.println("Birinci Kenar : ");
        a = input.nextInt();
        System.out.println("Ýkinci Kenar : ");
        b = input.nextInt();
        System.out.println("Üçüncü Kenar : ");
        c = input.nextInt();
        double u = (a+b+c)/2;
        double çevre = 2 * u;
        double alan = 0.0;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alaný : " + alan);
        System.out.println("Üçgenin Çevresi : " + çevre);
	}

}
