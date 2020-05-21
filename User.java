import java.util.*;
class User extends Movie{
    
    String Name;
    short Age;
    String EmailId;
    long MoblileNumber;
    String Gender;
    String City;
    int PinCode;
    public Scanner sc =  new Scanner(System.in);
    
    void setCity(String City){
    	this.City = City;
    }
    String getCity(){
    	return this.City;
    }
    int getPinCode(){
    	return this.PinCode;
    }
    void setPinCode(){
    	this.PinCode = PinCode;
    }
    
    void setName(String Name){
        this.Name = Name;
    }
    String getName(){
        return this.Name;
    }
    void setAge(int Age){
        this.Age = Age;
    }
    short getAge(){
        return this.Age;
    }
    void setEmailId(String EmailId){
        this.EmailId = EmailId;
    }
    String getEmailId(){
        return this.EmailId;
    }
    void setMobileNumber(long MobileNumber){
        this.MoblieNumber = MobileNumber;
   
    }
    long getMobileNumber(){
        return this.MobileNumber;
    }
    
    void GeneralInput(){
    	System.out.println("Enter Your Name");
    	setName(sc.nextLine());
    	System.out.println("Enter Your E-Mail ID");
    	setEmailId(sc.nextLine());
    	System.out.println("Enter Your Age");
    	setAge(sc.nextInt());
    	System.out.println("Enter Your City");
    	setCity(sc.nextLine());
    	System.out.println("Enter Your Pin Code");
    	setPinCode(sc.nextInt());
    	
    	System.out.println("Enter Your Mobile Number");
    	setMobielNumber(sc.nextInt());
    	
    
    
    }//gender and display
    
   
}
