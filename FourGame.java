import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator2 extends JFrame implements ActionListener {
    private JTextField textField;
    private JPanel panel1, panel2, panel3, panel4;
    private JFrame f1;
    private JRadioButton binaryRadioButton, decimalRadioButton, hexadecimalRadioButton;
    private ButtonGroup radioButtonGroup;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b60, b61, b62, b63, b64;
    private String s0, s1, s2;
    private double result;

    public calculator2() {
        f1 = new JFrame();
        s0 = s1 = s2 = "";
        f1.setTitle("Calculator");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f1.setSize(540, 540);
        f1.setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(6, 4, 3, 3));
        panel3.setLayout(new GridLayout(6, 1, 3, 3));
        panel4.setLayout(new GridLayout(6, 2, 3, 3));

        textField = new JTextField("");
        textField.setPreferredSize(new Dimension(500, 120));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font("Verdana", Font.BOLD, 60));
        panel1.add(textField);

        panel1.setBackground(new Color(55, 55, 55));
        panel2.setBackground(new Color(55, 55, 55));
        panel3.setBackground(new Color(55, 55, 55));
        panel4.setBackground(new Color(55, 55, 55));

        b1 = new JButton("AND");
        b1.setBackground(Color.orange);
        b1.addActionListener(this);
        panel4.add(b1);
        b2 = new JButton("A");
        b2.setBackground(Color.white);
        b2.addActionListener(this);
        panel4.add(b2);
        b3 = new JButton("OR");
        b3.setBackground(Color.orange);
        b3.addActionListener(this);
        panel4.add(b3);
        b4 = new JButton("B");
        b4.setBackground(Color.white);
        b4.addActionListener(this);
        panel4.add(b4);
        b5 = new JButton("XOR");
        b5.setBackground(Color.orange);
        b5.addActionListener(this);
        panel4.add(b5);
        b6 = new JButton("C");
        b6.setBackground(Color.white);
        b6.addActionListener(this);
        panel4.add(b6);
        b7 = new JButton("NOT");
        b7.setBackground(Color.orange);
        b7.addActionListener(this);
        panel4.add(b7);
        b8 = new JButton("D");
        b8.setBackground(Color.white);
        b8.addActionListener(this);
        panel4.add(b8);
        b9 = new JButton("NAND");
        b9.setBackground(Color.orange);
        b9.addActionListener(this);
        panel4.add(b9);
        b10 = new JButton("E");
        b10.setBackground(Color.white);
        b10.addActionListener(this);
        panel4.add(b10);
        b11 = new JButton("NOR");
        b11.setBackground(Color.orange);
        b11.addActionListener(this);
        panel4.add(b11);
        b12 = new JButton("F");
        b12.setBackground(Color.white);
        b12.addActionListener(this);
        panel4.add(b12);

        b13 = new JButton("<<");
        b13.setBackground(Color.white);
        b13.addActionListener(this);
        panel2.add(b13);
        b14 = new JButton(">>");
        b14.setBackground(Color.white);
        b14.addActionListener(this);
        panel2.add(b14);
        b15 = new JButton("C");
        b15.addActionListener(this);
        b15.setBackground(Color.white);
        b15.setBackground(Color.red);
        b15.setForeground(Color.white);
        panel2.add(b15);
        b16 = new JButton("DEL");
        b16.setBackground(Color.red);

        b16.setForeground(Color.white);
        panel2.add(b16);
        b17 = new JButton("(");
        b17.setBackground(Color.white);
        panel2.add(b17);
        b18 = new JButton(")");
        b18.setBackground(Color.white);
        b18.addActionListener(this);
        panel2.add(b18);
        b19 = new JButton("%");
        b19.setBackground(Color.white);
        b19.addActionListener(this);
        panel2.add(b19);
        b20 = new JButton("÷");
        b20.setBackground(Color.white);
        b20.addActionListener(this);
        panel2.add(b20);

        b21 = new JButton("7");
        b21.setBackground(Color.white);
        b22 = new JButton("8");
        b22.setBackground(Color.white);
        b23 = new JButton("9");
        b23.setBackground(new Color(0x5151D2));
        b60 = new JButton("*");
        b60.setBackground(Color.white);
        b24 = new JButton("4");
        b24.setBackground(Color.white);
        b25 = new JButton("5");
        b25.setBackground(Color.white);
        b26 = new JButton("6");
        b26.setBackground(Color.white);
        b61 = new JButton("-");
        b61.setBackground(Color.white);
        b27 = new JButton("1");
        b27.setBackground(Color.white);
        b28 = new JButton("2");
        b28.setBackground(Color.white);
        b29 = new JButton("3");
        b29.setBackground(Color.white);
        b62 = new JButton("+");
        b62.setBackground(Color.white);
        b30 = new JButton("0");
        b30.setBackground(Color.white);
        b31 = new JButton(".");
        b31.setBackground(Color.white);
        b63 = new JButton("=");
        b63.setBackground(Color.white);
        b64 = new JButton("");
        b64.setBackground(Color.white);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        b31.addActionListener(this);
        b60.addActionListener(this);
        b61.addActionListener(this);
        b62.addActionListener(this);
        b63.addActionListener(this);

        panel2.add(b21);
        panel2.add(b22);
        panel2.add(b23);
        panel2.add(b60);
        panel2.add(b24);
        panel2.add(b25);
        panel2.add(b26);
        panel2.add(b61);
        panel2.add(b27);
        panel2.add(b28);
        panel2.add(b29);
        panel2.add(b62);
        panel2.add(b64);
        panel2.add(b30);
        panel2.add(b31);
        panel2.add(b63);

        binaryRadioButton = new JRadioButton("Binary");
        binaryRadioButton.addActionListener(this);
        binaryRadioButton.setBackground(new Color(55, 55, 55));
        binaryRadioButton.setForeground(Color.white);
        decimalRadioButton = new JRadioButton("Decimal");
        decimalRadioButton.setSelected(true);
        decimalRadioButton.addActionListener(this);
        decimalRadioButton.setBackground(new Color(55, 55, 55));
        decimalRadioButton.setForeground(Color.white);
        hexadecimalRadioButton = new JRadioButton("Hexadecimal");
        hexadecimalRadioButton.addActionListener(this);
        hexadecimalRadioButton.setBackground(new Color(55, 55, 55));
        hexadecimalRadioButton.setForeground(Color.white);

        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(binaryRadioButton);
        radioButtonGroup.add(decimalRadioButton);
        radioButtonGroup.add(hexadecimalRadioButton);

        panel3.add(binaryRadioButton);
        panel3.add(decimalRadioButton);
        panel3.add(hexadecimalRadioButton);

        b2.setEnabled(false);
        b4.setEnabled(false);
        b6.setEnabled(false);
        b8.setEnabled(false);
        b10.setEnabled(false);
        b12.setEnabled(false);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b24.setEnabled(true);
        b25.setEnabled(true);
        b26.setEnabled(true);
        b28.setEnabled(true);
        b29.setEnabled(true);

        f1.add(panel1, BorderLayout.NORTH);
        f1.add(panel2, BorderLayout.CENTER);
        f1.add(panel3, BorderLayout.EAST);
        f1.add(panel4, BorderLayout.WEST);

        // Make sure the components are validated and repainted
        f1.revalidate();
        f1.repaint();

        f1.setVisible(true);
    }

    public void clear() {
        s0 = s1 = s2 = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() != binaryRadioButton && e.getSource() != hexadecimalRadioButton && e.getSource() != decimalRadioButton) {
            String c = e.getActionCommand();

            if ((c.charAt(0) >= '0' && c.charAt(0) <= '9') || c.charAt(0) == '.') {
                if (!s1.equals(""))
                    s2 = s2 + c;
                else
                    s0 = s0 + c;

                textField.setText(s0 + s1 + s2);
            } else if (c.charAt(0) == 'C') {
                clear();
                textField.setText(s0 + s1 + s2);
            } else if (c.charAt(0) == '=') {
                if (binaryRadioButton.isSelected()) {
                    if (s1.equals("+")) {
                        int a = Integer.parseInt(s0, 2);
                        int b = Integer.parseInt(s2, 2);
                        int binaryresult = a + b;
                        String a1 = Integer.toBinaryString(binaryresult);
                        textField.setText(s0 + s1 + s2 + "=" + a1);
                    } else if (s1.equals("AND")) {
                        int a2 = Integer.parseInt(s0) & Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a2);
                    } else if (s1.equals("OR")) {
                        int a3 = Integer.parseInt(s0) | Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a3);
                    } else if (s1.equals("XOR")) {
                        int a4 = Integer.parseInt(s0) ^ Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a4);
                    } else if (s1.equals(">>")) {
                        int a5 = Integer.parseInt(s0, 2) >> Integer.parseInt(s2, 2);
                        String a6 = Integer.toBinaryString(a5);
                        textField.setText(s0 + s1 + s2 + "=" + a6);
                    } else if (s1.equals("<<")) {
                        int a5 = Integer.parseInt(s0, 2) << Integer.parseInt(s2, 2);
                        String a6 = Integer.toBinaryString(a5);
                        textField.setText(s0 + s1 + s2 + "=" + a6);
                    }
                } else {
                    if (s1.equals("+")) {
                        result = (Double.parseDouble(s0) + Double.parseDouble(s2));
                        textField.setText(s0 + s1 + s2 + "=" + result);
                    } else if (s1.equals("-")) {
                        result = (Double.parseDouble(s0) - Double.parseDouble(s2));
                        textField.setText(s0 + s1 + s2 + "=" + result);
                    } else if (s1.equals("÷")) {
                        result = (Double.parseDouble(s0) / Double.parseDouble(s2));
                        textField.setText(s0 + s1 + s2 + "=" + result);
                    } else if (s1.equals("*")) {
                        result = (Double.parseDouble(s0) * Double.parseDouble(s2));
                        textField.setText(s0 + s1 + s2 + "=" + result);
                    } else if (s1.equals("AND")) {
                        int a1 = Integer.parseInt(s0) & Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a1);
                    } else if (s1.equals("OR")) {
                        int a3 = Integer.parseInt(s0) | Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a3);
                    } else if (s1.equals("XOR")) {
                        int a4 = Integer.parseInt(s0) ^ Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a4);
                    } else if (s1.equals(">>")) {
                        int a5 = Integer.parseInt(s0) >> Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a5);
                    } else if (s1.equals("<<")) {
                        int a5 = Integer.parseInt(s0) << Integer.parseInt(s2);
                        textField.setText(s0 + s1 + s2 + "=" + a5);
                    }
                }

                s0 = Double.toString(result);
                s1 = s2 = "";
            } else {
                if (s1.equals("") || s2.equals(""))
                    s1 = c;
                else {
                    if (s1.equals("+"))
                        result = (Double.parseDouble(s0) + Double.parseDouble(s2));
                    else if (s1.equals("-"))
                        result = (Double.parseDouble(s0) - Double.parseDouble(s2));
                    else if (s1.equals("/"))
                        result = (Double.parseDouble(s0) / Double.parseDouble(s2));
                    else
                        result = (Double.parseDouble(s0) * Double.parseDouble(s2));

                    s0 = Double.toString(result);
                    s1 = c;
                    s2 = "";
                }

                textField.setText(s0 + s1 + s2);
            }
        }

        if (e.getSource() == decimalRadioButton) {
            b2.setEnabled(false);
            b4.setEnabled(false);
            b6.setEnabled(false);
            b8.setEnabled(false);
            b10.setEnabled(false);
            b12.setEnabled(false);
            b21.setEnabled(true);
            b22.setEnabled(true);
            b23.setEnabled(true);
            b24.setEnabled(true);
            b25.setEnabled(true);
            b26.setEnabled(true);
            b28.setEnabled(true);
            b29.setEnabled(true);
        }
        if (e.getSource() == binaryRadioButton) {
            b2.setEnabled(false);
            b4.setEnabled(false);
            b6.setEnabled(false);
            b8.setEnabled(false);
            b10.setEnabled(false);
            b12.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
            b26.setEnabled(false);
            b28.setEnabled(false);
            b29.setEnabled(false);
        }
        if (e.getSource() == hexadecimalRadioButton) {
            b2.setEnabled(true);
            b4.setEnabled(true);
            b6.setEnabled(true);
            b8.setEnabled(true);
            b10.setEnabled(true);
            b12.setEnabled(true);
            b21.setEnabled(true);
            b22.setEnabled(true);
            b23.setEnabled(true);
            b24.setEnabled(true);
            b25.setEnabled(true);
            b26.setEnabled(true);
            b28.setEnabled(true);
            b29.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        new calculator2();
    }
}
