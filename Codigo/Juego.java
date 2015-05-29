import greenfoot.*;
/**
 * Write a description of class Escenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends World
{ 
    private Counter mensajePuntos;
    private Counter mensajeNivel;

    private GreenfootImage imgL1;  /**Imagen de fondo del nivel 1.*/
    private GreenfootImage imgL2;  /**Imagen de fondo del nivel 2.*/
    private GreenfootImage imgL3;  /**Imagen de fondo del nivel 3.*/

    private int score;
    private int vidas;
    private int puntos; //Contador de puntos
    private int level;
    private int bandNivel;
    private GreenfootSound soundFondo;
    private GreenfootImage fondo;
    int speedObjetos;
    public Garfield g;    
    Vida v1;
    Vida v2;
    Vida v3;
    Vida v4;
    Vida v5;
    Vida v6;
    Vida v7;

    public Juego()
    {     
        super(800, 600, 1, true);//Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.    
        level = 1;
        vidas = 7;
        puntos= 0;
        speedObjetos = 4;
        mensajePuntos = new Counter("Puntos: ");        
        addObject(mensajePuntos,60,20);
        mensajePuntos.setValue(puntos);

        mensajeNivel = new Counter("Nivel: ");
        addObject(mensajeNivel,160,20);
        mensajeNivel.setValue(level);
        this.setPaintOrder(Counter.class);        

        imgL1 = new GreenfootImage("primer nivel.jpg");/* agrega la primer imagen de fondo al escenario */
        imgL1.scale(800,600);/* escala la imagen a las medidas del escenario en caso de exceder las dimensiones */
        setBackground(imgL1);/* muestra la imagen en pantalla */
        imgL2 = new GreenfootImage("nivel2.jpg");
        imgL2.scale(800,600);/* escala la imagen a las medidas del escenario en caso de exceder las dimensiones */        
        imgL3 = new GreenfootImage("nivel3.jpg");
        imgL3.scale(800,600);/* escala la imagen a las medidas del escenario en caso de exceder las dimensiones */

        g = new Garfield();
        v1 = new Vida();
        v2 = new Vida();
        v3 = new Vida();
        v4 = new Vida();
        v5 = new Vida();
        v6 = new Vida();
        v7 = new Vida();

        int x=Greenfoot.getRandomNumber(100);
        int puntos = 0;

        RecuadroVida vid = new RecuadroVida();

        addObject(vid,500,30);

        addObject(g,330,545);
        addObject(v1,258,30);
        addObject(v2,320,30);
        addObject(v3,382,30);
        addObject(v4,444,30);
        addObject(v5,506,30);
        addObject(v6,568,30);
        addObject(v7,630,30);    
    }
    SimpleTimer tiempo = new SimpleTimer();
    public void act()
    {    
        int rand;
        int rango = 1000;       
        
        if(vidas!=0)
        {
            rand = Greenfoot.getRandomNumber(20000);      
            if(rand > rango){
              if(tiempo.millisElapsed() >= rand){
                 // system.out.println("cad");
                 addObject(new Hamburguesa(speedObjetos),Greenfoot.getRandomNumber(660),150);
                    tiempo.mark();
              }
            }
            
            rand = Greenfoot.getRandomNumber(20000);
            if(rand > rango){
                if(tiempo.millisElapsed()>= rand){
                    addObject(new Lasagna(speedObjetos),Greenfoot.getRandomNumber(660),150);
                    tiempo.mark();
                }
            }
            
            rand = Greenfoot.getRandomNumber(20000);
            if(rand > rango){
                if(tiempo.millisElapsed()>=rand){          
                   addObject(new Pizza(speedObjetos),Greenfoot.getRandomNumber(660),150);
                    tiempo.mark();
                }
            }
            
            rand = Greenfoot.getRandomNumber(20000);
            if(rand > rango){
                if(tiempo.millisElapsed()>=rand){
                    addObject(new Veneno(speedObjetos),Greenfoot.getRandomNumber(660),150);
                    tiempo.mark();
                }
            }
            
            rand = Greenfoot.getRandomNumber(20000);
            if(rand > rango){
                if(tiempo.millisElapsed()>=rand){
                    addObject(new Bomba(speedObjetos),Greenfoot.getRandomNumber(660),150);
                    tiempo.mark();
                }
            }
            
            rand = Greenfoot.getRandomNumber(20000);
            if(rand > rango){
                if(tiempo.millisElapsed()>=rand){
                    addObject(new medicina(speedObjetos),Greenfoot.getRandomNumber(660),150);
                    tiempo.mark();
                }
            }
            
            if(puntos >= 500 && level == 1)//nivel 2
            {
                rango -= 200;
                this.setBackground("nivel2.jpg");         
                speedObjetos += 3;
                addObject(mensajeNivel,160,20);
                level = 2;
                mensajeNivel.setValue(level);              
                imgL2 = new GreenfootImage("nivel2.jpg");              
                imgL2.scale(800,600);                  
                
            }
            
              if(puntos >= 1000 && level == 2)//nivel 3
              {
                 rango -= 600;
                 level = 3;
                 this.setBackground("nivel3.jpg");         
                 
                 speedObjetos += 4;
                 addObject(mensajeNivel,160,20);
                level = 3;
                mensajeNivel.setValue(level);              
                imgL2 = new GreenfootImage("nivel3.jpg");              
                imgL2.scale(800,600);
              }
              if(puntos >= 1200)
              {
                    Greenfoot.playSound("soundHappy.mp3");
                    Letrero gameOver;
                    gameOver = new Letrero("GANASTE :)");
                    addObject(gameOver,getWidth()/2,getHeight()/2); 
                    Greenfoot.stop();
               }
        }else
        {
            Greenfoot.playSound("gameOver.mp3");
            Letrero gameOver;
            gameOver = new Letrero("GAME OVER");
            addObject(gameOver,getWidth()/2,getHeight()/2); 
            Greenfoot.stop();
        }
        /* if(tiempo.millisElapsed()>=2500)
        tiempo.mark();
         */   
        //            addObject(h,Greenfoot.getRandomNumber(650),Greenfoot.getRandomNumber(400));
        //tiempo.mark();
        //          msjTiempo.add(1);
    }

    public void setPuntos(int unPunto)
    {
        puntos += unPunto;
        mensajePuntos.setValue(puntos);
    }

    public void quitaVida()
    {           
        switch(vidas)
        {
            case 0:                           
            break;
            case 1: 
            this.removeObject(v1);
            vidas--;
            break;  
            case 2: 
            this.removeObject(v2);
            vidas--;
            break;            
            case 3: 
            this.removeObject(v3);
            vidas--;
            break;
            case 4: 
            this.removeObject(v4);
            vidas--;
            break;
            case 5: 
            this.removeObject(v5);
            vidas--;
            break;
            case 6: 
            this.removeObject(v6);
            vidas--;
            break;
            case 7: 
            this.removeObject(v7);
            vidas--;
            break;

        }            
    }
    public void disminuyeVelocidad()
    {
        g.bandera = true;        
    }

    public void aumentaVelocidad()
    {
        g.bandera = false;
    }

    public void fin_game()
    {
        ScoreBoard scoreboard;
        scoreboard = new ScoreBoard(400,400);
        addObject(scoreboard, getWidth()/2,getHeight()/2);
    }

}
