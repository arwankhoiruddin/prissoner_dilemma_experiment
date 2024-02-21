public class BalasMemaafkan extends Person {

    public BalasMemaafkan() {
        super("Ahmad", "membalas dan memaafkan");
    }

    @Override
    public void respond(Person otherPerson) {
        if (!otherPerson.steps.getLast()) {
            this.steps.add(false);
        } else {
            this.steps.add(true);
        }
    }
}
