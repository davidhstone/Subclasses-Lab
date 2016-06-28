public class Main {

    public static void main(String[] args) {
	// write your code here

        Mammal aMoose = new Mammal(30, "cold", false, 4, 35, false, "Mortimer");

        System.out.println(aMoose.getmLifeSpan());
        System.out.println(aMoose.getmHabitat());
        System.out.println(aMoose.ismIsEndangered());
        System.out.println(aMoose.getmNumLegs());
        System.out.println(aMoose.getmTopSpeed());
        System.out.println(aMoose.ismIsMarsupial());
        System.out.println(aMoose.getmName());



        Reptile aCroc = new Reptile(40, "hot", false, 4, 25, false, "Clarence");

        System.out.println(aCroc.getmLifeSpan());
        System.out.println(aCroc.getmHabitat());
        System.out.println(aCroc.ismIsEndangered());
        System.out.println(aCroc.getmNumLegs());
        System.out.println(aCroc.getmTopSpeed());
        System.out.println(aCroc.ismIsTopPredator());
        System.out.println(aCroc.getmName());

    }


}
