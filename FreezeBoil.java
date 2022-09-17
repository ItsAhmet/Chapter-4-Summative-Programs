import java.util.Scanner;

public class FreezeBoil {
	public int temp;
	
	public FreezeBoil(int x) {
		temp=x;
	}
	public boolean isEthylFreezing() {
	return temp<=-173;
	}
	public boolean isEthylBoiling() {
		return temp>=-172;
		}
	public boolean isOxygenFreezing() {
		return temp<=-362;
		}
	public boolean isOxygenBoiling() {
		return temp<=-306;
		}
	public boolean isWaterFreezing() {
		return temp<=32;
		}
	public boolean isWaterBoiling() {
		return temp<=212;
		}
public static void main(String args[]) {
	int tempature;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a tempature -->");
	
	tempature = scan.nextInt();
	
	FreezeBoil f1 = new FreezeBoil(tempature);
	
	
	
	System.out.println("Is ethyl freezing? "+f1.isEthylFreezing());
	System.out.println("Is ethyl boiling? "+f1.isEthylBoiling());

	System.out.println("Is oxygen freezing? "+f1.isOxygenFreezing());
	System.out.println("Is oxygen boiling? "+f1.isOxygenBoiling());
	
	System.out.println("Is water freezing? "+f1.isWaterFreezing());
	System.out.println("Is water boiling? "+f1.isWaterBoiling());
	
}
}
