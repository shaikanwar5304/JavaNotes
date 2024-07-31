package J_animalshop;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog =new Dog("Bailey","Boerboel","arf-arf",80.2,"brown");
        System.out.println("Dog name :"+dog.getName());
        System.out.println("Dog breed :"+dog.getBreed());
        System.out.print("Bark NOise: ");
        dog.bark();
        System.out.println("Dog weight: "+dog.getWeight());
        System.out.println("Dog colour: "+dog.getColour());
        System.out.println();
        Fish fish=new Fish("GoldFish","cold","red");
        System.out.println("Fish Breed : "+fish.getBreed());
        System.out.println("Fish WAter type : "+fish.getWaterType());
        System.out.println("Fish Colour : "+fish.getColour());
    }
}
