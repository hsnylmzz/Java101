import java.util.Scanner;

public class HarmonikSayiBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Harmonik Serisi Bulunacak Say� Giriniz : ");
        int n = input.nextInt();
        double harmonik = 0;
        for (int i =1; i <= n; i++)
        {
            harmonik += (1.0/i);
        }
        System.out.println("Say�n�n Harmonik De�eri : " + harmonik);

	}

}
