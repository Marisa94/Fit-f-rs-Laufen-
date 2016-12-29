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
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

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
		
		//Title of Window
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
		
		//left column heading 
		
		JLabel lblMeineZiele = new JLabel("Meine Ziele");
		lblMeineZiele.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblMeineZiele = new GridBagConstraints();
		gbc_lblMeineZiele.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMeineZiele.insets = new Insets(0, 0, 5, 5);
		gbc_lblMeineZiele.gridx = 1;
		gbc_lblMeineZiele.gridy = 0;
		contentPane.add(lblMeineZiele, gbc_lblMeineZiele);
		
		//right column heading 
		
		JLabel lblNewLabel = new JLabel("Meine Daten");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		//label of 1st Dropbox (Strecke)
		
		JLabel lblStrecke = new JLabel("Strecke in km");
		GridBagConstraints gbc_lblStrecke = new GridBagConstraints();
		gbc_lblStrecke.anchor = GridBagConstraints.EAST;
		gbc_lblStrecke.insets = new Insets(0, 0, 5, 5);
		gbc_lblStrecke.gridx = 0;
		gbc_lblStrecke.gridy = 1;
		contentPane.add(lblStrecke, gbc_lblStrecke);
		
		// Dropbox for "Strecke"
		
		JComboBox combStrecke = new JComboBox();
		//Values of Dropbox
		combStrecke.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15", "20"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 1;
		contentPane.add(combStrecke, gbc_comboBox_1);
		
		//label of Dropbox (Fitneslevel)
		
		JLabel lblFitneslevel = new JLabel("Fitneslevel");
		GridBagConstraints gbc_lblFitneslevel = new GridBagConstraints();
		gbc_lblFitneslevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblFitneslevel.anchor = GridBagConstraints.EAST;
		gbc_lblFitneslevel.gridx = 2;
		gbc_lblFitneslevel.gridy = 1;
		contentPane.add(lblFitneslevel, gbc_lblFitneslevel);
		//Dropbox of Fitneslevel
		JComboBox combofit = new JComboBox();
		//Values of fitneslevel
		combofit.setModel(new DefaultComboBoxModel(new String[] {"untrainiert", "grundausdauer", "gut trainiert "}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 1;
		contentPane.add(combofit, gbc_comboBox_2);
		
		//label of Dropbox (Zeit)
		JLabel lblZeit = new JLabel("Zeit in Minuten");
		GridBagConstraints gbc_lblZeit = new GridBagConstraints();
		gbc_lblZeit.anchor = GridBagConstraints.EAST;
		gbc_lblZeit.insets = new Insets(0, 0, 5, 5);
		gbc_lblZeit.gridx = 0;
		gbc_lblZeit.gridy = 2;
		contentPane.add(lblZeit, gbc_lblZeit);
		//Dropbox of Zeit
		JComboBox comboZeit = new JComboBox();
		//Possible content for dropbox 
		DefaultComboBoxModel Zeit5 = new DefaultComboBoxModel(new String[] {"20", "25", "30 ", "35"});
		DefaultComboBoxModel Zeit10 = new DefaultComboBoxModel(new String[] {"40", "45", "50 ", "55", "60"});
		DefaultComboBoxModel Zeit15 = new DefaultComboBoxModel(new String[] {"70", "80", "90", "100"});
		DefaultComboBoxModel Zeit20 = new DefaultComboBoxModel(new String[] {"90", "100", "110", "120", "130"});
		//content of dropbox, depended on Strecke
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
		
		// label of dropbox Zeitaufwand 
		JLabel lblZeitaufwand = new JLabel("Zeitaufwand pro Woche");
		GridBagConstraints gbc_lblZeitaufwand = new GridBagConstraints();
		gbc_lblZeitaufwand.insets = new Insets(0, 0, 5, 5);
		gbc_lblZeitaufwand.anchor = GridBagConstraints.EAST;
		gbc_lblZeitaufwand.gridx = 2;
		gbc_lblZeitaufwand.gridy = 2;
		contentPane.add(lblZeitaufwand, gbc_lblZeitaufwand);
		// Dropbox Zeitaufwand 
		JComboBox comboaufwand = new JComboBox();
		//content of dropbox zeitaufwand 
		comboaufwand.setModel(new DefaultComboBoxModel(new String[] {"2", "4", "6", "8", "10"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 3;
		gbc_comboBox_3.gridy = 2;
		contentPane.add(comboaufwand, gbc_comboBox_3);
		// Button to get plans 
		JButton btnTrainingsplan = new JButton("Trainingsplan erstellen");
		btnTrainingsplan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		// Create PDF if Button "Trainingsplan erstellen" is pushed 
		btnTrainingsplan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// create DoCument 
                    Document document = new Document(PageSize.A4.rotate());
                    // new object Ausgabe 
                    Ausgabe Test = new Ausgabe();
                    // location of document 
                    String FILE = "C:/Users/Default/Documents/Fit_Fürs_Laufen.pdf";
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    // create Ausgabe with methods 
                    document.open();
                    Test.addMetaData(document);
                    Test.addContentLaufen(document);
                    Desktop.getDesktop().open(new File(FILE));
                    document.close();
	            } catch (Exception e1) {
	                    e1.printStackTrace();
	            }
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