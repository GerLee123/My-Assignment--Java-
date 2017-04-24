//Name : Ger Lee
//Student Number: C15588357
//Class : DT211C/2
//Group : B

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MyMain{
	
	//My Main which calls the GUI
	public static void main(String[] args){
		//Opening my interface
		myInterface go = new myInterface();
		go.setSize(400,400);
		go.setVisible(true);		
	}
	
		//My class for file operations and scanning for bad words
		public static void openingFiles(String[] args){
		ArrayList <String> badWords = new ArrayList<String>();

		String data;
		
		try
		{
			FileReader badWordReader = new FileReader("C:/Users/Ger/Desktop/words.txt");
			Scanner scanBadWords = new Scanner(badWordReader);
			
			FileReader tweetFile = new FileReader(args[0]);
			Scanner scanTweetFile = new Scanner(tweetFile);
			
			//Adds all the words from the text file to an array
			while((scanBadWords.hasNextLine()))
			{
				badWords.add(scanBadWords.nextLine());
			}
			
			
			while(scanTweetFile.hasNext())
			{
				
				data = scanTweetFile.next();

					if(badWords.contains(data))
					{
						JOptionPane.showMessageDialog(null, "The bad word",data,0);
					}

				}
			scanTweetFile.close();
			scanBadWords.close();	
		}
		
		catch(Exception ex)
		{
			System.out.println("exception " + ex.getMessage() + " caught");
		}
			
		}
		
		//My Class for adding words to the text file
		public static void addWordToFile(String s)
		{
			try
			{
				String newWord = s;
				PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/Ger/Desktop/words.txt", true));
			    writer.println("\r\n" + newWord);
			    writer.close();
				JOptionPane.showMessageDialog(null, "Word Added to Bad Word File");

			} 
			catch(Exception ex)
			{
				System.out.println("exception " + ex.getMessage() + " caught");
			}
	}
}