import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.println("May�n Tarlas�na Ho�geldiniz !");
		System.out.println("Girmek �stedi�iniz Boyutunuzu Se�iniz ");
		/*System.out.print("Sat�r Say�s� : ");
        row = scan.nextInt();
        System.out.print("S�tun Say�s� : ");
        column = scan.nextInt();
        */
        May�nTarlas� may�n = new May�nTarlas�(5,5);
        may�n.run();
	}

}
