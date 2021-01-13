package Timing;
public class Timing {
	
		
	public static void main(String[] args) {
	int[] matrix=new int[100000];
	for (int i=0;i<100000;i++) {
	matrix[i]=(int)(Math.random()*100000);
	}
	
	Timer timer=new Timer();
	
    Sort(matrix);
    timer.stop();
    
	System.out.println("Elapsed time in milliseconds is ="+timer.getelapsedtime());
	}
	
	

	public static void Sort(int[] matrix) {

		for (int k=0;k<99999;k++) {
			int min=k;
			for(int j=k+1;j<100000;j++) {
				if(matrix[min]>matrix[j]) {
					k=j;
		}
	}
	
			if (min != k) {
	            int temp = matrix[k];
	            matrix[k] = matrix[min];
	            matrix[min] = temp;
			}
		
		}
	}
}
	

			class Timer{
				private  long startTime=System.currentTimeMillis();
				private long stopTime=startTime;
				public Timer() {
					
				}
				public  long getstart() {
					return this.startTime;
					
				}
				public long getstop() {
					return this.stopTime;
					
				}
				public void start() {
					this.startTime=System.currentTimeMillis();
				}
				public void stop() {
					this.stopTime=System.currentTimeMillis();
				}
				public long getelapsedtime() {
					
					
					return (this.stopTime-this.startTime);
					
					
				}
			}
		
	
