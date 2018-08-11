package FamilyTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static FamilyTree.MockDB.people;

public class Main {

    public Person getPersonById(int id) {
        for (Person person : people) {
            if (person.getId() == id) return person;
        }
        return null;
    }

    public String editPersonName(int id, String name) {
        for (Person person : people) {
            if (person.getId() == id) {
                person.setName(name);
                break;
            }
        }
        return name;
    }

    public void addUser(int id, String name, LocalDate birtday) {
        for (Person p : people) {
            if (p.getId() == id){
                System.out.println("ID - " +id+ " already exist !");
                break;
            }
        }
        people.add(new Person(id, name, birtday));
    }

    public void deleteUser(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                people.remove(person);
                break;
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        System.out.println(main.getPersonById(1));

        System.out.println("Enter Name : ");
        System.out.println(main.editPersonName(1, sc.next()));

        main.addUser(2, "Nur", LocalDate.of(2000, 1, 1));
        System.out.println(people);
        main.deleteUser(2);
        System.out.println(people);
    }
}
