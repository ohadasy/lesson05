
public class Tester {

	public static void main(String[] args) {
		Team holon=null;
		Team telAviv = new Team("Tshuvva", "levayev");
		holon = new Team("Yam", "stam", -12);
		String noharData = telAviv.toString();
		System.out.println(telAviv);
		System.out.println(holon);
		telAviv.add_player("Itzik");
		telAviv.add_player("koko");
		telAviv.add_player("foo");
		telAviv.add_player("foo");
		telAviv.add_player("foo");
		holon.add_player("messi");
		holon.add_player("messi");
		holon.add_player("messi");
		holon.add_player("messi");
		System.out.println(telAviv.get_players());
		System.out.println(holon.get_players());
		Game n2b = new Game(telAviv, holon);
		n2b.addPointTeamA();
		n2b.addPointTeamA();
		n2b.addPointTeamA();
		System.out.println(n2b.getScore());
		n2b.getTeamB().add_player("Levron James");
		System.out.println(n2b.getTeamB().get_players());
		Team temp = n2b.getTeamB();
		System.out.println(temp.equals(holon));
		
		
		
		
		
		
		
		
		
		
		
	}

}
