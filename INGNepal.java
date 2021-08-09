import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class INGNepal extends JFrame implements ActionListener{
    public JLabel S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S25;
    public JTextField G1, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11, G12, G13, G14, G15, G16, G17, G18, G19, G20, G21;
    public JButton Btn1, Btn2,Btn3, Btn4, Btn5, Btn6, Btn7;
    public JComboBox co1, co2;
    ArrayList<StaffHire> list=new ArrayList<StaffHire>();
    PartTimeStaffHire part;
    FullTimeStaffHire full;
   
    //default constructor
    public INGNepal() {
        JFrame frame=new JFrame();
        //instance creation
        S1 = new JLabel("Vacancy Number:");
        S2 = new JLabel("Salary:");
        S3 = new JLabel("Designation:");
        S4 = new JLabel("Working Hour:");
        S5 = new JLabel("Vacancy Number:");
        S6 = new JLabel("Staff Name:");
        S7 = new JLabel("Qualification:");
        S8 = new JLabel("Appoinded By:");
        S9 = new JLabel("Joined Date:");
        S10= new JLabel("Vacancy Number:");
        S11= new JLabel("Vacancy Number");
        S12= new JLabel("Shift");
        G1= new JTextField("");
        G2 = new JTextField("");
        G3 = new JTextField("");
        G4 = new JTextField("");
        G5 = new JTextField("");
        G6 = new JTextField("");
        G7 = new JTextField("");
        G8 = new JTextField("");
        G9 = new JTextField("");
       
        Btn1 = new JButton("Add FullTime Vacancy");
        Btn2= new JButton("Appoint FullTime Staff");
        Btn3 = new JButton("Add PartTime Vacancy");
        Btn4 = new JButton("Appoint PartTime Staff");
        Btn5 = new JButton("Terminate");
        Btn6 = new JButton("Clear");
        Btn7 = new JButton("Display");
        
        String a[] = {"FullTime", "PartTime"};
        co1 = new JComboBox(a);
        String z[] = {"FullTime", "PartTime"};
        co2 = new JComboBox(z);
        S13 = new JLabel("Designation:");
        S14 = new JLabel("Wages Per Hour:");
        S15 = new JLabel("Vacancy Number");
        S16 = new JLabel("Staff Name:");
        S17 = new JLabel("Qualification:");
        S18 = new JLabel("Appoint By:");
        S19 = new JLabel("Joined Date:");
        S20 = new JLabel("Job Type:");
        S21 = new JLabel("Working Hour:");
        S22 = new JLabel("Joined Date:");
        S23 = new JLabel("Full time staff hire:");
        S24 = new JLabel("Part Time Staff Hire:");
        S25 = new JLabel("Working Hour:");
        G10 = new JTextField("");
        G11 = new JTextField("");
        G12 = new JTextField("");
        G13 = new JTextField("");
        G14 = new JTextField("");
        G15 = new JTextField("");
        G16 = new JTextField("");
        G17 = new JTextField("");
        G18 = new JTextField("");
        G19 = new JTextField("");
        G20 = new JTextField("");
        G21 = new JTextField("");
        //working on frame
        frame.setLayout(null);
        frame.setSize(1200, 1000);
        frame.setTitle("Login here");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //create location
        S23.setBounds(290, 10, 160, 45);
        frame.add(S23);
        S1.setBounds(10, 60, 110, 35);
        frame.add(S1);
        G1.setBounds(130, 60, 100, 35);
        frame.add(G1);
        S3.setBounds(250, 60, 100, 35);
        frame.add(S3);
        G3.setBounds(330, 60, 100, 35);
        frame.add(G3);
        S25.setBounds(450, 60, 100, 35);
        frame.add(S25);
        co1.setBounds(530, 60, 100, 35);
        frame.add(co1);
        S2.setBounds(10, 120, 100, 35);
        frame.add(S2);
        G2.setBounds(120, 120, 100, 35);
        frame.add(G2);
        S4.setBounds(240, 120, 100, 35);
        frame.add(S4);
        G4.setBounds(330, 120, 100, 35);
        frame.add(G4);
        Btn1.setBounds(450, 120, 190, 35);
        frame.add(Btn1);
        S5.setBounds(10, 170, 100, 35);
        frame.add(S5);
        G5.setBounds(120, 170, 100, 35);
        frame.add(G5);
        S6.setBounds(240, 170, 100, 35);
        frame.add(S6);
        G6.setBounds(330, 170, 100, 35);
        frame.add(G6);
        S9.setBounds(440, 170, 100, 35);
        frame.add(S9);
        G9.setBounds(530, 170, 100, 35);
        frame.add(G9);
        S7.setBounds(10, 215, 100, 35);
        frame.add(S7);
        G7.setBounds(120, 215, 100, 35);
        frame.add(G7);
        S8.setBounds(225, 215, 100, 40);
        frame.add(S8);
        G8.setBounds(330, 215, 100, 40);
        frame.add(G8);
        Btn2.setBounds(450, 215, 180, 35);
        frame.add(Btn2);
        S24.setBounds(300, 300, 150, 40);
        frame.add(S24);
        S10.setBounds(10, 350, 100, 35);
        frame.add(S10);
        G10.setBounds(120, 350, 100, 35);
        frame.add(G10);
        S13.setBounds(250, 350, 100, 30);
        frame.add(S13);
        G13.setBounds(335, 350, 100, 30);
        frame.add(G13);
        S20.setBounds(450, 350, 100, 35);
        frame.add(S20);
        co2.setBounds(520, 350, 100, 30);
        frame.add(co2);
        S12.setBounds(10, 400, 100, 30);
        frame.add(S12);
        G12.setBounds(120, 400, 100, 30);
        frame.add(G12);
        S14.setBounds(235, 400, 100, 35);
        frame.add(S14);
        G14.setBounds(335, 400, 100, 40);
        frame.add(G14);
        S25.setBounds(445,400,100,40);
        frame.add(S25);
        G20.setBounds(545,400,90,40);
        frame.add(G20);
        Btn3.setBounds(638, 400, 180, 40);
        frame.add(Btn3);
        S15.setBounds(10, 450, 100, 35);
        frame.add(S15);
        G15.setBounds(120, 450, 100, 35);
        frame.add(G15);
        S16.setBounds(240, 450, 100, 35);
        frame.add(S16);
        G16.setBounds(335, 450, 100, 40);
        frame.add(G16);
        S19.setBounds(440, 450, 100, 40);
        frame.add(S19);
        G19.setBounds(530, 450, 100, 30);
        frame.add(G19);
        S17.setBounds(10, 540, 100, 35);
        frame.add(S17);
        G17.setBounds(120, 500, 100, 35);
        frame.add(G17);
        S18.setBounds(230, 500, 100, 35);
        frame.add(S18);
        G18.setBounds(335, 500, 110, 35);
        frame.add(G18);
        Btn4.setBounds(450, 500, 190, 40);
        frame.add(Btn4);
        S11.setBounds(10, 500, 170, 40);
        frame.add(S11);
        G11.setBounds(140, 550, 80, 40);
        frame.add(G11);
        Btn5.setBounds(280, 550, 100, 40);
        frame.add(Btn5);
        Btn6.setBounds(10, 605, 90, 55);
        frame.add(Btn6);
        Btn7.setBounds(355, 605, 90, 55);
        frame.add(Btn7);
          Btn1.addActionListener(this);
          Btn2.addActionListener(this);
          Btn3.addActionListener(this);
          Btn4.addActionListener(this);
          Btn5.addActionListener(this);
          Btn6.addActionListener(this);
          Btn7.addActionListener(this);
        }
       public static void main(String[] args) {
        new INGNepal();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Btn1){
            int vacancy,slary,workingHrs;
            String designation,jobType;
            boolean check;
            try{
            vacancy=Integer.parseInt(G1.getText());
            slary=Integer.parseInt(G2.getText());
            designation=G3.getText();
            jobType=co1.getSelectedItem().toString();
            workingHrs=Integer.parseInt(G4.getText());
            check=false;
            for(StaffHire var:list) {
        if(var.getVacancyNumber()==vacancy){
            check=true;
            break;
            }
        }
    if(check==false){
                 full=new FullTimeStaffHire(vacancy,designation,jobType,slary,workingHrs);
                list.add(full);
                 JOptionPane.showMessageDialog(null,"vacancy is added sucesfully "+list.size());
                }else{
                     JOptionPane.showMessageDialog(null,"The given vacancy number is already in  list. "+list.size());
                    }
        }
        catch(Exception exp){
            JOptionPane.showMessageDialog(null,"Please enter all the fields");
        }
        }
       if(e.getSource()==Btn2){
       try{
           int vacancynum=Integer.parseInt(G5.getText());
           String name=G6.getText();
           String qualification=G7.getText();
           String joiningDate=G9.getText();
           String appointBy=G8.getText();
           boolean vancynofound=false;
           for(StaffHire oo: list){
                if(oo.getVacancyNumber()==vacancynum){
                    vancynofound=true;
                    if(oo instanceof FullTimeStaffHire){
                        FullTimeStaffHire full=(FullTimeStaffHire)oo;
                        if(full.getJoined() ==true){;
                        JOptionPane.showMessageDialog(null,"The staff is already appointed.");
                    } 
                    else{
                        full.hireFullTimeStaff(name, joiningDate, qualification, appointBy);
                         JOptionPane.showMessageDialog(null,"The staff is successfully appointed.");
                        break;
                    }
                }else{
                JOptionPane.showMessageDialog(null,"Not for full time staffHire");
                }
              }
           }
           if(!vancynofound){
            JOptionPane.showMessageDialog(null,"The invalid vacancy entered");
            }
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,"Please enter all the fields");
        }
    }
    if(e.getSource()==Btn3){
            int vacancynum,workingHour,wagesPerHour;
            String designation,jobType,shift;
            boolean check33;
            try{
                vacancynum=Integer.parseInt(G10.getText());
                  designation=G13.getText();
                  jobType=co2.getSelectedItem().toString();
                  workingHour=Integer.parseInt(G21.getText());
                  wagesPerHour=Integer.parseInt(G14.getText());
                  shift=G12.getText();
                 check33=false;
                 for(StaffHire obj1: list){
                 if(obj1.getVacancyNumber()==vacancynum){
                 check33=true;
                 break;
                   }
            }
            if(check33==false){
                 part=new PartTimeStaffHire(vacancynum,designation,jobType,workingHour,wagesPerHour,shift);
                list.add(part);
                 JOptionPane.showMessageDialog(null,"vacancy is  added "+list.size());
                }else{
                     JOptionPane.showMessageDialog(null,"Entered vacancy number is already in list. "+list.size());
                    }
            }catch(Exception exe){
                        JOptionPane.showMessageDialog(null,"Please Enter all  fields");
            }
       }
    if(e.getSource()==Btn4){
    try{
       int vacancyNum=Integer.parseInt(G15.getText());
       String staffName=G16.getText();
       String joiningDate=G19.getText();
       String qualification=G17.getText();
       String appointBy=G18.getText();
       boolean checkvacnum=false;
       for(StaffHire ob:list){
                if(ob.getVacancyNumber()==vacancyNum){
                    checkvacnum=true;
                    if(ob instanceof PartTimeStaffHire){
                     part=(PartTimeStaffHire)ob;
                    if(part.getjoined()==true){
                        JOptionPane.showMessageDialog(null,"Staff is already appointed.");
                    }else{
                    part.hirePartTimeStaff(staffName, joiningDate, qualification,appointBy);
                    JOptionPane.showMessageDialog(null,"Staff is successfully appointed.");
                    break;
                } 
                }else{
                     JOptionPane.showMessageDialog(null,"Not for partTime staff appointed");
                    break;
                }
            }
        }
        if(!checkvacnum){
            JOptionPane.showMessageDialog(null,"The invalid vacancy");
        }
    }
    catch(Exception exe){
    JOptionPane.showMessageDialog(null,"please Enter all the fields");
        }
    }
    if(e.getSource()==Btn5){
        try{
        int vNum=Integer.parseInt(G11.getText());
        boolean check=false;
        for(StaffHire oj:list){
            if(oj.getVacancyNumber()==vNum){
                    if(oj instanceof PartTimeStaffHire){
                         part=(PartTimeStaffHire)oj;
                        if(part.getTerminated()==false){
                        part.terminatePartTimeStaff();
                        JOptionPane.showMessageDialog(null,"The staff is terminated");
                        part.setTerminated(true);
                        break;
                         }else{
                            JOptionPane.showMessageDialog(null,"staff is already terminated");
                            break;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"The part time object is  does not match ");
                        break;
                    }
            }else{
            JOptionPane.showMessageDialog(null,"The vacnacy number is  does not match");
            }
        }
        }catch(Exception exe){
          JOptionPane.showMessageDialog(null,"Please enter all  fields");  
        }
       } 
    if(e.getSource()==Btn7){
        for(StaffHire st: list){
            if(st instanceof FullTimeStaffHire){
                FullTimeStaffHire ff=(FullTimeStaffHire)st;
                ff.display();
            }
            if(st instanceof PartTimeStaffHire){
             part=(PartTimeStaffHire)st;
            part.display();
            }
        }
    }
    if(e.getSource()==Btn6){
           G1.setText("");
           G2.setText("");
           G3.setText("");
           G4.setText("");
           G5.setText("");
           G6.setText("");
           G7.setText("");
           G8.setText("");
           G9.setText("");
           G10.setText("");
           G11.setText("");
           G12.setText("");
           G13.setText("");
           G14.setText("");
           G15.setText("");
           G16.setText("");
           G17.setText("");
           G18 .setText("");
           G19.setText("");
           G20.setText("");
           G21.setText("");
    }
    }
}
    
