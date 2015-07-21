package lessons;

import java.util.Random;

public class Cat {
	private static int catCount;

	private String name;
	private int age;
	private double weight;
	private String sex;

	public static int getCatCount() {
		return catCount;
	}

	public Cat(String name, int age, double weight, String sex) {
		catCount++;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
	}

	public Cat(String name) {
		catCount++;
		this.name = name;
		this.age = 1;
		this.weight = 10;
		this.sex = "male";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void voice() {
		System.out.println(this.name+" says Meow!");
	}

	public void compareCats(Cat otherCat) {
		if (this.age > otherCat.getAge()) {
			System.out.printf("%s is older then %s\n", this.name, otherCat.getName());
		} else if (this.age < otherCat.getAge()) {
			System.out.printf("%s is older then %s\n", otherCat.getName(), this.name);
		} else {
			System.out.printf("%s and %s have same age!\n", this.name, otherCat.getName());
		}
	}
	
	public Cat newCat (Cat otherCat){
		if(this.sex != otherCat.getSex()){
			Random rn = new Random();
			Cat littleCat = new Cat("Noname", 0, 0.1, (rn.nextBoolean())?"male":"female");
			return littleCat;
		} if (this.sex.matches("male")){
			System.out.printf("%s and %s both male! Fight!\n", this.name, otherCat.getName());
			return null;
		}else {
			System.out.printf("%s and %s have same sex! Sorry, no kittens\n", this.name, otherCat.getName());
			return null;
		}
	}

}
