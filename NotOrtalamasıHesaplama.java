import java.util.Scanner;

public class NotOrtalamas�Hesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Matematik Notunuz : " );
		int mat = input.nextInt();
		System.out.print("Fizik Notunuz : ");
		int fizik = input.nextInt();
		System.out.print("Kimya Notunuz : ");
		int kimya = input.nextInt();
		System.out.print("T�rk�e Notunuz : ");
		int T�rk�e = input.nextInt();
		System.out.print("Tarih Notunuz : ");
		int tarih = input.nextInt();
		System.out.print("M�zik Notunuz : ");
		int m�zik = input.nextInt();
		
		double ort = (mat + fizik + kimya + T�rk�e + tarih + m�zik)/6;
		
		boolean sonuc= ort >=60;
        String gectiKaldi = sonuc ? " Gecti" : " Kald�";
        System.out.println("Ortalama : " + ort + gectiKaldi);
		

	}

}
