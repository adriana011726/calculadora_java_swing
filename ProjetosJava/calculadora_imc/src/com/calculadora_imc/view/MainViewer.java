package com.calculadora_imc.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.calculadora_imc.control.ImcController;

public class MainViewer {

	private JFrame appFrame;
	private JTextField pesoTextField;
	private JTextField alturaTextField;
	private JTextPane resultPane; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.setAlwaysOnTop(true);
		appFrame.setTitle("IMC APP");
		appFrame.setBounds(100, 100, 300, 400);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.getContentPane().setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora IMC");
		lblCalculadora.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblCalculadora.setBounds(31, 6, 238, 31);
		appFrame.getContentPane().add(lblCalculadora);
		
		JLabel pesoLabel = new JLabel("Peso");
		pesoLabel.setBounds(31, 87, 61, 16);
		appFrame.getContentPane().add(pesoLabel);
		
		pesoTextField = new JTextField();
		pesoTextField.setText("0.0");
		pesoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesoTextField.setBounds(139, 82, 130, 50);
		appFrame.getContentPane().add(pesoTextField);
		pesoTextField.setColumns(10);
		
		JLabel pesoLabel_1 = new JLabel("Altura");
		pesoLabel_1.setBounds(31, 150, 61, 16);
		appFrame.getContentPane().add(pesoLabel_1);
		
		alturaTextField = new JTextField();
		alturaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturaTextField.setText("0.0");
		alturaTextField.setToolTipText("");
		alturaTextField.setColumns(10);
		alturaTextField.setBounds(139, 144, 130, 50);
		appFrame.getContentPane().add(alturaTextField);
		
		JButton calcularButton = new JButton("Calcular");
		calcularButton.setBounds(31, 203, 238, 50);
		calcularButton.addActionListener(new ImcController(this));
		appFrame.getContentPane().add(calcularButton);
		
		resultPane = new JTextPane();
		resultPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		resultPane.setText("Result");
		resultPane.setBounds(31, 283, 238, 71);
		appFrame.getContentPane().add(resultPane);
	}

	public JFrame getAppFrame() {
		return appFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		this.appFrame = appFrame;
	}

	public JTextField getPesoTextField() {
		return pesoTextField;
	}

	public void setPesoTextField(JTextField pesoTextField) {
		this.pesoTextField = pesoTextField;
	}

	public JTextField getAlturaTextField() {
		return alturaTextField;
	}

	public void setAlturaTextField(JTextField alturaTextField) {
		this.alturaTextField = alturaTextField;
	}

	public JTextPane getResultPane() {
		return resultPane;
	}

	public void setResultPane(JTextPane resultPane) {
		this.resultPane = resultPane;
	}
	
	
}
