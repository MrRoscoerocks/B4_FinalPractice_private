import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		
		
		
		Runner myRunner = new Runner();
		converter myConverter = new converter();
		myRunner.welcome();
		
	}

	private void welcome() {
		JOptionPane.showMessageDialog(null, "Welcome to my Converter Program, created by Roscoe Ambrose");
		
	}

}
