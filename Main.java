package game;
import game.Indoor;
import game.Outdoor;
public class Main {
	 public static void main(String[] args) {
	        
	        Indoor indoorGame = new Indoor("Chess");
	        Outdoor outdoorGame = new Outdoor("Football");

	       
	        indoorGame.addPlayer("Alice");
	        indoorGame.addPlayer("Bob");
	        outdoorGame.addPlayer("Charlie");
	        outdoorGame.addPlayer("David");

	       
	        indoorGame.display();
	        outdoorGame.display();
	    }
	}

