import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time =0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        prepare();
    }
    public void act(){
        time++;
        if(time % 360 ==0){
            addObject( new Enemy(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(550));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mouse mouse = new Mouse();
        addObject(mouse,91,609);
        mouse.setLocation(72,613);
        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,114,253);
        wallWidthLong.setLocation(260,639);
        wallWidthLong.setLocation(244,646);
        wallWidthLong.setLocation(227,645);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,439,577);
        wallWidthMedium.setLocation(488,640);
        removeObject(wallWidthMedium);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,485,632);
        wallWidthLong2.setLocation(468,639);
        wallWidthLong2.setLocation(464,646);
        wallWidthLong2.setLocation(465,645);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,628,474);
        removeObject(wallHeightMedium);
        WallHeightTall wallHeightTall = new WallHeightTall();
        addObject(wallHeightTall,652,514);
        wallHeightTall.setLocation(644,232);
        //WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,652,592);
        wallHeightMedium.setLocation(642,577);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,416,592);
        wallHeightMedium2.setLocation(411,572);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,278,616);
        wallHeightSmall.setLocation(290,601);
        wallHeightSmall.setLocation(102,495);
        removeObject(wallHeightSmall);
        WallHeightTall wallHeightTall2 = new WallHeightTall();
        addObject(wallHeightTall2,76,366);
        wallHeightTall2.setLocation(75,366);
        wallHeightTall2.setLocation(60,418);
        wallHeightTall2.setLocation(61,503);
        wallHeightTall2.setLocation(56,458);
        wallHeightTall2.setLocation(53,330);
        wallHeightTall2.setLocation(59,434);
        wallHeightTall2.setLocation(53,417);
        WallHeightTall wallHeightTall3 = new WallHeightTall();
        addObject(wallHeightTall3,147,216);
        wallHeightTall3.setLocation(52,251);
        wallHeightTall3.setLocation(55,207);
        wallHeightTall2.setLocation(50,259);
        wallHeightTall2.setLocation(52,242);
        WallWidthLong wallWidthLong3 = new WallWidthLong();
        addObject(wallWidthLong3,293,251);
        wallWidthLong3.setLocation(226,62);
        WallWidthLong wallWidthLong4 = new WallWidthLong();
        addObject(wallWidthLong4,438,271);
        wallWidthLong4.setLocation(469,60);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,140,514);
        wallWidthSmall.setLocation(95,585);
        //WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,156,520);
        wallHeightSmall.setLocation(156,518);
        wallHeightSmall.setLocation(135,548);
        //WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,220,503);
        wallWidthMedium.setLocation(204,508);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,294,444);
        wallWidthMedium2.setLocation(266,511);
        removeObject(wallWidthMedium2);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,347,483);
        wallWidthSmall2.setLocation(280,508);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,400,448);
        wallHeightMedium3.setLocation(319,438);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,238,382);
        wallWidthSmall3.setLocation(292,367);
        wallWidthSmall3.setLocation(280,370);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,240,438);
        wallHeightSmall2.setLocation(193,465);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,218,283);
        wallWidthSmall4.setLocation(88,463);
        //WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,546,573);
        wallWidthMedium2.setLocation(566,587);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,412,361);
        wallHeightMedium4.setLocation(413,426);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,252,626);
        wallHeightSmall3.setLocation(126,421);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,465,395);
        wallWidthMedium3.setLocation(487,355);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,519,435);
        wallHeightMedium5.setLocation(523,433);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,233,353);
        wallHeightSmall4.setLocation(236,318);
        wallHeightSmall4.setLocation(233,344);
        wallHeightSmall4.setLocation(233,332);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,301,590);
        wallWidthMedium4.setLocation(330,585);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,235,286);
        wallWidthMedium5.setLocation(173,291);
        removeObject(wallWidthMedium5);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,204,248);
        wallWidthSmall5.setLocation(192,293);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,232,192);
        wallHeightMedium6.setLocation(154,141);
        WallWidthLong wallWidthLong5 = new WallWidthLong();
        addObject(wallWidthLong5,376,192);
        wallWidthLong5.setLocation(404,151);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,286,239);
        wallHeightSmall5.setLocation(294,260);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,380,313);
        wallWidthSmall6.setLocation(333,301);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,446,317);
        wallWidthSmall7.setLocation(373,299);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,413,321);
        wallHeightSmall6.setLocation(412,339);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,352,212);
        wallHeightSmall7.setLocation(297,212);
        wallHeightSmall7.setLocation(297,180);
        wallHeightSmall7.setLocation(292,188);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,503,220);
        wallHeightSmall8.setLocation(523,200);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,475,240);
        wallHeightSmall9.setLocation(412,259);
        Cheese cheese = new Cheese();
        addObject(cheese,86,425);
        Cheese cheese2 = new Cheese();
        addObject(cheese2,365,613);
        Cheese cheese3 = new Cheese();
        addObject(cheese3,339,258);
        Cheese cheese4 = new Cheese();
        addObject(cheese4,594,97);
        Cheese cheese5 = new Cheese();
        addObject(cheese5,465,544);
        Cheese cheese6 = new Cheese();
        addObject(cheese6,260,437);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,100,107);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,484,194);
        Teleporter teleporter3 = new Teleporter();
        addObject(teleporter3,598,554);

        Enemy enemy = new Enemy();
        addObject(enemy,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        Enemy enemy2 = new Enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        Enemy enemy3 = new Enemy();
        addObject(enemy3,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        cheese3.setLocation(338,258);
        Enemy2 enemy22 = new Enemy2();
        addObject(enemy22,338,258);
        Enemy2 enemy23 = new Enemy2();
        addObject(enemy23,86,531);
        Enemy2 enemy24 = new Enemy2();
        addObject(enemy24,184,350);
        Enemy2 enemy25 = new Enemy2();
        addObject(enemy25,465,304);
        WinningPlatform winningPlatform = new WinningPlatform();
        addObject(winningPlatform,645,451);
        winningPlatform.setLocation(644,459);
    }
}
