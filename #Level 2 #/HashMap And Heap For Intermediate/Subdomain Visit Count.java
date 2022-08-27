// https://nados.io/question/subdomain-visit-count
import java.util.*;

public class Main {
    
	public static List<String> subdomainVisits(String[] cpdomains) {
		// write your code here

		return null;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] cpd = new String[n];
		for (int i = 0; i < cpd.length; i++) {
			cpd[i] = s.nextLine();
		}
		List<String> ans = subdomainVisits(cpd);
		Collections.sort(ans);
		System.out.println(ans);
	}

}
