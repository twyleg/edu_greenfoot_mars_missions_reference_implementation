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
    }    
}
