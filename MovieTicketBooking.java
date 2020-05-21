class MovieTicketBooking{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("\t\tWelcome to Piramal Online Ticket Booking System");
	System.out.println("Enter 1.Owner\n2.Guest Mode As User");
	int n = sc.nextInt();
	if(n==1){
	System.out.println("Enter Owner Password ");
	String s = sc.next();
	if(s.equals("OWNER")){
		Owner obj = new Owner();
		obj.UpdateTheatre();
		obj.UpdateMovie();
	
	}
	}
	else if(n==2)
	{
		User mv = new User();
		
		mv.GeneralInput();
		mv.DisplaySlots();
		Booking B = new Booking();
		B.MovieInput();
		B.DisplayTicketInfo();
		
	
	
	}
	

}
}
