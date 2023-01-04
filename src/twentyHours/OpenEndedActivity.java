package twentyHours;

import java.util.ArrayList;

public class OpenEndedActivity {

	public static String oneNewMethod(String hi){
		String x = "";
		int where = hi.indexOf('a');
		if(hi.length() > 0){
			hi = hi.toLowerCase().trim();
			for(int i = 0; i < hi.length(); i++){
				if(hi.charAt(i) == 'a'){
					x = hi.substring(0,where)+ hi.substring(where+1, hi.length()-1);
					return x;
				}
			}


		} return hi;


	}

	public static void main(String[] args) {
		System.out.println(oneNewMethod("hello"));

	}
}
