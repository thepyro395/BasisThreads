public class RunThreads 
{

	public static void main(String[] args) 
  {
		int[] list = new int[3000000];
		long endTime;
		//Run Thread that implements Runnable Interface
		Thread1 task1 = new Thread1("First Thread", list);
		task1.start();
		
		
		//Run Thread that inherits from Thread Class
		Thread2 task2 = new Thread2("Second Thread", list);
		task2.start();

		Thread3 task3 = new Thread3("Third Thread", list);
		task3.start();
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime);
	
	}

}
