import java.util.Scanner;
class lab_task_9{
    public static void main(String[] arg){
        int nof,a=0,b=1,c,i;
        System.out.println("enter number of terms:");
        Scanner obj=new Scanner(System.in);
        nof=obj.nextInt();
        for(i=1;i<=nof;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            
            
            ;
        }
    }
}