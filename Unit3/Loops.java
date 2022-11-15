import java.util.Scanner;
public class Loops {
	public static void main(String[] args){
		printEven();
		nameGetter();

}
	public static void nameGetter(){
		String response = "";
		Scanner scan = new Scanner(System.in);
		while (!(response=scan.next()).equals("stop")) System.out.println("Hello " + response);


	}

	public static void printEven(){
		int x = 0;
		while (x<=100){
			if (x % 2 == 0){
				System.out.println(x);
			}
			x+=1;
		}


	}
}

