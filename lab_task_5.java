import java.util.*;
class lab_task_5{
	public static void main(String[] args){
		String email,password;
		String[][] userinfo = { {"hanzala@gmail.com","00000000"}, {"bilal@hotmail.com","11111111"},{"choudry@yahoo.com","22222222"},
        {"danish@gmail.com","33333333"},{"fakhir@gmail.com", "44444444"}};
            System.out.println("welcome to pakistan ARMY'S WEBSITE ");
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter Your Email Address: ");
			email = obj.nextLine();
            if(email.equalsIgnoreCase(userinfo[0][0])|| email.equalsIgnoreCase(userinfo[1][0]) || email.equalsIgnoreCase(userinfo[2][0])|| email.equalsIgnoreCase(userinfo[3][0]) || email.equalsIgnoreCase(userinfo[4][0]))
            {
                System.out.println("enter the passward");
            }
            else 
            {
                System.out.print("invalid email");
            }
            password=obj.nextLine();
           if(password.equalsIgnoreCase(userinfo[0][1])|| password.equalsIgnoreCase(userinfo[1][1])||password.equalsIgnoreCase(userinfo[2][1])||password.equalsIgnoreCase(userinfo[3][1])||password.equalsIgnoreCase(userinfo[4][1]))
            {
              
            System.out.println("welcome to the the login page");
        }
          else
{
             System.out.print("sorry wrong password");
    }
}
}