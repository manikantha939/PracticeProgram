package PatternProgram;


public class Program01 {
	
	public static void main(String[] args) {
		int n =5;
		for(int i= 0;i<n ;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i= 0;i<n ;i++) {
			System.out.print((char)(i+65)+ " ");
		}
		System.out.println();
		for(int i= 0;i<n ;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i= 0;i<n ;i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
                       