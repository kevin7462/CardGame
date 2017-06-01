import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    int hp;
    int dp;
    String name;
    
    public int click = 0;
    
    /**
     * Constructor for objects of class Card
     */
    public Card(int hp, int dp, String name) {
     this.hp = hp;
     this.dp = dp;
     this.name = name;
    }
    }

