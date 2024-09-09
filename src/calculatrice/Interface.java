/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatrice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

/**
 * Classe Interface qui représente une calculatrice graphique simple. Elle
 * permet d'effectuer des opérations de base (addition, soustraction,
 * multiplication, division) ainsi que des opérations plus complexes (puissance,
 * carré). L'interface est conçue en utilisant Swing pour une interface
 * graphique conviviale.
 */
public class Interface extends JFrame {

    /**
     * Panneau principal de la calculatrice, où les boutons sont disposés.
     */
    private static JPanel calc = new JPanel();

    /**
     * Label pour afficher les résultats et l'entrée de l'utilisateur.
     */
    private static JLabel res = new JLabel();

    /**
     * Bouton représentant le chiffre 0.
     */
    private static JButton zero = new JButton("0");

    /**
     * Bouton représentant le chiffre 1.
     */
    private static JButton un = new JButton("1");

    /**
     * Bouton représentant le chiffre 2.
     */
    private static JButton deux = new JButton("2");

    /**
     * Bouton représentant le chiffre 3.
     */
    private static JButton trois = new JButton("3");

    /**
     * Bouton représentant le chiffre 4.
     */
    private static JButton quatre = new JButton("4");

    /**
     * Bouton représentant le chiffre 5.
     */
    private static JButton cinq = new JButton("5");

    /**
     * Bouton représentant le chiffre 6.
     */
    private static JButton six = new JButton("6");

    /**
     * Bouton représentant le chiffre 7.
     */
    private static JButton sept = new JButton("7");

    /**
     * Bouton représentant le chiffre 8.
     */
    private static JButton huit = new JButton("8");

    /**
     * Bouton représentant le chiffre 9.
     */
    private static JButton neuf = new JButton("9");

    /**
     * Bouton pour l'opérateur de soustraction (-).
     */
    private static JButton moins = new JButton("-");

    /**
     * Bouton pour l'opérateur d'addition (+).
     */
    private static JButton plus = new JButton("+");

    /**
     * Bouton pour l'opérateur de division (/).
     */
    private static JButton diviser = new JButton("/");

    /**
     * Bouton pour l'opérateur de multiplication (x).
     */
    private static JButton multiplier = new JButton("x");

    /**
     * Bouton pour ajouter une virgule (décimal).
     */
    private static JButton virgule = new JButton(".");

    /**
     * Bouton pour exécuter le calcul (EXE).
     */
    private static JButton entrée = new JButton("EXE");

    /**
     * Bouton pour réinitialiser la calculatrice (AC - All Clear).
     */
    private static JButton reintialiser = new JButton("AC");

    /**
     * Bouton pour supprimer le dernier caractère ou l'entrée (SUPPR).
     */
    private static JButton supp = new JButton("SUPPR");

    /**
     * Bouton pour calculer le carré d'un nombre (x²).
     */
    private static JButton carré = new JButton("x²");

    /**
     * Bouton pour calculer une puissance (x^).
     */
    private static JButton puissance = new JButton("x^");

    /**
     * Label affichant le texte "CASIO" pour des raisons esthétiques.
     */
    private static JLabel lab = new JLabel("CASIO");

    /**
     * Constructeur de la classe Interface. Initialise la fenêtre de la
     * calculatrice et ajoute les composants nécessaires.
     */
    Interface() {
        this.setTitle("Calculatrice");
        this.setSize(400, 710);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        this.getContentPane().setBackground(new Color(92, 240, 117));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(lab);
        this.add(res);
        this.add(calc);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        this.requestFocusInWindow();
        initComponents();
        addKeyListener();
        addMouseListener();
        calculatriceFont();
    }

