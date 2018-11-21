import java.lang.reflect.Array;

public class Team {

	private String _owner;
	private String _cotchar;
	private int _numOfPlayers;
	private String[] _players;
	private int _playersIndex ;
	
	public Team(String teamOwner, String teamCotchar, int numOfPlayers){
		_owner = teamOwner;
		_cotchar = teamCotchar;
		_numOfPlayers = numOfPlayers >= 0 ? numOfPlayers : 10;
		_playersIndex =0;
		
//		System.out.println("Team created from 3 parms constractor" + _numOfPlayers);
		_players = new String[_numOfPlayers];
		
	}
	public Team(String _owner, String _cotchar) {
		this(_owner, _cotchar,10);
//		System.out.println("Team created from 2 parms constractor");
	}
	
	public Team(Team source){
		_owner = source._owner;
		_cotchar = source._cotchar;
		_numOfPlayers = source._numOfPlayers;
		_players = new String[source._players.length];
		for (int i=0; i<_players.length;i++){
			_players[i]= source._players[i];
		}
	}


	public String get_cotchar() {
		return _cotchar;
	}
	public void set_cotchar(String _cotchar) {
		this._cotchar = _cotchar;
	}
	public String get_owner() {
		return _owner;
	}
	@Override
	public String toString() {
		return "Team Owner=" + _owner + ", Cotchar=" + _cotchar;
	}
	public void add_player(String name) {
		// yosi, ronen, nimne, messei , null,null,null,null
//		if (_playersIndex< _players.length){
//		_players[_playersIndex]=name;
//		_playersIndex++;
//		}
//		else{
//			System.out.println("No More ROOM");
//		}
		boolean found =false;
		for (int i = 0; i < _players.length && !found ; i++) {
			if (this._players[i]==null){
				this._players[i]=name;
				found=true;
			}
		}
		if (!found){
			System.out.println("No More ROOM");
		}
		
		
	}
	public String get_players() {
		String res="";
		for (int i=0;i<this._players.length;i++ )
			if (this._players[i]!=null)
				res+=this._players[i]+" ";
		
		return res;
	}
	@Override
	public boolean equals(Object other) {
		if (other instanceof Team){
			Team tmp = (Team)other;
			if (this._owner == tmp._owner && this._cotchar==tmp._cotchar &&
					this._players.length == tmp._players.length){
				return true;
			}
			else{
				return false;
			}
			
		}
		else{
			return false;
		}
	}
	
	
	
	
	
	
}//end class
