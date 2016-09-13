import java.util.Scanner;


public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String cont;
		
		
		System.out.println("Welcom to the Grand Circus Casino! Roll the dice? (y/n): ");
		String playGame = input.nextLine();
		
		if(playGame.equalsIgnoreCase("y")){
			do {
			int dice1;
			int dice2;
		
			
			dice1 = (int)(Math.random()*6 + 1);
			dice2 = (int)(Math.random()*6 + 1);
			
			System.out.println("Roll 1: ");
			System.out.println(dice1);
			System.out.println(dice2);
			
			System.out.println("Roll again?(y/n)");
				cont = input.nextLine();
				
			}while(cont.equalsIgnoreCase("y"));
			}else{
				System.out.println("Thanks for playing");
			}
		
		
		

	}

}
