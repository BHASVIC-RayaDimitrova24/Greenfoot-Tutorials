import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    int timesHit =2;
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        removeEnemy();
        hitByProjectile();
    }
    public void hitByProjectile(){
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
            getWorld().removeObject(this);
        }
    }
}
