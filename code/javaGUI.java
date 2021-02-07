import java.awt.event.*;
import javax.swing.*;

public class javaGUI 
{
	public static void main(String[] args)
	{
		//Creates blank frame 
		JFrame frame = new JFrame();
		
		//Create new text field
		final JTextField text = new JTextField();
		//Set the x axis, y axis, width and height
		text.setBounds(50, 50, 150, 20);

		//Create a new Button
		JButton button = new JButton("Click");
		//Set the x axis, y axis, width and height
		button.setBounds(130, 100, 100, 40);
	
		//Create and initialize action listener
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				text.setText("First Java Swing App");
			}
		});

		//Add components to frame
		frame.add(button);
		frame.add(text);

		//Set frame parameters
		frame.setSize(400, 500); //Width and Height
		frame.setLayout(null); //Set Layout managers
		frame.setVisible(true); //Set frame visibility
	}
}
