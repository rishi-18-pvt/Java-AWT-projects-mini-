import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class form{
    form(){
        Frame frame = new Frame();

        Label email = new Label("Email");
        email.setBounds(50, 130, 100, 30);
        TextField emailInput = new TextField();
        emailInput.setBounds(170, 130, 125, 25);

        Label password = new Label("Password");
        password.setBounds(50, 170, 100, 30);
        TextField passwordInput = new TextField();
        passwordInput.setBounds(170, 170, 125, 25);

        Label age = new Label("Age");
        age.setBounds(50, 210, 100, 30);
        TextField ageInput = new TextField();
        ageInput.setBounds(170, 210, 125, 25);

        Button submit = new Button("Submit");
        submit.setBounds(150, 250, 50, 30);

        ActionListener SubmitListener = new ActionListener() {
            

           
            public void actionPerformed(ActionEvent e) {
                
                System.out.println(emailInput.getText());
                System.out.println(passwordInput.getText());
                System.out.println(ageInput.getText());
            }
        };

        submit.addActionListener(SubmitListener);
       
        frame.add(email);
        frame.add(password);
        frame.add(age);
        frame.add(emailInput);
        frame.add(passwordInput);
        frame.add(ageInput);
        frame.add(submit);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(100,100);
        frame.setTitle("app");
    }

    public static void main(String[] args) {
        new form();
    }
    
}
