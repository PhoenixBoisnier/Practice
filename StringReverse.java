
public class StringReverse {

	public static void main(String[] args) {

		String a = "poopybutthole";
		System.out.println(a);
		System.out.println(StringReverse.ittRev(a));
		System.out.println(a);
		System.out.println(StringReverse.recRev(a));
		
	}
	
	public static String recRev(String r) {
		if(r.substring(0).equalsIgnoreCase("")) {
			return "";
		}
		else return r.substring(r.length()-1, r.length())+recRev(r.substring(0, r.length()-1));
	}
	
	public static String ittRev(String r) {
		String val = "";
		for(int q = r.length(); q>0; q--) {
			val+=r.substring(q-1, q);
		}
		return val;
	}

}
