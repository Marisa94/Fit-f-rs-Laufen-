package SEProjekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;

public class GUIWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWindow frame = new GUIWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIWindow() {
		setTitle("Fit f\u00FCrs Laufen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 263);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{73, 207, 150, 229};
		gbl_contentPane.rowHeights = new int[]{71, 0, 0, 90, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblMeineZiele = new JLabel("Meine Ziele");
		lblMeineZiele.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblMeineZiele = new GridBagConstraints();
		gbc_lblMeineZiele.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMeineZiele.insets = new Insets(0, 0, 5, 5);
		gbc_lblMeineZiele.gridx = 1;
		gbc_lblMeineZiele.gridy = 0;
		contentPane.add(lblMeineZiele, gbc_lblMeineZiele);
		
		JLabel lblNewLabel = new JLabel("Meine Daten");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblStrecke = new JLabel("Strecke in km");
		GridBagConstraints gbc_lblStrecke = new GridBagConstraints();
		gbc_lblStrecke.anchor = GridBagConstraints.EAST;
		gbc_lblStrecke.insets = new Insets(0, 0, 5, 5);
		gbc_lblStrecke.gridx = 0;
		gbc_lblStrecke.gridy = 1;
		contentPane.add(lblStrecke, gbc_lblStrecke);
		
		JComboBox combStrecke = new JComboBox();
		combStrecke.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15", "20"}));
		
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 1;
		contentPane.add(combStrecke, gbc_comboBox_1);
		
		JLabel lblFitneslevel = new JLabel("Fitneslevel");
		GridBagConstraints gbc_lblFitneslevel = new GridBagConstraints();
		gbc_lblFitneslevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblFitneslevel.anchor = GridBagConstraints.EAST;
		gbc_lblFitneslevel.gridx = 2;
		gbc_lblFitneslevel.gridy = 1;
		contentPane.add(lblFitneslevel, gbc_lblFitneslevel);
		
		JComboBox combofit = new JComboBox();
		combofit.setModel(new DefaultComboBoxModel(new String[] {"untrainiert", "grundausdauer", "gut trainiert "}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 1;
		contentPane.add(combofit, gbc_comboBox_2);
		
		JLabel lblZeit = new JLabel("Zeit in Minuten");
		GridBagConstraints gbc_lblZeit = new GridBagConstraints();
		gbc_lblZeit.anchor = GridBagConstraints.EAST;
		gbc_lblZeit.insets = new Insets(0, 0, 5, 5);
		gbc_lblZeit.gridx = 0;
		gbc_lblZeit.gridy = 2;
		contentPane.add(lblZeit, gbc_lblZeit);
		
		JComboBox comboZeit = new JComboBox();
		
		DefaultComboBoxModel Zeit5 = new DefaultComboBoxModel(new String[] {"20", "25", "30 ", "35"});
		DefaultComboBoxModel Zeit10 = new DefaultComboBoxModel(new String[] {"40", "45", "50 ", "55", "60"});
		DefaultComboBoxModel Zeit15 = new DefaultComboBoxModel(new String[] {"70", "80", "90", "100"});
		DefaultComboBoxModel Zeit20 = new DefaultComboBoxModel(new String[] {"90", "100", "110", "120", "130"});
		
		combStrecke.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (combStrecke.getSelectedItem().toString()){
				case "5": 
					comboZeit.setModel(Zeit5);
					break;
				case "10": 
					comboZeit.setModel(Zeit10);
					break;
				case "15": 
					comboZeit.setModel(Zeit15);
					break;
				case "20": 
					comboZeit.setModel(Zeit20);
				
				}
				
			}
		});
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		contentPane.add(comboZeit, gbc_comboBox);
		
		JLabel lblZeitaufwand = new JLabel("Zeitaufwand pro Woche");
		GridBagConstraints gbc_lblZeitaufwand = new GridBagConstraints();
		gbc_lblZeitaufwand.insets = new Insets(0, 0, 5, 5);
		gbc_lblZeitaufwand.anchor = GridBagConstraints.EAST;
		gbc_lblZeitaufwand.gridx = 2;
		gbc_lblZeitaufwand.gridy = 2;
		contentPane.add(lblZeitaufwand, gbc_lblZeitaufwand);
		
		JComboBox comboaufwand = new JComboBox();
		comboaufwand.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "6", "8", "10"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 3;
		gbc_comboBox_3.gridy = 2;
		contentPane.add(comboaufwand, gbc_comboBox_3);
		
		JButton btnTrainingsplan = new JButton("Trainingsplan erstellen");
		btnTrainingsplan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTH;
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnTrainingsplan, gbc_btnNewButton);
	}

}
