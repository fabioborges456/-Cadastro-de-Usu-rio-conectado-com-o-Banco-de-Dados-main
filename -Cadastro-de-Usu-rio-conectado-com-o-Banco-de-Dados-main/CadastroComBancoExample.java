package CadastrodeUsuárioConectadoBancodeDados;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CadastroComBancoExample extends JFrame {

private static final long serialVersionUID = -3559795837124927130L;
private JTextField nomeField;
private JTextField usuarioField;
private JPasswordField senhaField;
private JPasswordField confirmarSenhaField;
private JButton cadastrarButton;

private final String DB_URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
private final String DB_USER = "seu_usuario";
private final String DB_PASSWORD = "sua_senha";

public CadastroComBancoExample() {

setTitle("Cadastre-se");
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(450, 300);
setLocationRelativeTo(null);

JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
nomeField = new JTextField();
usuarioField = new JTextField();
senhaField = new JPasswordField();
confirmarSenhaField = new JPasswordField();
cadastrarButton = new JButton(" Cadastrar");

panel.add(new JLabel("   Nome:"));
panel.add(nomeField);
panel.add(new JLabel("   Usuário:"));
panel.add(usuarioField);
panel.add(new JLabel("   Senha:"));
panel.add(senhaField);
panel.add(new JLabel("   Confirmar Senha:"));
panel.add(confirmarSenhaField);
panel.add(new JLabel()); // Espaço em branco para alinhar botão
panel.add(cadastrarButton);

add(panel);

cadastrarButton.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {
String nome = nomeField.getText();
String usuario = usuarioField.getText();
String senha = new String(senhaField.getPassword());
String confirmarSenha = new String(confirmarSenhaField.getPassword());

if (!senha.equals(confirmarSenha)) {
JOptionPane.showMessageDialog(null, "As senhas não coincidem.", "Erro", JOptionPane.ERROR_MESSAGE);
return;
}

try {

Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
String query = "INSERT INTO usuarios (nome, usuario, senha) VALUES (?, ?, ?)";
PreparedStatement preparedStatement = connection.prepareStatement(query);
preparedStatement.setString(1, nome);
preparedStatement.setString(2, usuario);
preparedStatement.setString(3, senha);
preparedStatement.executeUpdate();

JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

preparedStatement.close();
connection.close();
} catch (SQLException ex) {
ex.printStackTrace();
JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}
	});
}

public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
CadastroComBancoExample example = new CadastroComBancoExample();
example.setVisible(true);
		});
	}
}