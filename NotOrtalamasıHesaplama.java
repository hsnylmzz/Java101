import java.util.Scanner;

public class NotOrtalamasýHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Matematik Notunuz : " );
		int mat = input.nextInt();
		System.out.print("Fizik Notunuz : ");
		int fizik = input.nextInt();
		System.out.print("Kimya Notunuz : ");
		int kimya = input.nextInt();
		System.out.print("Türkçe Notunuz : ");
		int Türkçe = input.nextInt();
		System.out.print("Tarih Notunuz : ");
		int tarih = input.nextInt();
		System.out.print("Müzik Notunuz : ");
		int müzik = input.nextInt();
		
		double ort = (mat + fizik + kimya + Türkçe + tarih + müzik)/6;
		
		boolean sonuc= ort >=60;
        String gectiKaldi = sonuc ? " Gecti" : " Kaldý";
        System.out.println("Ortalama : " + ort + gectiKaldi);
		

	}

}
