import java.util.*;

class Authentication{
    static HashMap<String,String> login = new HashMap<String,String>();
    static Scanner in = new Scanner(System.in);
    List<Integer> Pnr_no = new ArrayList<Integer>();
    Dictionary trainList = new Hashtable();
  // Dictionary passgr_detail = new Hashtable();
    HashMap<String,String[]> passengers = new HashMap<String,String[]>();
    Dictionary<Integer, String> passgr_detail = new Hashtable<Integer, String>();

    public  static void Start()
    {}
        

     void Sign_up() {
      
        String username,password;
        System.out.println("Enter Username");
        username=in.nextLine();
        System.out.println("Enter Password");
        password=in.nextLine();
        login.put(username,password);
        
    }

    void Sign_in() {
        String inusername,inpassword;
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Username");
        inusername=in.nextLine();
        System.out.println("Enter Password");
        inpassword=in.nextLine();

        
        //Check whether entered password with username
        if (inpassword.equals(login.get(inusername))){
            options();

        }
        else
        {
            System.out.println("Password invalid");
        }
    }

    public void options() {
        System.out.println("1.Reservation Details");
        System.out.println("2.Cancellation");
        System.out.println("Enter Choice");
         int ch = in.nextInt();

        switch (ch){

            case 1:
                Reservation_sys();
                break;

            case 2:
                cancellation();
                break;

            default:
                System.out.println("Enter Valid Choice");

        }

    }

    public void cancellation() {
        Integer PNR_no;
        System.out.println("Enter PNR Number");
        PNR_no = in.nextInt();


                System.out.println("Details" + passgr_detail.get(trainList));
                System.out.println("\n");



        options();

    }

    public void Reservation_sys() {
        Scanner in =new Scanner(System.in);


        trainList.put("10022","LTT");
        trainList.put("10023","Pudocherry Express");
        trainList.put("10024","Chennai Express");
        String train_no;
        String class_type,date,from_place,to_place;

        int n =trainList.size();
        for (int i = 0; i < n; i++) {


            System.out.println("Enter Train Number");
            System.out.println("10022\n" + "10023\n" + "10024\n");
            train_no = in.nextLine();
            passgr_detail.put(1, train_no);
            //passgr_detail.put((String) trainList.get(train_no));
            System.out.println("Train Name is :" + trainList.get(train_no));
            System.out.println("Enter Class type ");
            class_type = in.nextLine();
            passgr_detail.put(1,class_type);
            System.out.println("Enter Date of Journey");
            date = in.nextLine();
            passgr_detail.put(1, date);
            System.out.println("Enter From place :");
            from_place = in.nextLine();
            passgr_detail.put(1,from_place);
            System.out.println("Enter Destination place");
            to_place = in.nextLine();
            passgr_detail.put(1,to_place);
            System.out.println("Enter insert");
            String insert = in.nextLine();
            options();

        }




    }
}

public class TASK_1 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        Authentication obj = new Authentication();
        do {
            System.out.println("1.Sign In");
            System.out.println("2.Sign Up");
            System.out.println("Enter Choice");
            int ch = in.nextInt();
            switch (ch) {
                case 1 -> obj.Sign_in();
                case 2 -> obj.Sign_up();
                default -> System.out.println("Enter valid choice");
            }
        }while (true);
    }



}

