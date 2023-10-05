package game;
import java.util.ArrayList;
import java.util.List;
public class Indoor {

	private String gameName;
    private List<String> players;

    public Indoor() {
        this("Indoor Game");
    }

    public Indoor(String gameName) {
        this.gameName = gameName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    public void display() {
        System.out.println("Players for " + gameName + ":");
        for (String player : players) {
            System.out.println(player);
        }
    }
}