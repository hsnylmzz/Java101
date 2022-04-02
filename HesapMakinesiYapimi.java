import java.util.Scanner;

public class HesapMakinesiYapimi {

	public static void main(String[] args) {
		int sayi1,sayi2,toplam,fark,carpim,secenek;
		double bolum;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý Giriniz : ");
		sayi1 = input.nextInt();
		sayi2 = input.nextInt();
		System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçiniz : ");
		secenek = input.nextInt();
		switch(secenek)
		{
		   case 1:
		       toplam = sayi1 + sayi2;
		       System.out.println("Sayýnýn Toplamý : " + toplam);
		       break;
		   
		   case 2:
		       fark = sayi1 - sayi2;
			   System.out.println("Sayýnýn Farký : " + fark);
			   break;
		   
		   case 3:
			   carpim = sayi1 * sayi2;
			   System.out.println("Sayýnýn Çarpýmý : " + carpim);
			   break;
		   
		   case 4:
			   if(sayi2 != 0)
			   {
				   bolum = sayi1 / sayi2;
				   System.out.println("Sayýnýn Bölümü : " + bolum);
			   }
			   else
			   {
				   System.out.println("Sayý sýfýra bölünemez.Tanýmsýzdýr.");
			   }
			   break;
		   default:
		    	System.out.println("Geçersiz Ýþlem");
		    	break;
		}
		

	}

}
