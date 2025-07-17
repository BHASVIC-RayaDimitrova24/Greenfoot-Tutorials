import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    public boolean infected=false;
    public int recoveryTime =0;
    int infectRadius=20;
    MyWorld world;
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Person(){
        getImage().scale(40,40);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act()
    {
        movement();
        contractVirus();
        socialDistance(world.socialDistance);
        if(world.maskOn){
            infectRadius=1;
            getImage().setColor(Color.WHITE);
            getImage().fillOval(14,5, 10,4);
        }
        if(world.maskOn){
            getImage().setColor(Color.BLACK);
            getImage().fillOval(14,5, 10,4);
        }
    }
    public void contractVirus(){
        List<Person>people = getObjectsInRange(infectRadius, Person.class);
        for(Person persons: people){
            if(persons.infected && infected==false){
                infect();
                infected=true;
            }
            
        }
        
        if(infected){
            recoveryTime++;
        }
        if(recoveryTime >=200&& infected==true){
            healed();
            infected=false;
        }
    }
    public void socialDistance(boolean enabled){
        if(enabled){
            List<Person>people=getObjectsInRange(90,Person.class);
            for(Person persons :people){
                turn(5);
            }
        }
    }
    public void movement(){
        move(4);
        turn(Greenfoot.getRandomNumber(19)-9);
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    public void infect(){
        getImage().setColor(Color.RED);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        infected = true;
        world.numInfected++;
    }
    public void healed(){
        getImage().setColor(Color.GREEN);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        world.numRecovered++;
        world.numInfected--;
    }
}
