//This class access must not be available to everyone
private class Owner extends Movie{
	Scanner sc = new Scanner();
	Movie ow = new Movie();
	void UpdateMovie(){
		System.out.println("Enter the names all 3 of updated Movies:-");
		for(int i=0;i<=2;i++){
		String a = sc.nextLine();
		setMovie(i+1,a);
		}
	
	}
	void UpdateTheatre(){
		System.out.println("Enter the names all 4 of updated Theatres:-");
		for(int i=0;i<=3;i++){
		String b = sc.nextLine();
		setMovie(i+1,b)
		}
	
	}
	void setMovie(int i,String s){
		switch(i){
			case 1:
				ow.Movie[0]=s;
				break;
			case 2:
				ow.Movie[1]=s;
				break;
			case 3:
				ow.Movie[2]=s;
				break;								
			default:
				System.out.println("Invalid number selected");
	}
	void setTheatre(int i,String s){
			switch(i){
			case 1:
				ow.Theatre[0]=s;
				break;
			case 2:
				ow.Theatre[1]=s;
				break;
			case 3:
				ow.Theatre[2]=s;
				break;
			case 4:
				ow.Theatre[3]=s;
				break;									
			default:
				System.out.println("Invalid number selected");
		
	
	
	
	
	}


}

