package dpaf_lab1;

interface cmpName {

    void Cname();
}

interface cmpType {

    void type();
}

interface cmpLoc {

    void loc();
}

class Nameimpl extends Locimpl implements cmpName, cmpType {

    public void Cname() {
        System.out.println("Aspire Meditech.");
    }

    public void type() {
        System.out.println("Private-lim.");
    }
}

abstract class Locimpl implements cmpLoc {

    public void loc() {
        System.out.println("Surat");
    }
}

public class DPAF_LAB1 {

    public static void main(String[] args) {
        Nameimpl d = new Nameimpl();
        d.Cname();
        d.type();
        d.loc();
    }
}
