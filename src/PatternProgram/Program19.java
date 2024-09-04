package PatternProgram;

public class Program19 {
	/*
	 9 9 9 9 9 9 9 9 9
	   7 7 7 7 7 7 7
	     5 5 5 5 5
	       3 3 3
	         1
	     
	*/
	
	public static void main(String[] args) {
//		int n = 10;
//		for(int i=n;i>=1;i--) {
//			int num=i%2;
//			if(num!=0) {
//			for(int j=1;j<=(n-i);j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i;j++) {
//				System.out.print(i+" ");
//			}
//			}
//			System.out.println();
//		}
		
		
		int n = 5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print((2*i)-1+" ");
			}
			System.out.println();
		}
	}
}

                       