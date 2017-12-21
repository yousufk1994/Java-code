import java.util.Scanner;

public class table {
	Scanner scan=new Scanner(System.in);
	
	int user;
	int no;
	int limit;
	int startingpoint;
	
	public int tables(){
		
		
		System.out.println("Enter your value");
		user=scan.nextInt();
		System.out.println("Enter your starting point");
		startingpoint=scan.nextInt();
		System.out.println("Limit of your table?");
		limit=scan.nextInt();
		if(limit>=startingpoint){
		for(no=startingpoint;no<=limit;no++){
		int table=user*no;
		System.out.println(user+ "\t*\t" +no+ "\t=\t" +table);
		}
		}
		else{
			System.out.println("Error:your starting point is greater than your limit");
			return user;
		}	
		return user;
	}
	public void calling(){
		
	     
		for(int aad=1;aad<=1000;aad++){
			aad=tables();	
		}
	}

	public static void main(String[] args) {

		table n=new table();
		n.tables();
		n.calling();
	}

}