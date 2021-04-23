package Language;

import javax.swing.*;

public class Application {
	public static class Bundles{
		public static class Search{
			public static JTextField Search = Components.Bundle.Search.TextfieldComponents.get(0);
		}
		public static class InfoForm{
			/*
			 * Normal form
			 */
			public static JTextField Firstname1 = Components.Bundle.InfoForm.TextfieldComponents.get(0);
			public static JTextField Lastname1 = Components.Bundle.InfoForm.TextfieldComponents.get(1);
			/*
			 * Age Form
			 */
			public static JTextField Firstname2 = Components.Bundle.InfoForm.TextfieldComponents.get(2);
			public static JTextField Lastname2 = Components.Bundle.InfoForm.TextfieldComponents.get(3);
		}
	}
	public static void changeText(JLabel Component, String Text) {
		Component.setText(Text);
	}
	public static void changeText(JTextField Component, String Text) {
		Component.setText(Text);
	}
}