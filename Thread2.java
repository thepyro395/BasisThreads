public class Thread2 extends Thread
{
	   //private String name;
	   private int[] list;
		
		public Thread2(String name, int[] list)
		{
			//this.name=name;
			this.list = list;
		}
		
		@Override
		public void run() 
		{
			long start;
			start = System.currentTimeMillis();
			
		   int index;
		   for(index = 1000000; index<2000000;index ++)
		   {
		  	 list[index] = list[index] + 100;
		   }
			long end = System.currentTimeMillis();
			long elaspedTime = end-start;
			System.out.println("Elapsed Time = " + elaspedTime);
		}
}
