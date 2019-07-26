package col106;
import java.util.Scanner;
public class HexaToBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the hexadecimal");
		String hex=s.nextLine();
		int n=hex.length();
		s.close();
		String bin = "";
		for(int i=n-1;i>=0;i--) {
			switch(hex.charAt(i)){
			case 0:
				bin+="0000";
			case 1:
				bin+="0001";
			case 2:
				bin+="0010";
			case 3:
				bin+="0011";
			case 4:
				bin+="0100";
			case 5:
				bin+="0101";
			case 6:
				bin+="0110";
			case 7:
				bin+="0111";
			case 8:
				bin+="1000";
			case 9:
				bin+="1001";
			case 'A':
				bin+="1010";
			case 'B':
				bin+="1011";
			case 'C':
				bin+="1100";
			case 'D':
				bin+="1101";
			case 'E':
				bin+="1110";
			case 'F':
				bin+="1111";
			}		
					
		}
		System.out.println(bin);
		

	}

}
