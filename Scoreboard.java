public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
    public void recordPlay(int score)
    {
        if (teamOne.equals(activeTeam))
        {   
            teamOneScore += score;
            if (score == 0)
            {   
                // System.out.println("test");
                if(activeTeam.equals(teamOne))
                {
                    activeTeam = teamTwo;
                    // System.out.println("team one active");
                } 
                else if (activeTeam.equals(teamTwo)) activeTeam = teamOne;
            }
        }
        else if (teamTwo.equals(activeTeam))
        {
            teamTwoScore += score;
            if (score == 0)
            {   
                if(activeTeam.equals(teamOne))
                {
                    activeTeam = teamTwo;
                }
                else if (activeTeam.equals(teamTwo))
                {
                    // System.out.println("team two active");
                    activeTeam = teamOne;
                }
            }
        }
    }
}

// if red loses gains 0 in one round then switch to blue