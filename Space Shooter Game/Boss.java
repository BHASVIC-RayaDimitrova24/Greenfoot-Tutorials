import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    int timesHit =10;
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boss(){
        setRotation(90);
    }
    public void act()
    {
        moveEnemy();
        hitProjectile();
    }
    public void hitProjectile(){
        Actor projectile = (Projectile)getOneIntersectingObject(Projectile.class);
        if(projectile != null){
            getWorld().removeObject(projectile);
            World world = getWorld();
            MyWorld myWorld = (MyWorld) world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            timesHit--;
        }
        if(timesHit ==0){
            getWorld().removeObject(this);
        }
        else if (getY() == 599){
            World world = getWorld();
            MyWorld myWorld = (MyWorld) world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }    
}
