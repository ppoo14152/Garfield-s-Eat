import greenfoot.*;

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor
{
    Vida v1;
    int speed;
    
    public Bomba(int s)
    {
      speed = s;
    }
    
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //private int vidas = 7;
    public void act() 
    {
       Juego w= (Juego)getWorld();
       setRotation(30);// Add your action code here.
       setLocation(getX(),getY()+speed);
       if(isTouching(Garfield.class))
       {
           w.quitaVida();
           Greenfoot.playSound("soundBomba.mp3");
           w.removeObject(this);
           //vidas --;
           
         //           w.remove(Vida.class);
       }
       else if(isAtEdge())
       {
           w.removeObject(this);
       } 
        //add your action code here.
    }    
    
}
