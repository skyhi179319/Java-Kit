package Components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu{
	public static class menuItem extends JMenuItem{
		public menuItem(String text,ActionListener action) {
			super.setText(text);
			super.addActionListener(action);
		}
	}
	public static class menu extends JMenu{
		public menu(String text,menuItem[] items) {
			super.setText(text);
			for (int i = 0; i < items.length; i++) {
				super.add(items[i]);
			}
		}
	}
	public static class menuBar extends JMenuBar {
		public menuBar(){
			menuItem[] items = {new menuItem("Exit",new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Language.Application.exitApplication();
				}
				
			})};
			JMenu main = new menu("Options",items);
			super.add(main);
		}
		public menuBar(menu[] items) {
			for (int i = 0; i < items.length; i++) {
				super.add(items[i]);
			}
		}
	}
}