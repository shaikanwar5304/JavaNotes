package J_animalshop;

class Fish extends Animal{
    private String waterType;
    Fish(String Breed,String waterType,String colour){
        super(Breed,colour);
        this.waterType=waterType;
    }
    public String getWaterType(){
        return this.waterType;
    }

}