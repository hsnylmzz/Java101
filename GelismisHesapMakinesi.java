import java.util.Scanner;

public class GelismisHesapMakinesi {
	private static Object sonuc;

	static void plus()
	{
		Scanner input = new Scanner(System.in);
		int sayi,sonuc = 0,i = 1;
		while(true)
		{
		     System.out.print(i++ + ". sayý :");
                     sayi = input.nextInt();
             if (sayi == 0) {
                break;
            }
            sonuc += sayi;
		}
		System.out.println("Sonuç : " + sonuc);
		
	}
	static void minus()
	{
		Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = input.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayý :");
            sayi = input.nextInt();
            if (i == 1) {
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
	}
    static void times()
    {
    	Scanner input = new Scanner(System.in);
        int sayi, sonuc = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayý :");
            sayi = input.nextInt();

            if (sayi == 1)
                break;

            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }
    static void divided()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = input.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayý :");
            sayi = input.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }
    
    static void power()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Taban deðeri giriniz :");
        int taban = input.nextInt();
        System.out.print("Üs deðeri giriniz :");
        int exponent = input.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= exponent; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç : " + sonuc);
    }
    
    static void factorial()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Sayý giriniz :");
        int n = input.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }

        System.out.println("Sonuç : " + sonuc);
    }
    static void modular()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = input.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayý : ");
            sayi = input.nextInt();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 olduðundan sayýnýn modu yoktur");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc %= sayi;
        }

        System.out.println("Sonuç : " + sonuc);
    }
    static void RectangleAreaPerimater()
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Dikdörtgenin 1.Kenarý Yazýnýz : ");
    	int width = input.nextInt();
    	System.out.print("Dikdörtgenin 2.Kenarý Yazýnýz : ");
    	int height = input.nextInt();
    	
    	int area = width * height;
    	int perimeter = 2 * (width + height);
    	System.out.println("Dikdörtgenin Alaný : " + area);
    	System.out.println("Dikdörtgenin Çevresi : " + perimeter);
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Ýþlemi\n"
                + "2- Çýkarma Ýþlemi\n"
                + "3- Çarpma Ýþlemi\n"
                + "4- Bölme iþlemi\n"
                + "5- Üslü Sayý Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabý\n"
                + "0- Çýkýþ Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir iþlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                	modular();
                	break;
                case 8:
                	RectangleAreaPerimater();
                	break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

	}


}
