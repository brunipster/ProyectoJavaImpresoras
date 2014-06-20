/**
 * 
 */
package venta_proyectores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author alejandro
 * 
 */
public class LoginActionListener implements ActionListener {

	private Login login;

	public LoginActionListener(Login login) {

		this.login = login;
	}

	public void actionPerformed(ActionEvent e) {
		// var
		String user, pass;
		// ing dat
		user = login.txtUser.getText();
		pass = login.txtPass.getText();
		// proce
		if (user.equalsIgnoreCase("admin") && pass.equals("admin")) {
			// JOptionPane.showInternalInputDialog(this,
			// "Bienvenido al Sistema", defaultCloseOperation, null, eventCache,
			// anchor);
			Venta frame = new Venta();
			frame.setVisible(true);
			login.setVisible(false);
		}
	}

}
