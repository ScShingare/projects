import java.util.*;
public class Arrayoutofboundexceptionapp
{
 public static void main(String args[])
 {
  int a[]= new int[5];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
  try
  {
  System.out.println(a[5]);
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
    e.printStackTrace();
  }
 }
}