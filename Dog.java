public class Dog {
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;

  public Dog(String theName, String breed, double weight, String color, boolean houseTrained){
    name = theName;
    this.breed = breed;
    this.weight = weight;
    this.color = color;
    this.houseTrained = houseTrained;
  }

  // getter methods
  public String getName(){
    return this.name;
  }

  public String getBreed(){
    return this.breed;
  }
  
  public double getWeight(){
    return this.weight;
  }


  //@override
  public String toString(){
    return this.name + "🐶";
  }









}
