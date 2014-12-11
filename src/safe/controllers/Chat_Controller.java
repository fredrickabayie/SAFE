/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safe.controllers;

/**
 * Import from java directories
 */
import java.io.*;
import java.net.*; 
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import safe.views.Chat_View;
//import safe.views.Chat_View.

/**
 *
 * @author Abayie Fredrick
 */
public class Chat_Controller {
  private DataInputStream  inputFromClient;
  private DataOutputStream outputToClient;
  ServerSocket serversocket;
  Socket socket;
  Chat_View chat_view;
  ServerSocket server_socket;
  ActionListener actionListener;
  
  /**
   * Constructor for the class
     * @param chat_view
   */
  public Chat_Controller (Chat_View chat_view ){
      this.chat_view = chat_view;
      chatButton();
  }
  
  /**
   * Method to establish a connection
     * @return 
   */
  public boolean establishConnection(){
      try{
          System.out.println("testing connection");
         server_socket = new ServerSocket (8001);
         socket = server_socket.accept();
         System.out.println(socket.toString());
         System.out.println("before catch Connection established");
      }
      catch(Exception e){
          System.out.println("Error connection "+e.toString());
      }
      System.out.println("after catch Connection established");
      return true;
  }
  
  /**
   * Method to receive messages
   */
  public void receiveMessage(){
      try{
      inputFromClient = new DataInputStream ( socket.getInputStream());
      outputToClient = new DataOutputStream( socket.getOutputStream()); 
      
      do{
          String text = inputFromClient.readUTF();
          System.out.println(text);
        chat_view.setList(text + '\n'); 
      }while(establishConnection()==true);
       }
      catch(Exception e){
          System.out.println(e.toString());
      }
  }
  
  /**
 * method to handle buttons pressed
 */
public void chatButton (){
try
{
    actionListener = (ActionEvent e) -> {
        if(e.getSource().equals(chat_view.getSend())){
            send();
        }
        
        if(e.getSource().equals(chat_view.getConnect())){
            establishConnection();
            receiveMessage();
        }
    };
    chat_view.getSend().addActionListener ( actionListener );
    chat_view.getSend().addActionListener ( actionListener );
            }
catch(Exception ex){
    System.out.println(ex.toString());
            }
}
  
/**
 * Method to send messages
 */
public void send(){
   try{
     String text = chat_view.getMessage().trim();
       chat_view.setList(text + '\n'); 
       outputToClient.writeUTF(text);
       outputToClient.flush();
      }
     catch(Exception ex){
        System.out.println(ex.toString());
      }
}
  
  
//  public static void main (String []args){
//      Chat_View chat_view = new Chat_View();
//      Chat_Controller chat = new Chat_Controller(chat_view);
//      chat.establishConnection();
//  }
  
}


//public class Chat_Controller extends JFrame
//{
//  
//  // Text field for receiving radius
//  private JTextField jtf = new JTextField(); 
//  // Text area for displaying contents 
//  private JTextArea jta = new JTextArea();
//  JPanel p;
//  //IO streams
//  private DataInputStream  inputFromClient;
//  private DataOutputStream outputToClient;
//  
//  public static void main(String[] args) 
//  { 
//    new Chat_Controller();
//  } 
//  
//  public Chat_Controller() 
//  {
//    p = new JPanel(); 
//    p.setLayout(new BorderLayout()); 
//    
//    p.add(new JLabel("Enter Message"), BorderLayout.WEST); 
//    p.add(jtf, BorderLayout.CENTER); 
//    
//    jtf.setHorizontalAlignment(JTextField.RIGHT); 
//    setLayout(new BorderLayout()); 
//    add(p, BorderLayout.NORTH); 
//    
//    add(new JScrollPane(jta), BorderLayout.CENTER);
//    jtf.addActionListener(new here()); 
//    setTitle("Server"); 
//    setSize(500, 300); 
//    
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setVisible(true); // It is necessary to show the frame here! 
//    
//    try 
//    { 
//      
//      // Create a server socket 
//      ServerSocket serverSocket = new ServerSocket ( 8001 );
//      jta.append("Server started at " + new Date() + '\n');
//      
//      // Listen for a connection request 
//      Socket socket = serverSocket.accept();
//      
//      // Create data input and output streams
//       inputFromClient = new DataInputStream( socket.getInputStream()); 
//       outputToClient = new DataOutputStream( socket.getOutputStream()); 
//      
//      while (true) 
//      { 
//        String text = inputFromClient.readUTF();
//        
////        // Receive radius from the client 
////        String text = inputFromClient.readUTF ();
////        // Compute area 
////        String word = "Server Reseived The Message";
////        // Send area back to the client 
////        outputToClient.writeUTF(word);
//        jta.append( text + '\n'); 
//////        jta.append("Message found: " + word+ '\n'); 
//      } 
//    }
//    catch(IOException ex) {
////      System.err.println(ex); 
//      jta.append(ex.toString()+'\n');
//    }  
//  }
//  
//  private class here implements ActionListener
//  {
//    public void actionPerformed(ActionEvent e) 
//    { 
//      try 
//      { 
//        // Get the radius from the text field 
//        String text = jtf.getText().trim(); 
//         // Send the radius to the server 
//        outputToClient.writeUTF (text);
//        outputToClient.flush ();
//        // Get area from the server
////        String word =  inputFromClient.readUTF (); 
//        // Display to the text area 
////        jta.append("Message is " + text + "\n"); 
////        jta.append(word ); 
//        jtf.setText("");
//      } 
//      catch (IOException ex)
//      { 
//        System.err.println(ex); 
//      }
//    } 
//  }
//    
//}
 


//  public void connect(){
//   try 
//    { 
//      
//      // Create a server socket 
//      ServerSocket serverSocket = new ServerSocket ( 8001 );
//      chat_view.setTime("Last Seen " + new Date() + '\n');
//      
//      // Listen for a connection request 
//      Socket socket = serverSocket.accept();
//      
//      // Create data input and output streams
//       inputFromClient = new DataInputStream( socket.getInputStream()); 
//       outputToClient = new DataOutputStream( socket.getOutputStream()); 
//      
//      while (true) 
//      { 
//        String text = inputFromClient.readUTF();
//        
////        // Receive radius from the client 
////        String text = inputFromClient.readUTF ();
////        // Compute area 
////        String word = "Server Reseived The Message";
////        // Send area back to the client 
////        outputToClient.writeUTF(word);
//        jta.append( text + '\n'); 
//////        jta.append("Message found: " + word+ '\n'); 
//      } 
//    }
//    catch(IOException ex) {
////      System.err.println(ex); 
//      jta.append(ex.toString()+'\n');
//    }  
//  }
  
  //  private class here implements ActionListener
//  {
//    public void actionPerformed(ActionEvent e) 
//    { 
//      try 
//      { 
//        // Get the radius from the text field 
//        String text = jtf.getText().trim(); 
//         // Send the radius to the server 
//        outputToClient.writeUTF (text);
//        outputToClient.flush ();
//        // Get area from the server
////        String word =  inputFromClient.readUTF (); 
//        // Display to the text area 
////        jta.append("Message is " + text + "\n"); 
////        jta.append(word ); 
//        jtf.setText("");
//      } 
//      catch (IOException ex)
//      { 
//        System.err.println(ex); 
//      }
//    } 
//  }