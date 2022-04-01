import java.util.Scanner;

public class VücutKitleÝndeksiHesaplama {

	public static void main(String[] args) {
		double boy,indeks;
		int kilo;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
		boy = input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo = input.nextInt();
		indeks = kilo / (boy * boy);
		System.out.println("Vücut Kitle Ýndeksiniz : " + indeks);

	}

}
