import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int firstdig=num/100;
    int secdig=((num/10)%10);
    int lastdig=num%10;
    int reverse=(lastdig*100)+(secdig*10)+(firstdig);
    System.out.println(reverse);
  }
}