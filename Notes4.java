public class Notes4 {
    // Do:
    // 2.3.4, 
    // 2.3.7, 
    // 2.3.8, 
    // 2.3.10
    
    public static void main(String[] args) {
    // Logical Operators
        //A player can unlock a level 
        // only if they have enough coins and 
        // have defeated the boss.
        // AND
        int coins = 75;
        boolean bossDefeated = true;
        if (coins > 50 && bossDefeated) {
                System.out.println("Level unlocked!");
        } else {
            System.out.println("Level locked");
        }

        // A spectator can enter a game if they 
        // have a ticket or a season pass.
        boolean hasTicket = false;
        boolean hasSeasonPass = true;
        if (hasTicket || hasSeasonPass) {
            System.out.println("You can enter");
        } else {
            System.out.println("You shall not pass!");
        }

        // NOT - reverses any boolean value
        boolean muted = false;
        if (!muted) {
            System.out.println("Music is playing");
        } else {
            System.out.println("It's quiet");
        }

        // Short Circuiting
        int people = 0;
        int slices = 16;
        // System.out.println(slices/people);
        if (people > 0 && slices / people >= 2){
            System.out.println("At least two slices per person.");
        } else {
            System.out.println("Hello from here");
        }
    }
    



}
