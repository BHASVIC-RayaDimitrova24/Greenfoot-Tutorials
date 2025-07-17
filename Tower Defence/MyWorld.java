
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

    public static int money = 100;
    int basicTowerPrice =50;
    int worldTime;
    int waveNumber =1;
    int map[][] = {{0,0,0,0,0,0,0,0,0,0},
            {1,1,2,0,3,1,1,1,1,2},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,4,1,1,5,0,1},
            {0,0,1,0,0,0,0,1,0,1},
            {0,0,1,0,0,0,0,1,0,1},
            {0,0,1,0,0,0,0,1,0,1},
            {0,0,3,1,1,2,0,1,0,1},
            {0,0,0,0,0,1,0,1,0,1},
            {0,0,0,0,0,3,1,4,0,2}};
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1); 
        Menu menu = new Menu();
        addObject(menu,656,285);
        addObject(new MoneyDisplay(), 720, 30);
        menu.setLocation(726,300);
        Level1();

        prepare();
    }

    public void act(){
        addInTowers();
        spawnWave();
        worldTime++;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void Level1()
    {
        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++){
                if(map[j][i] == 1){
                    addObject(new Road(true),30+i*60,30 + j* 60); 
                }
                if(map[j][i] == 2){
                    addObject(new Road(90),30+i*60,30 + j* 60); 
                }
                if(map[j][i] == 3){
                    addObject(new Road(0),30+i*60,30 + j* 60); 
                }
                if(map[j][i] == 4){
                    addObject(new Road(270),30+i*60,30 + j* 60); 
                }
                if(map[j][i] == 5){
                    addObject(new Road(180),30+i*60,30 + j* 60); 
                }
            }
        }
    }

    public void addInTowers(){
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && money>=basicTowerPrice){ //if click on empty space
            addObject(new Tower(), (Greenfoot.getMouseInfo().getX()/60)*60+30, (Greenfoot.getMouseInfo().getY()/60)*60+30);
            money -=basicTowerPrice;
        }
    }
    
    public void spawnWave(){
        if(worldTime %20 ==0){
            addObject(new Enemy(waveNumber), 1, 90);
        }
        
        if(worldTime%400==399){
            waveNumber++;
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
