package Model;

public class Customer {
    private  int customerID;
    private String name;
    private String phone;


     public Customer(int customerID , String name, String phone){
         this.customerID = customerID;
         this.name = name;
         this.phone = phone;

     }
     public  String getName(){
         return name;

    }
    public String getPhone(){
         return phone;


    }

}
