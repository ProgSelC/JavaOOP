package homework;

public class Vector3d {
	private String name;
	private double x;
	private double y;
	private double z;

	public Vector3d(String name, double x, double y, double z) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d(String name) {
		super();
		this.name = name;
		this.x = 1;
		this.y = 1;
		this.z = 1;
	}

	public String getName() {
		return name;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public void printVector() {
		System.out.printf("%s (%.2f, %.2f, %.2f)\n",this.name, this.x, this.y, this.z);
	}

	public Vector3d sumVector(Vector3d oVect) {
		return new Vector3d(this.name + "+" + oVect.getName(), this.x
				+ oVect.getX(), this.y + oVect.getY(), this.z + oVect.getZ());
	}

	public Vector3d vectorProduct(Vector3d oVect) {
		double newX = this.y * oVect.getZ() - this.z * oVect.getY();
		double newY = this.x * oVect.getZ() - this.z * oVect.getX();
		double newZ = this.y * oVect.getX() - this.x * oVect.getY();

		return new Vector3d(this.name+"x"+oVect.name,newX, newY, newZ);
	}

	public double scalarProduct(Vector3d oVect) {
		return this.x * oVect.getX() + this.y * oVect.getY() + this.z
				* oVect.getZ();
	}

	public boolean isCollinear(Vector3d oVect) {
		return (this.vectorProduct(oVect).getX() == 0
				&& this.vectorProduct(oVect).getY() == 0 && this.vectorProduct(
				oVect).getZ() == 0);
	}

	public boolean isPerpendicular(Vector3d oVect) {
		return (this.scalarProduct(oVect) == 0);
	}
}
