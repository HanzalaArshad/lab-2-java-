import java.util.*;
class lab_task_6{
public static void main(String[] arg){
int option; 
String order;
System.out.println("WELCOME TO HANZEE'S KITCHEN");
Scanner obj=new Scanner(System.in);
System.out.println("Menu\n 1.chicken burger\n 2.tea\n 3.coffee\n 4.cold drink\n 5.large pizza\n 6.small pizza");
System.out.println("enter choices(1-6):");
option=obj.nextInt();
switch(option)
{
case 1:
  order="chicken burger";
  System.out.println( "price =350 PKR");
  break;
case 2:
  order="tea";
  System.out.println("price =70 PKR");
  break;
  case 3: 
  order="coffee";
  System.out.println("price =100 PKR");
  break;
  case 4:
  order="cold drink";
  System.out.println("price =50 PKR");
  break;
  case 5:
  order="large pizza";
  System.out.println("price =800");
  break;
  case 6:
  order="small pizza";
  System.out.println("price =400");
  break;
  default:
  order="sorry not in menu";
}
  System.out.println("your order is "+order);
 

}
}