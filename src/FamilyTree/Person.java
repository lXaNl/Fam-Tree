package FamilyTree;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate birtday;

    public Person(int id, String name, LocalDate birtday) {
        this.id = id;
        this.name = name;
        this.birtday = birtday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birtday=" + birtday +
                '}';
    }
}
