import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Erweiterung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Erweiterung extends Rover
{
    
    /**
     * mission01 - move around a stone formation at the center of the map.
     */
    public void mission01()
    {
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
    }
    
    /**
     * mission02 -  move around a stone formation at the center of the map
     *              three times.
     */
    public void mission02()
    {
        // First round
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        // Second round
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        // Third round
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
    }
    
    /**
     * mission03 -  move around a stone formation at the center of the map.
     *              Minimize code duplication by using methods.
     */
    public void moveAlongBorder()
    {
        fahre();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
    }
        
    public void mission03()
    {
        moveAlongBorder();
        moveAlongBorder();
        moveAlongBorder();
        moveAlongBorder();
    }
    
    /**
     * mission04 -  move around a stone formation at the center of the map
     *              three times.
     *              Minimize code duplication by using methods.
     */
    
    public void performRoundTrip()
    {
        moveAlongBorder();
        moveAlongBorder();
        moveAlongBorder();
        moveAlongBorder();
    }
    
    public void mission04()
    {
        performRoundTrip();
        performRoundTrip();
        performRoundTrip();
    }
    
    
    /**
     * mission05 -  move around a stone formation at the center of the map
     *              three times.
     *              Minimize code duplication by using methods and for-loops.
     */
    public void moveAlongBorderWithForLoop()
    {
        for(int i=0; i<5; i++)
        {
            fahre();
        }
        drehe("links");
    }
    
    public void performRoundTripWithForLoop()
    {
        for(int i=0; i<4; i++)
        {
            moveAlongBorder();
        }
    }
    
    public void mission05()
    {
        for(int i=0; i<3; i++)
        {
            performRoundTripWithForLoop();
        }
    }
    
    
    /**
     * mission06 - Pick up a fixed number of markers right in front of the rover.
     * 
     */  
    public void mission06()
    {
        for(int i=0; i<4; i++)
        {
            fahre();
            entferneMarke();
        }
    }
    
    /**
     * mission07 -  Approach a line of markers in an unknown distance and remove
     *              all markers in that line.
     *              
     */  
    public void mission07()
    {
        while(markeVorhanden() == false)
        {
            fahre();
        }
        
        while(markeVorhanden())
        {
            entferneMarke();
            fahre();
        }
    }
    
    /**
     * mission08 -  Approach a line of markers in an unknown distance and remove
     *              all markers in that line. Use a do-while-loop instead of a while-loop.
     *              
     */  
    public void mission08()
    {
        do
        {
            fahre();
        }
        while(markeVorhanden() == false);
        
        do
        {
            entferneMarke();
            fahre();
        }
        while(markeVorhanden());
    }
    
    /**
     * mission09 -  Approach a line of markers in an unknown distance and remove
     *              all markers in that line. Use the not-operator in your while-loop.
     *              
     */  
    public void mission09()
    {
        while(markeVorhanden() != true)
        {
            fahre();
        }
        
        while(!(markeVorhanden() == false))
        {
            entferneMarke();
            fahre();
        }
    }
    
    /**
     * mission10 -  Rotate the rover back and forth by 180 deg through the drehe()-methode
     *              and two while loops.
     *              
     */  
    public void mission10()
    {
        while(getRotation() < 180)
        {
            drehe("rechts");
            Greenfoot.delay(1);
        }
        
        while(getRotation() > 0)
        {
            drehe("links");
            Greenfoot.delay(1);
        }
    }
    
    /**
     * mission11 -  Rotate the rover back and forth by 180 deg through the drehe()-methode
     *              and two while loops. Use the less-equal and greater-equal operators.
     *              
     */  
    public void mission11()
    {
        while(getRotation() <= 90)
        {
            drehe("rechts");
            Greenfoot.delay(1);
        }
        
        while(getRotation() >= 90)
        {
            drehe("links");
            Greenfoot.delay(1);
        }
    }

    /**
     * mission12 -  Pick up all markers on the left half of the map by using
     *              the AND operator.
     *              
     */  
    public void mission12()
    {
        while(markeVorhanden() == false && getX() < 8)
        {
            fahre();
        }
        
        while(markeVorhanden() == true && getX() < 8)
        {
            entferneMarke();
            fahre();
        }
        
        drehe("links");
        drehe("links");
        
        while(!isAtEdge())
        {
            fahre();
        }
        
        drehe("links");
        drehe("links");
    }
    
    
    /**
     * mission13 -  Find an alterantive way around a steep hill and collect some markers.
     *              
     */    
    public void moveAroundHill()
    {
        drehe("links");
        fahre();
        
        drehe("rechts");
        fahre();
        fahre();
        drehe("rechts");
        
        fahre();
        drehe("links");
    }
    
    public void approachMarkers()
    {
        while(markeVorhanden() == false)
        {
            if(huegelVorhanden("vorne") == false)
            {
                moveAroundHill();
            }
            fahre();
        }
    }
    
    public void removeMarkers()
    {
        while(markeVorhanden())
        {
            entferneMarke();
            fahre();
        }
    }
    
    public void mission13()
    {
        approachMarkers();
        removeMarkers();
    }
    
    /**
     * mission14 -  Find an alterantive way around a steep hill and collect some markers by using if-else.
     *              
     */
    public void approachMarkersWithIfElse()
    {
        while(markeVorhanden() == false)
        {
            if(huegelVorhanden("vorne") == false)
            {
                moveAroundHill();
            }
            else
            {
                fahre();   
            }
        }
    }
    
    public void mission14()
    {
        approachMarkersWithIfElse();
        removeMarkers();
    }
    
    
    /**
     * mission15 - Collect all markers and avoid steep hills by bypassing them.
     *              
     */
    public void moveUp()
    {
        if(getRotation() == 0)
        {
            drehe("links");
            fahre();
            drehe("links");
        }
        else
        {
            drehe("rechts");
            fahre();
            drehe("rechts");
        }
    }
    
    public void moveAlongRow()
    {
        if(markeVorhanden())
        {
            entferneMarke();
        }
        
        if(huegelVorhanden("vorne"))
        {
            moveAroundHill();
        }
        else
        {
            fahre();
        }
    }
    
    public void moveAlongFinalRow()
    {
        while(getX() < 15)
        {
            moveAlongRow();
        }
    }
    
    public void mission15()
    {   
        while(getY() > 1)
        {
            while(getX() < 15)
            {
                moveAlongRow();
            }
            
            moveUp();
            
            while(getX() > 0)
            {
                moveAlongRow();
            }
            
            moveUp();
        }     
        
        /*
         * Quick and Dirty hack:
         * Die oberste Zeile ist wegen eines Bugs in Greenfoot nicht
         * befahrbar. Daher muss die vorletzte Zeile als letzte Zeile
         * angesehen werden. Diese muss nochmal explizit abgefahren 
         * werden.
         */
        moveAlongFinalRow();
    }
    
        /**
     * Mission 16 - Collect all markers and avoid steep hill formations
     * with complex shapes by bypassing them.
     */
    public void moveAroundHillExtended()
    {
        drehe("links");
     
        int startY = getY();
        
        do{
            
            if(huegelVorhanden("vorne"))
            {
                drehe("links");
            }
            else if(huegelVorhanden("rechts"))
            {
                fahre();
            } 
            else
            {
                drehe("rechts");
                fahre();
            }
            
        }while(startY != getY());
        
        drehe("links");
    }
    
    public void moveAlongRowExtended()
    {
        if(markeVorhanden())
        {
            entferneMarke();
        }
        
        if(huegelVorhanden("vorne"))
        {
            moveAroundHillExtended();
        }
        else
        {
            fahre();
        }
    }
    
    public void moveAlongFinalRowExtended()
    {
        while(getX() < 15)
        {
            moveAlongRowExtended();
        }
    }
    
    public void mission16()
    {
        while(getY() > 1)
        {
            while(getX() < 15)
            {
                moveAlongRowExtended();
            }
            
            moveUp();
            
            while(getX() > 0)
            {
                moveAlongRowExtended();
            }
            
            moveUp();
        } 
        
        /*
         * Quick and Dirty hack:
         * Die oberste Zeile ist wegen eines Bugs in Greenfoot nicht
         * befahrbar. Daher muss die vorletzte Zeile als letzte Zeile
         * angesehen werden. Diese muss nochmal explizit abgefahren 
         * werden.
         */
        moveAlongFinalRowExtended();
    }
    
    /**
     * Mission 17 - Collect all markers and avoid steep hill formations
     * with complex shapes by bypassing them.
     */
    public void mission17()
    {
        // Variable 'targetRotation' definieren und initilisieren
        int targetRotation = 0;
        
        // Der Variable 'targetRotation' einen neuen Wert zuweisen
        targetRotation = 180;
        
        // Die Variable 'targetRotation' auslesen und verwenden
        setRotation(targetRotation);
        System.out.println(targetRotation);
        
        // Der Variable 'targetRotation' einen neuen Wert zuweisen und verwenden
        targetRotation = 270;
        setRotation(targetRotation);
        System.out.println(targetRotation);
    }
    
    /**
     * Act - do whatever the Erweiterung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //mission01();
        //mission02();
        //mission03();
        //mission04();
        //mission05();
        //mission06();
        //mission07();
        //mission08();
        //mission09();
        //mission10();
        //mission11();
        //mission12();
        //mission13();
        //mission14();
        //mission15();
        //mission16();
        mission17();
    }    
}
