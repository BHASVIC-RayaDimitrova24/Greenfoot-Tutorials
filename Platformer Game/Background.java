import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2500, 400, 1); 
        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100)<=5){
            //addObject(new Coin(), getWidth()-1, Greenfoot.getRandomNumber(125)+250);
            addObject(new Coin(), getWidth()-Greenfoot.getRandomNumber(2500), Greenfoot.getRandomNumber(100)+150);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,38,291);
        Cloud cloud = new Cloud();
        addObject(cloud,141,215);
        cloud.setLocation(63,47);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,344,139);
        cloud2.setLocation(204,51);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,302,135);
        cloud3.setLocation(338,32);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,384,163);
        cloud4.setLocation(420,104);
        cloud4.setLocation(468,49);
        cloud4.setLocation(452,76);
        cloud2.setLocation(266,104);
        cloud2.setLocation(266,104);
        cloud2.setLocation(200,54);
        cloud2.setLocation(194,79);
        cloud2.setLocation(217,31);
        cloud2.setLocation(193,47);
        cloud2.setLocation(255,95);
        cloud2.setLocation(208,51);
        Tree tree = new Tree();
        addObject(tree,129,179);
        tree.setLocation(129,179);
        Tree tree2 = new Tree();
        addObject(tree2,46,175);
        Tree tree3 = new Tree();
        addObject(tree3,84,179);
        Tree tree4 = new Tree();
        addObject(tree4,126,258);
        Tree tree5 = new Tree();
        addObject(tree5,234,374);
        Tree tree6 = new Tree();
        addObject(tree6,296,324);
        Tree tree7 = new Tree();
        addObject(tree7,346,369);
        Tree tree8 = new Tree();
        addObject(tree8,442,307);
        Tree tree9 = new Tree();
        addObject(tree9,371,269);
        Tree tree10 = new Tree();
        addObject(tree10,248,139);
        Tree tree11 = new Tree();
        addObject(tree11,313,113);
        Tree tree12 = new Tree();
        addObject(tree12,287,177);
        cloud4.setLocation(488,90);
        cloud4.setLocation(452,170);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,2456,50);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,2299,52);
        Cloud cloud7 = new Cloud();
        addObject(cloud7,2186,35);
        Cloud cloud8 = new Cloud();
        addObject(cloud8,2068,55);
        Cloud cloud9 = new Cloud();
        addObject(cloud9,1950,41);
        Cloud cloud10 = new Cloud();
        addObject(cloud10,1835,25);
        Cloud cloud11 = new Cloud();
        addObject(cloud11,1757,42);
        Cloud cloud12 = new Cloud();
        addObject(cloud12,1636,45);
        Cloud cloud13 = new Cloud();
        addObject(cloud13,1516,24);
        Cloud cloud14 = new Cloud();
        addObject(cloud14,1387,57);
        Cloud cloud15 = new Cloud();
        addObject(cloud15,1293,35);
        Cloud cloud16 = new Cloud();
        addObject(cloud16,1216,51);
        Cloud cloud17 = new Cloud();
        addObject(cloud17,1097,27);
        Cloud cloud18 = new Cloud();
        addObject(cloud18,1000,18);
        Cloud cloud19 = new Cloud();
        addObject(cloud19,899,35);
        Cloud cloud20 = new Cloud();
        addObject(cloud20,726,30);
        Cloud cloud21 = new Cloud();
        addObject(cloud21,600,15);
        Cloud cloud22 = new Cloud();
        addObject(cloud22,452,62);
        Tree tree13 = new Tree();
        addObject(tree13,588,260);
        Tree tree14 = new Tree();
        addObject(tree14,557,326);
        Tree tree15 = new Tree();
        addObject(tree15,617,368);
        Tree tree16 = new Tree();
        addObject(tree16,656,136);
        Tree tree17 = new Tree();
        addObject(tree17,699,153);
        Tree tree18 = new Tree();
        addObject(tree18,744,290);
        Tree tree19 = new Tree();
        addObject(tree19,707,364);
        Tree tree20 = new Tree();
        addObject(tree20,838,353);
        Tree tree21 = new Tree();
        addObject(tree21,924,331);
        Tree tree22 = new Tree();
        addObject(tree22,905,217);
        Tree tree23 = new Tree();
        addObject(tree23,1008,121);
        tree23.setLocation(1008,121);
        Tree tree24 = new Tree();
        addObject(tree24,1008,121);
        Tree tree25 = new Tree();
        addObject(tree25,816,130);
        Tree tree26 = new Tree();
        addObject(tree26,1077,230);
        Tree tree27 = new Tree();
        addObject(tree27,1111,369);
        Tree tree28 = new Tree();
        addObject(tree28,1167,137);
        Tree tree29 = new Tree();
        addObject(tree29,1223,316);
        Tree tree30 = new Tree();
        addObject(tree30,1376,184);
        Tree tree31 = new Tree();
        addObject(tree31,1303,280);
        Tree tree32 = new Tree();
        addObject(tree32,1459,369);
        Tree tree33 = new Tree();
        addObject(tree33,1578,195);
        Tree tree34 = new Tree();
        addObject(tree34,1636,291);
        Tree tree35 = new Tree();
        addObject(tree35,1738,161);
        Tree tree36 = new Tree();
        addObject(tree36,1815,298);
        Tree tree37 = new Tree();
        addObject(tree37,1745,370);
        Tree tree38 = new Tree();
        addObject(tree38,1874,356);
        cloud9.setLocation(1911,111);
        Tree tree39 = new Tree();
        addObject(tree39,1911,111);
        Tree tree40 = new Tree();
        addObject(tree40,1989,265);
        Tree tree41 = new Tree();
        addObject(tree41,2080,172);
        Tree tree42 = new Tree();
        addObject(tree42,2053,360);
        Tree tree43 = new Tree();
        addObject(tree43,2152,257);
        Tree tree44 = new Tree();
        addObject(tree44,2285,135);
        Tree tree45 = new Tree();
        addObject(tree45,2344,268);
        Tree tree46 = new Tree();
        addObject(tree46,2244,345);
        Tree tree47 = new Tree();
        addObject(tree47,2468,201);
        Tree tree48 = new Tree();
        addObject(tree48,2393,367);
        Ground ground = new Ground();
        addObject(ground,44,321);
        Ground ground2 = new Ground();
        addObject(ground2,182,325);
        Ground ground3 = new Ground();
        addObject(ground3,356,325);
        Ground ground4 = new Ground();
        addObject(ground4,532,322);
        Ground ground5 = new Ground();
        addObject(ground5,705,327);
        Ground ground6 = new Ground();
        addObject(ground6,900,332);
        Ground ground7 = new Ground();
        addObject(ground7,1084,336);
        Ground ground8 = new Ground();
        addObject(ground8,1282,337);
        Ground ground9 = new Ground();
        addObject(ground9,1479,339);
        Ground ground10 = new Ground();
        addObject(ground10,1684,341);
        tree38.setLocation(1882,344);
        Ground ground11 = new Ground();
        addObject(ground11,1882,344);
        Ground ground12 = new Ground();
        addObject(ground12,2056,339);
        tree46.setLocation(2240,344);
        Ground ground13 = new Ground();
        addObject(ground13,2240,344);
        Ground ground14 = new Ground();
        addObject(ground14,2416,353);
        GroundMid groundMid = new GroundMid();
        addObject(groundMid,121,232);
        GroundMid groundMid2 = new GroundMid();
        addObject(groundMid2,293,232);
        cloud4.setLocation(476,234);
        GroundMid groundMid3 = new GroundMid();
        addObject(groundMid3,476,234);
        GroundMid groundMid4 = new GroundMid();
        addObject(groundMid4,651,240);
        tree22.setLocation(919,233);
        GroundMid groundMid5 = new GroundMid();
        addObject(groundMid5,919,233);
        tree26.setLocation(1078,236);
        GroundMid groundMid6 = new GroundMid();
        addObject(groundMid6,1078,236);
        GroundMid groundMid7 = new GroundMid();
        addObject(groundMid7,1280,234);
        GroundMid groundMid8 = new GroundMid();
        addObject(groundMid8,1527,235);
        GroundMid groundMid9 = new GroundMid();
        addObject(groundMid9,1719,228);
        GroundMid groundMid10 = new GroundMid();
        addObject(groundMid10,1986,233);
        GroundMid groundMid11 = new GroundMid();
        addObject(groundMid11,2199,243);
        GroundMid groundMid12 = new GroundMid();
        addObject(groundMid12,2429,240);
        GroundHigh groundHigh = new GroundHigh();
        addObject(groundHigh,204,146);
        cloud4.setLocation(381,144);
        GroundHigh groundHigh2 = new GroundHigh();
        addObject(groundHigh2,381,144);
        GroundHigh groundHigh3 = new GroundHigh();
        addObject(groundHigh3,564,136);
        GroundHigh groundHigh4 = new GroundHigh();
        addObject(groundHigh4,756,134);
        tree23.setLocation(1009,135);
        GroundHigh groundHigh5 = new GroundHigh();
        addObject(groundHigh5,1009,135);
        GroundHigh groundHigh6 = new GroundHigh();
        addObject(groundHigh6,1192,145);
        GroundHigh groundHigh7 = new GroundHigh();
        addObject(groundHigh7,1408,134);
        GroundHigh groundHigh8 = new GroundHigh();
        addObject(groundHigh8,1633,140);
        cloud9.setLocation(1896,136);
        GroundHigh groundHigh9 = new GroundHigh();
        addObject(groundHigh9,1896,136);
        GroundHigh groundHigh10 = new GroundHigh();
        addObject(groundHigh10,2105,140);
        GroundHigh groundHigh11 = new GroundHigh();
        addObject(groundHigh11,2344,136);
    }
}
