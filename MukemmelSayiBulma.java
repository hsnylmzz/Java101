import java.util.Scanner;

public class MukemmelSayiBulma {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        System.out.print("Sayý giriniz: ");
        int sayi=input.nextInt();
        int toplam=0;
        for (int i=1; i<sayi; i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (toplam==sayi)
            System.out.println("Girdiðiniz sayý mükemmel sayýdýr.");
        else
            System.out.println("Girdiðiniz sayý mükemmel sayý deðildir.");

	}

}
