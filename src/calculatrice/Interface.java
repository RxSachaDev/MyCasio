/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatrice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author sacha
 */
public class Interface extends JFrame {

    private static JPanel calc = new JPanel();
    private static JLabel res = new JLabel();
    private static JButton zero = new JButton("0");
    private static JButton un = new JButton("1");
    private static JButton deux = new JButton("2");
    private static JButton trois = new JButton("3");
    private static JButton quatre = new JButton("4");
    private static JButton cinq = new JButton("5");
    private static JButton six = new JButton("6");
    private static JButton sept = new JButton("7");
    private static JButton huit = new JButton("8");
    private static JButton neuf = new JButton("9");
    private static JButton moins = new JButton("-");
    private static JButton plus = new JButton("+");
    private static JButton diviser = new JButton("/");
    private static JButton multiplier = new JButton("x");
    private static JButton virgule = new JButton(",");
    private static JButton entrée = new JButton("EXE");
    private static JButton reintialiser = new JButton("AC");
    private static JButton supp = new JButton("SUPPR");
    private static JButton carré = new JButton("x²");
    private static JButton puissance = new JButton("x^");
    private static JLabel lab = new JLabel("CASIO");

    Interface() {
        this.setTitle("Calculatrice");
        this.setSize(400, 710);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        this.getContentPane().setBackground(new Color(92, 240, 117));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.add(lab);
        this.add(res);
        this.add(calc);
        this.setLocationRelativeTo(null);
        lab.setPreferredSize(new Dimension(120, 70));
        lab.setLocation(145, 10);
        lab.setFont(new Font("Arial", Font.PLAIN, 35));
        calc.setPreferredSize(new Dimension(350, 400));
        calc.setLayout(new GridLayout(6, 4, 10, 5));
        calc.setBackground(new Color(92, 240, 117));
        res.setPreferredSize(new Dimension(350, 200));
        res.setLocation(18, 85);
        res.setFont(new Font("Arial", Font.PLAIN, 50));
        res.setText("0");
        res.setBackground(new Color(180, 255, 186));
        res.setOpaque(true);
        res.setHorizontalAlignment(SwingConstants.RIGHT);
        res.setBorder(new EmptyBorder(0, 0, 0, 10));
        calc.setLocation(18, 325);
        calc.add(carré);
        calc.add(puissance);
        calc.add(supp);
        calc.add(reintialiser);
        calc.add(sept);
        calc.add(huit);
        calc.add(neuf);
        calc.add(plus);
        calc.add(quatre);
        calc.add(cinq);
        calc.add(six);
        calc.add(moins);
        calc.add(un);
        calc.add(deux);
        calc.add(trois);
        calc.add(multiplier);
        calc.add(zero);
        calc.add(diviser);
        calc.add(virgule);
        calc.add(entrée);
        zero.setBackground(new Color(36, 115, 49));
        un.setBackground(new Color(36, 115, 49));
        deux.setBackground(new Color(36, 115, 49));
        trois.setBackground(new Color(36, 115, 49));
        quatre.setBackground(new Color(36, 115, 49));
        cinq.setBackground(new Color(36, 115, 49));
        six.setBackground(new Color(36, 115, 49));
        sept.setBackground(new Color(36, 115, 49));
        huit.setBackground(new Color(36, 115, 49));
        neuf.setBackground(new Color(36, 115, 49));
        moins.setBackground(new Color(36, 115, 49));
        plus.setBackground(new Color(36, 115, 49));
        diviser.setBackground(new Color(36, 115, 49));
        multiplier.setBackground(new Color(36, 115, 49));
        puissance.setBackground(new Color(36, 115, 49));
        carré.setBackground(new Color(36, 115, 49));
        supp.setBackground(new Color(225, 211, 42));
        reintialiser.setBackground(new Color(225, 211, 42));
        entrée.setBackground(new Color(36, 115, 49));
        virgule.setBackground(new Color(36, 115, 49));
        zero.setForeground(Color.white);
        un.setForeground(Color.white);
        deux.setForeground(Color.white);
        trois.setForeground(Color.white);
        quatre.setForeground(Color.white);
        cinq.setForeground(Color.white);
        six.setForeground(Color.white);
        sept.setForeground(Color.white);
        huit.setForeground(Color.white);
        neuf.setForeground(Color.white);
        plus.setForeground(Color.white);
        moins.setForeground(Color.white);
        diviser.setForeground(Color.white);
        multiplier.setForeground(Color.white);
        entrée.setForeground(Color.white);
        virgule.setForeground(Color.white);
        puissance.setForeground(Color.white);
        carré.setForeground(Color.white);
    }
}
