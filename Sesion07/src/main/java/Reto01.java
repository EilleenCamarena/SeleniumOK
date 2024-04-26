import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reto01 {
    public static void main(String[] args) {
        List<Persona> agenda = new LinkedList<>();

        Persona p1 = new Persona("Abigail", "4561-5323");
        Persona p2 = new Persona("Beto", "4261-5323");
        Persona p3 = new Persona("Carlos", "4261-5313");
        Persona p4 = new Persona("Cesar", "1261-5323");
        Persona p5 = new Persona("Fernando", "4211-5323");
        Persona p6 = new Persona("Monica", "4161-5323");

        agenda.add(p5);
        agenda.add(p6);
        agenda.add(p1);
        agenda.add(p2);
        agenda.add(p4);
        agenda.add(p3);

        Collections.sort(agenda);

        for (Persona p : agenda){
            System.out.println(p.toString());
        }

    }

}
