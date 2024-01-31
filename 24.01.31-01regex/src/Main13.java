import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main13 {
	public static void main(String[] args) {
		//휴대폰 번호
		//010-XXXX-XXXX
		
		Scanner scan = new Scanner(System.in);
		System.out.println("TelNum?");
		String phonNum = scan.nextLine();
		
		Pattern p = Pattern.compile("010-(\\d{4})-(\\d{4})");
		
		Matcher m = p.matcher(phonNum);
	//	System.out.println(m.matches());
		if(m.find()) {
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
	}
}
