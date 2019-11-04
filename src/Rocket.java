public class Rocket implements SpaceShip {
    int cost;
    int weight;
    int maxWeight;
    double chanceExplosion;
    double chanceCrash;
    int currentWeight;

    public boolean launch(){
        return true;
    }
    public boolean land(){
        return true;
    }
    public boolean canCarry(Item item) {
        return item.getWeight() + currentWeight <= maxWeight;
    }
    public void carry(Item item) {
        currentWeight += item.getWeight();

    }

}
