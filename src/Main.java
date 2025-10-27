import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
public Main() {
    super("Loguj");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    setLayout(new BorderLayout(10, 10));

    JPanel panelp = new JPanel();
    panelp.setLayout((new GridLayout(2, 2, 5, 5)));

    panelp.add(new JLabel("Nick:", SwingConstants.RIGHT));
    JTextField poleU = new JTextField(15);
    panelp.add(poleU);

    panelp.add(new JLabel("haslo:", SwingConstants.RIGHT));
    JTextField poleH = new JTextField(15);
    panelp.add(poleH);
    JPanel srodek = new JPanel(new GridBagLayout());
    srodek.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 100));
    srodek.add(panelp);
    JPanel prz = new JPanel();
    prz.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

    JButton btnl = new JButton("log");
    JButton btnn = new JButton("jednak nie");

    prz.add(btnl);
    prz.add(btnn);

    add(srodek, BorderLayout.CENTER);
    add(prz, BorderLayout.SOUTH);

    pack();
    setVisible(true);
}

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new Main());
    }
}
