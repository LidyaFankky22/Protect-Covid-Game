import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nyawa extends setNyawa
{
    static int MyNyawa= 5;
 
    public void act() 
    {
       setImage(new GreenfootImage("Nyawa: " + MyNyawa, 30, Color.WHITE, null));
    }  
    
    public static void BerkurangNyawa() {
       MyNyawa--;
       if (MyNyawa == 0) {
           Greenfoot.setWorld(new Buyar());
        }
       
    }
    public static int kor(){
        return MyNyawa;
    }
}
