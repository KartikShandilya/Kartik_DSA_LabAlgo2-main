
public class BubbleSort {

	public void sort(int[] currency) {
		int i,j,temp;
		for(i=0;i<currency.length-1;i++)
		{
			for(j=0;j<currency.length-1-i;j++)
			{
				if(currency[j]<currency[j+1])
				{		
					temp=currency[j];
					currency[j]=currency[j+1];
					currency[j+1]=temp;
				}
			}
		}
	}

}

