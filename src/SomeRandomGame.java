import java.util.Scanner;

public class SomeRandomGame {

	public static void main(String[] args) {
		
		boolean cchoice = true, bchoice = true;
		int points, bet, schoice, wannaplay, RoundRoll, d1, d2, dsum;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Whats yo startin' point balance? (Btw,gambling is illegal (under 18), stay in school kids)");
		points = sc.nextInt();
		
		outerloop: {
		
		System.out.println("Input yo bet");
		bet = sc.nextInt();
		
		while (bet > points) {
			System.out.println("Boi, you bet more money than you have!!!! Enter again!");
			bet = sc.nextInt();
		}
		
		System.out.println("Now let's get some grape juice and start rolling them dices!");
		
		d1 = (int)((Math.random() * 6) + 1);
		d2 = (int)((Math.random() * 6) + 1);
		dsum = d1 + d2;
		
		if (dsum == 2 || dsum==3 || dsum==12) {
			
			System.out.println("Bad luck! You lost " + bet + " cuz you rolled a "+ dsum);
			
			points -= bet; 
			
			if (points < 0) {
				System.out.println("Aw man! You lost the game. Final Bal.: " + points);
				break outerloop;
			}
			
			else if (dsum == 7 || dsum == 11) {
				
				System.out.println("Boi, you rolled a " + dsum + ", so you won "+ bet + " which has been added to your total balance.");
				
				points += bet;
				
			}
			
			else {
				
				System.out.println("You are in a special round cuz you rolled a "+ dsum + ". Rolling 7 will cause you to loose, but rolling a "+ dsum + " will let you win the round and bets" );
				schoice = dsum;
				
				while (bchoice == true || schoice !=7 ) {
					d1 = (int)((Math.random() * 6) + 1);
					d2 = (int)((Math.random() * 6) + 1);
					dsum = d1 + d2;
					
					if ( dsum == 7) {
						System.out.println("Hmm. So you rolled a 7, and you lost this round");
						points -= bet;
						
						if (points < 0) {
							System.out.println("Aw man! You lost the game. Final Bal.: " + points);
							break outerloop;
						}
						break;
					}
					
					if (d2 == schoice) {
						System.out.println("Noice! You won " + points);
						
						points += bet;
						break;
					}
					
					
					System.out.println("You rolled a " + d2 + " Wanna continue? 0 = No, 1 = Yes");
					schoice = sc.nextInt();
					
					if (schoice == 0)
						bchoice = false;
					else
						bchoice = true;
					
					
					if (bchoice == true) {
						bet += sc.nextInt();
						
						while (points < bet) {
							System.out.println("Boi, you bet more money than you have!!!! Enter again!");

							bet += sc.nextInt();
							
						}
						
					}
					
				}
				
				
			}
			
			
			System.out.println("Wanna play again, current bal is " + points + ". (0 for no, 1 for yes");
			wannaplay = sc.nextInt();
			
			
			if (wannaplay == 1) 
				cchoice = true;
			else
				cchoice = false;
			
		}
		
		while (cchoice == true);
		
		
		
		}
		
	System.out.println("Game over! Ending Bal: " + points);	
		
	}

}
