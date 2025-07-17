import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends SpaceActors
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int horizontalSpeed =0;
    int verticalSpeed =0;
    boolean fired = false;
    boolean hitRock=false;
    public Ship(){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        // Add your action code here.
        turnCommand();
        accelerateOnCommand();
        setLocation(getX() + horizontalSpeed/3, getY()+verticalSpeed/3);
        //wrapAtEdge();
        //fireOnCommand();
        bounceAtEdge();
        fireOnCommand();
        hitRocks();
    }
    public void turnCommand(){
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
        }
    }
    public void accelerateOnCommand(){
        if(Greenfoot.isKeyDown("space")){
            if(getRotation()==0){
                horizontalSpeed++;
            }
            if(getRotation()==180){
                horizontalSpeed--;
            }
            if(getRotation()==90){
                verticalSpeed++;
            }
            if(getRotation()==270){
                verticalSpeed++;
            }
        }
    }
    public void wrapAtEdge(){
        if(getX() ==0){
            setLocation(899, getY());
        }
        if(getY() ==0){
            setLocation(getX(), 649);
        }
        if(getX() ==899){
            setLocation(1, getY());
        }
        if(getX() ==649){
            setLocation(getX(), 649);
        }
    }
    public void bounceAtEdge(){
        if(getX() ==0){
            horizontalSpeed =-horizontalSpeed;
        }
        if(getY() ==0){
            verticalSpeed =-verticalSpeed;
        }
        if(getX() ==899){
            horizontalSpeed = -horizontalSpeed;
        }
        if(getX() ==649){
            verticalSpeed =-verticalSpeed;
        }
    }
    public void fireOnCommand(){
        Projectile projectile = new Projectile();
        if(Greenfoot.isKeyDown("f") && fired ==false){
            getWorld().addObject(projectile, getX(), getY());
            projectile.setRotation(getRotation());
            fired = true;
        }
        if(Greenfoot.isKeyDown("f")){
            fired = false;
        }
    }
    public void hitRocks(){
        if(isTouching(AllRocks.class)&& hitRock==false){
            MyWorld myWorld = (MyWorld)getWorld();
            HealthBar healthBar = myWorld.getHealthBar();
            healthBar.health--;
            hitRock = true;
        }
        else if(!isTouching(AllRocks.class)){
            hitRock =false;
        }
    }
}
