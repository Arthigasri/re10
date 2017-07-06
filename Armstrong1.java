# re10
import java.io.*;
import java.util.*;
public class Armstrong1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,temp,c=0;
    a=sc.nextInt();
    
    int n=153;
    
    temp=0;
    while(n>0)
    {
      a=n%10;
      n=n/10;
      c=c+(a*a*a);
    }
    if(temp==c)
    System.out.println("Armstrong");
    else
    
    System.out.println("Not armstrong");
  }
}
      
