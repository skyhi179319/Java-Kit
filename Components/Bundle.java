package Components;

import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bundle {
	public static class Search extends JPanel{
		public static ArrayList<JTextField> TextfieldComponents = new ArrayList<JTextField>();
		public Search(MouseListener event) {
			JTextField Search = new Components.Textfield(10, getForeground(), getBackground());
			super.add(Search);
			super.add(new Components.Button(24, "Search", true, getForeground(), Colors.colors.silver,event));
			super.updateUI();
			TextfieldComponents.add(Search);
		}
	}
	public static class InfoForm extends JPanel{
		public static ArrayList<JLabel> LableComponents = new ArrayList<JLabel>();
		public static ArrayList<JTextField> TextfieldComponents = new ArrayList<JTextField>();
		public ArrayList<JButton> ButtonComponents = new ArrayList<JButton>();
		public InfoForm(MouseListener event) {
			JLabel FirstnameL = new Components.Label("Firstname :", getForeground());
			super.add(FirstnameL);
			JTextField Firstname =  new Components.Textfield(10, getForeground(), getBackground());
			super.add(Firstname);
			JLabel LastnameL = new Components.Label("Lastname :", getForeground());
			super.add(LastnameL);
			JTextField Lastname =  new Components.Textfield(10, getForeground(), getBackground());
			super.add(Lastname);
			JButton Button = new Components.Button(28, "Add", true, getForeground(), Colors.colors.silver,event);
			super.add(Button);
			LableComponents.add(FirstnameL);
			LableComponents.add(LastnameL);
			TextfieldComponents.add(Firstname);
			TextfieldComponents.add(Lastname);
			ButtonComponents.add(Button);
		}
		public InfoForm(JComponent[] age,MouseListener event) {
			JLabel FirstnameL = new Components.Label("Firstname :", getForeground());
			super.add(FirstnameL);
			JTextField Firstname =  new Components.Textfield(10, getForeground(), getBackground());
			super.add(Firstname);
			JLabel LastnameL = new Components.Label("Lastname :", getForeground());
			super.add(LastnameL);
			JTextField Lastname =  new Components.Textfield(10, getForeground(), getBackground());
			super.add(Lastname);
			JButton Button = new Components.Button(28, "Add", true, getForeground(), Colors.colors.silver,event);
			JComponent age0 = age[0];
			super.add(age0);
			JComponent age1 = age[1];
			super.add(age1);
			super.add(Button);
			LableComponents.add(FirstnameL);
			LableComponents.add(LastnameL);
			TextfieldComponents.add(Firstname);
			TextfieldComponents.add(Lastname);
			ButtonComponents.add(Button);
		}
	}
}