 import java.util.*;
 class lab_task_8{
    public static void main(String[]arg){
        int a,b, ch;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the number");
        a=obj.nextInt();
        System.out.println("enter the number");
        b=obj.nextInt();
        System.out.println("enter choices\n 1 for addition\n 2 for subtraction\n 3for division\n 4 for multiplication");
        ch=obj.nextInt();
        switch(ch){
        case 1:
        System.out.println("the addition of numbers" + (a+b));
        break;
        case 2:
        System.out.println("the subtraction of numbers" + (a-b));
        break;
        case 3:
        System.out.println("the division of numbers"+ (a/b));
        break;
        case 4:
        System.out.println("the multiplication of numbers"+ (a*b));
        break;
        default:
        System.out.println("invalid choices");
}

        


    }
}