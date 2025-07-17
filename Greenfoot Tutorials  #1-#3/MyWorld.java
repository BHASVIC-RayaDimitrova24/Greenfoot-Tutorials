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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,340,255);
        Enemy enemy3 = new Enemy();
        addObject(enemy3, 50, 60);
        Enemy enemy1 = new Enemy();
        addObject(enemy1, 100, 600);
        Enemy enemy2 = new Enemy();
        addObject(enemy2, 200, 620);
        player.setLocation(29,43);

        enemy2.setLocation(153,242);
        enemy1.setLocation(57,449);
        enemy2.setLocation(66,489);
        enemy3.setLocation(76,369);
        enemy3.setLocation(46,251);
        enemy3.setLocation(120,377);
        player.setLocation(29,43);
        enemy3.setLocation(48,224);
        enemy2.setLocation(72,350);
        enemy3.setLocation(58,502);

        enemy3.setLocation(68,214);
        enemy1.setLocation(88,330);
        enemy2.setLocation(58,446);
        enemy1.setLocation(88,351);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,207,243);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,196,402);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,200,533);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,364,498);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,359,302);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,359,169);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,540,277);
        Enemy enemy11 = new Enemy();
        addObject(enemy11,513,431);
        Enemy enemy12 = new Enemy();
        addObject(enemy12,588,569);
        Enemy enemy13 = new Enemy();
        addObject(enemy13,582,144);
        enemy8.setLocation(366,374);
        enemy9.setLocation(383,196);
    }
}
