import java.util.Scanner;

public class U�akBiletiUygulamas� {

	public static void main(String[] args) {
		int ya�,mesafe,isReturn,tarif=1;
		double indirimli_tutar, ya�_indirimi = 1,normal_tutar,gidi�_mesafesi = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Mesafe giriniz: ");
		mesafe = input.nextInt();
		
		System.out.println("Ya� giriniz: ");
		ya� = input.nextInt();
		
		System.out.println("Yolculuk Tipini Giriniz :\n1 - Tek-Y�n\n2 - Gidi�-D�n��");
        isReturn = input.nextInt();

        if (mesafe < 0 || ya� < 0 || isReturn < 0 || isReturn > 2) {
            System.out.println("Please check the information that you provided.");
        }
        else
        {
        	if (ya� < 12) {
                ya�_indirimi = 0.5;
            } else if (ya� >= 12 && ya� < 24) {
                ya�_indirimi = 0.9;
            } else if (ya� > 65) {
                ya�_indirimi = 0.7;
            }

            if (isReturn == 2) {
                gidi�_mesafesi = 1.6;
            }

            double sum = mesafe * tarif * ya�_indirimi * gidi�_mesafesi;
            System.out.print("Total Tutar: " + sum);
        }
	}

	

}
