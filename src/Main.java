
public class Main {

    public static void main(String[] args) {

        Simulation sim = new Simulation();
        sim.loadItems("phase1.txt");
        sim.loadItems("phase2.txt");

        System.out.println("Budget for U1 "+ sim.runSimulation(sim.loadU1())+ " millions");
        System.out.println("Budget for U2 "+ sim.runSimulation(sim.loadU2())+ " millions");

    }
}
