package PatternProgram;

public class Program20 {
	/*
	 	*
	 	* *
	 	* * * 
	 	* * * *
	 	* * *
	 	* *
	 	* 
	     
	*/
	
	public static void main(String[] args) {
		int n = 5;
		for(int i=n;i>=(n-i);i--) {
			for(int j=n;j>=Math.abs(i);j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

                       