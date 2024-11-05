package tech.java.java17;


//Sealed classes let you control which classes or interfaces can extend or implement a class/interface.
//This helps create more secure and maintainable hierarchies.
public sealed class Shape permits Circle, Rectangle {

  public void printShapeDesc() {
    System.out.println("Shape");
  }
}
