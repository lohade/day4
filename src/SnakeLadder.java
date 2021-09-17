public class SnakeLadder {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to snake and ladder:");
        int playerposition = 0;
        System.out.println("The position of player is : " + playerposition);

        int diceroll = (int) (Math.random() * 6) + 1;
        playerposition += diceroll;
        System.out.println("After the roll dice....The position of player is : " + playerposition);


    }
}
