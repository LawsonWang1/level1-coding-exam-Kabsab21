import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Level1CodingExam implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	void run() {
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(yellow);
		yellow.addActionListener(this);
		panel.add(red);
		red.addActionListener(this);
		panel.add(blue);
		blue.addActionListener(this);
		panel.add(green);
		green.addActionListener(this);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Level1CodingExam().run();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton a = (JButton) arg0.getSource();
		if (a == yellow) {
			speak("yellow");
		} else if (a == green) {
			speak("green");
		} else if (a == blue) {
			speak("blue");
		} else {
			speak("red");
		}
		
	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
