public class Arv {
    private String no;
    protected String  happyThoughts;

    public Arv(){
        no = "jag kan inte nås i objektet";
        happyThoughts = "objektet kan nå detta";
    }

    public void printNo(){
        System.out.println(no);
    }

    public void printAll(){
        System.out.println(no);
        System.out.println(happyThoughts);
    }
}
