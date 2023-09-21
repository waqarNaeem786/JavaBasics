public class conditional{

public static void main(String[] args){
	
	// if-else statement
	// calculate leap year it is divisible by 400 and 4 but not by 100 
	int year = 2023;
	if(((year%4 == 0)&&(year%100 != 0))||(year%100 == 0)){
		System.out.println("Leap Year");
	}else{
	
		System.out.println("not a Leap Year");
	}

// switch statement


	String level = "Expert";
	int lvl = 0;

	switch(level){
		case "beginner": lvl =1;
		break;
		case "intermediate": lvl = 2;
		break;
		case "Expert": lvl = 3;
		break;
		default: lvl = 0;
		break;	
	}

	System.out.println("Your Level is " + lvl);

// for-Loop

for(int i = 1; i<=5;i++){
for(int j = 1; j<=i; j++){
	System.out.print("* ");

}
System.out.println();
} 	





}

}
