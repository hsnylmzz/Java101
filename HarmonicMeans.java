
public class HarmonicMeans {

	public static void main(String[] args) {
		int dizi[] = {3,2,5,9,2};
		double average = 0.0;
		double sum = 0;
		for(int i = 0; i< dizi.length;i++)
		{
			sum += 1.0/dizi[i];
		}
		average = dizi.length/sum;
       System.out.println("Harmonik Ortalama : " + average);
	}

}
