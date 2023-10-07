public class Sequences {
    int definiteNumber = 2;
    public void arithmeticSeries() {
        String apNumber="1";
        apNumber = apNumber + ", " + (1 + definiteNumber) + ", " + 
        (1 + (2 *definiteNumber))+ "........" ;
        System.out.println(apNumber);
    }

    public void geometricSeries() {
        String geoNumber = "1";
        geoNumber = geoNumber + ", " + (1*definiteNumber) + ", " + (1*(definiteNumber*definiteNumber))
        + ", " + (1*(definiteNumber*definiteNumber*definiteNumber))+"...............";
        System.out.println(geoNumber);
    }
    public static void main(String[] args) {
        Sequences add = new Sequences();
        add.arithmeticSeries();
        add.geometricSeries();
    }
}