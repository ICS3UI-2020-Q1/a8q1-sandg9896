import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables 
  JPanel mainPanel;

  JTextField printNameInput;

  JLabel greetName;

  JButton sayHello;

  JTextArea outputArea;
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Hello GUI");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    // initialize the main JPanel
   mainPanel = new JPanel();
   // turn on the manual layouts
   mainPanel.setLayout(null);
   // add the panel to the JFrame to see it
   frame.add(mainPanel);

   // initialize the JTextField
   printNameInput = new JTextField();
   // set the location and size of the input fields
   printNameInput.setBounds(300, 10, 200, 30);
   // add the inputs to the main panel
   mainPanel.add(printNameInput);

   // initialize the JButtons
   outputArea = new JTextArea();
   outputArea.setBounds(300,60,200,30);

   // disable the textAreas so that the user can't type in them
   outputArea.setEnabled(false);

   // create button which will greet user once pressed
   sayHello = new JButton("Say Hello");
   sayHello.setActionCommand("sayHello");
   sayHello.addActionListener(this);
   // set location of button
   sayHello.setBounds(300,110,200,30);
   // add button to main panel
   mainPanel.add(sayHello);
   mainPanel.add(outputArea);

  }


   // method called when a button is pressed
   public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    if(command.equals("sayHello")){
      // get text from each text boxes
      String name = printNameInput.getText();
      // print out name along with greeting
      outputArea.setText("Hello " + name);
    }

  }

  // Main method to start our program
   public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
   }
  }
 


