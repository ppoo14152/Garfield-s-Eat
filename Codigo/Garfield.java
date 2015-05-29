import greenfoot.*;

/**
 * Write a description of class Garfield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garfield extends Actor
{
    Vida v1;
    private Juego miMundo;
    /**
     * Act - do whatever the Garfield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean bandera = false; //bandera que me va a ayudar para lo de si toca el objeto
    SimpleTimer tiempo = new SimpleTimer();
    //public iVelocidad = 7;
    public void act()
    {
        mover(); 
    }   
    
    public void mover()
    {
        //      String tecla = Greenfoot.isKeyDown(); 
        
      if(Greenfoot.isKeyDown("left"))
      {
        if((tiempo.millisElapsed()>=250))
        {
            if(bandera == false)
             move(-7);
             else
             {
                 move(-3);
             }
        }
      }
        
      if(Greenfoot.isKeyDown("right"))
      {
         if((tiempo.millisElapsed()>=250))
         {
            if(bandera == false)
             move(7);
             else
             {
                 move(3);
             }
         }
         }
      
    }  // Add your action code here.
                
}
