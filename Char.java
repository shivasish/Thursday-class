 import java.util.Scanner;
 public class Char
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    int a=c;
	    
	    if(a>=65||a<117){
	        System.out.println("alphabet");
	        
	    }
	    else{
		System.out.println("not Alphabet");
	    }
	}
}