package selenium4;


public class mm {

	

	private static char highestOccuredChar(String str) {

	    int [] count = new int [256];

	    for ( int i=0 ;i<str.length() ; i++){
	        count[str.charAt(i)]++;
	    }

	    int max = -1 ;
	    char result = ' ' ;

	    for(int j =0 ;j<str.length() ; j++){
	        if(max < count[str.charAt(j)] && count[str.charAt(j)] > 1) {
	            max = count[str.charAt(j)];
	            result = str.charAt(j);
	        }
	    }

	    return result;

	}
	
	public static void main(String[] args) {

	    String str= "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcddddeeeeee";
	    String str1 = "dbc";

	    if(highestOccuredChar(str) != ' ')
	    System.out.println("Most Frequently occured Character ==>  " +Character.toString(highestOccuredChar(str)));
	    else
	        System.out.println("The String doesn't have any character whose occurance is more than 1");
	}

	}

	


