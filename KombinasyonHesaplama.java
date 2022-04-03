import java.util.Scanner;

public class KombinasyonHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonu için;");
        System.out.print("n sayýsýný girin: ");
        int n= input.nextInt();
        System.out.print("r sayýsýný girin: ");
        int r= input.nextInt();
        int toplamn=1,toplamr=1,toplamneksi=1;
        for(int i=1;i<=n;i++){
            toplamn=toplamn*i;
        }
        System.out.println("n!= "+toplamn);
        for(int j=1;j<=r;j++){
            toplamr=toplamr*j;
        }
        System.out.println("r!= "+toplamr);
        for(int k=1;k<=(n-r);k++){
            toplamneksi=toplamneksi*k;
        }
        System.out.println("(n-r)!= "+toplamneksi);
        int sonuc=toplamn/(toplamr*(toplamneksi));
        System.out.println(sonuc);

	}

}
