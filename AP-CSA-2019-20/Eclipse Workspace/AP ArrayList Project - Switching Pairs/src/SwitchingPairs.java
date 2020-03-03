// Andrew Young
// Switching Pairs
// 2/14/2020


import java.util.ArrayList;

public class SwitchingPairs {
	
	public static void main(String[] args) {
		ArrayList<String> raylist =  new ArrayList<String>();
		raylist.add("four");
		raylist.add("score");
		raylist.add("and");
		raylist.add("seven");
		raylist.add("years");
		raylist.add("ago");
		//raylist.add("xtra string");
		String[] ray = new String[raylist.size()] ;
		for (int i = 0; i < raylist.size(); i++) {
			ray[i] = raylist.get(i);
		}
		System.out.println(switchPairs(ray).toString());
		
	}

	public static ArrayList<String> switchPairs(String[] in) {
		ArrayList<String> toreturn =  new ArrayList<String>();
		if (in.length % 2 == 0) {
			for (int i = 0; i < in.length; i += 2) {
				toreturn.add(in[i + 1]);
				toreturn.add(in[i]);
			} 
			return toreturn;
		} else {
			for (int i = 0; i < in.length - 1; i += 2) {
				toreturn.add(in[i + 1]);
				toreturn.add(in[i]);
			} 
			toreturn.add(in[in.length-1]);
			return toreturn;
		}
		
	}
	
	
	
}

	
