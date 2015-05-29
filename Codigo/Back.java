import greenfoot.*;

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Botones
{
    private Actor actor;
    public Back(Actor a)
    {
        actor = a;
    }
    
    /**
     * Act - hace lo que Back quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        this.click();
    }    
    
    /**
     * Cierra la ventana para ver nuevamente el menu.
     */
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            getWorld().removeObject(actor);
            getWorld().removeObject(this);
        }
    }  
}
