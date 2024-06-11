import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EH {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Biodata Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        // Create form fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();
        
        JLabel genderLabel = new JLabel("Gender:");
        JTextField genderField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField();

        // Create Save button
        JButton saveButton = new JButton("Save");

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(genderLabel);
        frame.add(genderField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(new JLabel()); // Placeholder for layout
        frame.add(saveButton);

        // Add action listener to the Save button
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve data from form fields
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = genderField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                
                // Print the data to the console
                System.out.println("Biodata:");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
                System.out.println("Email: " + email);
                System.out.println("Phone: " + phone);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
