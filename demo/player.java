import greenfoot.*;

public class player extends Actor
{
    animation run = new animation("C:/Users/Oguz/Documents/School/Greenfoot-windows-370/Projects/demo/images/player/run/");
    
    public void act()
    {
        setImage(run.draw(500, 250, 8, 1));
    }
}
