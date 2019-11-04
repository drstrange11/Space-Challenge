import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation{

        private ArrayList<Item> items;

        Simulation(){
            items= new ArrayList<>();
        }
        public void loadItems(String filename)
        {
            File file = new File(filename);
            try{
                Scanner scanner = new Scanner(file);
                while(scanner.hasNextLine())
                {
                    String[] line = scanner.nextLine().split("=");
                    items.add(new Item(line[0],Integer.valueOf(line[1])));
                }

            } catch (FileNotFoundException e) {
                System.out.println("File not Found");
                System.exit(0);
            }
        }
        public ArrayList<Rocket> loadU1()
        {
            ArrayList<Rocket> fleet1 = new ArrayList<>();
            int i=0;
            while(i<items.size())
            {
                Rocket r1 = new U1();
                while(r1.canCarry(items.get(i)))
                {
                    if(i<items.size()){
                    r1.carry(items.get(i));
                    i++;}
                }
               fleet1.add(r1);
            }
            return fleet1;
        }
        public ArrayList<Rocket> loadU2()
        {
        ArrayList<Rocket> fleet2 = new ArrayList<>();
        int i=0;
        while(i<items.size())
        {
            Rocket r2 = new U2();
            while(i<items.size() && r2.canCarry(items.get(i)))
            {
                r2.carry(items.get(i));
                i++;
            }
            fleet2.add(r2);
        }
        return fleet2;
        }

        public double runSimulation(ArrayList<Rocket> rockets)
        {
            double totalBudget=0;
            int times=0;
            for(Rocket r:rockets)
            {
                while(!r.launch() || !r.land())
                {
                    totalBudget+=r.cost;
                    times++;
                }

            }
            System.out.println("Fails = "+times);
            return totalBudget;

        }
    }


