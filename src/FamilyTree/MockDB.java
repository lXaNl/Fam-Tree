package FamilyTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MockDB {

    public static final List<Person> people = new  ArrayList<>();

    static {
        people.add(new Person(1,"Xan", LocalDate.of(1997,8,11)));
    }

}
