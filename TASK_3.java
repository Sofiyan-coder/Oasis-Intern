import java.util.Scanner;

class ATM{
    static Scanner input = new Scanner(System.in);
    static int choose,back;
    static double withdraw,balance=10000,balance2=5000,deposit,depos,post,transfer,acc_num;
    static String us,user_id="SBI000153",ps,user_pin="1234";
    static int []array;

    public  static void start(){
        System.out.println("Enter User id");
        us= input.nextLine();
        if (us.equals(user_id)){
            pin();
        }
        else {
            System.err.println("Incorrect User id");
            start();
        }
    }

    public static void pin() {
        System.out.println("Enter PIN");
        ps= input.nextLine();
        if (ps.equals(user_pin)){
            hello();
        }
        else {
            System.err.println("Incorrect  PIN");
            pin();
        }


    }

    public static void hello() {
        System.out.println("Hello visitor"+user_id);
        options();
    }

    public static void options(){
        System.out.println("\t========================");
        System.out.println("\t| Choose Your Option    |");
        System.out.println("\t========================");
        try{
            System.out.println("\t========================");
            System.out.println("\t|  [1] History          |");
            System.out.println("\t|  [2] Withdraw         |");
            System.out.println("\t|  [3] Deposit          |");
            System.out.println("\t|  [4] Balance         |");
            System.out.println("\t|  [5] Transfer            |");
            System.out.println("\t|  [6] Exit             |");
            System.out.println("\t========================");
            choose=input.nextInt();
            if(choose==1){

            }//end of if(choose==1)
            else if(choose==2){
                if(balance==0){
                    System.err.println();
                    System.err.println("\t=============================");
                    System.err.println("\t| Sorry You Dont Have        |");
                    System.err.println("\t| Enough Balance to Withdraw |");
                    System.err.println("\t=============================");
                    System.err.println();
                    options();
                }
                else{
                    Withdraw.withdraw();}
            }//end of else if(choose==2)
            else if(choose==3){
                Deposite.deposite();
            }
            else if(choose==4){
                CheckBalance.check();
            }//end of else if(choose==3)
            //else if(choose==4){
                //hist();
            else if(choose==5){
                Transfer.transfer();
            }
            else if(choose==6){
                System.out.println();
                System.out.println("\t| GoodBye! Thank You |");
                System.out.println();
            }//end of else if(choose==5)
            else if(choose<=6){
                System.err.print("\t| Invalid Input |");
                options();
            }//end of else if(choose<5)
        }//end of try
        catch(Exception b){
            System.err.print("\t| Invalid Input |");
            input.nextLine();
            options();
        }//end of catch
    }//end of static void option


}
class Deposite{


   public static void deposite()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account number");
        int acc_num = in.nextInt();
        System.out.println("Enter Deposite amount");
        ATM.deposit= in.nextDouble();





        if(acc_num==1)
    {
        caldepo();
        ATM.options();

    }
        else if (acc_num==2){
        caldepo();
        ATM.options();

        }
        else {
        System.out.println("Invalid Account  Number");
    }

}
    public  static void caldepo(){
        System.out.println("\t"+ATM.deposit+"is Successfully Deposited from your Account");
        ATM.balance+=ATM.deposit;
        ATM.balance2+=ATM.deposit;


    }
}




class Withdraw{


   public static void withdraw()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account number");
        int acc_num = in.nextInt();
        System.out.println("Enter Withdraw amount");
        ATM.withdraw= in.nextDouble();
        if(acc_num==1)
        {
            calwith();
            ATM.options();
        }
        else if (acc_num==2){
            calwith();
            ATM.options();
        }
        else {
            System.out.println("Invalid Account  Number");
        }

    }
    public  static void calwith(){
        if (ATM.withdraw>ATM.balance || ATM.withdraw>ATM.balance2 ){
            System.out.println("Sorry you don't have sufficient Balance");
            withdraw();

        }
        else {
            System.out.println("\t"+ATM.withdraw+"is Successfully withdraw from your Account");
            ATM.balance-=ATM.withdraw;
            ATM.balance2-=ATM.withdraw;

        }

    }

}
class Transfer{


    public static void transfer()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  amount to transfer to other account");
        ATM.transfer= in.nextDouble();
        if (ATM.transfer>ATM.balance){
            System.out.println("Sorry you don't have sufficient Balance");
            transfer();
        }

    else{
        System.out.println("\t"+ATM.transfer+"is Successfully Transfer from your Account");
        ATM.balance-=ATM.transfer;
        ATM.balance2+=ATM.transfer;
        ATM.options();
    }
}

}
class CheckBalance{


   public  static void check()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Balance No.");
        ATM.acc_num= in.nextDouble();
        if (ATM.acc_num==1){
            System.out.println("Your Balance is "+ATM.balance);

        }
        else if (ATM.acc_num==2){
            System.out.println("Your Balance is "+ATM.balance);
        }
        else {
            System.out.println("Enter Valid Account Number");
        }

        }

}



public class TASK_3 {

    public static void main(String[] args) {
        ATM obj = new ATM();
        ATM.start();




    }


}
