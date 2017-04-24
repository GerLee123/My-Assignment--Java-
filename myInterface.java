//Name : Ger Lee
//Student Number: C15588357
//Class : DT211C/2
//Group : B

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class myInterface extends JFrame{
	
	MyMain MyProject = new MyMain();
	
	//Buttons and Textboxes which create functionality
	private JButton button1;
	private JButton button2;
	private JTextField tf1;
	private JTextField tf2;
	
	
	public myInterface(){
	
		setLayout(new FlowLayout());
		
		
		//Displays a button and a text box where the user can enter a text file to open
		tf1 = new JTextField("Enter filename",20);
		add(tf1);
		button1 = new JButton("Choose File");
		
		//On click the button opens the file using Action Listener
		button1.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						String filename = tf1.getText();
						go.openingFiles(filename);

}
				}
		);
		add(button1);
		
		
		
		//Displays a button and a text box where the user can enter a word to add it to the bad word list
		JTextField tf2 = new JTextField("Enter Word", 20);
		add(tf2);
		button2 = new JButton("Add Word");
		button2.addActionListener(
			
		//On click the button adds the word to the file using Action Listener
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						String userWord = tf2.getText();
						go.addWordToFile(userWord);

					}
					
				}
		);
		add(button2);

	}
	
	
}