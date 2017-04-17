package ultimateleague;

import java.sql.*;
import java.io.*;
import javax.swing.*;

/**
 * Ultimate League
 * @author Initech
 * Spring 2017
 */

public class UltimateLeague {
    
    public static void main(String[] args) {
     
        final String DB_URL = "jdbc:mysql://192.111.147.77:3306/ultimate_league";
        
        try{//try to connect to the database
           Connection connection = DriverManager.getConnection(DB_URL, "triad_ultimate", "a29me46DF4m8bcc");
           
           System.out.println("Connection established.");
           
           try{//try to create a statement on the connection
               Statement statement = connection.createStatement();
               System.out.println("Statement created.");
               
               //write SQL commands
               String selectAll = "select Player_ID, PassingScores, ReceivingScores INTO OUTFILE (D:/School/Scores.txt) FROM Stats";
               statement.executeQuery(selectAll);
               //retrieve data from the table and print it
               //ResultSet result = statement.executeQuery(selectAll);
               //ResultSetMetaData metaData = result.getMetaData();
               //int numberOfColumns = metaData.getColumnCount();
               
             
            //File file = new File("D:\\School\\Spring 2017\\Programming Capstone\\Project\\triad_utilmate_desktop-master\\triad_utilmate_desktop-master\\UltimateLeague\\passingyards.txt");
            
            //add string to file
            /*try 
            {   while(result.next()){
                
                try (FileWriter write = new FileWriter(file)) {
                    BufferedWriter buff = new BufferedWriter(write);
                    
                    buff.write(Integer.toString(result.getInt("Player_ID")) + ", ");
                    buff.write(Integer.toString(result.getInt("PASSINGYARDS_number")) + ", ");
                    buff.newLine();
                }
            }}
            catch (IOException ez)
            {
                System.out.println(ez);
            }*/
        
            
        }catch(SQLException ex)
            {
                System.out.println(ex);
            }
        }catch(SQLException ex)
        {
            System.out.println("Connection failed");
        }
    }      
    }
    

