package Series;

public class SquareSeries {
	public static void printSquares(int n) {
        System.out.print("Square Series: ");
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
        System.out.println();
    }
}