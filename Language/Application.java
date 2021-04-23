package Language;

import java.util.TreeMap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Application {
	public static void changeText(JLabel Component, String Text) {
		Component.setText(Text);
	}
	public static void changeText(JTextField Component, String Text) {
		Component.setText(Text);
	}
	public static void updateTable(DefaultTableModel Model,TreeMap<String,String> Data) {
		//  Deletes All Rows And Refreshes The Content
        int rowCount = Model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
           Model.removeRow(i);
        }
        for (String i : Data.keySet()) {
	         Object[] set = {i,Data.get(i)};
	         Model.addRow(set);
	    }
	}
	public static void clearText(JTextField Field) {
		Field.setText("");
	}
	public static void exitApplication() {
		System.exit(0);
	}
}