package ADPAssignment1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class App implements ActionListener
{

    JFrame jf = new JFrame("test");
    JButton btnred = new JButton("red");
    JButton btnblue = new JButton("blue");
    JButton btnread = new JButton("read");
    JButton btnexit = new JButton("exit");

    JTextArea txtarea = new JTextArea();


    JRadioButton rbtngreen = new JRadioButton("green");
    JRadioButton rbtnyellow = new JRadioButton("yellow");

    ButtonGroup bg = new ButtonGroup();

    JTextField txtinput = new JTextField();



    String country[]={"red","blue","green","yellow","orange"};
    Color colors[]={Color.red,Color.blue,Color.green,Color.yellow,Color.orange}; //colour mapping for country array
    JComboBox cbox = new JComboBox(country);



    JLabel lbl1 = new JLabel("RadioButton");
    JLabel lbl2 = new JLabel("TextField");
    JLabel lbl3 = new JLabel("ComboBox");


    public App()
    {
        setframeState();
        addComponents();
    }


    public void setframeState()
    {
        jf.setSize(600,500);
        jf.setResizable(false);
        jf.setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();

        int w = jf.getSize ().width;
        int h = jf.getSize ().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        jf.setLocation (x, y);


    }


    public void addComponents()
    {
        jf.setLayout(null);

        btnred.setBounds(90, 400, 90, 50);
        jf.add(btnred);
        btnred.addActionListener(this);

        btnblue.setBounds(200, 400, 90, 50);
        jf.add(btnblue);
        btnblue.addActionListener(this);

        btnread.setBounds(310, 400, 90, 50);
        jf.add(btnread);
        btnread.addActionListener(this);

        btnexit.setBounds(420, 400, 90, 50);
        jf.add(btnexit);
        btnexit.addActionListener(this);

        lbl1.setBounds(20, 10, 70, 20);
        jf.add(lbl1);
        lbl2.setBounds(20, 150, 70, 20);
        jf.add(lbl2);
        lbl3.setBounds(20, 220, 70, 20);
        jf.add(lbl3);

        rbtngreen.setBounds(20, 50, 70, 20);
        jf.add(rbtngreen);
        rbtngreen.addActionListener(this);

        rbtnyellow.setBounds(20, 90, 70, 20);
        jf.add(rbtnyellow);
        rbtnyellow.addActionListener(this);

        bg.add(rbtngreen);
        bg.add(rbtnyellow);

        txtinput.setBounds(20, 180, 90, 30);
        jf.add(txtinput);
        txtinput.addActionListener(this);

        cbox.setBounds(20, 250, 90, 30);
        jf.add(cbox);
        cbox.addActionListener(this);

        txtarea.setBounds(200, 15, 350, 285);
        jf.add(txtarea);
        txtarea.setBackground(Color.black);


    }

    public void actionPerformed(ActionEvent e)
    {

        if(txtinput == e.getSource())
        {
            String text = txtinput.getText();
            txtarea.setText(text);
        }

        if(rbtnyellow == e.getSource())
        {
            txtarea.setBackground(Color.yellow);
            JOptionPane.showMessageDialog(null,"you pressed " + e.getActionCommand());
        }

        if(rbtngreen == e.getSource())
        {
            txtarea.setBackground(Color.green);
            JOptionPane.showMessageDialog(null,"you pressed " + e.getActionCommand());
        }

        if(btnred == e.getSource())
        {
            txtarea.setBackground(Color.red);
            JOptionPane.showMessageDialog(null,"you pressed " + e.getActionCommand());
        }

        if(btnblue == e.getSource())
        {
            txtarea.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"you pressed " + e.getActionCommand());
        }

        if(btnexit == e.getSource())
        {
            System.exit(0);
        }

        if(cbox == e.getSource())
        {
            txtarea.setBackground(colors[Arrays.asList(country).indexOf(cbox.getSelectedItem())]);
            JOptionPane.showMessageDialog(null,"you pressed " + e.getActionCommand());
        }

        if(btnread == e.getSource())
        {
            JOptionPane.showMessageDialog(null,"you pressed " + e.getActionCommand());
            txtarea.setBackground(Color.blue);
        }

    }


    public static void main (String[]args)
    {
        new App();
    }



}
