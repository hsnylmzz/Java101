import java.util.Scanner;

public class ��geninAlan�ve�evresi {

	public static void main(String[] args) {
		int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.println("Birinci Kenar : ");
        a = input.nextInt();
        System.out.println("�kinci Kenar : ");
        b = input.nextInt();
        System.out.println("���nc� Kenar : ");
        c = input.nextInt();
        double u = (a+b+c)/2;
        double �evre = 2 * u;
        double alan = 0.0;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("��genin Alan� : " + alan);
        System.out.println("��genin �evresi : " + �evre);
	}

}
