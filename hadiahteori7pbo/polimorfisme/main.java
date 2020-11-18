import java.util.Scanner;

public class main{
	public static void main(String[]args){
		
		double vol;
		Scanner input = new Scanner(System.in);
		System.out.print("jari-jari: ");
		vol = input.nextInt();
	
		hitung h = new hitung(vol);
		volume v = new hitung(vol);
		
		h.hasil();
		
		
		
	
		
		
	}
}
