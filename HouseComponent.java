import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 Represents a house, it's coordinates and size
 */
public class HouseComponent extends JComponent
{
	private House h;
	
	/**
	 * 
	 * @param xCoord The x coordinate of the house
	 * @param yCoord The y coordinate of the house
	 * @param baseSize The base size of the house
	 */
	public HouseComponent(int xCoord, int yCoord, int baseSize)
	
	 {
		 super();
		 h = new House(xCoord, yCoord, baseSize);
	 }
	
	 public void paintComponent(Graphics g)
	 {
	 	Graphics2D g2 = (Graphics2D)g;
		
		h.draw(g2);
	}
}	

