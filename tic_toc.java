package tic_toc;

import java.awt.*;
import java.awt.event.*;
class tic_toc1 extends Frame implements ActionListener
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Label l1,l2,l3,l4,l5,l6,l7;
    int t=1;
    int n =0, m =0;
    tic_toc1()
    {
        b1=new Button();
        b2=new Button();
        b3=new Button();
        b4=new Button();
        b5=new Button();
        b6=new Button();
        b7=new Button();
        b8=new Button();
        b9=new Button();
        l1=new Label("Player 1");
        l2=new Label("");
        l3=new Label("Player 2");
        l4=new Label("");
        l5=new Label("");
        l6=new Label("");
        l7=new Label("");
        add(b1);
        add(b2);
        add(b3);
        add(l1);
        add(b4);
        add(b5);
        add(b6);
        add(l3);
        add(l2);
        add(l6);
        add(b7);
        add(b8);
        add(b9);
        add(l4);
        add(l7);
        add(l5);
        setLayout(null);
        b1.setBounds(130,70,80,40);
        b2.setBounds(210,70,80,40);
        b3.setBounds(290,70,80,40);
        l1.setBounds(40,110,80,40);
        b4.setBounds(130,110,80,40);
        b5.setBounds(210,110,80,40);
        b6.setBounds(290,110,80,40);
        l3.setBounds(380,110,80,40);
        l2.setBounds(35,150,10,40);
        l6.setBounds(43,150,77,40);
        b7.setBounds(130,150,80,40);
        b8.setBounds(210,150,80,40);
        b9.setBounds(290,150,80,40);
        l4.setBounds(375,150,10,40);
        l7.setBounds(383,150,80,40);
        l5.setBounds(210,200,80,60);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==b1) {
            if (b1.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b1.setLabel("*");
                } else {
                    b1.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b2) {
            if (b2.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b2.setLabel("*");
                } else {
                    b2.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b3) {
            if (b3.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b3.setLabel("*");
                } else {
                    b3.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b4) {
            if (b4.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b4.setLabel("*");
                } else {
                    b4.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b5) {
            if (b5.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b5.setLabel("*");
                } else {
                    b5.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b6) {
            if (b6.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b6.setLabel("*");
                } else {
                    b6.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b7) {
            if (b7.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b7.setLabel("*");
                } else {
                    b7.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b8) {
            if (b8.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b8.setLabel("*");
                } else {
                    b8.setLabel("O");
                }
                t++;
            }
        }
        if(e.getSource()==b9) {
            if (b9.getLabel().length() == 0) {
                if (t % 2 == 1) {
                    b9.setLabel("*");
                } else {
                    b9.setLabel("O");
                }
                t++;
            }
        }
        String a=b1.getLabel();
        String b=b2.getLabel();
        String c=b3.getLabel();
        String d=b4.getLabel();
        String e1=b5.getLabel();
        String f=b6.getLabel();
        String g=b7.getLabel();
        String h=b8.getLabel();
        String i=b9.getLabel();
        if(a.length()!=0 && b.length()!=0 && c.length()!=0)
        {
            if(a.equals(b) && a.equals(c))
            {
                if(a.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }
        if(a.length()!=0 && e1.length()!=0 && i.length()!=0)
        {
            if(a.equals(e1) && a.equals(i))
            {
                if(a.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }
        if(a.length()!=0 && d.length()!=0 && g.length()!=0)
        {
            if(a.equals(d) && a.equals(g))
            {
                if(a.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }
        if(b.length()!=0 && e1.length()!=0 && h.length()!=0)
        {
            if(b.equals(e1) && b.equals(h))
            {
                if(b.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }
        if(d.length()!=0 && e1.length()!=0 && f.length()!=0)
        {
            if(d.equals(e1) && d.equals(f))
            {
                if(d.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }
        if(c.length()!=0 && e1.length()!=0 && g.length()!=0)
        {
            if(c.equals(e1) && c.equals(g))
            {
                if(c.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }
        if(g.length()!=0 && h.length()!=0 && i.length()!=0)
        {
            if(g.equals(h) && g.equals(i))
            {
                if(g.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }
        if(c.length()!=0 && f.length()!=0 && i.length()!=0)
        {
            if(c.equals(f) && c.equals(i))
            {
                if(c.equals("*"))
                {
                    n=n+1;
                    l2.setText(n+"");
                }
                else
                {
                    m = m +1;
                    l4.setText(m+"");
                }
                Restart();
            }
        }

        if(n==3)
        {
            l6.setText("Winner");
            l2.setText("");
            l4.setText("");
            l5.setText("");
            n=0;
            m=0;
            Restart();
        }
        if(m==3)
        {
            l7.setText("Winner");
            l2.setText("");
            l4.setText("");
            l5.setText("");
            n=0;
            m=0;
            Restart();
        }
        if (t%2==0)
        {
            l5.setText("");
            l6.setText("");
            l7.setText("");
        }
        if(t==10)
        {
            n=0;
            m=0;
            l5.setText("Match Draw");
            l2.setText("");
            l4.setText("");
            l6.setText("");
            l7.setText("");
            Restart();
        }
    }
    void Restart()
    {
        b1.setLabel("");
        b2.setLabel("");
        b3.setLabel("");
        b4.setLabel("");
        b5.setLabel("");
        b6.setLabel("");
        b7.setLabel("");
        b8.setLabel("");
        b9.setLabel("");
        t=1;
    }
}
public class tic_toc{
    public static void main(String[] args)
    {
        tic_toc1 d=new tic_toc1();
        d.setSize(500,280);
        d.setVisible(true);
    }
}
