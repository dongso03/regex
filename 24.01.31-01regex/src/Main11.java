import java.util.regex.Pattern;

public class Main11 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-z]");
		System.out.println(p.matcher("A").matches());
		System.out.println(p.matcher("@").matches());
		System.out.println(p.matcher("1").matches());
	}
}
