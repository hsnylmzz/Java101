import java.util.Scanner;

public class AtmÝslemleriSwitchCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        String userName, password;
        int select;
        int balance = 1500, price;
        int right = 3;

        while (right > 0) {
            System.out.print("Kullanýcý Adýnýz : ");
            userName = input.nextLine();
            System.out.print("Parolanýz : ");
            password = input.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
                do {
                    System.out.println("1-Para Yatýrma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çýkýþ Yap");
                    System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");

                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarý : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Para Miktarý : ");
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
                System.out.println("Tekrar Görüþmek Üzere . ");
                break;

            } else {
                right--;
                System.out.println("Hatalý Kullanýcý Adý veya Þifre . Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabýnýz Bloke olmuþtur lüften banka ile iletiþime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkýnýz : " + right);
                }
            }
        }
	}

}
