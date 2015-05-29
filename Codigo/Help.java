import greenfoot.*;

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Botones
{
    private Ayuda help;
    /**
     * Constructor de la clase BotonHelp.
     */
    
    public Help()
    {
        help = new Ayuda();
        
    }
    
    /**
     * Act - hace lo que Help quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        super.act();
    }   
    
    /**
     * Al dar clic en el boton aparece la ayuda.
     */
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(help, 
                                getWorld().getWidth()/2,
                                getWorld().getHeight()/2);
            getWorld().addObject(new Back(help), 
                                help.getX() - help.getImage().getWidth()/2,
                                help.getY() - help.getImage().getHeight()/2);
        }
    }       
}
