import java.util.Scanner;

public class HesapMakinesiYapimi {

	public static void main(String[] args) {
		int sayi1,sayi2,toplam,fark,carpim,secenek;
		double bolum;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Say� Giriniz : ");
		sayi1 = input.nextInt();
		sayi2 = input.nextInt();
		System.out.print("Yapmak �stedi�iniz ��lemi Se�iniz : ");
		secenek = input.nextInt();
		switch(secenek)
		{
		   case 1:
		       toplam = sayi1 + sayi2;
		       System.out.println("Say�n�n Toplam� : " + toplam);
		       break;
		   
		   case 2:
		       fark = sayi1 - sayi2;
			   System.out.println("Say�n�n Fark� : " + fark);
			   break;
		   
		   case 3:
			   carpim = sayi1 * sayi2;
			   System.out.println("Say�n�n �arp�m� : " + carpim);
			   break;
		   
		   case 4:
			   if(sayi2 != 0)
			   {
				   bolum = sayi1 / sayi2;
				   System.out.println("Say�n�n B�l�m� : " + bolum);
			   }
			   else
			   {
				   System.out.println("Say� s�f�ra b�l�nemez.Tan�ms�zd�r.");
			   }
			   break;
		   default:
		    	System.out.println("Ge�ersiz ��lem");
		    	break;
		}
		

	}

}
