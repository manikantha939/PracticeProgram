package PatternProgram;

public class Program12 {
	/*
 	A 3 4 5
 	3 B 5 6
 	4 5 c 7
 	5 6 7 D
	*/
	
	public static void main(String[] args) {
		int n = 4;
		approach1(n);
		System.out.println("----------------");
		approach2(n);
	}
	
	public static void approach1(int n) {
		int count=0;
        for (int i = 0; i < n; i++) {
        	int num = 2+count;
            for (int j = 0; j < n; j++) {
            	if(i==j) {
            		System.out.print((char)(65+i)+" ");
            		num++;
            	}else if(i==0 || j==0){
            		System.out.print(num+" ");
            		num++;
            	}else {
            		System.out.print(num+" ");
            		num++;
            	}
            }
            System.out.println();
            count++;
        }
	}
	
	public static void approach2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
            	if(i==j) {
            		System.out.print((char)(65+i)+" ");
            	}else {
            		System.out.print((i+j)+" ");
            	}
            }
            System.out.println();
        }
	}
	
	
}

                       