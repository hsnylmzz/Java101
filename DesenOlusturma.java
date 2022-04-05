import java.util.Scanner;

public class DesenOlusturma {
    static void DesenOlustur(int sayi)
    {
    	if(sayi <= 0)
    	{
    		System.out.print(" " + sayi);
    		return;
    	}
    	System.out.print(" " + sayi);
    	DesenOlustur(sayi-5);
    	System.out.print(" " + sayi);
    }
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        int x;
        
        while(true)
        {
        	System.out.print("N Sayýsý : ");
        	x = input.nextInt();
        	System.out.print("Çýktýsý : ");
        	DesenOlustur(x);
        	System.out.println("\n");
        }
	}

}
