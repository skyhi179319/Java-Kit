package Components;

import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import Colors.colors;

public class Dialog extends JDialog{
	public static ArrayList<JPanel> buttonComponents = new ArrayList<JPanel>();
	public Dialog(int X,int Y, int Width,int Height,String Title,String Message,MouseListener eventYes) {
		super.setBounds(X, Y, Width, Height);
		super.setTitle(Title);
		JPanel closingMessage = new JPanel();
	    JPanel closingButtons = new JPanel();
	    JButton Yes = new  Components.Button(28, "Yes", true, colors.Black,colors.white, eventYes);
	    closingButtons.add(Yes);
	    closingMessage.add(new Components.Label(Message, colors.Black));
	    super.getContentPane().add(closingMessage, BorderLayout.CENTER);
	    super.getContentPane().add(closingButtons, BorderLayout.SOUTH);
	    buttonComponents.add(closingButtons);
	    super.show();
	}
}