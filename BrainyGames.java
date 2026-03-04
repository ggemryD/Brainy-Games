import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Random;

public class BrainyGames {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("loginNames.txt", true);
            Scanner scan = new Scanner(System.in);

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
            System.out.print("\t\t\t\tEnter your name: ");
            String playerName = scan.nextLine();

            fileWriter.write(playerName + "\n");

            fileWriter.close();

			System.out.println("\n\n");
			System.out.println("___________________________________________________________________________________\n");
            System.out.println("                                Login successfully. . .                                ");
            System.out.println("___________________________________________________________________________________");
            System.out.println();
            System.out.println("\n\n\n\n\n\n\n\n");
            System.out.print("Press enter to continue...");
            String enter = scan.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
            if(enter.isEmpty()){
				clearScreen();
				home();
				}



			scan.close();
        } catch (IOException e) {
            System.out.println("An error occurred while registering the name.");
            e.printStackTrace();
        }
    }

    public static void playersName(){
		Scanner scan = new Scanner(System.in);
		char [] playerNames = new char[1000];
		try{
			FileReader loginNames = new FileReader("loginNames.txt");

			loginNames.read(playerNames);
			System.out.println(playerNames);
			System.out.println("\n\n");
			System.out.println("[1] - Back.");
			System.out.print("==> ");
			int enter = scan.nextInt();
			if(enter == 1){
				clearScreen();
				home();
				}
			} catch(Exception e){
				e.getStackTrace();
				}

		}

		public static void clearScreen(){
			try{
				String os = System.getProperty("os.name").toLowerCase();
				ProcessBuilder processBuilder;
				if(os.contains("win")){
					processBuilder = new ProcessBuilder("cmd","/c","cls");
					} else{
						processBuilder = new ProcessBuilder("clear");
						}

				Process process = processBuilder.inheritIO().start();
				process.waitFor();
				} catch(Exception e){
					e.printStackTrace();
					}

			}

    public static void home (){
		Scanner scan = new Scanner(System.in);
				System.out.print("\n\n\n\n");

        		System.out.println("\tBBBBB    RRRRRRR       AAA	I   NN	   N   Y     Y	 		    ");
				System.out.println("\tB    B   R    	R     A	  A	I   NN	   N	Y   Y			    ");
				System.out.println("\tB    B   R    	R    A	   A	I   N N	   N	 Y Y				");
				System.out.println("\tBBBBB    RRRRRR      AAAAAAA	I   N  N   N	  Y	  G A M E ' S");
				System.out.println("\tB    B   R     R     A	   A	I   N	N  N	  Y					");
				System.out.println("\tB    B   R      R    A	   A   	I   N	 N N 	  Y				    ");
				System.out.println("\tBBBBB    R       R   A     A  	I   N     NN      Y   			    ");
				System.out.print("\n\n\n\n");

				System.out.print("\n\t\t\t\t\t\t\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.print("\n\t\t\t\t\t\t\t\t\t^           Level of Difficulty:           ^");
				System.out.print("\n\t\t\t\t\t\t\t\t\t^                                          ^");
				System.out.print("\n\t\t\t\t\t\t\t\t\t^    EASY - riddle game                    ^");
				System.out.print("\n\t\t\t\t\t\t\t\t\t^    MEDIUM - unscramble the words game    ^");
				System.out.print("\n\t\t\t\t\t\t\t\t\t^    HARD - guess the ace card game        ^");
				System.out.print("\n\t\t\t\t\t\t\t\t\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

				System.out.print("\n\n\n\n\nPress [1] - to RIDDLE GAME >");
				System.out.print("\nPress [2] - to UNSCRAMBLE THE WORDS GAME >");
			    System.out.print("\nPress [3] - to GUESS THE ACE CARD GAME >");
			    System.out.print("\nPress [4] - to VIEW PLAYERS NAME LOGIN >");
				System.out.print("\nPress [0] - to EXIT THE GAME >");
				System.out.print("\n\n==>: ");
				int select = scan.nextInt();
				System.out.print("\n\n\n\n\n\n\n");

				switch (select)
				    {
					case 1:
						clearScreen();
						riddleGame();
						break;
					case 2:
						clearScreen();
			            unscrambleTheWordGame();
						break;
					case 3:
						clearScreen();
						guessTheAceCardGame();
			            break;
			        case 4:
			        	clearScreen();
			        	playersName();
			        	break;
			        case 0:
			            System.out.print("-------------------------------------------------------------- EXITING THE GAME ----------------------------------------------------------------------------------------\n\n\n");
			            System.exit(0);
			            break;
			        default:
			            System.out.printf("\nInvalid Selection.");
			        }

		scan.close();

		}

		public static void ridGameOver(){
			Scanner scan = new Scanner(System.in);

			System.out.println("\n\n\n");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("\t\tGGGGG   AAA   M	    M  EEEEE						");
			System.out.println("\t\tG      A   A  MM   MM  E	OOOO V 	 V EEEE R RRR  	");
			System.out.println("\t\tG  GG  AAAAA  M M M M  EEEE   - O  O  V V  E	RR  ");
			System.out.println("\t\tG   G  A   A  M	 M  M  E	OOOO   V   EEEE	RR      	");
			System.out.println("\t\tGGGGG  A   A  M     M  EEEEE         				");
			System.out.println("------------------------------------------------------------------------------------------");

			System.out.println("\n\n\n\n");

			System.out.println("                   .....");
			System.out.format("Remaining Heart => : %d :", heart);
			System.out.println("\n                   .....");

			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.print("Press enter to continue...");
            String enter = scan.nextLine();
            	if(enter.isEmpty()){
					clearScreen();
					end1();
					}
			}

public static int heart = 5;

public static void riddleGame() {
		int ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10, ans11, ans12, ans13, ans14, ans15;
		Scanner scan = new Scanner(System.in);


	    System.out.print("\n\n\n\n");
	    System.out.print("\n\t\t~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ");
	    System.out.print("\n\t\t~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ");
		System.out.print("\n\t\t~~                                  ~~");
		System.out.print("\n\t\t~~            RIDDLE GAME           ~~");
		System.out.print("\n\t\t~~                                  ~~");
		System.out.print("\n\t\t~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ");
		System.out.print("\n\t\t~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ~~ ");

		System.out.print("\n\n\n\n\n\n\n-Let The Game Begin.\n\n\n");

		System.out.println("\t\t\t\t\t\t\t\t   ==============");
	    System.out.format("\t\t\t\t\t\t\t\t    Hearts: %d\n", heart);
	    System.out.println("\t\t\t\t\t\t\t\t   ==============");

		System.out.print("\n\n\n\n>> Which month has 28 days ?");
		System.out.print("\n\n1. April\t 2. February\t 3. June\t 4. All");

		System.out.print("\n\nYour Answer : ");
		ans1 = scan.nextInt();

			if(ans1 == 4 )
			{
				System.out.print("\n\t\tCorrect Answer O_O");
			} else if(ans1 != 4)
			{
		    	System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
		    }


		System.out.print("\n\n\n>> What room has no door or windows ?\n");
		System.out.print("\n1. Mushroom\t 2. Bathroom\t 3. Living room\t 4. Bedroom");

		System.out.print("\n\nYour Answer : ");
		ans2 = scan.nextInt();

			if(ans2 == 1 )
			{
				System.out.print("\n\t\tCorrect Answer :)");
			} else if(ans2 != 1)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}


		System.out.print("\n\n\n>> What kind of table can you eat ?\n");
		System.out.print("\n1. Timetable\t 2. Tableware\t 3. Vegetable\t 4. Tablemate");

		System.out.print("\n\nYour Answer : ");
		ans3 = scan.nextInt();

			if(ans3 == 3)
			{
				System.out.print("\n\t\tCorrect Answer ;)");
			} else if(ans3 != 3)
			{
		    	System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
		System.out.print("\n\n\n>> What kind of nut that has a hole ?\n");
		System.out.print("\n1. Chestnut\t 2. Walnut\t 3. Peanut\t 4. Donut");

		System.out.print("\n\nYour Answer : ");
		ans4 = scan.nextInt();

			if(ans4 == 4)
			{
				System.out.print("\n\t\tCorrect Answer +_+");
			} else if (ans4 != 4)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}


		System.out.print("\n\n\n>> What ship has no captain but two mates ?\n");
		System.out.print("\n1. Friendship\t 2. Queenship\t 3. Steamship\t 4. Spaceship");

		System.out.print("\n\nYour Answer : ");
		ans5 = scan.nextInt();

			if(ans5 == 1)
			{
				System.out.print("\n\t\tCorrect Answer $_$");
			} else if (ans5 != 1)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
		    	if (heart <= 0)
		    	{
					clearScreen();
					ridGameOver();
				}


		System.out.print("\n\n\n>> What kind of cup can't hold water ?\n");
		System.out.print("\n1. Oilcup\t 2. Cupcake\t 3. Eggcup\t 4. Teacup");

		System.out.print("\n\nYour Answer : ");
		ans6 = scan.nextInt();

			if(ans6 == 2)
			{
				System.out.print("\n\t\tCorrect Answer :)");
			} else if (ans6 != 2)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					ridGameOver();
				}


		System.out.print("\n\n\n>> What type of lion never roars ?\n");
		System.out.print("\n1. Dandelion\t 2. Oldlion\t 3. Femalelion\t 4. Littlelion");

		System.out.print("\n\nYour Answer : ");
		ans7 = scan.nextInt();

			if(ans7 == 1)
			{
				System.out.print("\n\t\tCorrect Answer :P");
			} else if (ans7 != 1)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					ridGameOver();
				}


		System.out.print("\n\n\n>> What type of building contains the most stories ?\n");
		System.out.print("\n1. Castle\t 2. Mall\t 3. Hospital\t 4. Library");

		System.out.print("\n\nYour Answer : ");
		ans8 = scan.nextInt();
			if(ans8 == 4)
			{
				System.out.print("\n\t\tCorrect Answer $_$");
			} else if (ans8 != 4)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}


		System.out.print("\n\n\n>> What has one eye, but can't see ?\n");
		System.out.print("\n1. Dice \t 2. Starfish \t 3. Ant \t 4. Needle");

		System.out.print("\n\nYour Answer : ");
		ans9 = scan.nextInt();

			if(ans9 == 4)
			{
				System.out.print("\n\t\tCorrect Answer ^_^");
			} else if (ans9 != 4)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}


		System.out.print("\n\n\n>> What can you catch but never throw ?\n");
		System.out.print("\n1. Dragonfly\t 2. Ball\t 3. Cold\t 4. Money");

		System.out.print("\n\nYour Answer : ");
		ans10 = scan.nextInt();

			if(ans10 == 3)
			{
				System.out.print("\n\t\tCorrect Answer :D");
			} else if (ans10 != 3)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}


		System.out.print("\n\n\n>> It's not alive but it has a foot !\n");
		System.out.print("\n1. Slippers \t 2. Candle \t 3. Chair \t 4. Table");

		System.out.print("\n\nYour Answer : ");
		ans11 = scan.nextInt();

			if(ans11 == 1)
			{
				System.out.print("\n\t\tCorrect Answer ^_^");
			} else if (ans11 != 1)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}

		System.out.print("\n\n\n>> It was born but not delivered, It was delivered but not born.\n");
		System.out.print("\n1. Orange \t 2. Banana \t 3. Apple \t 4. Jackfruit");

		System.out.print("\n\nYour Answer : ");
		ans12 = scan.nextInt();

			if(ans12 == 2)
			{
				System.out.print("\n\t\tCorrect Answer ^_^");
			} else if (ans12 != 2)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}

		System.out.print("\n\n\n>> What has many teeth but cannot bite ?\n");
		System.out.print("\n1. Hippo \t 2. Snail \t 3. Lion \t 4. Comb");

		System.out.print("\n\nYour Answer : ");
		ans13 = scan.nextInt();

			if(ans13 == 4)
			{
				System.out.print("\n\t\tCorrect Answer ^_^");
			} else if (ans13 != 4)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}

		System.out.print("\n\n\n>> What has ears but cannot hear ?\n");
		System.out.print("\n1. Owl  \t2. Corn \t 3. Worm \t 4. Fish");

		System.out.print("\n\nYour Answer : ");
		ans14 = scan.nextInt();

			if(ans14 == 2)
			{
				System.out.print("\n\t\tCorrect Answer ^_^");
			} else if (ans14 != 2)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}

		System.out.print("\n\n\n>> The surface has thorns and the inside are stones. \n");
		System.out.print("\n1. Jackfruit \t 2. Papaya \t 3. Guava \t 4. Pineapple");

		System.out.print("\n\nYour Answer : ");
		ans15 = scan.nextInt();

			if(ans15 == 1)
			{
				System.out.print("\n\t\tCorrect Answer ^_^");
			} else if (ans15 != 1)
			{
				System.out.println("\n\t\tx_x Oops! Wrong Answer! x_x ");
				heart = heart - 1;
				System.out.println("\t\t\t\t\t\t\t\t   ================= ");
				System.out.format("\t\t\t\t\t\t\t\t    Current Heart: %d\n", heart);
	    		System.out.println("\t\t\t\t\t\t\t\t   ================= ");
			}
				if (heart <= 0)
		    	{
					clearScreen();
					end1();
				}

		   clearScreen();
				ridWin();
			scan.close();
		}

		public static void ridWin(){
			Scanner scan = new Scanner(System.in);

			System.out.println("\n\t        *************************************");
			System.out.println("\t       *                                     *");
			System.out.println("\t       *   *******************************   *");
			System.out.println("\t       *   *    !!YOU WIN THE GAME!!     *   *");
			System.out.println("\t       *   *******************************   *");
			System.out.println("\t       *                                     *");
			System.out.println("\t        *************************************");

			System.out.println("\n\n\n");
			System.out.println("                   .....");
			System.out.format("Remaining Heart => : %d :", heart);
			System.out.println("\n                   .....");

			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.print("Press enter to continue...");
            String enter = scan.nextLine();
            	if(enter.isEmpty()){
					clearScreen();
					end1();
					}

			}

