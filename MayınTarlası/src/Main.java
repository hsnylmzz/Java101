import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.println("Mayýn Tarlasýna Hoþgeldiniz !");
		System.out.println("Girmek Ýstediðiniz Boyutunuzu Seçiniz ");
		/*System.out.print("Satýr Sayýsý : ");
        row = scan.nextInt();
        System.out.print("Sütun Sayýsý : ");
        column = scan.nextInt();
        */
        MayýnTarlasý mayýn = new MayýnTarlasý(5,5);
        mayýn.run();
	}

}
