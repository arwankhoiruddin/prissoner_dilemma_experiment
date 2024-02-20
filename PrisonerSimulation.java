// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Person {
    public String name;
    public boolean[] steps;
    
    public Person(String name, int iterations) {
        this.name = name;
        steps = new boolean[iterations];
    }
    
    public void iterogasi(Person orangLain) {
        
    }
}

class PrisonerSimulation {
    public static void main(String[] args) {
        System.out.println("Prissoners Dilemma");
        int iterations = 10;
        Person a = new Person("selalu memaafkan", iterations);
        Person b = new Person("membalas dan memaafkan", iterations);
        Person c = new Person("selalu membalas", iterations);
        Person d = new Person("selalu berkhianat", iterations);
        Person e = new Person("membalas susah memaafkan", iterations);
        
    }
}
