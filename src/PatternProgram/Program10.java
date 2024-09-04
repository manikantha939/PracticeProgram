package PatternProgram;

public class Program10 {
	/*
	 D C B A
	 D C B A
	 D C B A
	 D C B A
	*/
	
	public static void main(String[] args) {
		int n = 4;
       for (int i = n; i > 0; i--) {
           for (int j = n; j > 0; j--) {
             System.out.print((char)(64+j)+" ");
           }
           System.out.println();
       }
	}
}
                       