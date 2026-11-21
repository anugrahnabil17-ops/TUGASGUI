import javax.swing.*;
import java.awt.*;

public class FormBiodata {
    public static void main(String[] args) {
        // 1. Top-level container
        JFrame frame = new JFrame("Form Biodata");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Layout manager untuk content pane (BorderLayout)
        BorderLayout layout = new BorderLayout(5, 5);
        frame.getContentPane().setLayout(layout);

        // 3. Atomic component
        JLabel judul = new JLabel("FORM BIODATA", JLabel.CENTER);
        judul.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel lblNama = new JLabel("Nama");
        JLabel lblNim = new JLabel("NIM");
        JLabel lblJurusan = new JLabel("Jurusan");

        JTextField txtNama = new JTextField();
        JTextField txtNim = new JTextField();
        JTextField txtJurusan = new JTextField();

        JButton btnSimpan = new JButton("Simpan");
        JButton btnReset = new JButton("Reset");

        // 4. Intermediate container (JPanel)
        // Panel form memakai GridLayout (3 baris, 2 kolom)
        JPanel panelForm = new JPanel(new GridLayout(3, 2, 5, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panelForm.add(lblNama);
        panelForm.add(txtNama);
        panelForm.add(lblNim);
        panelForm.add(txtNim);
        panelForm.add(lblJurusan);
        panelForm.add(txtJurusan);

        // Panel tombol memakai FlowLayout (default JPanel)
        JPanel panelTombol = new JPanel();
        panelTombol.add(btnSimpan);
        panelTombol.add(btnReset);

        // 5. Masukkan ke content pane
        frame.getContentPane().add(judul, BorderLayout.NORTH);
        frame.getContentPane().add(panelForm, BorderLayout.CENTER);
        frame.getContentPane().add(panelTombol, BorderLayout.SOUTH);

        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
