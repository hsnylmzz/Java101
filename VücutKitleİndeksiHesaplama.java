import java.util.Scanner;

public class V�cutKitle�ndeksiHesaplama {

	public static void main(String[] args) {
		double boy,indeks;
		int kilo;
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen boyunuzu (metre cinsinden) giriniz : ");
		boy = input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo = input.nextInt();
		indeks = kilo / (boy * boy);
		System.out.println("V�cut Kitle �ndeksiniz : " + indeks);

	}

}
