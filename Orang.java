import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orang extends Actor
{
    public Orang()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/10, image.getHeight()/10);
        setImage(image);
        
}
    public void act(){
        getWorld().showText("Score : "+Score.score,85,30);
        getWorld().showText("Nyawa : "+Nyawaa.nyawa,500,30);
        checkKeys();
        Level();
}
     public void Level(){
         if(Score.score==50||Score.score==55){
            Greenfoot.setWorld(new Level2());
            Score.score++;
        }else if(Score.score==101||Score.score==106){
            Greenfoot.setWorld(new Level3());
            Score.score++;
        }else if(Score.score==202||Score.score==207){
            Greenfoot.setWorld(new Level4());
            Score.score++;
        }else if(Score.score==303||Score.score==308){
            Greenfoot.setWorld(new Level5());
            Score.score++;
        }else if(Score.score==404||Score.score==409){
            Greenfoot.setWorld(new Level6());
            Score.score++;
        }else if(Score.score==455||Score.score==460){
            Greenfoot.setWorld(new Menang());
            Score.score++;
        }
    }
    public void checkKeys(){
        if(Greenfoot.isKeyDown("left"))
        {
            this.setLocation(this.getX()-5, this.getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            this.setLocation(this.getX()+5, this.getY());
        }
    }
}