package timetable;

import java.awt.Color;

import javax.swing.JFrame;

public class Window {

	static int width;
	static int height;
	
	public static void main(String args[]){
		
		
		
	}
	
public static void Window(String args[]){
		
		String WindowName= "Window";
			
			JFrame Window = new JFrame(WindowName);
			
			Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Window.setVisible(true);
			
			Window.setSize(700, 700);
			
			 width = Window.getSize().width;
			 
		      height = Window.getSize().height;
		      
		      Window.setBackground( Color.DARK_GRAY );
		      
		      
			
		}
	
}
