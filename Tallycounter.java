import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Tallycounter extends Frame {
    TextField display;

    Button reset, increment,decrement;
     
    Tallycounter(){
        display = new TextField("0");
        display.setBounds(50, 50, 100, 30);

        increment = new Button("Increment");
        increment.setBounds(75, 100, 80, 20);

        decrement = new Button("Decrement");
        decrement.setBounds(75, 130, 80, 20);

        decrement.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
               int num = Integer.parseInt(display.getText());
               display.setText(String.valueOf(--num));
            }
            
        });
        

        increment.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
               int num = Integer.parseInt(display.getText());
               display.setText(String.valueOf(++num));
            }
            
        });

        

        reset = new Button("reset");
        reset.setBounds(75, 150, 50, 20);

        reset.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent e) {
               display.setText("0") ;
            }
            
        });

        add(display);
        add(increment);
        add(reset);
        add(decrement);

        setLayout(null);
        setSize(100,100);
        setTitle("Counter");
        setVisible(true);
    }
    public static void main(String[] args) {
        new Tallycounter();
    }
}
