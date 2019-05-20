
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square horizon;
    private Square ground;
    private Square wall;
    private Square wall2;
    private Square window;
    private Square window2;
    private Square window3;
    private Square door;
    private Square tower;
    private Square tower2;
    private Circle kremlin;
    private Circle kremlin2;
    private Triangle roof;
    private Triangle roof2;
    private Triangle roof3;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        
     
        horizon = new Square ();
        horizon.changeSize(300);
        horizon.moveVertical(-150);
        horizon.moveHorizontal(-60);
        horizon.changeColor("blue");
        horizon.makeVisible();
        
        ground = new Square ();
        ground.changeSize(300);
        ground.moveVertical(150);
        ground.moveHorizontal(-60);
        ground.changeColor("green");
        ground.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.changeColor("red");
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(80);
        wall2.moveHorizontal(100);
        wall2.changeSize(100);
        wall2.changeColor("red");
        wall2.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(80);
        window2.moveVertical(100);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("black");
        window3.moveHorizontal(140);
        window3.moveVertical(100);
        window3.makeVisible();
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(80);
        door.moveVertical(150);
        door.changeColor("brown");
        door.makeVisible();
        
        roof3 = new Triangle();
        roof3.changeSize(50, 35);
        roof3.moveHorizontal(105);
        roof3.moveVertical(65);
        roof3.changeColor("black");
        roof3.makeVisible();
        
        tower = new Square ();
        tower.changeSize(50);
        tower.moveVertical(40);
        tower.changeColor("red");
        tower.makeVisible();
        
        tower2 = new Square ();
        tower2.changeSize(50);
        tower2.moveVertical(40);
        tower2.changeColor("red");
        tower2.moveHorizontal(150);
        tower2.makeVisible();        
        
        kremlin = new Circle ();
        kremlin.changeSize(90);
        kremlin.moveVertical(-40);
        kremlin.moveHorizontal(170);
        kremlin.changeColor("black");
        kremlin.makeVisible();
        
        kremlin2 = new Circle ();
        kremlin2.changeSize(90);
        kremlin2.moveVertical(-40);
        kremlin2.moveHorizontal(18);
        kremlin2.changeColor("black");
        kremlin2.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(25, 35);
        roof.moveHorizontal(185);
        roof.moveVertical(-16);
        roof.changeColor("orange");
        roof.makeVisible();

        roof2 = new Triangle();
        roof2.changeSize(25, 35);
        roof2.moveHorizontal(33);
        roof2.moveVertical(-16);
        roof2.changeColor("orange");
        roof2.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(-30);
        sun.moveVertical(-80);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