    /**
     * Initialise les composants de la calculatrice. Cette méthode configure les
     * boutons, l'étiquette, ainsi que la disposition générale des composants.
     */
    public void initComponents() {
        lab.setPreferredSize(new Dimension(120, 50));
        lab.setLocation(145, 10);
        lab.setFont(new Font("Arial", Font.PLAIN, 35));
        calc.setPreferredSize(new Dimension(350, 400));
        calc.setLayout(new GridLayout(6, 4, 10, 5));
        calc.setBackground(new Color(92, 240, 117));
        res.setPreferredSize(new Dimension(350, 200));
        res.setLocation(18, 85);
        res.setFont(new Font("Arial", Font.PLAIN, 50));
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
        zero.addActionListener(new NumberButtonListener());
        un.addActionListener(new NumberButtonListener());
        deux.addActionListener(new NumberButtonListener());
        trois.addActionListener(new NumberButtonListener());
        quatre.addActionListener(new NumberButtonListener());
        cinq.addActionListener(new NumberButtonListener());
        six.addActionListener(new NumberButtonListener());
        sept.addActionListener(new NumberButtonListener());
        huit.addActionListener(new NumberButtonListener());
        neuf.addActionListener(new NumberButtonListener());
        virgule.addActionListener(new NumberButtonListener());
        plus.addActionListener(new OperatorButtonListener());
        moins.addActionListener(new OperatorButtonListener());
        multiplier.addActionListener(new OperatorButtonListener());
        diviser.addActionListener(new OperatorButtonListener());
        supp.addActionListener(new DeleteButtonListener());
        reintialiser.addActionListener(new ResetButtonListener());
        carré.addActionListener(new CarreButtonListener());
        puissance.addActionListener(new PowerButtonListener());
        entrée.addActionListener(new ExecuteButtonListener());
    }

