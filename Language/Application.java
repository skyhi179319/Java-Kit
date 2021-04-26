package Language;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;
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
	public static void deleteRow(JTable J ,DefaultTableModel Model) {
		if(J.getSelectedRow() != -1) {
            // remove selected row from the model
            Model.removeRow(J.getSelectedRow());
         }
	}
	public static void writeFile(String Filename,String text) {
		try {
	         String file = Filename;
	         FileWriter myWriter = new FileWriter(file);
	         myWriter.write(text);
	         myWriter.close();
	      } catch (IOException e) {
	         Language.Console.Log("An error occurred.");
	         e.printStackTrace();
	      }
	}
	public void writeFile(String Filename, String[] text) {
		try {
	         String file = Filename;
	         FileWriter myWriter = new FileWriter(file);
	         for (int i = 0; i < text.length; i++) {
        	 	myWriter.write(text[i] + "\r\n");
	         }
	         myWriter.close();
	      } catch (IOException e) {
	         System.out.println("An error occurred.");
	         e.printStackTrace();
	      }
	}
	public static void exitApplication() {
		System.exit(0);
	}
}