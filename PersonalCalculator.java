import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Main Class of the Program
public class PersonalCalculator {

    //double variables
    private double total1=0.0;
    private double total2=0.0;
    //char variable
    private char math_operator;

    // J Panel
    private JPanel Calculate;
    // J TextField
    private JTextField textDisplay;
    // J Buttons
    private JButton btnClear;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnMinus;
    private JButton btnSeven;
    private JButton btnDivide;
    private JButton btnEquals;
    private JButton btnEight;
    private JButton btnOne;
    private JButton btnNine;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnMultiply;
    private JButton btnBackspace;
    private JButton btnFour;
    private JButton btnZero;
    private JButton btnCredits;
    private JButton btnPositiveNegative;
    private JButton btnPercentage;
    private JButton btnSquareRoot;

    //getOperator of Java- a code that is used to perform the Operations
    private void getOperator(String btnText){
        math_operator=btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textDisplay.getText( ) );
        textDisplay.setText("");
    }

    //Main Method of the Program
    public static void main(String[] args) {
        JFrame frame = new JFrame("PersonalCalculator");
        frame.setContentPane(new PersonalCalculator().Calculate);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PersonalCalculator() {
        //Functionality of button One
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        //Functionality of button Two
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnOneText);
            }
        });
        //Functionality of button Three
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });
        //Functionality of button Four
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });
        //Functionality of button Five
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });
        //Functionality of button Six
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        //Functionality of button Seven
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });
        //Functionality of button Eight
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });
        //Functionality of button Nine
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });
        //Functionality of button Zero
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });
        //Functionality of button Point
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
                // The code will make the output neater. Instead of "." the code will make it as "0."
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                } else if (textDisplay.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                }
                btnPoint.setEnabled(true);
            }
        });
        //Functionality of button Plus
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        //Functionality of button Equals
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    //Operator Plus
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    //Operator Minus
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    //Operator Multiply
                    case 'x':
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;
                    //Operator Divide
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        //Functionality of button Clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });
        //Functionality of button Backspace
        btnBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = textDisplay.getText();
                textDisplay.setText("");
                for (int i = 0; i < string.length() - 1; i++) {
                    textDisplay.setText(textDisplay.getText() + string.charAt(i));
                }
            }
        });
        //Functionality of button Minus
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        //Functionality of button Multiply
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        //Functionality of button Divide
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
        //Functionality of button Credits
        btnCredits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Opening a new window
                if (e.getSource() == btnCredits) {
                    CreditsWindow myWindow = new CreditsWindow();
                }
            }
        });
        //Functionality of button Positive/Negative
        btnPositiveNegative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp = Double.parseDouble(textDisplay.getText());
                temp*=-1;
                textDisplay.setText(String.valueOf(temp));
            }
        });
        //Functionality of button Percentage
        btnPercentage.addActionListener(new ActionListener() {
            @Override
            // First Value (*) Second Value / 100 = New second Value (*) First Value = Answer
            public void actionPerformed(ActionEvent e) {
                Double result=total1 * (Double.parseDouble(textDisplay.getText())/100);
                textDisplay.setText(Double.toString(result));
            }
        });
        //Functionality of button Square Root
        btnSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = textDisplay.getText();
             Double result=Math.sqrt(Double.valueOf(button_text));
                textDisplay.setText(Double.toString(result));
            }
        });



    }}
