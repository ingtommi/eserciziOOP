import java.io.*;
import java.util.*;


public class ReIm {

	public static void main (String[] args) throws IOException{

		Scanner input = new Scanner(System.in);
		String s;
		double r=0,i=0;
		System.out.print("Inserire numero reale o immaginario(immaginario preceduto dalla j): ");
		s = input.nextLine();
		boolean iNeg = false;
		try{
			r = Double.parseDouble(s);
		}catch(NumberFormatException e){
			s.replaceAll("[+]", "+");
			s.replaceAll("[-]", "-");
			if(s.contains("+j")){
				String[] n = s.split("\\+j");
				r = Double.parseDouble(n[0]);
				i = Double.parseDouble(n[1]);
			}
			else if (s.contains("-j")) {
				String[] n = s.split("-j");
				r = Double.parseDouble(n[0]);
				i = Double.parseDouble(n[1]);
				iNeg = true;
			}
			else if (s.contains("j")) {
				r=0;
				i=Double.parseDouble(s.substring(1,s.length())); 
			}
			else System.out.println("impossibile");
		}//fine try-catch
		if(r!=0)System.out.println("Numero Reale:"+r);
		if(iNeg)System.out.println("Numero Immaginario:-"+i);
		else System.out.println("Numero Immaginario:"+i);
		input.close();
	}}



