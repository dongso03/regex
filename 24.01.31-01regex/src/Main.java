import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		//문자열 정보
		Scanner scan  =new Scanner(System.in);
		System.out.println("ID?");
		String id = scan.nextLine();
	
		int length = id.length();
		if(length <1 ||length >10) {
			System.out.println("ID must be 1~10 length");
			return;
		}
		Pattern p = Pattern.compile("[\\s]");
		if(p.matcher(id).find()) {
			System.out.println("ID cant use emptyspace");
			return;
		}
		Pattern p2 = Pattern.compile("[a-z]+");
		if(!p2.matcher(id).matches()) {
			System.out.println("ID must be small letter");
			return;
		}
		System.out.println("Its proper ID");
	}
}
