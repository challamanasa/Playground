import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int first_dig=num/10;
      int last_dig=num%10;
      int sum=first_dig+last_dig;
      System.out.println(sum);
	}
}