import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,muzik,toplam = 0,counter = 0;
		Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Girin : ");
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100)
        {
        	toplam += mat;
        	counter++;
        }
        
        System.out.print("Fizik Notunuzu Girin : ");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100)
        {
        	toplam += fizik;
        	counter++;
        }
        
        System.out.print("Kimya Notunuzu Girin : ");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100)
        {
        	toplam += kimya;
        	counter++;
        }
        
        System.out.print("T�rk�e Notunuzu Girin : ");
        turkce = input.nextInt();
        if(turkce >= 0 && turkce <= 100)
        {
        	toplam += turkce;
        	counter++;
        }
        
        System.out.print("M�zik Notunuzu Girin : ");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100)
        {
        	toplam += muzik;
        	counter++;
        }
        
        double ort = toplam / counter;
        System.out.println("Ortalaman�z : " + ort);
        if(ort >= 55)
        {
        	System.out.println("Tebrikler s�n�f� ge�tiniz. ");
        }
        else
        {
        	System.out.println("S�n�fta kald�n�z. ");
        }
        
	}

}
