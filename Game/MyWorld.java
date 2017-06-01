import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);

        prepare();
        setPaintOrder(Card.class, Hand.class, Box.class);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Box(), 200, 200);
        Hand hand = new Hand();
        addObject(hand,321,200);
        Pikachu pikachu = new Pikachu();
        addObject(pikachu,163,298);
        card2 card2 = new card2();
        addObject(card2,486,323);
    }
}
