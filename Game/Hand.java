import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;
/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand extends Actor
{
    //private int x = 9;

    //public int getX() {
    // return x;
    //}

    // public void setLocation(int x, int y) {
    //this.x = x;
    //  this.y = y;
    //
    private int clicks = 0;
    Card[] deck = {new Card(7, 5, "Your ded Kid"), new Pikachu()};
    public Hand() {
        GreenfootImage blank = new GreenfootImage(5, 5);
        blank.setColor(new Color(255,255,255));
        blank.fillRect(0,0, 5, 5);
        setImage(blank);
        for(Card c: deck) {
            System.out.println("HP: " + c.hp + " Damage: " + c.dp + " Name: " + c.name);
        }
    }

    /**
     * Act - do whatever the Hand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.getMouseInfo() != null) {
            setLocation(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
            ArrayList<Object> objects = new ArrayList<Object>(getWorld().getObjects(Card.class));
            for(Object o : objects) {
                if(Greenfoot.mouseClicked(o)) ((Card) o).click += 1;
                if(((Card) o).click == 1) {
                    ((Actor) o).setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
                }
                if(((Card) o).click == 2) {
                    Actor b = getOneIntersectingObject(Box.class);
                    if(b != null) {
                        ((Actor) o).setLocation(b.getX(), b.getY());
                    }
                    ((Card) o).click = 0;
                }

            }  
        }
    }
}
