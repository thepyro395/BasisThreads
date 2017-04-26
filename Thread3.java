public class Thread3 extends Thread
{
	  // private String name;
	   private int[] list;
		
		public Thread3(String name, int[] list)
		{
			this.list=list;
		}
		
		@Override
		public void run() 
		{
			 int index;
			 long start;
			 start = System.currentTimeMillis();
		   for(index = 2000000; index<3000000;index ++)
		   {
		  	 list[index] = list[index] + 100;
		   }
		   long end = System.currentTimeMillis();
				long elaspedTime = end-start;
				System.out.println("Elapsed Time = " + elaspedTime);
			
		}
}
