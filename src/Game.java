
public class Game {
	private Team teamA;
	private Team teamB;
	private int scoreA;
	private int scoreB;

	public Game(Team teamA, Team teamB) {
		this.teamA = new Team(teamA);
		this.teamB = new Team(teamB);
	}

	public void addPointTeamA() {
		addPointTeamA(1);
	}

	public void addPointTeamA(int amount) {
		scoreA += amount;
	}

	public void addPointTeamB() {
		addPointTeamB(1);
	}

	public void addPointTeamB(int amount) {
		scoreB += amount;
	}

	public Team getWinner() {
			if(scoreA> scoreB){
				return teamA;
			}
			else if (scoreA< scoreB){
				return teamB;
			}
			else return null;
	}
	
	public String getScore(){
		return String.format("(%s:%d : %s:%d)", teamA, scoreA,teamB, scoreB);
	}

	public Team getTeamA() {
		return new Team(this.teamA);
	}

	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}

	public Team getTeamB() {
		return new Team(this.teamB);
	}

	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}
	
	
}
