package PatternProgram;

public class Program15 {
	/*
	   		 *
	   	   * *
	     * * *
	   * * * *
	 * * * * *
	*/
	
	public static void main(String[] args) {
		int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
            	System.out.print("  ");	
            }
            for (int j = 0; j <= i; j++) {
            	System.out.print("* ");	
            }
            System.out.println();
        }
        
        System.out.println("------------------");
        int n1=5;
        for(int i=1;i<=n1;i++) {
        	for(int j=1;j<=(n1-i);j++) {
        		System.out.print("  ");
        	}
        	for(int j=0;j<i;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}
}

                       