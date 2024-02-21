public class OrangBaik extends Person {

    public OrangBaik() {
        super("Arwan", "selalu memaafkan");
    }

    @Override
    public void respond(Person otherPerson) {
        this.steps.add(true);
    }
    
}
