import java.util.Scanner;

public class Atm�slemleriSwitchCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        String userName, password;
        int select;
        int balance = 1500, price;
        int right = 3;

        while (right > 0) {
            System.out.print("Kullan�c� Ad�n�z : ");
            userName = input.nextLine();
            System.out.print("Parolan�z : ");
            password = input.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankas�na Ho�geldiniz!");
                do {
                    System.out.println("1-Para Yat�rma\n" +
                            "2-Para �ekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-��k�� Yap");
                    System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");

                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktar� : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Para Miktar� : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz !");
                            } else {
                                balance -= price;
                                break;
                            }

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                    }

                } while (select != 4);
                System.out.println("Tekrar G�r��mek �zere . ");
                break;

            } else {
                right--;
                System.out.println("Hatal� Kullan�c� Ad� veya �ifre . Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesab�n�z Bloke olmu�tur l�ften banka ile ileti�ime ge�iniz.");
                } else {
                    System.out.println("Kalan Hakk�n�z : " + right);
                }
            }
        }
	}

}
