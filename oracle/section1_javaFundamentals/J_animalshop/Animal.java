package J_animalshop;
public class Animal{
    private String breed;
    private String colour;
    Animal(String breed,String Colour){
        this.breed=breed;
        this.colour=Colour;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String Colour)
    {
        this.colour=Colour;
    }
}