public class ProgramStructure {
    public static void main(String [] args){
    ProgramStructure printer = new ProgramStructure();
        printer.aboutPublic();
        printer.aboutVoid();
        printer.aboutMain();
        printer.aboutPrintln();
    }
    public void aboutPrintln(){
        System.out.println("println () is method to display a text on the console");
    }
    public void aboutPublic(){
        System.out.println("public is a access modifier");
    }
    public void aboutMain(){
        System.out.println("Main is the entry point to a program");
    }
    public void aboutVoid(){
        System.out.println("void is a return type which return nothing.Just like this method ;)");
    }
}




