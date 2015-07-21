package homework;

public class Vector3dRun {

	public static void main(String... args) {
		Vector3d v1 = new Vector3d("a", 1, 1, 1);
		Vector3d v2 = new Vector3d("b", 4, 4, 4);
		Vector3d v3 = new Vector3d("c", 5, 0, 0);
		Vector3d v4 = new Vector3d("d", 0, 0, 3);

		v1.printVector();
		v2.printVector();
		v3.printVector();
		v4.printVector();
		
		// сумма векторов
		v1.sumVector(v3).printVector();
		
		// векторное произведение векторов
		v1.vectorProduct(v3).printVector();

		// скалярное произведение векторов
		System.out.printf("Scalar product %s and %s equals %.1f\n",
				v2.getName(), v4.getName(), v2.scalarProduct(v4));

		// проверка на коллинеарность и перпендикулярность
		System.out.printf("%s %s\t collinear to %s\n", v1.getName(),
				(v1.isCollinear(v2) ? "is" : "isn't"), v2.getName());

		System.out.printf("%s %s\t perpendicular to %s\n", v1.getName(),
				(v1.isPerpendicular(v2) ? "is" : "isn't"), v2.getName());

		System.out.printf("%s %s\t collinear to %s\n", v3.getName(),
				(v3.isCollinear(v4) ? "is" : "isn't"), v4.getName());

		System.out.printf("%s %s\t perpendicular to %s\n", v3.getName(),
				(v3.isPerpendicular(v4) ? "is" : "isn't"), v4.getName());
	}
}
