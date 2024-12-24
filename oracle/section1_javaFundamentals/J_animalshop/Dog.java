package J_animalshop;

class Dog extends Animal{
    private String name;
    private String barkNoise="Woof";
    private double weight;

    public Dog(String name,String breed,double weight,String colour){
        super(breed,colour);//calling superClass constructor
        this.name=name;
        this.weight=weight;
    }

    public Dog(String name,String breed,String Noise,double weight,String colour){
        super(breed,colour);
        this.name=name;
        this.weight=weight;
        this.barkNoise=Noise;
    }

    //Accessor methods are getters which will return some sort of information
    //Mutator methods are setters in general. And they will not return any but takes parameters
    //Functional methods perform some actions may or may not be void 

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    
    public void bark(){
        System.out.println(barkNoise);
    }
    //method overloading is possible but they should have different signatures
    public void bark(String noise){
        System.out.println(noise);
    }
}
