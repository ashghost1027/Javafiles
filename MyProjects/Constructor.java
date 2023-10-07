public class Constructor {
    String name;
    String bars;
    double time;
    String cement;

    void House(String name ,String bars,Double time,String cement){
        this.name = name;
        this.bars = bars;
        this.time = time;
        this.cement = cement;
    }
    void destroyHouse(){
        System.out.println("The house built by "+bars+" bars got demolished.");
    }
    void furnishHouse(){
        System.out.println(name+" was furnished today");
    }
}
