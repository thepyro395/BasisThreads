public class Thread1 extends Thread{
	   //private String name;
	   private int[] list;
		
		public Thread1(String name, int[] list){
			this.list=list;
		}
		
		@Override
		public void run() {
			 int index;
			 long start;
			 start = System.currentTimeMillis();
		   for(index = 0; index<1000000;index ++)
		   {
		  	 list[index] = list[index] + 100;
		   }
		   long end = System.currentTimeMillis();
				long elaspedTime = end-start;
				System.out.println("Elapsed Time = " + elaspedTime);
		}

}
