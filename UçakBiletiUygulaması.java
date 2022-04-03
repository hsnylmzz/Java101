import java.util.Scanner;

public class UçakBiletiUygulamasý {

	public static void main(String[] args) {
		int yaþ,mesafe,isReturn,tarif=1;
		double indirimli_tutar, yaþ_indirimi = 1,normal_tutar,gidiþ_mesafesi = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Mesafe giriniz: ");
		mesafe = input.nextInt();
		
		System.out.println("Yaþ giriniz: ");
		yaþ = input.nextInt();
		
		System.out.println("Yolculuk Tipini Giriniz :\n1 - Tek-Yön\n2 - Gidiþ-Dönüþ");
        isReturn = input.nextInt();

        if (mesafe < 0 || yaþ < 0 || isReturn < 0 || isReturn > 2) {
            System.out.println("Please check the information that you provided.");
        }
        else
        {
        	if (yaþ < 12) {
                yaþ_indirimi = 0.5;
            } else if (yaþ >= 12 && yaþ < 24) {
                yaþ_indirimi = 0.9;
            } else if (yaþ > 65) {
                yaþ_indirimi = 0.7;
            }

            if (isReturn == 2) {
                gidiþ_mesafesi = 1.6;
            }

            double sum = mesafe * tarif * yaþ_indirimi * gidiþ_mesafesi;
            System.out.print("Total Tutar: " + sum);
        }
	}

	

}
