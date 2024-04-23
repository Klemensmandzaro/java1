public class Zadanie_3 {
    public static void zrob_zadanie(){
        Wyscigowy wyscigowy= new Wyscigowy("Biały", "Mercedes", false);
        Sportowy supra=new Sportowy("Zolta", "Toyota", "podwojne");
        Zwykly pasat=new Zwykly("szary", "wolgswagen", 5);
        Car[] cars={wyscigowy, supra, pasat};
        for (Car obecnyCar : cars) {
            System.out.println(obecnyCar.getKolor()+" "+obecnyCar.getMarka());
        }
    }
}
