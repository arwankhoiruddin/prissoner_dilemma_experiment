import java.util.LinkedList;

class PrisonerSimulation {

    public static void main(String[] args) {
        System.out.println("Prissoners Dilemma");
        
        int iterations = 10;
        Person a = new OrangBaik();
        Person b = new BalasMemaafkan();

        Person[] persons = {a, b};
        for (int i=0; i< persons.length; i++) {
            for (int j=0; j < persons.length; j++) {
                int poinA = 0;
                int poinB = 0;
                
                a.steps.clear();
                b.steps.clear();
                a.steps.add(true);
                b.steps.add(true);
                for (int iter=0; iter < iterations; iter++) {
                    a.respond(b);
                    b.respond(a);
                }
                System.out.println("Person A");
                for (boolean val: a.steps) {
                    System.out.println(val);
                }
                System.out.println("Person B");
                for (boolean val: b.steps) {
                    System.out.println(val);
                }

                a.steps.clear();
                b.steps.clear();
                a.steps.add(true);
                b.steps.add(false);
                for (int iter=0; iter < iterations; iter++) {
                    a.respond(b);
                    b.respond(a);
                }
                System.out.println("Person A");
                for (boolean val: a.steps) {
                    System.out.println(val);
                }
                System.out.println("Person B");
                for (boolean val: b.steps) {
                    System.out.println(val);
                }

                a.steps.clear();
                b.steps.clear();
                a.steps.add(false);
                b.steps.add(true);
                for (int iter=0; iter < iterations; iter++) {
                    a.respond(b);
                    b.respond(a);
                }
                System.out.println("Person A");
                for (boolean val: a.steps) {
                    System.out.println(val);
                }
                System.out.println("Person B");
                for (boolean val: b.steps) {
                    System.out.println(val);
                }

                a.steps.clear();
                b.steps.clear();
                a.steps.add(false);
                b.steps.add(false);
                for (int iter=0; iter < iterations; iter++) {
                    a.respond(b);
                    b.respond(a);
                }
                System.out.println("Person A");
                for (boolean val: a.steps) {
                    System.out.println(val);
                }
                System.out.println("Person B");
                for (boolean val: b.steps) {
                    System.out.println(val);
                }
            }
        }
    }
}
