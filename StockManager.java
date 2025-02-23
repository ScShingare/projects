/*Q2. ProductOufOfStockException
Description: Suppose  consider we are working on InventoryControl Application and we have one module name as StockManagment and we want to store product count in stack if product is less than 0 then system should generate run time exception to us name as ProductOutOfStockException*/

import java.util.*;
import java.io.*;

 class ProductException extends RuntimeException{
 public ProductException(String msg){
    super(msg);
 }
}

public class StockManager{
 private int stock;

StockManager(int stock){
this.stock=stock;
 }

public void sellProduct(int qty){
 if(stock-qty<0){
  throw new ProductException("product is out of stock");

 }
 stock = stock-qty;
 System.out.println("product sold,available stock:"+stock);
}
 public void addStock(int qty){
  stock=stock+qty;
  System.out.println("stock added,available stock:"+stock);
 }


 public static void main(String args[]){
  Scanner sc =new Scanner(System.in);
  System.out.println("enter initial stock");
  int stock = sc.nextInt();
 
  StockManager sm =new StockManager(stock);
  
  
int choice;
  do{
System.out.println("enter 1 to sell product and  enter 2 to add product or enter 0 to exit");
 choice=sc.nextInt();

  if(choice==1){
   System.out.println("enter qty to sell");
    int qty = sc.nextInt();
   try{
  sm.sellProduct(qty);
}
 catch(ProductException e){
  e.printStackTrace();
 }
 }
  
  else if(choice==2){
   System.out.println("enter qty to add");
    int addqty = sc.nextInt();
  try{
    sm.addStock(addqty);
}
 catch(ProductException e){
  e.printStackTrace();
 }
 }
 else{
   System.out.println("invalid choice ,enter 0 to exit,1 to sell product 0r 2 to addproduct");
  }
}
 while(choice!=0);
  
}
}

  
 
