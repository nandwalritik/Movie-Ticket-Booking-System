import java.util.*;
class Movie{
	Scanner sc = new Scanner(System.in);
	int MovieId;
	int TheatreId;
	int Cost;
	Integer [] ar1 = new Integer[100];
	ArrayList<Integer> cap00=new ArrayList<Integer>(Arrays.asList(ar1));
	Collections.fill(cap00,0);
	Integer [] ar2 = new Integer[100];
	ArrayList<Integer> cap01=new ArrayList<Integer>(Arrays.asList(ar2));
	Collections.fill(cap01,0);
	Integer [] ar3 = new Integer[100];
	ArrayList<Integer> cap02=new ArrayList<Integer>(Arrays.asList(ar3));
	Collections.fill(cap02,0);
	Integer [] ar4 = new Integer[100];
	ArrayList<Integer> cap10=new ArrayList<Integer>(Arrays.asList(ar4));
	Collections.fill(cap10,0);
	Integer [] ar5 = new Integer[100];
	ArrayList<Integer> cap11=new ArrayList<Integer>(Arrays.asList(ar5));
	Collections.fill(cap11,0);
	Integer [] ar6 = new Integer[100];
	ArrayList<Integer> cap12=new ArrayList<Integer>(Arrays.asList(ar6));
	Collections.fill(cap12,0);
	Integer [] ar7 = new Integer[100];
	ArrayList<Integer> cap20=new ArrayList<Integer>(Arrays.asList(ar7));
	Collections.fill(cap20,0);
	Integer [] ar8 = new Integer[100];
	ArrayList<Integer> cap21=new ArrayList<Integer>(Arrays.asList(ar8));
	Collections.fill(cap21,0);
	Integer [] ar9 = new Integer[100];
	ArrayList<Integer> cap22=new ArrayList<Integer>(Arrays.asList(ar9));
	Collections.fill(cap22,0);
	String ShowTime= new String[3];
	ShowTime[0] = "09:00 - 12:00";
	ShowTime[1] = "13:00 - 16:00";
	ShowTime[2] = "20:30 - 23:30";
	String Movie = new String[3];
	Movie[0]="";
	Movie[1]="";
	Movie[2]="";
	
	String Theatre = new Theatre[4];
	Theatre[0]="";
	Theatre[1]="";
	Theatre[2]="";
	Theatre[3]="";
	String getSelectedMovie(int i){
		switch(i){
			case 1:
				return this.Movie[0];
				break;
			case 2:
				return this.Movie[1];
				break;
			case 3:
				return this.Movie[2];
				break;								
			default:
				System.out.println("Invalid number selected");
		
		
		}
	
	
	}
	String getSelectedTheatre(int i){
		switch(i){
			case 1:
				return this.Theatre[0];
				break;
			case 2:
				return this.Theatre[1];
				break;
			case 3:
				return this.Theatre[2];
				break;
			case 4:
				return this.Theatre[3];
				break;									
			default:
				System.out.println("Invalid number selected");
		
		
		}
	
	
	}
	String getSelectedShowTime(int i){
		switch(i){
			case 1:
				return this.ShowTime[0];
				break;
			case 2:
				return this.ShowTime[1];
				break;
			case 3:
				return this.ShowTime[2];
				break;
											
			default:
				System.out.println("Invalid number selected");
		
		
		}
	
	
	}
	double getCost(){
		
		return this.Cost;
	
	}
	void setCost(double Cost){
		this.Cost = Cost;
	}
	
	//special rights to update movie and theatre details
	/*
	Features needed to be added :-
		cost of per person
		available seats column
		
	
	
	*/
	void DisplaySlots(){
	System.out.println("Available Theatres With Showtimes");//Displaying showtimes theatres movies
	System.out.println("THEATRE		MOVIE			SHOWTIME	AVAILABLE_SEATS");
	System.out.print(Theatre[0]+"	");
	System.out.print(Movie[0]+"			"+ShowTime[0]+"\t\t\t"Collections.frequency(cap00,0)+"\n");
	System.out.print("       		"+Movie[1]+"			"+ShowTime[1]+"\t\t\t"+Collections.frequency(cap01,0)+"\n");
	System.out.print("       		"+Movie[2]+"			"+ShowTime[2]+"\t\t\t"+Collections.frequency(cap01,0)+"\n\n\n");
	System.out.print(Theatre[1]+"	");
	System.out.print(Movie[0]+"			"+ShowTime[0]+"\n");
	System.out.print("       		"+Movie[1]+"			"+ShowTime[1]+"\t\t\t"+Collections.frequency(cap01,0)+"\n");
	System.out.print("       		"+Movie[2]+"			"+ShowTime[2]+"\t\t\t"+Collections.frequency(cap01,0)+"\n\n\n");
	System.out.print(Theatre[2]+"	");
	System.out.print(Movie[0]+"			"+ShowTime[0]+"\t\t\t"+Collections.frequency(cap01,0)+"\n");
	System.out.print("       		"+Movie[1]+"			"+ShowTime[1]+"\t\t\t"+Collections.frequency(cap01,0)+"\n");
	System.out.print("       		"+Movie[2]+"			"+ShowTime[2]+"\t\t\t"+Collections.frequency(cap01,0)+"\n\n\n");
	System.out.print(Theatre[3]+"	");
	System.out.print(Movie[0]+"			"+ShowTime[0]+"\t\t\t"+Collections.frequency(cap01,0)+"\n");
	System.out.print("       		"+Movie[1]+"			"+ShowTime[1]+"\t\t\t"+Collections.frequency(cap01,0)+"\n");
	System.out.print("       		"+Movie[2]+"			"+ShowTime[2]+"\t\t\t"+Collections.frequency(cap01,0)+"\n");	
	}

}
