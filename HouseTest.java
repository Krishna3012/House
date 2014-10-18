import javax.swing.JFrame;

public class HouseTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(1000, 1000);
		frame.setTitle("House Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HouseComponent comp = new HouseComponent(200, 200, 200);
		frame.add(comp);
		
		frame.setVisible(true);
		
		HouseComponent compp = new HouseComponent( 100, 200, 100);
		frame.add(compp);
		
		frame.setVisible(true);
		
		HouseComponent compppp = new HouseComponent(400, 200, 300);
		frame.add(compppp);
		
		frame.setVisible(true);
		
		StreetComponent comppp = new StreetComponent(100, 600, 50, 20);
		frame.add(comppp);
		
		frame.setVisible(true);
		
		
	}	
}		
	
