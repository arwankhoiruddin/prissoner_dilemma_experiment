import java.util.LinkedList;

abstract class Person {
    public String nama;
    public String description;
    public LinkedList<Boolean> steps = new LinkedList<>();
    
    public Person(String nama, String description) {
        this.nama = nama;
        this.description = description;
    }
    
    public abstract void respond(Person otherPerson);
    // Now any subclass of Person must implement the respond method
}