    /**
     * Ajoute un KeyListener à la fenêtre principale pour permettre
     * l'interaction via le clavier. Les touches numériques, opérateurs et
     * autres sont mappées pour simuler un clic sur les boutons correspondants.
     */
    public void addKeyListener() {
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // Vérifiez si la touche pressée est la touche "1"
                if (e.getKeyChar() == '1') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "1"
                    un.doClick(); // Simule un clic sur le bouton "1"
                } else if (e.getKeyChar() == '2') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "2"
                    deux.doClick(); // Simule un clic sur le bouton "2"
                } else if (e.getKeyChar() == '3') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "3"
                    trois.doClick(); // Simule un clic sur le bouton "3"
                } else if (e.getKeyChar() == '4') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "4"
                    quatre.doClick(); // Simule un clic sur le bouton "4"
                } else if (e.getKeyChar() == '5') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "5"
                    cinq.doClick(); // Simule un clic sur le bouton "5"
                } else if (e.getKeyChar() == '6') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "6"
                    six.doClick(); // Simule un clic sur le bouton "6"
                } else if (e.getKeyChar() == '7') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "7"
                    sept.doClick(); // Simule un clic sur le bouton "7"
                } else if (e.getKeyChar() == '8') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "8"
                    huit.doClick(); // Simule un clic sur le bouton "8"
                } else if (e.getKeyChar() == '9') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    neuf.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    supp.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    entrée.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyChar() == '+') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    plus.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyChar() == '-') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    moins.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyChar() == '*') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    multiplier.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyChar() == '/') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    diviser.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyChar() == '²') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    carré.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyCode() == KeyEvent.VK_DEAD_CIRCUMFLEX) {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    puissance.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyChar() == ',' || e.getKeyChar() == '.') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "9"
                    virgule.doClick(); // Simule un clic sur le bouton "9"
                } else if (e.getKeyChar() == '0') {
                    // Exécutez le même code que celui dans votre ActionListener de bouton "2"
                    zero.doClick(); // Simule un clic sur le bouton "2"
                }
            }
        });
    }

    /**
     * Classe interne qui gère les actions des boutons numériques. Ajoute le
     * chiffre sélectionné au texte du label 'res'.
     */
    class NumberButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (res.getText().equals("ERROR")) {
                res.setText("");
            }
            JButton bouton = (JButton) e.getSource();
            res.setText(res.getText().concat(bouton.getText()));
        }
    }

    /**
     * Classe interne qui gère les actions des boutons d'opérations. Ajoute
     * l'opérateur sélectionné au texte du label 'res'.
     */
    class OperatorButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (res.getText().equals("ERROR")) {
                res.setText("");
            }
            JButton bouton = (JButton) e.getSource();
            res.setText(res.getText().concat(" ".concat(bouton.getText().concat(" "))));
        }
    }

    /**
     * Classe interne qui gère l'action du bouton SUPPR. Supprime le dernier
     * caractère ou symbole affiché dans 'res'.
     */
    class DeleteButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            res.setText(res.getText().substring(0, res.getText().length() - 1));
        }
    }

    /**
     * Classe interne qui gère l'action du bouton AC (réinitialisation). Efface
     * tout le contenu de 'res' pour réinitialiser la calculatrice.
     */
    class ResetButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            res.setText("");
        }
    }

    /**
     * Classe interne qui gère l'action du bouton x². Ajoute l'opération x²
     * (mise au carré) au texte de 'res'.
     */
    class CarreButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (res.getText().equals("ERROR")) {
                res.setText("");
            }
            res.setText(res.getText().concat(" ^ 2"));
        }
    }

    /**
     * Classe interne qui gère l'action du bouton x^. Ajoute l'opération de
     * puissance au texte de 'res'.
     */
    class PowerButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (res.getText().equals("ERROR")) {
                res.setText("");
            }
            res.setText(res.getText().concat(" ^ "));
        }
    }

    /**
     * Classe interne qui gère l'action du bouton EXE (exécution). Calcule
     * l'expression affichée dans 'res' et affiche le résultat.
     */
    class ExecuteButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            res.setText(calculSimple(res.getText()));
        }
    }

    /**
     * Effectue les calculs simples d'addition, soustraction, multiplication,
     * division et puissance.
     *
     * @param s L'expression à calculer.
     * @return Le résultat de l'expression.
     */
    public String calculSimple(String s) {
        double resultat;
        String[] elements = s.split(" ");  // On sépare en sous-chaines avec espace comme délimiteur
        try {
            if (elements.length == 3) {
                double nb1 = Double.parseDouble(elements[0]);
                double nb2 = Double.parseDouble(elements[2]);
                String operateur = elements[1];
                switch (operateur) {
                    case "+":
                        resultat = nb1 + nb2;
                        break;
                    case "-":
                        resultat = nb1 - nb2;
                        break;
                    case "/":
                        if (nb2 == 0) {
                            return "ERROR";  // Renvoi infinity si on ne prend pas en compte
                        }
                        resultat = nb1 / nb2;
                        break;
                    case "x":
                        resultat = nb1 * nb2;
                        break;
                    case "^":
                        resultat = Math.pow(nb1, nb2);
                        break;
                    default:
                        return "ERROR";
                }
                if (String.valueOf(resultat).length() > 13) {
                    if (resultat / Math.pow(10, 13) >= 1) {
                        int i = 13;
                        while (resultat / Math.pow(10, i) >= 10) {
                            i++;
                        }
                        resultat = resultat / Math.pow(10, i);
                        return String.valueOf(resultat).substring(0, 4) + "E" + i;
                    } else {
                        int y = 0;
                        while (resultat * Math.pow(10, y) < 1) {
                            y++;
                        }
                        resultat = resultat * Math.pow(10, y);
                        return String.valueOf(resultat).substring(0, 4) + "E-" + y;
                    }
                } else {
                    if (resultat == (int) resultat) {
                        return String.valueOf((int) resultat);
                    } else {
                        return String.valueOf(resultat);
                    }
                }
            } else {
                return "ERROR";
            }

        } catch (Exception probleme) {
            return "ERROR";
        }
    }

    /**
     * Ajoute un MouseListener pour permettre à la fenêtre de retrouver le focus
     * après un clic sur l'un des boutons.
     */
    void addMouseListener() {
        Component[] components = calc.getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Interface.this.requestFocusInWindow();
                    }
                });
            }
        }
    }

    /**
     * Charge une police personnalisée pour l'affichage de la calculatrice.
     */
    void calculatriceFont() {
        Font customFont, customFont2, customFont3, customFont4;
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Kanit-Bold.ttf")).deriveFont(Font.PLAIN, 47);
            customFont2 = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Kanit-Bold.ttf")).deriveFont(Font.PLAIN, 40);
            customFont3 = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Kanit-Bold.ttf")).deriveFont(Font.PLAIN, 20);
            customFont4 = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Kanit-Bold.ttf")).deriveFont(Font.PLAIN, 14);
        } catch (IOException | FontFormatException e) {
            // Gérer les exceptions en cas d'erreur lors du chargement de la police
            e.printStackTrace();
            customFont = new Font("Arial", Font.PLAIN, 12);
            customFont2 = new Font("Arial", Font.PLAIN, 12);
            customFont3 = new Font("Arial", Font.PLAIN, 12);// Utilisez une police de secours en cas d'échec du chargement
            customFont4 = new Font("Arial", Font.PLAIN, 12);
        }
        res.setFont(customFont);
        lab.setFont(customFont2);
        Component[] components = calc.getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                if (!button.getText().equals("SUPPR")) {
                    button.setFont(customFont3);
                } else {
                    button.setFont(customFont4);
                }
            }
        }
    }

}
