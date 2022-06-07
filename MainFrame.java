import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
	private JPanel mainPane;
	private JTextField txt_a;
	private JTextField txt_b;

	public MainFrame() {
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);

		JLabel lblProcessed = new JLabel("Processed Parcels: Sorted by ID");
		lblProcessed.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblProcessed.setBounds(40, 60, 700, 80);
		mainPane.add(lblProcessed);

		JLabel lbl_a = new JLabel("1. Place holder text");
		lbl_a.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_a.setBounds(40, 180, 460, 50);
		mainPane.add(lbl_a);

		JLabel lbl_b = new JLabel("2. Place holder text");
		lbl_b.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_b.setBounds(40, 300, 460, 50);
		mainPane.add(lbl_b);

		JButton btn_parcel = new JButton("NEW PARCEL");
		btn_parcel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_parcel.setBounds(1000, 120, 200, 100);
		mainPane.add(btn_parcel);

		JButton btn_logout = new JButton("LOG OUT");
		btn_logout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_logout.setBounds(1000, 300, 200, 100);
		btn_logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.this.dispose();
			}
		});
		mainPane.add(btn_logout);
		
		JButton btn_del = new JButton("Delivery Request");
		btn_del.setFont(new Font("Tahoma", Font.BOLD, 19));
		btn_del.setBounds(1000, 360, 200, 80);
		mainPane.add(btn_del);
		
		JButton btn_inf = new JButton("Parcel Info");
		btn_inf.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_inf.setBounds(1000, 480, 200, 80);
		mainPane.add(btn_inf);
	}
}
