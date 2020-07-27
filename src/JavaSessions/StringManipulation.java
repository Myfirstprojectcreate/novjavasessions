package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
	String s= "This is my Java Training";
	char find = 'i';
	
	
//	System.out.println(s.length());
//	System.out.println(s.charAt(0));
//	System.out.println(s.indexOf("J"));
//    System.out.println(s.indexOf("i"));
//    System.out.println(s.indexOf("i", s.indexOf("i")+1));
    for ( int a=0; a<s.length();){
    	
    	if (s.charAt(a) == find){
    		System.out.println(s.indexOf(a));
    		}
    	a++;
    	
    }
    	
	}

}
