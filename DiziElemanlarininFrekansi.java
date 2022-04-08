import java.util.Arrays;

public class DiziElemanlarininFrekansi {
	
	static boolean isSame(int [] arr,int value)
	{
		for(int i:arr)
		{
			if(i == value)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int [] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		System.out.println("Dizi : " + Arrays.toString(dizi));
		int [] sonuc = new int[dizi.length];
		
		int startIndex = 0;
		int count = 0;
		for(int i=0;i<dizi.length;i++)
		{
			for(int j=0;j<dizi.length;j++)
			{
				if(dizi[i] == dizi[j])
				{
					count++;
				}
			}
			
			if(!isSame(sonuc,dizi[i]))
			{
				sonuc[startIndex++] = dizi[i];
				System.out.println(dizi[i] + " sayýsý " + count + " kere tekrar edildi");
				count = 0;
			}
		}
		
	}

}
