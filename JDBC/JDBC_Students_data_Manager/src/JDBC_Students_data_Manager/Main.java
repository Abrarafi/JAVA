package JDBC_Students_data_Manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {
	
	static JFrame f;
	static JLabel l1,l2,l3,l4,l5,ls,ol1,ol2,ol3,ol4,ol5;
	static JButton b6,search_button,save_b,delete_b,edit_b,cencel_b;
	static JPanel p1,p2,p3,p4,p5,p6,op1,op2,op3,op4,op5,op6,op7;
	static JTextField t1,t2,t3,t4,t5,ts;
	static JTextField ot1,ot2,ot3,ot4,ot5;
	
	static ResultSet result;
	static String databaseURL;
	
	static boolean search(String s)
	{
		boolean flag=false;
		try {
			Connection connection =DriverManager.getConnection(databaseURL );
			System.out.println("Connected to ms access.");
			String sql="SELECT * FROM StudentsData";
			
			Statement statement= connection.createStatement();
			result = statement.executeQuery(sql);
			
			
			
			
			while(result.next())
			{
				int id=result.getInt("StudentID");
				String str=Integer.toString(id);
				
				if(s.equals(str))
				{
					flag=true;
					break;
					
				}
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return flag;
	}
	
	public static void main(String args[])
	{
		 databaseURL = "jdbc:ucanaccess://studentData.accdb";
		
		try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
		
		f=new JFrame("Student Data");
		f.setSize(700,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(1,2));
		
		l1=new JLabel("Student ID: ");
		l2=new JLabel("Name: ");
		l3=new JLabel("Date Of Birth: ");
		l4=new JLabel("Phone: ");
		l5=new JLabel("Email: ");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		ts=new JTextField("Student ID",25);
		
		b6=new JButton("Save New");
		search_button=new JButton("Search");
		save_b = new JButton("Save");
		cencel_b=new JButton("Cencel");
		edit_b = new JButton("Edit");
		delete_b = new JButton("Delete");
		b6.setFocusable(false);
		search_button.setFocusable(false);
		save_b.setFocusable(false);
		cencel_b.setFocusable(false);
		edit_b.setFocusable(false);
		delete_b.setFocusable(false);
		
		edit_b.setVisible(false);
		delete_b.setVisible(false);
		cencel_b.setVisible(false);
		save_b.setVisible(false);
		
		
		
		p1= new JPanel(new FlowLayout());
		p2= new JPanel(new FlowLayout());
		p3= new JPanel(new FlowLayout());
		p4= new JPanel(new FlowLayout());
		p5= new JPanel(new FlowLayout());
		p6= new JPanel(new FlowLayout());
		
		p1.add(l1); p1.add(t1);
		p2.add(l2); p2.add(t2);
		p3.add(l3); p3.add(t3);
		p4.add(l4); p4.add(t4);
		p5.add(l5); p5.add(t5);
		p6.add(b6);
		
		JPanel pp1 =new JPanel(new GridLayout(6,1));
		
		
		pp1.add(p1);
		pp1.add(p2);
		pp1.add(p3);
		pp1.add(p4);
		pp1.add(p5);
		pp1.add(p6);
		Border border = BorderFactory.createLineBorder(Color.black);
		pp1.setBorder(border);
		
		ot1=new JTextField(25);
		ot2=new JTextField(25);
		ot3=new JTextField(25);
		ot4=new JTextField(25);
		ot5=new JTextField(25);
		
		ot1.setEditable(false); ot2.setEditable(false);
		ot3.setEditable(false); ot4.setEditable(false);
		ot5.setEditable(false);
		
		ol1=new JLabel("Student ID: ");
		ol2=new JLabel("Name: ");
		ol3=new JLabel("Date Of Birth: ");
		ol4=new JLabel("Phone: ");
		ol5=new JLabel("Email: ");
		
		op1= new JPanel(new FlowLayout(FlowLayout.LEFT));
		op2= new JPanel(new FlowLayout(FlowLayout.LEFT));
		op3= new JPanel(new FlowLayout(FlowLayout.LEFT));
		op4= new JPanel(new FlowLayout(FlowLayout.LEFT));
		op5= new JPanel(new FlowLayout(FlowLayout.LEFT));
		op6= new JPanel(new FlowLayout(FlowLayout.LEFT));
		op7= new JPanel(new FlowLayout());
		
		op1.add(search_button); op1.add(ts);
		op2.add(ol1); op2.add(ot1);
		op3.add(ol2); op3.add(ot2);
		op4.add(ol3); op4.add(ot3);
		op5.add(ol4); op5.add(ot4);
		op6.add(ol5); op6.add(ot5);
		op7.add(edit_b); op7.add(delete_b);op7.add(save_b);
		op7.add(cencel_b);
		
		
		JPanel pp2 = new JPanel(new GridLayout(7,1));
		
		pp2.add(op1); pp2.add(op2);
		pp2.add(op3); pp2.add(op4);
		pp2.add(op5); pp2.add(op6);
		pp2.add(op7);
		
		f.add(pp1);
		
		f.add(pp2);
		f.setVisible(true);
		
		
		b6.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						String s1,s2,s3,s4,s5;
						s1=t1.getText();
						s2=t2.getText();
						s3=t3.getText();
						s4=t4.getText();
						s5=t5.getText();
						
						try {
							Connection connection =DriverManager.getConnection(databaseURL );
							System.out.println("Connected to ms access.");
							String sql= "INSERT INTO StudentsData (StudentID,StudentName, StudentDateofBirth, MobileNumber, Email) VALUES" + "(?,?,?,?,?)";
							PreparedStatement statement = connection.prepareStatement(sql);
							
							int id=Integer.parseInt(s1);
							
							statement.setInt(1, id);
							statement.setString(2,s2);
							statement.setString(3, s3);
							statement.setString(4,s4);
							statement.setString(5, s5);
							
							
							int rows = statement.executeUpdate();
							
							if(rows>0)
							{
								System.out.println("A new Student data added");
							}
							statement.close();
							connection.close();
							
							t1.setText("");t2.setText("");
							t3.setText("");t4.setText("");
							t5.setText("");
							
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
					}
			
				}
				);
		search_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String s=ts.getText();
				boolean flag=search(s);
				if(flag==true)
				{
					edit_b.setVisible(true);
					delete_b.setVisible(true);
					try {
						ot1.setText(s);
						String name=result.getString("StudentName");
						ot2.setText(name);
						String dob=result.getString("StudentDateofBirth");
						ot3.setText(dob);
						String phone=result.getString("MobileNumber");
						ot4.setText(phone);
						String email=result.getString("Email");
						ot5.setText(email);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else ot1.setText("Sorry,No such student!");
			}
			
		});
		
		edit_b.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						save_b.setVisible(true);
						cencel_b.setVisible(true);
						edit_b.setVisible(false);
						delete_b.setVisible(false);
						ot1.setEditable(true);ot2.setEditable(true);
						ot3.setEditable(true);ot4.setEditable(true);
						ot5.setEditable(true);
						
						
					}
			
				});
		
		save_b.addActionListener(new ActionListener()
				{
					
					@Override
					public void actionPerformed(ActionEvent e) {
						save_b.setVisible(false);
						cencel_b.setVisible(false);
						String s1,s2,s3,s4,s5;
						s1=ot1.getText();
						s2=ot2.getText();
						s3=ot3.getText();
						s4=ot4.getText();
						s5=ot5.getText();
						
						try(Connection connection =DriverManager.getConnection(databaseURL) ) {
							
							String updateQuery = "UPDATE StudentsData SET StudentName = ?,StudentDateofBirth = ?, MobileNumber = ?, Email = ? WHERE StudentID = ?";
			                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
			                int id=Integer.parseInt(s1);
			                
			                updateStatement.setString(1, s2);
			                updateStatement.setString(2, s3);
			                updateStatement.setString(3, s4);
			                updateStatement.setString(4, s5);

			                // Set the value to identify the row (primary key)
			                updateStatement.setInt(5, id);

			                int rowsAffected = updateStatement.executeUpdate();
			                System.out.println("Rows affected: " + rowsAffected);
			         
							ot1.setText("");ot2.setText("");
							ot3.setText("");ot4.setText("");
							ot5.setText("");
							ot1.setEditable(false); ot2.setEditable(false);
							ot3.setEditable(false); ot4.setEditable(false);
							ot5.setEditable(false);
							
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
						
					}
					
				});
		cencel_b.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						save_b.setVisible(false);
						cencel_b.setVisible(false);
						ot1.setText("");ot2.setText("");
						ot3.setText("");ot4.setText("");
						ot5.setText("");
						ot1.setEditable(false); ot2.setEditable(false);
						ot3.setEditable(false); ot4.setEditable(false);
						ot5.setEditable(false);
					}
					
				});
		delete_b.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						edit_b.setVisible(false);
						delete_b.setVisible(false);
						ot1.setText("");ot2.setText("");
						ot3.setText("");ot4.setText("");
						ot5.setText("");
						ot1.setEditable(false); ot2.setEditable(false);
						ot3.setEditable(false); ot4.setEditable(false);
						ot5.setEditable(false);
						
						int id= Integer.parseInt(ts.getText());
						try(Connection connection =DriverManager.getConnection(databaseURL)) {
							
							String deleteq = "DELETE FROM StudentsData WHERE StudentID = ?";
							PreparedStatement preparedStatement = connection.prepareStatement(deleteq);
							preparedStatement.setInt(1,id);
							int row = preparedStatement.executeUpdate();
							if(row>0)System.out.println("row deleted:"+ row);
							
						} catch (SQLException e1) {
							
							e1.printStackTrace();
						}
					}
				
				});
			
	}

}
