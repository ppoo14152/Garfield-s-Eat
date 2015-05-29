import greenfoot.*;

/**
 * Write a description of class Hamburguesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hamburguesa extends Comida
{
     int speed;
    
    public Hamburguesa(int s)
    {
      speed = s;
    }
    
    public void act() 
    {
       setLocation(getX(),getY()+speed);
       Juego w= (Juego)getWorld();
       if(isTouching(Garfield.class))
       {
           w.setPuntos(20);
           Greenfoot.playSound("soundFood.mp3");
           w.removeObject(this);
       }
       else if(isAtEdge())
       {
           w.removeObject(this);
           
       }                
       
        // Add your action code here.
    }      
}