public static void end1() {
		int i;
	    Scanner scan = new Scanner(System.in);

	    System.out.print("\n\n\n\n\t\t________________________");
	    System.out.print("\n\n\t\tThank You for Playing :) ");
	    System.out.print("\n\t\t________________________");
	    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPress [5] - to restart the Game >");
	    System.out.print("\nPress [1] - to Home >");
	    System.out.print("\n\n==>: ");
	    i = scan.nextInt();
	    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	    switch(i)
	    	{
				case 1:
				clearScreen();
		            heart = 5;
		            home();
		            break;
		        case 5:
		            clearScreen();
		            heart = 5;
		            riddleGame();
		            break;
		            default:
			System.out.print("Invalid Selection.");
	    	}

	    scan.close();
	}

public static String scramble(String word) {
		char[] letters = word.toCharArray();
	    Random rand = new Random();

	    for (int i = letters.length - 1; i > 0; i--) {
	        int j = rand.nextInt(i + 1);

	        char temp = letters[i];
	        letters[i] = letters[j];
	        letters[j] = temp;
	    }

	    return new String(letters);
	}

public static int overallPoints = 0;
public static int noCheck = 0;

public static void unscrambleTheWordGame() {
			Scanner scan = new Scanner(System.in);
		    String word = "orange";
		    int attempts = 2;
		    boolean correct_answer = false;
		    int firstCheck = 10;
		    int secondCheck = 5;
		    int totalPoints = 0;

		    System.out.print("\n\n\n");
		    System.out.print("\n\t\t***************************************");
		    System.out.print("\n\t\t**                                   **");
		    System.out.print("\n\t\t**                                   **");
		    System.out.print("\n\t\t**     UNSCRAMBLE THE WORDS GAME     **");
		    System.out.print("\n\t\t**                                   **");
		    System.out.print("\n\t\t**                                   **");
		    System.out.print("\n\t\t***************************************");

		    System.out.format("\n\n\n\n\n\n\n\n\n-Let The Game Begin.\t\t\t\t\tTotal Attempts Per Number: %d",attempts );

			System.out.format("\n\n\n\n\n");

		    String scrambled = scramble(word);
		    System.out.format("\n\n\n1. Unscrambled the Word: [ %s ]", scrambled);
		    System.out.println();

		    do{
		        System.out.print("\nAnswer: ");
		        String answer = scan.nextLine();

		        if (answer.equals(word))
		        {
		        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
			            correct_answer = true;
			            totalPoints += firstCheck;
					System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
			            overallPoints += totalPoints;
			            word2();

		        	} else if(attempts == 1) {
		    		System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
			            correct_answer = true;
			            totalPoints += secondCheck;
					System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
			            overallPoints += totalPoints;
			            word2();
		        	}
		        } else
		        {
		        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
		            attempts = attempts - 1;
		            System.out.format("Attempts left: %d\n", attempts);
		            System.out.println("\n\t==> Clue: (It can be eaten and colorful.)\n");
		        }
		        if (attempts <= 0)
			    	{
		        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
		  			System.out.println("\t\t\t+-------------------+");
		  			System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
					System.out.println("\t\t\t+-------------------+");
		                word2();
					}


		    } while (!correct_answer && attempts < 2 );

		    scan.close();
		}

	public static void word2() {
	    Scanner scan = new Scanner(System.in);
	    String word = "echo";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n2. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
		            System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word3();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
		 			System.out.println("\t\t\t+-------------------+");
		  			System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word3();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (I repeat the word you say. The more I repeat, the softer I got. I cannot be seen but can be heard.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
				System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word3();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}


	public static void word3() {
	    Scanner scan = new Scanner(System.in);
	    String word = "ballpen";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n3. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
		   			System.out.println("\t\t\t+-------------------+");
		   			System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word4();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
					System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word4();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (We use it everyday in school.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
				System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word4();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}

	public static void word4() {
	    Scanner scan = new Scanner(System.in);
	    String word = "penguin";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n4. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word5();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
					System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word5();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (An animal that always love marching.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
	  			System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word5();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}

	public static void word5() {
	    Scanner scan = new Scanner(System.in);
	    String word = "sister";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n5. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word6();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word6();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (You are my brother, but I'm not your brother.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
	  			System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word6();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}

	public static void word6() {
	    Scanner scan = new Scanner(System.in);
	    String word = "soap";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n6. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word7();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word7();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (It shrink smaller every time it takes a bath.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
	  			System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word7();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}

	public static void word7() {
	    Scanner scan = new Scanner(System.in);
	    String word = "space";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n7. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word8();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
		  			System.out.println("\t\t\t+-------------------+");
		  			System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word8();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (Astronaut's favorite key on a keyboard.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
				System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word8();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}

	public static void word8() {
	    Scanner scan = new Scanner(System.in);
	    String word = "women";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n8. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
					System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word9();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word9();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (Always right.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
				System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word9();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}

	public static void word9() {
	    Scanner scan = new Scanner(System.in);
	    String word = "time";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n9. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
					System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word10();

	        	} else if(attempts == 1) {
System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
					System.out.println("\t\t\t+-------------------+");
					System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            word10();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (It is easy to waste and unstoppable.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
				System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                word10();
				}

	    } while (!correct_answer && attempts < 2 );

	    scan.close();
	}

	public static void word10() {
	    Scanner scan = new Scanner(System.in);
	    String word = "wednesday";
	    int attempts = 2;
	    boolean correct_answer = false;
	    int firstCheck = 10;
	    int secondCheck = 5;
	    int totalPoints = 0;

	    String scrambled = scramble(word);
	    System.out.format("\n\n\n10. Unscrambled the Word: [ %s ]", scrambled);
	    System.out.println();

	    do{
	        System.out.print("\nAnswer: ");
	        String answer = scan.nextLine();

	        if (answer.equals(word))
	        {
	        	if(attempts == 2) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += firstCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		            tpoints();

	        	} else if(attempts == 1) {
					System.out.println("\t\t\t\t\t\t\t\t\t          *");
					System.out.println("\t\t\t\t\t\t\t\t\t        *");
					System.out.println("\t\t\t\t\t\t\t\t\t*     **");
					System.out.println("\t\t\t\t\t\t\t\t\t ** *** ");
					System.out.println("\t\t\t\t\t\t\t\t\t  ***");
		            correct_answer = true;
		            totalPoints += secondCheck;
		 			System.out.println("\t\t\t+-------------------+");
		 			System.out.format("\t\t\t| Points earned: %d  |\n", totalPoints);
					System.out.println("\t\t\t+-------------------+");
		            overallPoints += totalPoints;
		           tpoints();
	        	}
	        } else
	        {
	        	System.out.println("\n\t     Sorry.. Try Again.\n\n");
	            attempts = attempts - 1;
	            System.out.format("Attempts left: %d\n", attempts);
	            System.out.println("\n\t==> Clue: (Movie and a day.)\n");
	        }
	        if (attempts <= 0)
		    	{
	        	System.out.println("\n\n\t\t    YOU FAILED :(\n\n\n");
	        	System.out.println("\t\t\t+-------------------+");
				System.out.format("\t\t\t| Points earned: %d  |\n", noCheck);
				System.out.println("\t\t\t+-------------------+");
	                tpoints();
				}

	    } while (!correct_answer && attempts < 2 );


	    scan.close();
	}


public static void tpoints(){
		clearScreen();
		System.out.print("\n\n\n\n\n");
		System.out.println("\n\t       *************************************");
		System.out.println("\t      *                                     *");
		System.out.println("\t      *   *******************************   *");
		System.out.println("\t      *   * ^_^ YOU FINISH THE GAME ^_^ *   *");
		System.out.println("\t      *   *******************************   *");
		System.out.println("\t      *                                     *");
		System.out.println("\t       *************************************");
		System.out.println("\n\n\n\n\n");
		System.out.println("\t\t    ==========================");
	    System.out.format("\t\t    Your Total Points is : %d\n", overallPoints);
	    System.out.println("\t\t    ==========================");

	    end2() ;

	}

	public static void end2(){
		Scanner scan = new Scanner(System.in);
	    int i;

	    System.out.print("\n\n\n\n\n");

	    System.out.print("\n\n\nPress [5] - to restart the Game >");
	    System.out.print("\nPress [1] - to Home >");
	    System.out.print("\n\n==>: ");
	    i = scan.nextInt();
	    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	    switch(i)
	    {
	    	case 1:
	    		clearScreen();
	    		overallPoints -= overallPoints;
	    		home();
	    		break;
	    	case 5:
	    		clearScreen();
	    		overallPoints -= overallPoints;
	    		unscrambleTheWordGame();
	    		break;
	    	default:
	    		System.out.print("Invalid Selection.");
		}

	}

public static void guessTheAceCardGame(){
		Scanner scan = new Scanner(System.in);
		int betting_amount;

		System.out.print("\n\n\n\n");
		System.out.print("\n\t\t? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?");
		System.out.print("\n\t\t? ?                               ? ?");
		System.out.print("\n\t\t? ?                               ? ?");
		System.out.print("\n\t\t? ?    GUESS THE ACE CARD GAME    ? ?");
		System.out.print("\n\t\t? ?                               ? ?");
		System.out.print("\n\t\t? ?                               ? ?");
		System.out.print("\n\t\t? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ?");
		System.out.print("\n\n\n\n\n\n");
		System.out.print("\n-Let The Game Begin.\n");
		System.out.format("\n\n     CASH => P%d \t\t\t\t\t Target Cash To Win = 1000\n\n\n", cash);

		while (cash > 0)
		{
			System.out.print("\n\n--- What is your betting amount? P");
			betting_amount = scan.nextInt();
			if(betting_amount == 0 || betting_amount > cash)
			break;

			playgame(betting_amount);
		}

	 }

public static int cash = 150;

	public static void playgame(int betting_amount){
		Scanner scan = new Scanner(System.in);
		char cards[]= {'J','A','Q'};
		int playersChoice;
		Random rand = new Random();

        for (int i = 1; i <= 10; i++) {
            int x = rand.nextInt(3);
            int y = rand.nextInt(3);
            char temp = cards[x];
            cards[x] = cards[y];
            cards[y] = temp;
        }

		System.out.print("\n\t\t\t ~~ Shuffling is done ~~\n");
		System.out.print("\n--- What position does the Ace of cards occupy (1,2 or 3)?");
		System.out.print("\nYour choice: ");
		playersChoice = scan.nextInt();
		if (cards[playersChoice - 1] == 'A')
		{
			cash = cash + betting_amount;
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------");
			System.out.format("                                         \t\t\t\t\t\t\t=>  Position of cards = '%c' '%c' '%c'    <=\n", cards[0], cards[1], cards[2]);
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------");

			System.out.println("\n\t\t\t    $$$$$$$$$$$$$$$$$$$$");
			System.out.format("\t\t\t    $     YOU WIN!     $\n");
			System.out.println("\t\t\t    $$$$$$$$$$$$$$$$$$$$");
			System.out.format("\n\n\n\n => Current Cash = P%d\n", cash);

		} else
		{
			cash = cash - betting_amount;
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------");
			System.out.format("                                         \t\t\t\t\t\t\t=>  Position of cards = '%c' '%c' '%c'    <=\n", cards[0], cards[1], cards[2]);
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------");

			System.out.println("\n-------------------------- NOT SO LUCKY THIS TIME. --------------------------\n");
			System.out.format("\n\n\n\n => Current Cash = P%d\n", cash);

		}
		if (cash >= 1000)
			{
				clearScreen();
				end3();
			} else if(cash <= 0){
				clearScreen();
				gameOverAceCardGame();
				}
	}

	public static void gameOverAceCardGame(){
			Scanner scan = new Scanner(System.in);
			int i;

			System.out.println("\n\n\n");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("\t\tGGGGG   AAA   M	    M  EEEEE						");
			System.out.println("\t\tG      A   A  MM   MM  E	OOOO V 	 V EEEE R RRR  	");
			System.out.println("\t\tG  GG  AAAAA  M M M M  EEEE   - O  O  V V  E	RR  ");
			System.out.println("\t\tG   G  A   A  M	 M  M  E	OOOO   V   EEEE	RR      	");
			System.out.println("\t\tGGGGG  A   A  M     M  EEEEE         				");
			System.out.println("------------------------------------------------------------------------------------------");

			System.out.println("\n\n\n\n");
			System.out.println("\t\t\t**********************");
			System.out.format("\t\t\t*     OUT OF CASH    *\n");
			System.out.println("\t\t\t**********************");

			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPress [5] - to restart the Game >");
		    System.out.print("\nPress [1] - to Home >");
		    System.out.print("\n\n==>: ");
		    i = scan.nextInt();
		    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		    switch(i)
		    {
		    	case 1:
		    		clearScreen();
		    		home();
		    		break;
		    	case 5:
		    		clearScreen();
		    	    cash = 150;
		    	    guessTheAceCardGame();
		    		break;
		    	default:
		    		System.out.print("Invalid Selection.");

			}

		}

	public static void end3(){
			Scanner scan = new Scanner(System.in);
		    int i;

		    System.out.print("\n\n\n\t\t! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
			System.out.print("\n");
			System.out.print("\n\t\t! !     YOU WIN THE GAME!     ! !");
			System.out.print("\n");
			System.out.print("\n\t\t! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");

			System.out.print("\n\n\n\n\n\t  Target Cash = 1000");
			System.out.format("\n\t  Your Cash   = %d", cash);


		    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPress [5] - to restart the Game >");
		    System.out.print("\nPress [1] - to Home >");
		    System.out.print("\n\n==>: ");
		    i = scan.nextInt();
		    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		    switch(i)
		    {
		    	case 1:
		    		clearScreen();
		    		home();
		    		break;
		    	case 5:
		    		clearScreen();
		    	    cash = 150;
		    	    guessTheAceCardGame();
		    		break;
		    	default:
		    		System.out.print("Invalid Selection.");

			}

	}

}
