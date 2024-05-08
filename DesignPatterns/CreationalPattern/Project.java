package CreationalPattern;



interface Shape{
    
    public double area();
    public double perimeter();
    
    
}

class Circle implements Shape{

    private double radius;
    
    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

}

class Rectangle implements Shape{
    
    private double length;
    private double width;
    
    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2 * length + 2 * width;
    }
    
    
}

abstract class ShapeFactory{
    
    //Other stuff
    
    
    public abstract Shape createShape();
    
}


class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape(){
        return new Circle();
    }
    
}

class RectangleFactory extends ShapeFactory{
    @Override
    public Shape createShape(){
        return new Rectangle();
    }

}

class Project {

    public static void main(String[] args){

        ShapeFactory sf1 = new CircleFactory();
        Shape circle = sf1.createShape();
        circle.area();

        ShapeFactory sf2 = new RectangleFactory();
        Shape rectangle = sf2.createShape();
        rectangle.perimeter();


    }

}







