import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		double moeda;
		int input = 0;
		Scanner scan = new Scanner(System.in);
		
		do{
		System.out.println("Insira uma moeda (Somente $0.10 e $0.25 serão aceitas): \n*1- Penny 2- nickel 3- dime 4- quarter 5- half dollar 6- dollar*");
		input = scan.nextInt();
		switch (input) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				total += 10;
				break;
			case 4:
				total += 25;
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
			if(total >= 45) {
				System.out.println("*Aqui está a sua coca-cola*\n");
				System.out.println("================================================");
				total = 0;
				System.out.println("\n\n\n*Reiniciando sistema*");
			}
		}while (total <= 45);
	}

}
