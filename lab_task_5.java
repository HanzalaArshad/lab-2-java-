import java.util.*;
class hh{
	public static void main(String[] args){
		String email,password;
		String[][] userinfo = { {"hanzala@gmail.com","00000000"}, {"bilal@hotmail.com","11111111"},{"choudry@yahoo.com","22222222"},
        {"danish@gmail.com","33333333"},{"fakhir@gmail.com", "44444444"}};

            System.out.println("welcome to pakistan ARMY'S WEBSITE ");
			Scanner obj = new Scanner(System.in);

			System.out.println("Enter Your Email Address: ");
			email = obj.next();
            System.out.println("Enter Your Password: ");
			password = obj.next();
        
                int i;
                boolean AccountExists = false;

                for( i=0;i< userinfo.length;i++){
                    if(userinfo[i][0].equals(email)) {
                        AccountExists = true;
                        
                        if( userinfo[i][1].equals(password))  {
                            System.out.println(" you are login ");
                            break;
                        }
                    }
                }
                if(i == userinfo.length)  
                  System.out.println(":Invalid Credentials");

                if(AccountExists)  
                  System.out.println(":Account Exists");
                else
                  System.out.println(":Account Doesn't exists");
 
        }
}
//SAME  PROGRAM THROUGH HASHTABLES
import java.util.*;
class hashcode{
 public static void main(String [] args)
 {
    String email, password;
    Hashtable<String,String>[] account = new Hashtable[]{new Hashtable<String,String>(),new Hashtable<String,String>(),new Hashtable<String,String>(),new Hashtable<String,String>(),new Hashtable<String,String>()};
    account[0].put("NAME","HANZALA ARSHAD ARAIN");
    account[0].put("FATHER NAME  ","MUHAMMAD ARSHAD ARAIN");
    account[0].put("SURNAME","ARAIN");
    account[0].put("EMAIL","hanzala@hmail.com");
    account[0].put("PASSWORD","00000000");
    account[0].put("NATIONALITY","PAKISTANI");

    account[1].put("NAME","MUHAMMAD TALHA BASHIR ");
    account[1].put("FATHER NAME  ","MUHAMMAD BASHIR ");
    account[1].put("SURNAME","MALIK AWAN");
    account[1].put("EMAIL","talha@hmail.com");
    account[1].put("PASSWORD","10000000");
    account[1].put("NATIONALITY","PAKISTANI");

    account[2].put("NAME","AHSAN IQBAL");
    account[2].put("FATHER NAME  ","MUHAMMAD IQBAL");
    account[2].put("SURNAME","SANDHO JUTT");
    account[2].put("EMAIL","ahsan@hmail.com");
    account[2].put("PASSWORD","20000000");
    account[2].put("NATIONALITY","PAKISTANI");

    account[3].put("NAME","HAMZA JAVAID");
    account[3].put("FATHER NAME  ","MUHAMMAD JAVAID ");
    account[3].put("SURNAME","SHIEKH");
    account[3].put("EMAIL","hS@hmail.com");
    account[3].put("PASSWORD","30000000");
    account[3].put("NATIONALITY","PAKISTANI");

    account[4].put("NAME","FAHAD MUMTAZ");
    account[4].put("FATHER NAME  ","MUMTAZ");
    account[4].put("SURNAME","GADDI PATHAN");
    account[4].put("EMAIL","fahad@hmail.com");
    account[4].put("PASSWORD","40000000");
    account[4].put("NATIONALITY","PAKISTANI");

    Scanner obj=new Scanner(System.in);
    System.out.println("ENTER YOUR EMAIL ADDRESS:");
    email=obj.next();
    System.out.println("ENTER YOUR PASSWORD:");
    password=obj.next(); 
    int i;
    boolean AccountExists = false;
     
    for(i=0; i<5;i++)
    {
         String EMAIL = account[i].get("EMAIL" );
         String PASSWORD = account[i].get("PASSWORD" );
         if(EMAIL.equals(email))
         {
              AccountExists= true;
              if( PASSWORD.equals(password))  {
                System.out.println("you are logged in");
                System.out.println("\n\n\n\n********YOUR PROFILE********");
                System.out.println("YOUR NAME  "+account[i].get("NAME"));
                System.out.println("YOUR FATHER NAME  "+account[i].get("FATHER NAME"));
                System.out.println("YOUR SURNAME  "+account[i].get("SURNAME"));
                System.out.println("YOUR EMAIL  "+account[i].get("EMAIL"));
                System.out.println("YOUR NATIONALITY  "+account[i].get("NATIONALITY"));

                break;
              }
            }
        }    
        
        if(AccountExists)  
        System.out.println(":Account Exists");
      else
        System.out.println("SORRY WRONG EMAIL AND PASSWORD");
            }
            
    }
         
 
