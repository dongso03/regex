import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z]{1,}");
		Matcher m = p.matcher("asdfsadsadfsad");
		
		System.out.println(m.matches());
	}
}
