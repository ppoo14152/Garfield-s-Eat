import greenfoot.*;

/**
 * Write a description of class Veneno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Veneno extends Actor
{
    int speed;
    
    public Veneno(int s)
    {
      speed = s;
    }
    
    
    /**
     * Act - do whatever the Veneno wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
       setRotation(30);// Add your action code here.
       setLocation(getX(),getY()+speed);
       Juego w= (Juego)getWorld();
       if(isTouching(Garfield.class))
       {          
           w.disminuyeVelocidad();
            Greenfoot.playSound("soundFood.mp3");
           w.removeObject(this);           
       }
       else if(isAtEdge())
       {
           w.removeObject(this);
       }
    }    
    
        
}
