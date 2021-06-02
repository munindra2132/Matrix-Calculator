import javax.swing.*;
import java.awt.Color;
import java.awt.event.*
;
public class App implements ActionListener{
    private static JFrame frame;
    private static JButton button;
    private static JLabel label1, label2, label3;
    private static double[][] firstmatrix , secondmatrix;
    private JTextField[][] Matrix1, Matrix2, Matrix3;

    // Matrix1 Matrix2 Matrix3 are the inputs from the user
    App(){
        frame = new JFrame(); //creating new frame
        frame.setTitle("Matrix Calculator"); //setting the title for the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        frame.setSize(700,500); //setting the default size 
        frame.getContentPane().setBackground(new Color(123,50,250)); //changing the background color
        
        StartOperation();
        
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private  void StartOperation(){
        //FIRST INPUT MATRIX
        label1 = new JLabel("Enter the values of Matrix 1");
        label1.setBounds(50, 30,200, 30);
        frame.add(label1);
        Matrix1 = new JTextField[3][3];
        for( int i=0; i <3 ; i++) {
            for (int j = 0; j <3; j++){
                Matrix1[i][j] = new JTextField(5);
                Matrix1[i][j].setBounds((50 + 70*i), (70 + 30*j), 50, 20); 
                frame.add(Matrix1[i][j]);
            }
        }
        //SECOND INPUT MATRIX
        label2 = new JLabel("Enter the values of Matrix 2");
        label2.setBounds(50, 180, 200 ,30);
        frame.add(label2);
        Matrix2 = new JTextField[3][3];
        for( int i=0; i <3 ; i++) {
            for (int j = 0; j <3; j++){
                Matrix2[i][j] = new JTextField(5);
                Matrix2[i][j].setBounds((50 + 70*i), (220 + 30*j), 50, 20); 
                frame.add(Matrix2[i][j]);
            }
        }
        
        //OUTPUT MATRIX
        label3 = new JLabel("Output Matrix");
        label3.setBounds(300, 120, 200 ,30);
        frame.add(label3);
        Matrix3 = new JTextField[3][3];
        for( int i=0; i <3 ; i++) {
            for (int j = 0; j <3; j++){
                Matrix3[i][j] = new JTextField(5);
                Matrix3[i][j].setBounds((300 + 70*i), (150 + 30*j), 50, 20); 
                frame.add(Matrix3[i][j]);
            }
        }
        
        button = new JButton("Multiply");
        button.setBounds( 200 , 320, 150, 30);
        frame.add(button);
        button.addActionListener(this);
    }

    public static void main(String[] args) throws Exception {  
        App matrixApp = new App();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            firstmatrix = new double[3][3];
            secondmatrix = new double[3][3];
            //taking input from GUI to 
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    String f = Matrix1[i][j].getText();
                    //Intger m = Intger.parseInt(f);
                    Matrix3[i][j].setText(f);
                }
            }
        }
    }
}
