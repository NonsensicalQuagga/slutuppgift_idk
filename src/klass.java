public class klass extends Arv{

    public String yeet = "yeet"; //jag är public och kan nås utanför
    private String pog;  //kan inte nås utanför

    public Arv cool;
    public klass (String wow){

        this.pog = wow;
    }

    public klass () {
        this.pog = "pog";
    }


    public void printPog(){
        System.out.println(pog);
    }

    public static void stat(){
        System.out.println("Jag kräver inte ett objekt");
    }

    public void printAll(){
        System.out.println(yeet);
        System.out.println(pog);
        super.printAll();
    }
}
