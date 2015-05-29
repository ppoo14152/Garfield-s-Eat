import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private GreenfootImage fondo;  /*Imagen de fondo del menu.*/
    private GreenfootSound soundFondo; /*musica de fondo para el menu*/
    private Play botonplay;

    /**
     * El constructor coloca la imagen del menu del juego
     * y reproduce un fondo musical.
     */
    public Menu()
    {    
        super(800, 600, 1, false); 
        fondo = new GreenfootImage("Portada.jpg");
        fondo.scale(800,600);/* escala la imagen a las medidas del escenario en caso de exceder las dimensiones */
        setBackground(fondo);/* muestra la imagen en pantalla */
        //       soundFondo=new GreenfootSound("Garfield y sus Amigos.mp3");//cancion de fondo del menu
        botonplay = new Play();
        prepare();
    }

    /**
     * El actua del menu se ecarga de reproducir la cancion
     * en un ciclo,solo se detiene hasta que se le de un click
     * al boton Play del juego.
     */public void act()
    {
        //        soundFondo.playLoop();
        /**        if(Greenfoot.mouseClicked(botonplay) )
        soundFondo.stop();
        }

        /**
         * 
         * El metodo prepare coloca los botones en el menu
         * del juego.
         */
    }

    public void prepare()
    {
        addObject(botonplay, 150, 350);
    }

    /**     public void stopped()
    {
    soundFondo.pause();
    }    

    /**    public void started()
    {
    soundFondo.play();
    }**/
}
