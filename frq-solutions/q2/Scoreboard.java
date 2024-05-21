public class Scoreboard {
    private String t1;
    private String t2;
    private int s1;
    private int s2;
    private boolean isTeam1Active;

    public Scoreboard(String team1Name, String team2Name) {
        t1 = team1Name;
        t2 = team2Name;
        s1 = 0;
        s2 = 0;
        isTeam1Active = true;
    }

    public String getScore() {
        if(isTeam1Active) {
            return s1 + "-" + s2 + "-" + t1;
        } else {
            return s1 + "-" + s2 + "-" + t2;
        }
    }

    public void recordPlay(int point) {
        if(point == 0) isTeam1Active = !isTeam1Active;
        if(isTeam1Active) s1 += point;
        else s2+= point;
    }
  
}
