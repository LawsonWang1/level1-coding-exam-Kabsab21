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
		frame.setVisible(true);
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
	}

	public static void main(String[] args) {
		new Level1CodingExam().run();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
