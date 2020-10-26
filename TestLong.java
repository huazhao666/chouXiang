package ChouXiang.demo;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-26
 * Time : 14:36
 */
interface Shape {

    public abstract void draw();
//    default  public void func(){
//
//    }
}

class  Cycle implements  Shape{
    public  void draw(){
        System.out.println(" ⭕");
    }
}
class  Flower implements  Shape{
    public  void draw(){
        System.out.println(" ❀");
    }
}

public class TestLong {

    public static  void drawMap(Shape shape){
        shape.draw();
    }

    public static void main (String[] args){
        Shape shape = new Flower();
        shape.draw();
        Shape shape1 = new Cycle();
        shape1.draw();
        Flower flower = new Flower();
        drawMap(flower);
    }


}
