
public class AsalSayiBulma {

	public static void main(String[] args) {
		for (int i=2; i<100; i++) {
	          boolean AsalSayimi = true;
	          for (int j=2; j<i; j++) {
	              if (i%j == 0) {
	                  AsalSayimi = false;
	                  break;
	              }
	         }
	            
	         if (AsalSayimi) {
	            System.out.print(i + " ");
	         }

	   }

   }
}
