import java .util.*;
import java.util.HashMap;
import java.util.Date;
public class Reservation {
    private static HashMap<String, String> userDatabase = new HashMap<>();
public static void main(String args[]){
    
    
    Scanner sc = new Scanner(System.in);
   boolean t ;
    System.out.println("===============================WELCOME ===================================");
System.out.println(    "===========================REGISTER/LOGIN================================");
System.out.println("Enter 1 to register ");
System.out.println("Enter 2 if Already registered and continue to login page");
int num = sc.nextInt();
sc.nextLine();

    if(num==1){
    System.out.println("====Enter the registration details====");
    System.out.println("Enter your name:");
    String name= sc.nextLine();
    System.out.println("Create Password :");
    String password = sc.nextLine();
    
    if (userDatabase.containsKey(name)) {
        System.out.println("Username already taken. Please choose another.");
    } else {
        userDatabase.put(name, password);
        System.out.println("===Your registration was successfull===");
    }
    }else if(num==2){}
    System.out.println("====Enter the login details====");
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    
    System.out.println("Enter Password :");
    String password = sc.nextLine();
    if (userDatabase.containsKey(name) && userDatabase.get(name).equals(password)) {
        System.out.println("Login successful!");
    } else {
        
        System.exit(0);
        
       
    
    }
    
    


    
    int price = 50;
    String from=null;
    String To = null;
    String Name= null;
    int prn=0;
    String Class = null;
    int money = 0;
    //from station 
    System.out.println("~~~~~~~~~~~~~~~~~~Enter the required information~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("=======================From Station=========================================");
    
    System.out.println(" From station :- \n 1.Pune \n 2.Mumbai \n 3.Delhi \n 4.Nagpur");
    int ENTER = sc.nextInt();
    
    
    
   
    switch(ENTER)
    {
        case 1 : from = "Pune";
        System.out.println("Pune");
        break;
        case 2 :from = "Mumbai";
        System.out.println("Mumbai");
        break; 
        case 3 :from = "Delhi";
        System.out.println("Delhi");
        break;
        case 4 :from = "Nagpur";
        System.out.println("Nagpur");
        break;
        case 5:System.out.println("***check your Input***");
        break;

    }
    System.out.println("=========================To Station=========================================");
    System.out.println(" To station:- \n 1.Pune \n 2.Mumbai \n 3.Delhi \n 4.Nagpur");
    int n = sc.nextInt();
    
    
  
   
    switch(n)
    {
        case 1 : To = "Pune";
        System.out.println("Pune");
        break;
        case 2 :To = "Mumbai";
        System.out.println("Mumbai");
        break;
        case 3 :To = "Delhi";
        System.out.println("Delhi");
        break;
        case 4 : To = "Nagpur";
        System.out.println("Nagpur");
        break;
        case 5:System.out.println("***check your Input***");
        break;

    }
    
    String[]ID={"Pune Express","Mumbai Express","Delhi Express","Nagpur Express"};
    int PRN []={1232345,4563456,1246795,3455678};
    System.out.println("=======================================Select train==============================");
    System.out.println( " Select Train :-\n 1.Pune Express \n 2.Mumbai Express \n 3. Delhi Express \n 4.Nagpur Express");
    int train = sc.nextInt();
    switch(train){
        
        case 1 : Name = (ID[0]);
                 prn = (PRN[0]);
        System.out.println("Name of the train is :"+ID[0]);
        System.out.println("PRN of the train is :"+PRN[0]);
        break;
        case 2 : Name = (ID[1]);
                 prn = (PRN[1]);
        System.out.println("Name of the train is :"+ID[1]);
        System.out.println("PRN of the train is :"+PRN[1]);
        break;
        case 3 : Name = (ID[2]);
                 prn = (PRN[2]);
        System.out.println("Name of the train is :"+ID[2]);
        System.out.println("PRN of the train is :"+PRN[2]);
        break;
        case 4 : Name = (ID[3]);
                 prn = (PRN[3]);
        System.out.println("Name of the train is :"+ID[3]);
        System.out.println("PRN of the train is :"+PRN[3]);
        break;
        case 5:System.out.println("***check your Input***");
        break;
        

        
     }
    System.out.println("=================================Number of  Passengers ========================================");
    System.out.println("Enter the number of Passengers:");
    int Passengers = sc.nextInt();
    System.out.println("Number of Passengers :"+ Passengers);
    
    System.out.println("==========================================Select Class =========================================");
   
   System.out.println(" 1.AC CLASS \n 2.SLEEPER CLASS \n 3.GENERAL CLASS");
   
   int a  = sc.nextInt();
   if(a==1){
    Class = "AC Class";
    money  = (Passengers*30)+(Passengers*price);
    System.out.println("AC CLASS");
    System.out.println("Total Money to Pay =");
    System.out.println(money);
   }if(a==2){
    Class = "Sleeper class";
    money = (Passengers*20)+(Passengers*price);
    System.out.println("SLEEPER CLASS");
    System.out.println("Total Money to Pay =");
    System.out.println(money);
   }if(a==3){
    Class = "General Class";
    money = (Passengers*price);
    System.out.println("GENERAL CLASS");
    System.out.println("Total Money to Pay =");
    System.out.println(money);
   }
   System.out.println("***********************************************************************************");
   System.out.println(" --- --- --- --- --- --- --=====TICKET...COPY======--- --- --- --- -- --- --- ---");
   System.out.println("                               INDIAN RAILWAYS                                      ");
   Date date = new Date();
   System.out.println("                          "+ date.toString()                                                     );
   System.out.println("No of Passengers : " +Passengers +"                   "+"Selected Class : " +Class          );
   System.out.println("From Station : " +from+ "------------------------------->>" +"To Station : " +To            );
   System.out.println("Train Name :" + Name + "                                "+"PRN :" + prn                   );
   System.out.println("Total tO PAY : " +money                                                                        );
   System.out.println("************************HAVE A HAPPY AND SAFE JOURNEY*******************************");
   System.out.println("Enter 1 to Cancel ticket\nEnter 2 to conform ticket ");
   int action = sc.nextInt();
   if(action==1){
    System.out.println("^^^^^^^^^^^^ Ticket Cancelled !! ^^^^^^^^^^^^^^^");
   }else{
    System.out.println("<<<<<< Congratulations!!! Ticket Booked Successfully >>>>>>>");
   }
            

}
}        



  
    
  
   

    
  
    


   








