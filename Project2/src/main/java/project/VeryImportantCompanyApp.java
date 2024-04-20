package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VeryImportantCompanyApp {
    private JPanel panel1;
    private JButton updateButton;

    private VeryImportantCompany client;

    private String selectedDoorStatus;
    private int selectedDoorId;
    private String selectedWindowStatus;
    private int selectedWindowId;
    private String[] doorStates, windowStates;

    public VeryImportantCompanyApp() {
        try { this.client = new VeryImportantCompany(); }
        catch(Exception e){
            System.out.println("Couldn't connect");
        }

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*client.updateData(doorStates, windowStates);
                doorStatus.setText(client.getDoorData(selectedDoorId));
                windowStatus.setText(client.getWindowData(selectedWindowId));*/
                System.out.println("Updating...");
                String[][] data = client.updateData();
                for(int i = 0; i < 2; i++){

                    System.out.println(data[0][i]);
                    System.out.println(data[1][i]);
                }

                System.out.println("\n");
            }
        });
    }

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("VeryImportantCompanyApp");
        //client = new VeryImportantCompany();
        frame.setContentPane(new VeryImportantCompanyApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        //frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

}
