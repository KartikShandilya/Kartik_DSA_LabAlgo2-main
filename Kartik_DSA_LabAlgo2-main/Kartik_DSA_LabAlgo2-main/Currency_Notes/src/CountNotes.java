

public class CountNotes {

	public void counting(int[] currency, int amt) {
		int noteqty[]=new int[currency.length];
		int i;

		for(i=0;i<currency.length;i++)
		{
			noteqty[i]=amt/currency[i];
			amt=amt%currency[i];
		}

		System.out.println("Your payment approach in order to give min no of notes will be");

		for(i=0;i<currency.length;i++)
		{
			if(noteqty[i]!=0)
				System.out.println(currency[i] + ":" + noteqty[i]);
		}

	}

}
