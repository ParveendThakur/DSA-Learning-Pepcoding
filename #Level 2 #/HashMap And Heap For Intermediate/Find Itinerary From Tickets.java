// https://nados.io/question/find-itinerary-from-tickets
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		//write your code here
		
		HashMap<String , Boolean> hm = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
			hm.put(s2,false);
			if(hm.containsKey(s1)==false){
				hm.put(s1,true);
			}
		}

		String src = "";
		for(String s : hm.keySet()){
			if(hm.get(s)==true){
				src = s;
				break;
			}
		}

		System.out.print(src);
		while(map.containsKey(src)){
			src = map.get(src);
			System.out.print(" -> " + src);
		}

		System.out.println(".");
	}
}