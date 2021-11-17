import java.io.*;
import java.util.*;

	
public class ReIm {
	
	public static void main (String[] args) throws IOException{
    
    Scanner input = new Scanner(System.in);
	String s;
	int r=0,i=0;
	System.out.print("Inserire numero(se immaginario preceduto dalla j): ");
	s= input.nextLine();
    try{
	     r=Integer.parseInt(s);
	}catch(NumberFormatException e){
	     if(s.charAt(0)=='j'){
	         try{
	              i=Integer.parseInt(s.substring(1,s.length()));          
	            }catch(NumberFormatException x){
	              System.out.println("impossibile");
	            }
	    }else System.out.println("impossibile");
	}//fine try-catch
	if(r!=0)System.out.println("Numero Reale:"+r);
	if(i!=0)System.out.println("Numero Immaginario:"+i);
	}
	}


