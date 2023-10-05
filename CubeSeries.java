package Series;

public class CubeSeries {
	  public static void printCubes(int n) {
	        System.out.print("Cube Series: ");
	        for (int i = 1; i <= n; i++) {
	            int cube = i * i * i;
	            System.out.print(cube + " ");
	        }
	        System.out.println();
	    }
	}
