public class Main 
{
    public static void main(String[] args)
    {
        // Below is the test case from the document
        // String info;
        // Scoreboard game = new Scoreboard("Red", "Blue");
        // info = game.getScore();
        // System.out.println(info);
        // game.recordPlay(1);
        // game.recordPlay(0);
        // game.recordPlay(3);
        // info = game.getScore();
        // System.out.println(info);


        // Below is the test case from the AP task.
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        game.recordPlay(1);
        info = game.getScore();
        game.recordPlay(1);
        game.recordPlay(0);
        info = game.getScore();
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        info = game.getScore();
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        info = match.getScore();
        info = game.getScore();
        
    }
}