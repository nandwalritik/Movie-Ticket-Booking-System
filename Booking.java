class Booking extends User{
public Scanner sc = new Scanner(System.in);
int ClientTheatre;
int ClientMovie;
int ClientShowTime;
int Quantity;
void MovieInput(){
System.out.println("Select a Theatre 1 or 2 or 3 or 4");
ClientTheatre = sc.nextInt();
System.out.println("Select a Movie 1 or 2 or 3");
ClientMovie = sc.nextInt();
System.out.println("Select a Showtime 1 or 2 or 3");
ClientShowTime=sc.nextInt();
System.out.println("Enter the Quantity According to Availibility Displayed");
Quantity = sc.nextInt();


}
 User U = new User();
    void DisplayTicketInfo(){
    	System.out.print("Name : "+U.getName()+"\t\t\t"+"E-Mail : "+U.getEmailId()+"\n");
    	System.out.println("Theatre : "+U.getSelectedTheatre(ClientTheatre)+"\tMovie : "+U.getSelectedMovie(ClientMovie));
    	System.out.println("Show Time : "+U.getSelectedShowTime(ClientShowTime)+"\tTotal Cost : "+Quantity*U.getCost());
    	System.out.println("City : "+U.getCity()+"\tPin Code : "+U.getPinCode())
    
    
    }




}
