/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oodj_assignment;

import com.oodj_assignment.UI.Booking;
import com.oodj_assignment.UI.CustomerMenu;
import com.oodj_assignment.UI.Payment;
import com.oodj_assignment.helper.IdGenerator;
import com.oodj_assignment.helper.RecordReader;
import com.oodj_assignment.helper.RecordWriter;
import com.oodj_assignment.validation.UserValidator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jackson
 */
public class Customer extends User {

    private String username;
    private String phoneNum;
    
    public Customer() {
        super();
        this.username = null;
        this.phoneNum = null;
    }
    
    public Customer(String userID, String email, String username, String phoneNum, 
            String password) throws Exception {
        try {
            UserValidator.validateCredential(email, password);
        } catch (Exception e) {
            throw e;
        }
        this.userID = userID;
        this.email = email;
        this.username = username;
        this.phoneNum = phoneNum;
        this.password = password; 
    }
    
    public void setUsername(String username) {
        try {
            UserValidator.validateUsername(username.trim());
        } catch (IllegalArgumentException e) {
            throw e;
        }
        this.username = username;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setPhoneNum(String phoneNum) {
        try {
            UserValidator.validatePhoneNum(phoneNum.trim());
        } catch (IllegalArgumentException e) {
            throw e;
        }
        this.phoneNum = phoneNum;
    }
    
    public String getPhoneNum() {
        return this.phoneNum;
    }

    @Override
    public void viewMenu() {
        new CustomerMenu(this).setVisible(true);
    }
    
    public void signup(String email, String username, String phoneNum, String password, 
            String confirmPassword) throws Exception {
        try {
            UserValidator.validateEmail(email);
            UserValidator.validateUsername(username);
            UserValidator.validatePhoneNum(phoneNum);
            UserValidator.validatePassword(password); 
            if (null != userID) {
                throw new Exception("Customer has been signed up");
            } else if (confirmPassword.trim().isEmpty()) { 
                throw new Exception("Please confirm your password.");
            } else if (!confirmPassword.trim().equals(password.trim())) {
                throw new Exception("Password do not match.");
            }
        } catch (Exception e) {
            throw e;
        }
        this.userID = IdGenerator.generate("ctm-");
        this.email = email;
        this.username = username;
        this.phoneNum = phoneNum;
        this.password = password; 
        RecordWriter.write(new String[] {userID, email, username, phoneNum, password,}, "user.txt");
    }
    
    public void viewCar()
    {
        JTable bookingTable = CustomerMenu.getTable();
//        JPanel bookingPanel = CustomerMenu.getPanel();
//        bookingPanel.setVisible(true);
        DefaultTableModel tableModel = new DefaultTableModel();
        
        String[] carFields = {"Plate Number", "Model", "Colour", "Price/Day", "Status"};
        for (String carField : carFields) {
            tableModel.addColumn(carField);
        }
        String[][] carsInfo = RecordReader.readFile("car.txt");
        for (String[] carInfo : carsInfo) {
            tableModel.addRow(carInfo);
//            System.out.println(Arrays.toString(carInfo));
        }
        
        bookingTable.setModel(tableModel);
        
    }
    
    public void viewbookingHistory()
    {
        JTable bookingTable = CustomerMenu.getTable();
//        JPanel bookingPanel = CustomerMenu.getPanel();
        
//        bookingPanel.setVisible(true);
        DefaultTableModel tableModel = new DefaultTableModel();
        
        String[] carFields = {"CusID", "CarPlateNumber", "Start Date", "Return Date", "Duration", "Price/Day", "Total Price"};
        for (String carField : carFields) {
            tableModel.addColumn(carField);
        }
        
        bookingTable.setModel(tableModel);
    }
    
    public void makePayment()
    {
        new Payment(this).setVisible(true);
    }
    
    public void makeBooking()
    {
        new Booking(this).setVisible(true);
    }
    
    public static void readNumPlate (String[] payment)
    {
        String numplate = payment[1].trim();
    }
}
