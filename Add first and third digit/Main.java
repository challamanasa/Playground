import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n_firstdig=n/100;
      int n_thirddig=n%10;
      int sum=n_firstdig+n_thirddig;
      System.out.println(sum);
	}
}