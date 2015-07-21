package lessons;

public class CatRun {
	public static void main(String[] args) {
		Cat aBarsic = new Cat("Barsic", 1, 2, "male");
		Cat aMurka = new Cat("Murka", 3, 3, "female");
		Cat aKitty = new Cat("Kitty", 3, 2, "female");
		Cat aZeus = new Cat("Zeus", 4, 5, "male");
		
		aBarsic.voice();
		aBarsic.compareCats(aMurka);
		aMurka.compareCats(aKitty);
		
		Cat alittleCat = aBarsic.newCat(aMurka);
		Cat alittleCat1 = aMurka.newCat(aKitty);
		Cat alittleCat2 = aBarsic.newCat(aZeus);
		
		if (alittleCat != null) {
			System.out.print("Kitten ");
			alittleCat.voice();
		}
		if (alittleCat1 != null) {
			System.out.print("Kitten ");
			alittleCat1.voice();
		}
		if (alittleCat2 != null) {
			System.out.print("Kitten ");
			alittleCat2.voice();
		}
		
		System.out.println("Total cats created: " + Cat.getCatCount());
	}
}
