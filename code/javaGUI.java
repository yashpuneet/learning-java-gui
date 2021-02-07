import javax.swing.*;

public class javaGUI 
{
	public static void main(String[] args)
	{
		//Creates blank frame 
		JFrame frame = new JFrame();

		//Create a new Button
		JButton button = new JButton("Click");
		//Set the x axis, y axis, width and height
		button.setBounds(130, 100, 100, 40);
		//Add button to a frame
		frame.add(button);

		//Set frame parameters
		frame.setSize(400, 500); //Width and Height
		frame.setLayout(null); //Set Layout managers
		frame.setVisible(true); //Set frame visibility
	}
}
