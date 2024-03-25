import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("CYLINDER PROBLEM : ");
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("*************************");

        System.out.println("POOL AREA PROBLEM :");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("*************************");

        System.out.println("DEVELOPER COMPANY PROBLEM :");
        HRManager hrManager = new HRManager(1, "John Doe", 70000);
        JuniorDeveloper junior1 = new JuniorDeveloper(1, "Jane 1 Doe", 30000);
        JuniorDeveloper junior2 = new JuniorDeveloper(1, "Jane 2 Doe", 30000);
        JuniorDeveloper junior3 = new JuniorDeveloper(1, "Jane 3 Doe", 30000);
        JuniorDeveloper junior4 = new JuniorDeveloper(1, "Jane 4 Doe", 30000);
        hrManager.addEmployee(junior1);
        hrManager.addEmployee(junior2);
        hrManager.addEmployee(junior3);
        hrManager.addEmployee(junior4);

        System.out.println("JUNIORS : " + hrManager.getJuniorDevelopers().toString());
    }
}