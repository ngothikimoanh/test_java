import java.lang.String;
import java.util.*;

abstract class Persons {
    public abstract String getName();

}

class Duong extends Persons {
    public String getName() {
        return "Duong";
    }
}

class Oanh extends Persons {
    public String getName() {
        return "Oanh";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Persons> list = new ArrayList<Persons>();
        list.add(new Duong());
        list.add(new Oanh());
        for (Persons p : list) {
            System.out.println(p.getName());
        }
    }
}