package problem04;

public class Main {
	
	public static void main(String[] args) 
	{
		String[] dari = new String[20];
		int zero=0;
		int first=0;
		
		for(int i=0;i<20;i++)
		{
			int dol = (int)(Math.random()*2);
			if(dol==0 && zero!=20) {
				dari[i]="#";
				zero++;
			}
			else if(dol==1 && first!=20) {
				dari[i]="O";
				first++;
			}
		}
		for(String i:dari) {
			System.out.print(i);
		}
		
		
	}

}
