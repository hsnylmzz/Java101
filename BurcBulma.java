import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int month, day;
        

        System.out.print("Do�du�unuz ay : ");
        month = input.nextInt();

        System.out.print("Do�du�unuz g�n : ");
        day = input.nextInt();


        if (month == 1) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                    System.out.println("O�lak burcu");
                } else
                    System.out.println("Kova burcu");
        }


        if (month == 2) {
            if (day >= 1 && day <= 28)
                if (day < 20) {
                	System.out.println("Kova burcu");
                } else
                	System.out.println("Bal�k burcu ");
        }

        if (month == 3) {
            if (day >= 1 && day <= 31)
                if (day < 21) {
                	System.out.println("Bal�k burcu ");
                } else 
                	System.out.println("Ko� burcu ");
        }

        if (month == 4) {
            if (day >= 1 && day <= 30)
                if (day < 21) {
                	System.out.println("Ko� burcu ");
                } else 
                	System.out.println("Bo�a burcu ");
        }

        if (month == 5) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                	System.out.println("Bo�a burcu ");
                } else
                	System.out.println("�kizler burcu ");
        }

        if (month == 6) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                	System.out.println("�kizler burcu ");
                } else 
                	System.out.println("Yenge� burcu ");
        }

        if (month == 7) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                	System.out.println("Yenge� burcu ");
                } else 
                	System.out.println("Aslan burcu ");
        }

        if (month == 8) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                	System.out.println("Aslan burcu ");
                } else 
                	System.out.println("Ba�ak burcu ");
        }

        if (month == 9) {
            if (day >= 1 && day <= 30)
                if (day < 23) {
                	System.out.println("Ba�ak burcu ");
                } else 
                	System.out.println("Terazi burcu ");
        }

        if (month == 10) {
            if (day >= 1 && day <= 31)
                if (day < 23) {
                	System.out.println("Terazi burcu ");
                } else
                	System.out.println("Akrep burcu ");
        }

        if (month == 11) {
            if (day >= 1 && day <= 30)
                if (day < 22) {
                	System.out.println("Akrep burcu ");
                } else 
                	System.out.println("Yay burcu ");
        }

        if (month == 12) {
            if (day >= 1 && day <= 31)
                if (day < 22) {
                	System.out.println("Yay burcu ");
                } else 
                	System.out.println("O�lak burcu ");
        }

    }

}
