
package shape.pkgabstract;


public class ShapeAbstract {


    public static void main(String[] args) {
        Shape circ = new Circle(5);
        Shape sq = new Square(9.11, 69.9);
        
        System.out.println(circ.getName() +
                "\nArea =  " + circ.getArea() + 
                "\n\n" + sq.getName() + 
                "\nArea = " + sq.getArea());
      
    }
    
}
