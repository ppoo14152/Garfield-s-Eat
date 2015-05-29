import greenfoot.*;

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Comida
{
    int speed;
    
    public Pizza(int s)
    {
      speed = s;
    }
    
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+speed);
        Juego w= (Juego)getWorld();
       if(isTouching(Garfield.class))
       {
           w.setPuntos(70);
           Greenfoot.playSound("soundFood.mp3");
           w.removeObject(this);
            //           setLocation(getX()+1,getY());
          //           puntos = puntos + 20;
       }
       else if(isAtEdge())
       {     
           w.removeObject(this);
       }                
        // Add your action code here.
    }    
}
