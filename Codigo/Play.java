import greenfoot.*;

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Botones
{
    /**
     * Act - hace lo que Play quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();        
        if(mouse!=null)
        {
            
            if(Greenfoot.mouseClicked(this)){
              Greenfoot.setWorld(new Juego());   
            
            }
        }
    }
}
