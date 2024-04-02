import java.util.Random;

public class PrintingRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		long  tendigitnum =  (long) (random.nextDouble()*9_000_000_000L);
		
		//System.out.println(tendigitnum);
		//int RandomNumbervalue =0;
		
		for (int i=0;i<10;i++)
		{
			int RandomNumber = random.nextInt(10);
			
			System.out.print(RandomNumber);
			//****8One way of printing 
//			long RandomTendit = (long)(random.nextDouble()*9_000_000_000L);
//			System.out.println(RandomTendit);
		}
	
		

	}

}
