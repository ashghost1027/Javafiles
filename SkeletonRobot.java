public class SkeletonRobot {
    String colour;
    String software;
    String name;
    String dressCode;
    String job;
    public static void main(String[] args) {
        SkeletonRobot change = new SkeletonRobot();
        change.changeColor();
        change.changeSoftware();
        change.changeDressCode();
        change.changeName();
        change.changeJob();
    }
    public void changeColor(){
        colour = "color";
        System.out.println(colour);
    }   
    public void changeSoftware(){
        software = "Software.2.0";
        System.out.println(software);
    }
    public void changeName(){
        name = "Optimus Prime";
        System.out.println(name);
    }
    public void changeDressCode(){
        dressCode = "Hot";
        System.out.println(dressCode);
    }
    public void changeJob(){
        job = "fun";
        System.out.println(job);
    }
} 

