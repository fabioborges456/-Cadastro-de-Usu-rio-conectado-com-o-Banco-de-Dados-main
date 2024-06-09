package CadastrodeUsuárioConectadoBancodeDados;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class CadastroComBancoExample1 {

private JFrame frmCadastreSe;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;



	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroComBancoExample1 window = new CadastroComBancoExample1();
					window.frmCadastreSe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	
	public CadastroComBancoExample1() {
		initialize();
	}



	
	private void initialize() {
		frmCadastreSe = new JFrame();
		frmCadastreSe.setTitle("Cadastre - se");
		frmCadastreSe.getContentPane().setBackground(new Color(192, 192, 192));
		frmCadastreSe.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(38, 27, 175, 22);
		frmCadastreSe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(223, 28, 188, 22);
		frmCadastreSe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsuario.setBounds(38, 80, 175, 22);
		frmCadastreSe.getContentPane().add(lblUsuario);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 81, 188, 22);
		frmCadastreSe.getContentPane().add(textField_1);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(38, 130, 175, 22);
		frmCadastreSe.getContentPane().add(lblSenha);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(223, 131, 188, 22);
		frmCadastreSe.getContentPane().add(textField_2);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmarSenha.setBounds(38, 181, 175, 22);
		frmCadastreSe.getContentPane().add(lblConfirmarSenha);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(223, 182, 188, 22);
		frmCadastreSe.getContentPane().add(textField_3);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrar.setBounds(223, 227, 188, 23);
		frmCadastreSe.getContentPane().add(btnCadastrar);
		frmCadastreSe.setBounds(100, 100, 450, 300);
		frmCadastreSe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
