package Pattern;

public class Pattern5 {

	public static void main(String[] args) {
	int n=10;
	for(int i=1;i<n;i++) {
		for(int j=i;j<n;j++)
		{System.out.print(" ");
		
		}
		for(int j=i;j<=2*i-1;j++)
		{System.out.print("*"+" ");
		
		}
		System.out.println();
	}

	}

}
