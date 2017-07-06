# re10
import java.io.*;
import java.util.*;
public class Factorial
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,i,fact=1;
      a=sc.nextInt();
    int num=5;
    for(i=1;i<=num;i++)
    {
      
      fact=fact*i;
    }
    System.out.println(fact);
  }
} 
