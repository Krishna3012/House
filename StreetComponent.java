import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 Represents a street of houses
 */

public class StreetComponent extends JComponent
{
	private House[] house;
	
/**
 * 
 * @param xCoord The x coordinate of the house
 * @param yCoord The y coordinate of the house
 * @param baseSize The base size of the house
 * @param houseam The amount of houses on the street.
 */	
	
	
	public StreetComponent(int xCoord, int yCoord, int baseSize, int houseam)
	{
		super();
		
		house = new House[houseam];
		
		for(int i = 0 ; i<houseam; i++)
		{
		house[i] = new House(xCoord+(baseSize*i+(i*20)), yCoord, baseSize);
		} 
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		
		for(int i=0; i<house.length; i++)
		{
		house[i].draw(g2);
		
		}
		
	}
}			
	
