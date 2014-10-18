import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 Represents a set of shapes that create a house
 */

public class House
{
	private Rectangle.Double base;
	private Rectangle.Double door;
	private Line2D.Double roof1;
	private Line2D.Double roof2;
	private Ellipse2D.Double knob;
	private Rectangle.Double window1;
	private Rectangle.Double window2;
	private Rectangle.Double window3;
	private Rectangle.Double doormat;
	private Rectangle.Double chimney;

	
	/**
	 * 
	 * @param xCoord The x coordinate of the shape
	 * @param yCoord The y coordinate of the shape
	 * @param baseSize The size of the shape
	 */
	
	public House (int xCoord, int yCoord, int baseSize)
	{
		base = new Rectangle.Double(xCoord, yCoord, baseSize,
		baseSize);
		door = new Rectangle.Double(xCoord + (baseSize* 0.5), yCoord + (baseSize * 0.5) , 0.25 *
		baseSize, 0.5 * baseSize);
		doormat = new Rectangle.Double(xCoord +(baseSize * 0.5), yCoord + (baseSize*1), baseSize / 4 , baseSize / 8);
		roof1 = new Line2D.Double(xCoord, yCoord, xCoord+ (baseSize * .5), yCoord - (baseSize * .5));
		roof2 = new Line2D.Double(xCoord + baseSize, yCoord , xCoord + (baseSize * .5), yCoord - (baseSize * .5));
		knob = new Ellipse2D.Double(xCoord + (baseSize * 0.666) , yCoord + (baseSize* 0.7), baseSize / 12, baseSize
		/ 12);
		window1 = new Rectangle.Double (xCoord + (baseSize * 0.115),(yCoord + (baseSize * 0.555)), baseSize / 4, baseSize / 4);
		window2 = new Rectangle.Double (xCoord + (baseSize * 0.115),(yCoord + (baseSize * 0.111)), baseSize / 4, baseSize / 4);
		window3 = new Rectangle.Double (xCoord + (baseSize* 0.5), (yCoord + (baseSize * 0.111)), baseSize / 4, baseSize / 4);
		chimney = new Rectangle.Double (xCoord + (baseSize * 0.63), yCoord - (baseSize * 0.5), baseSize / 8, baseSize / 3);
		
	}
	
	public void draw(Graphics2D g)
	{
		g.setColor(Color.RED);
		g.fill(base);
		
		g.setColor(Color.GREEN);
		g.fill(door);
		
		g.setColor(Color.BLUE);
		g.fill(window1);
		g.fill(window2);
		g.fill(window3);
		
		g.setColor(Color.YELLOW);
		g.fill(knob);
		
		g.setColor( new Color(153, 102, 000));
		g.fill(doormat);
		g.fill(chimney);
		
		g.setColor(Color.BLACK);
		g.draw(base);
		g.draw(door);
		g.draw(roof1);
		g.draw(roof2);
		g.draw(knob);
		g.draw(window1);
		g.draw(window2);
		g.draw(window3);
		g.draw(doormat);
		
	}	
}			
	
