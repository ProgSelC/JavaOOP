package homework;

public class TriangleRun {

	public static void main(String[] args) {
		Triangle tr[] = { new Triangle(5, 2, 4), new Triangle(2, 3, 4),
				new Triangle(3, 4, 5) };

		for (int i = 0; i < tr.length; i++) {
			System.out.printf("Triangle%d square equals %.2f\n", (i + 1), tr[i].countSquare());
		}
	}
}
