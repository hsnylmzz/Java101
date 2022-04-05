import java.util.Scanner;

public class GelismisHesapMakinesi {
	private static Object sonuc;

	static void plus()
	{
		Scanner input = new Scanner(System.in);
		int sayi,sonuc = 0,i = 1;
		while(true)
		{
			System.out.print(i++ + ". say� :");
            sayi = input.nextInt();
            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
		}
		System.out.println("Sonu� : " + sonuc);
		
	}
	static void minus()
	{
		Scanner input = new Scanner(System.in);
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = input.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". say� :");
            sayi = input.nextInt();
            if (i == 1) {
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }

        System.out.println("Sonu� : " + sonuc);
	}
    static void times()
    {
    	Scanner input = new Scanner(System.in);
        int sayi, sonuc = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". say� :");
            sayi = input.nextInt();

            if (sayi == 1)
                break;

            if (sayi == 0) {
                sonuc = 0;
                break;
            }
            sonuc *= sayi;
        }

        System.out.println("Sonu� : " + sonuc);
    }
    static void divided()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = input.nextInt();
        double sayi, sonuc = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". say� :");
            sayi = input.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("B�leni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Sonu� : " + sonuc);
    }
    
    static void power()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Taban de�eri giriniz :");
        int taban = input.nextInt();
        System.out.print("�s de�eri giriniz :");
        int exponent = input.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= exponent; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonu� : " + sonuc);
    }
    
    static void factorial()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Say� giriniz :");
        int n = input.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }

        System.out.println("Sonu� : " + sonuc);
    }
    static void modular()
    {
    	Scanner input = new Scanner(System.in);
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = input.nextInt();
        int sayi, sonuc = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". say� : ");
            sayi = input.nextInt();
            if (i != 1 && sayi == 0) {
                System.out.println("B�leni 0 oldu�undan say�n�n modu yoktur");
                continue;
            }
            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc %= sayi;
        }

        System.out.println("Sonu� : " + sonuc);
    }
    static void RectangleAreaPerimater()
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Dikd�rtgenin 1.Kenar� Yaz�n�z : ");
    	int width = input.nextInt();
    	System.out.print("Dikd�rtgenin 2.Kenar� Yaz�n�z : ");
    	int height = input.nextInt();
    	
    	int area = width * height;
    	int perimeter = 2 * (width + height);
    	System.out.println("Dikd�rtgenin Alan� : " + area);
    	System.out.println("Dikd�rtgenin �evresi : " + perimeter);
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yap";

        do {
            System.out.println(menu);
            System.out.print("L�tfen bir i�lem se�iniz :");
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
                    System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

	}


}
