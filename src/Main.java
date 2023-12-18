
public class Main {
    public static void main(String[] args) {
        klass braUppgift = new klass("wow");
        klass goodExamination = new klass();
        Arv baraArv = new Arv();

        braUppgift.stat();
        klass.stat();

        goodExamination.printPog();

        goodExamination.printAll();

        baraArv.printAll();

        braUppgift.yeet = "kan ändras utanför";
        braUppgift.happyThoughts = "kan ändras utanför";
        System.out.println(braUppgift.yeet);
        System.out.println(braUppgift.happyThoughts);

    }

}
