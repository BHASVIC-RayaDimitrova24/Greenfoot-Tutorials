import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
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
    Button popButton = new Button("Population: ");
    public static int numInfected=0;
    Button infectedButton = new Button("Infected: ");
    public static int population =0;
    public static int numRecovered=0;
    Button recoveredButton = new Button("Recovered: ");
    public static int numVulnerable=0;
    Button vulnerableButton = new Button("Vulnerable: ");
    public static boolean socialDistance=false;
    Button socialButton = new Button("Social Distance: ");
    public static boolean maskOn=false;
    Button maskButton = new Button("Mask: ");
    String input;
    int time;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 500, 1); 
        addObject(popButton, 100, 50);
        showText(""+population, 200, 50);
        addObject(infectedButton, 100, 100);
        showText(""+numInfected, 200, 100);
        addObject(recoveredButton, 100, 150);
        showText(""+numRecovered, 200, 150);
        addObject(vulnerableButton, 100, 200);
        showText(""+(population-numInfected), 200, 200);
        addObject(socialButton, 100, 250);
        showText(""+socialDistance, 250, 250);
        addObject(maskButton, 100, 300);
        showText(""+maskOn, 250, 300);
        showText("Time: "+(time/60), 600, 50);
        setPaintOrder(Button.class, Person.class);
    }
    public void act(){
        time++;
        if(Greenfoot.mouseClicked(popButton)){
            input = JOptionPane.showInputDialog("How many people in the world?");
            population = Integer.parseInt(input);
            populate(population);
        }
        if(Greenfoot.mouseClicked(socialButton)){
            socialDistance =!socialDistance;
        }
        if(Greenfoot.mouseClicked(maskButton)){
            maskOn =!maskOn;
        }
        showText(""+population, 200, 50);
        showText(""+numInfected, 200, 100);
        showText(""+numRecovered, 200, 150);
        //int num = population-(numInfected+numRecovered);
        showText(""+(population-numInfected), 200, 200);
        showText(""+socialDistance, 250, 250);
        showText(""+maskOn, 250, 300);
        showText("Time: "+(time/60), 600, 50);
    }
    public void populate(int pop){
        this.population=pop;
        for(int i=0;i<population;i++){
            addObject(new Person(), Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight())); 
        }
    }
}
