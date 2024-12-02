public class Customer {
    public String name;
    public String email;
    

    public Customer(String name, String email,String password) {
        this.name = name;
        this.email = email;
   
    }

    public static void emailVerify(String email){
       
        boolean result = false;
        for(int i = 0;i < email.length();i++){
            char a = email.charAt(i);
            if(a == '@' && a == '.'){
            result = true;
            }
    }
    if(result == true){
        System.out.println("Email is valid");
    }
    else{
        System.out.println("Email is not valid");
    }
}

    public void displayCustomer() {
        System.out.println("Customer Name: " + name + ", Email: " + email);
    }
}
