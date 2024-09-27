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
        if (activeTeam == teamOne)
        {   
            teamOneScore =+ score;
            if (score == 0)
            {   
                activeTeam = teamTwo;
            }
        }
        if (activeTeam == teamTwo)
        {
            teamTwoScore =+ score;
            if (score == 0)
            {   
                activeTeam = teamOne;
            }
        }
    }
}

// if red loses gains 0 in one round then switch to blue