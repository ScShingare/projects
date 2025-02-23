import java.util.*;
import java.io.*;
 public class Bufferwriter
 {
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
    
   try(BufferedWriter a = new BufferedWriter(new FileWriter("File1",true)))
   {
    a.newLine();
    a.write(str);
    System.out.println("added successfully");
   }
   catch(IOException e)
   {
     e.printStackTrace();
   }
   finally
   {
    System.out.println("Happy?");
    sc.close();
   }
   
  }
 }