package exception_Handling;

//import java.io.FileNotFoundException;

public class Division {

	public static void main(String[] args) {
		
		run();
		
		
	}
	public static void run() {
		
		try{
			act();
			}catch(Exception e){
				System.out.println("caught an excepton");
				e.printStackTrace();
			}
		
	}
    public static void act() {
		
		int x = 5;
		int y = 0;
		System.out.println(x/y);
		
	}

}
//move, proceed, act, charge, run, goAhead,