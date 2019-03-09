import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicalView extends JFrame implements View {
	private JLabel input;
	private Timer model;
	
	public GraphicalView (Timer model, Controller controller) {
		setLayout (new GridLayout(2, 3));
		this.model = model;
		
		// Your code here.
		JButton iHours = new JButton ("IncrementHours");
		iHours.addActionListener(controller);
		JButton iMin = new JButton ("IncrementMinutes");
		iMin.addActionListener(controller);
		JButton iSec = new JButton ("IncrementSeconds");
		iSec.addActionListener(controller);
		JButton dHours = new JButton ("DecrementHours");
		dHours.addActionListener(controller);
		JButton dMin = new JButton ("DecrementMinutes");
		dMin.addActionListener(controller);
		JButton dSec = new JButton ("DecrementSeconds");
		dSec.addActionListener(controller);
		input = new JLabel(model.toString());
		add(iHours);
		add(iMin);
		add(iSec);
		add(input);
		add(dHours);
		add(dMin);
		add(dSec);




		//setup
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 100);

		//display the window
		setVisible(true);
	}
	public void update () {
	input.setText(model.toString());
}



}