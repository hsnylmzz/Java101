import java.util.Scanner;

public class DairedeAlanveCevreHesaplama {

	public static void main(String[] args) {
		double pi = 3.14;
		int r,alpha;
		double alan;
		Scanner input = new Scanner(System.in);
		r = input.nextInt();
		alpha = input.nextInt();
		
		alan = pi * r * r * alpha / 360;
        System.out.println("Daire Diliminin Alaný : " + alan);
	}


}
