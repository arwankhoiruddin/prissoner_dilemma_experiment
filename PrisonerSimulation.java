import java.util.LinkedList;

class PrisonerSimulation {

    private static int[] interaction(Person a, Person b, int iterations) {
        int[] points = new int[2];
        
        a.steps.clear();
        b.steps.clear();
        a.steps.add(true);
        b.steps.add(true);
        for (int iter=0; iter < iterations; iter++) {
            a.respond(b);
            b.respond(a);
        }
        for (boolean val: a.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (boolean val: b.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (int iter=0; iter < iterations; iter++) {
            if (a.steps.get(iter) && b.steps.get(iter)) {
                points[0] += 1;
                points[1] += 1;
            } else if (!a.steps.get(iter) && b.steps.get(iter)) {
                points[0] = 0;
                points[1] = 3;
            } else if (a.steps.get(iter) && !b.steps.get(iter)) {
                points[0] = 3;
                points[1] = 0;
            } else {
                points[0] = 2;
                points[1] = 2;
            }
        }

        a.steps.clear();
        b.steps.clear();
        a.steps.add(true);
        b.steps.add(false);
        for (int iter=0; iter < iterations; iter++) {
            a.respond(b);
            b.respond(a);
        }
        System.out.println();
        for (boolean val: a.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (boolean val: b.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (int iter=0; iter < iterations; iter++) {
            if (a.steps.get(iter) && b.steps.get(iter)) {
                points[0] += 1;
                points[1] += 1;
            } else if (!a.steps.get(iter) && b.steps.get(iter)) {
                points[0] = 0;
                points[1] = 3;
            } else if (a.steps.get(iter) && !b.steps.get(iter)) {
                points[0] = 3;
                points[1] = 0;
            } else {
                points[0] = 2;
                points[1] = 2;
            }
        }

        a.steps.clear();
        b.steps.clear();
        a.steps.add(false);
        b.steps.add(true);
        for (int iter=0; iter < iterations; iter++) {
            a.respond(b);
            b.respond(a);
        }
        System.out.println();
        for (boolean val: a.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (boolean val: b.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (int iter=0; iter < iterations; iter++) {
            if (a.steps.get(iter) && b.steps.get(iter)) {
                points[0] += 1;
                points[1] += 1;
            } else if (!a.steps.get(iter) && b.steps.get(iter)) {
                points[0] = 0;
                points[1] = 3;
            } else if (a.steps.get(iter) && !b.steps.get(iter)) {
                points[0] = 3;
                points[1] = 0;
            } else {
                points[0] = 2;
                points[1] = 2;
            }
        }

        a.steps.clear();
        b.steps.clear();
        a.steps.add(false);
        b.steps.add(false);
        for (int iter=0; iter < iterations; iter++) {
            a.respond(b);
            b.respond(a);
        }
        System.out.println();
        for (boolean val: a.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (boolean val: b.steps) {
            System.out.print(val + "\t");
        }
        System.out.println();
        for (int iter=0; iter < iterations; iter++) {
            if (a.steps.get(iter) && b.steps.get(iter)) {
                points[0] += 1;
                points[1] += 1;
            } else if (!a.steps.get(iter) && b.steps.get(iter)) {
                points[0] = 0;
                points[1] = 3;
            } else if (a.steps.get(iter) && !b.steps.get(iter)) {
                points[0] = 3;
                points[1] = 0;
            } else {
                points[0] = 2;
                points[1] = 2;
            }
        }

        return points;
    }

    public static void main(String[] args) {
        System.out.println("Prissoners Dilemma");
        
        int iterations = 10;
        Person a = new OrangBaik();
        Person b = new BalasMemaafkan();
        
        int[] points = interaction(a, b, iterations);
        for (int point: points) {
            System.out.println(point);
        }
    }
}
