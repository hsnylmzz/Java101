import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName, password,cevap,newPassword;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanýcý Adýnýz : ");
        userName = scan.nextLine();
        System.out.print("Þifreniz : ");
        password = scan.nextLine();
        
        if (userName.equals("patika") &&(password.equals("java123")) )
        {
            System.out.println("Giris yaptiniz!");
        }
        else
        {
            System.out.println("Bilgileriniz yanlis!");
            System.out.print("Sifrenizi yenilemek ister misiniz:evet / hayir cevabinizi yazin:");
            cevap=scan.nextLine();
            if (cevap.equals("evet"))
            {
                System.out.print("Lutfen yeni sifrenizi girin:");
                newPassword=scan.nextLine();
                if (newPassword.equals("java123"))
                {
                    System.out.println("Yeni sifre eski sifre ile ayni olamaz");
                    System.out.println("Tekrar olusturmak istediginiz sifreyi yaziniz:");
                    newPassword=scan.nextLine();
                    if (newPassword.equals("java123"))
                    {
                        System.out.println("Yeni sifre eski sifre ile ayni olamaz");
                    }
                    else 
                    {
                        System.out.println("Yeni sifre basarili bir sekilde olusturuldu.");
                    }

                }
                else
                {
                    System.out.println("Yeni sifre olusturuldu.");
                }

            }
            else if (cevap.equals("hayir"))
            {
                System.out.println("Sifrenizi yenilememek istediginizi bildirdiniz.");
            }

        }

	}

}
