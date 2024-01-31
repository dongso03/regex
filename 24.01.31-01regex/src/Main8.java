import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main8 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher("4564656");
		
		System.out.println(m.matches());
	}
}
