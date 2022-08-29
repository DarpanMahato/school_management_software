//import packages
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class INGCollege
{   //defining ui components
    private JFrame f;
    private JPanel pnlTitle,pnlChoose,pnlAcademic,pnlNonAcademic;
    private JButton btnAcademic,btnNonAcademic,
        btnAcAddCourse,btnAcRegister,btnNacAddCourse,btnNacRegister,btnDisplay,btnClear,btnnonDisplay,btnnonClear,btnRemove;
    private JLabel lblTitle,lblAcCourseID,lblAcCourseID2,lblAcDuration,lblLecturer,lblAcLevel,lblAcName,lblAcLeader,lblCredit,lblAcAssessments,lblAcStarting,lblAcCompletion,
        lblnonAcCourseID,lblnonAcCourseID2,lblnonAcDuration,lblnonAcPrerequisite,lblInstructor,lblExam,lblnonAcName,lblnonAcLeader,lblnonAcStarting,lblnonAcCompletion,lblnonCourseID3;
    private JTextField txtAcCourseID,txtAcCourseID2,txtAcDuration,txtLecturer,txtAcLevel,txtAcName,txtAcLeader,txtCredit,txtAcAssessments,txtAcStarting,txtAcCompletion, 
        txtnonAcCourseID,txtnonAcCourseID2,txtnonAcDuration,txtnonAcPrerequisite,txtInstructor,txtExam,txtnonAcName,txtnonAcLeader,txtnonAcStarting,txtnonAcCompletion,txtnonCourseID3;
    int txt_Duration,txt_Assessments,txt_nDuration;
    //ArrayList For Academic Course
    ArrayList<Course> academicList = new ArrayList<Course>();
    
    //ArrayList For NonAcademic Course
    ArrayList<Course> nonacademicList = new ArrayList<Course>();
    //object for nonacademic and academic
    Course Academicobj,NonAcademicobj;
    
    INGCollege()
    {
        //frame and its attributes
        f = new JFrame("ING College");
                f.setLayout(null);
                f.setSize(1200,800);
                f.setResizable(false);
                f.getContentPane().setBackground(Color.decode("#E0EAF4"));

            pnlTitle = new JPanel();
                pnlTitle.setBounds(0,0,1185,100);
                pnlTitle.setLayout(null);
                pnlTitle.setBackground(Color.decode("#E0EAF4"));
                f.add(pnlTitle);
            
            pnlChoose = new JPanel();
                pnlChoose.setBounds(0,150,1185,70);
                pnlChoose.setLayout(null);
                pnlChoose.setBackground(Color.decode("#E0EAF4"));
                f.add(pnlChoose);
            
            pnlAcademic = new JPanel();
                pnlAcademic.setBounds(40,240,1110,480);
                pnlAcademic.setLayout(null);
                f.add(pnlAcademic);
            
            pnlNonAcademic = new JPanel();
                pnlNonAcademic.setBounds(40,240,1110,480);
                pnlNonAcademic.setLayout(null);
                pnlNonAcademic.setVisible(false);
                f.add(pnlNonAcademic);
            
            //Fonts
                Font ff = new Font("Calibri", Font.BOLD,70);
                Font fa = new Font("Calibri", Font.BOLD,30);
                Font fb = new Font("Calibri", Font.BOLD,23);
                
                //labels for title panel
                lblTitle = new JLabel ("Course Registration");
                    lblTitle.setBounds(310,25,600,70);
                    lblTitle.setFont(ff);
                    pnlTitle.add(lblTitle);
                
                //buttons for Choose panel
                btnAcademic = new JButton("Academic Course");
                    btnAcademic.setBounds(200,10,290,50);
                    btnAcademic.setBackground(Color.RED);
                    btnAcademic.setForeground(Color.WHITE);
                    btnAcademic.setFont(fa);
                    btnAcademic.setFocusable(false);
                    pnlChoose.add(btnAcademic);
                
                btnNonAcademic = new JButton("Non Academic Course");
                    btnNonAcademic.setBounds(650,10,310,50);
                    btnNonAcademic.setFont(fa);
                    btnNonAcademic.setFocusable(false);
                    pnlChoose.add(btnNonAcademic);
                
                //academic panel buttons
                btnAcAddCourse = new JButton("Add");
                    btnAcAddCourse.setBounds(875,135,150,40);
                    btnAcAddCourse.setFocusable(false);
                    btnAcAddCourse.setFont(fb);
                    pnlAcademic.add(btnAcAddCourse);
                
                btnAcRegister = new JButton("Register");
                    btnAcRegister.setBounds(880,375,150,40);
                    btnAcRegister.setFocusable(false);
                    btnAcRegister.setFont(fb);
                    btnAcRegister.setFont(fb);
                    pnlAcademic.add(btnAcRegister);
                
                //non academic panel buttons
                btnNacAddCourse = new JButton("Add");
                    btnNacAddCourse.setBounds(875,135,150,40);
                    btnNacAddCourse.setFocusable(false);
                    btnNacAddCourse.setFont(fb);
                    pnlNonAcademic.add(btnNacAddCourse);
                
                btnNacRegister = new JButton("Register");
                    btnNacRegister.setBounds(880,375,150,40);
                    btnNacRegister.setFocusable(false);
                    btnNacRegister.setFont(fb);
                    pnlNonAcademic.add(btnNacRegister);
                
                btnRemove = new JButton("Remove");
                    btnRemove.setBounds(725,375,150,40);
                    btnRemove.setFocusable(false);
                    btnRemove.setFont(fb);
                    pnlNonAcademic.add(btnRemove);
                
                btnDisplay = new JButton("Display");
                    btnDisplay.setBounds(560,450,150,30);
                    btnDisplay.setFocusable(false);
                    btnDisplay.setFont(fb);
                    pnlAcademic.add(btnDisplay);
                    
                btnClear = new JButton("Clear");
                    btnClear.setBounds(360,450,150,30);
                    btnClear.setFocusable(false);
                    btnClear.setFont(fb);
                    pnlAcademic.add(btnClear);
                    
                btnnonDisplay = new JButton("Display");
                    btnnonDisplay.setBounds(560,450,150,30);
                    btnnonDisplay.setFocusable(false);
                    btnnonDisplay.setFont(fb);
                    pnlNonAcademic.add(btnnonDisplay);
                    
                btnnonClear = new JButton("Clear");
                    btnnonClear.setBounds(360,450,150,30);
                    btnnonClear.setFocusable(false);
                    btnnonClear.setFont(fb);
                    pnlNonAcademic.add(btnnonClear);
                
                //Labels
                
                //Academic labels
                lblAcCourseID = new JLabel("Course ID: ");
                    lblAcCourseID.setBounds(40,20,120,40);
                    lblAcCourseID.setFont(fb);
                    pnlAcademic.add(lblAcCourseID);
                
                lblAcDuration = new JLabel("Duration: ");
                    lblAcDuration.setBounds(775,20,100,20);
                    lblAcDuration.setFont(fb);
                    pnlAcademic.add(lblAcDuration);
                
                lblLecturer = new JLabel("Lecturer Name: ");
                    lblLecturer.setBounds(720,280,190,20);
                    lblLecturer.setFont(fb);
                    pnlAcademic.add(lblLecturer);
                
                lblAcLevel = new JLabel("Level: ");
                    lblAcLevel.setBounds(40,90,100,20);
                    lblAcLevel.setFont(fb);
                    pnlAcademic.add(lblAcLevel);
                    
                lblAcCourseID2 = new JLabel("Course ID: ");
                    lblAcCourseID2.setBounds(40,200,120,40);
                    lblAcCourseID2.setFont(fb);
                    pnlAcademic.add(lblAcCourseID2);
                
                lblAcName = new JLabel("Course Name: ");
                    lblAcName.setBounds(400,20,150,20);
                    lblAcName.setFont(fb);
                    pnlAcademic.add(lblAcName);
                
                lblAcLeader = new JLabel("Course Leader: ");
                    lblAcLeader.setBounds(40,270,150,20);
                    lblAcLeader.setFont(fb);
                    pnlAcademic.add(lblAcLeader);
                
                lblCredit = new JLabel("Credit: ");
                    lblCredit.setBounds(400,90,100,20);
                    lblCredit.setFont(fb);
                    pnlAcademic.add(lblCredit);
                    
                lblAcAssessments = new JLabel("Number of Assessments: ");
                    lblAcAssessments.setBounds(720,90,250,20);
                    lblAcAssessments.setFont(fb);
                    pnlAcademic.add(lblAcAssessments);
                    
                lblAcStarting = new JLabel("Starting Date: ");
                    lblAcStarting.setBounds(40,335,150,20);
                    lblAcStarting.setFont(fb);
                    pnlAcademic.add(lblAcStarting);
                
                lblAcCompletion = new JLabel("Completion Date: ");
                    lblAcCompletion.setBounds(720,335,190,20);
                    lblAcCompletion.setFont(fb);
                    pnlAcademic.add(lblAcCompletion);
                
                //Non Academic labels
                lblnonAcCourseID = new JLabel("CourseID: ");
                    lblnonAcCourseID.setBounds(40,20,120,40);
                    lblnonAcCourseID.setFont(fb);
                    pnlNonAcademic.add(lblnonAcCourseID);
                
                lblnonAcDuration = new JLabel("Duration: ");
                    lblnonAcDuration.setBounds(775,20,100,20);
                    lblnonAcDuration.setFont(fb);
                    pnlNonAcademic.add(lblnonAcDuration);
                
                lblInstructor = new JLabel("Instructor Name: ");
                    lblInstructor.setBounds(720,270,190,20);
                    lblInstructor.setFont(fb);
                    pnlNonAcademic.add(lblInstructor);
                
                lblExam = new JLabel("Exam Date: ");
                    lblExam.setBounds(720,335,190,20);
                    lblExam.setFont(fb);
                    pnlNonAcademic.add(lblExam);
                
                lblnonAcName = new JLabel("Course Name: ");
                    lblnonAcName.setBounds(40,90,150,20);
                    lblnonAcName.setFont(fb);
                    pnlNonAcademic.add(lblnonAcName);
                
                lblnonAcLeader = new JLabel("Course Leader: ");
                    lblnonAcLeader.setBounds(40,270,150,20);
                    lblnonAcLeader.setFont(fb);
                    pnlNonAcademic.add(lblnonAcLeader);
                    
                lblnonAcCourseID2 = new JLabel("Course ID: ");
                    lblnonAcCourseID2.setBounds(40,200,120,40);
                    lblnonAcCourseID2.setFont(fb);
                    pnlNonAcademic.add(lblnonAcCourseID2);
                    
                lblnonAcStarting = new JLabel("Starting Date: ");
                    lblnonAcStarting.setBounds(40,335,150,20);
                    lblnonAcStarting.setFont(fb);
                    pnlNonAcademic.add(lblnonAcStarting);
                
                lblnonAcCompletion = new JLabel("Completion Date: ");
                    lblnonAcCompletion.setBounds(380,335,190,20);
                    lblnonAcCompletion.setFont(fb);
                    pnlNonAcademic.add(lblnonAcCompletion);
                    
                lblnonAcPrerequisite = new JLabel("Prerequisite: ");
                    lblnonAcPrerequisite.setBounds(740,90,250,20);
                    lblnonAcPrerequisite.setFont(fb);
                    pnlNonAcademic.add(lblnonAcPrerequisite);
                
                lblnonCourseID3 = new JLabel("Course ID: ");
                    lblnonCourseID3.setBounds(450,375,150,40);
                    lblnonCourseID3.setFont(fb);
                    pnlNonAcademic.add(lblnonCourseID3);
                    
                
                
                //TextFields
                
                //Academic text fields
                txtAcCourseID = new JTextField();
                    txtAcCourseID.setBounds(150,25,150,30);
                    pnlAcademic.add(txtAcCourseID);
                    
                txtAcCourseID2 = new JTextField();
                    txtAcCourseID2.setBounds(150,205,150,30);
                    pnlAcademic.add(txtAcCourseID2);
                    
                txtAcDuration = new JTextField();
                    txtAcDuration.setBounds(875,18,150,30);
                    pnlAcademic.add(txtAcDuration);
                
                txtLecturer = new JTextField();
                    txtLecturer.setBounds(880,270,150,30);
                    pnlAcademic.add(txtLecturer);
                
                txtAcLevel = new JTextField();
                    txtAcLevel.setBounds(150,85,150,30);
                    pnlAcademic.add(txtAcLevel);
                
                txtAcName = new JTextField();
                    txtAcName.setBounds(540,15,150,30);
                    pnlAcademic.add(txtAcName);
                
                txtAcLeader = new JTextField();
                    txtAcLeader.setBounds(190,265,150,30);
                    pnlAcademic.add(txtAcLeader);
                    
                txtAcStarting = new JTextField();
                    txtAcStarting.setBounds(190,330,150,30);
                    pnlAcademic.add(txtAcStarting);
                    
                txtAcCompletion = new JTextField();
                    txtAcCompletion.setBounds(895,330,135,30);
                    pnlAcademic.add(txtAcCompletion);
                    
                txtCredit = new JTextField();
                    txtCredit.setBounds(540,85,150,30);
                    pnlAcademic.add(txtCredit);
                
                txtAcAssessments = new JTextField();
                    txtAcAssessments.setBounds(970,85,55,30);
                    pnlAcademic.add(txtAcAssessments);
                
                //non Academic text fields
                txtnonAcCourseID = new JTextField();
                    txtnonAcCourseID.setBounds(150,25,150,30);
                    pnlNonAcademic.add(txtnonAcCourseID);
                    
                txtnonAcCourseID2 = new JTextField();
                    txtnonAcCourseID2.setBounds(150,205,150,30);
                    pnlNonAcademic.add(txtnonAcCourseID2);
                
                txtnonAcDuration = new JTextField();
                    txtnonAcDuration.setBounds(875,18,150,30);
                    pnlNonAcademic.add(txtnonAcDuration);
                
                txtInstructor = new JTextField();
                    txtInstructor.setBounds(890,265,140,30);
                    pnlNonAcademic.add(txtInstructor);
                
                txtExam = new JTextField();
                    txtExam.setBounds(895,330,135,30);
                    pnlNonAcademic.add(txtExam);
                
                txtnonAcName = new JTextField();
                    txtnonAcName.setBounds(180,85,150,30);
                    pnlNonAcademic.add(txtnonAcName);
                
                txtnonAcLeader = new JTextField();
                    txtnonAcLeader.setBounds(190,265,150,30);
                    pnlNonAcademic.add(txtnonAcLeader);
                    
                txtnonAcPrerequisite = new JTextField();
                    txtnonAcPrerequisite.setBounds(875,85,150,30);
                    pnlNonAcademic.add(txtnonAcPrerequisite);
                    
                txtnonAcStarting = new JTextField();
                    txtnonAcStarting.setBounds(190,330,145,30);
                    pnlNonAcademic.add(txtnonAcStarting);
                    
                txtnonAcCompletion = new JTextField();
                    txtnonAcCompletion.setBounds(555,330,135,30);
                    pnlNonAcademic.add(txtnonAcCompletion);
                    
                txtnonCourseID3 = new JTextField();
                    txtnonCourseID3.setBounds(555,375,150,30);
                    pnlNonAcademic.add(txtnonCourseID3);
                
            
        //Frame
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        
        //for changing to Academic panel
        btnAcademic.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pnlNonAcademic.setVisible(false);
                pnlAcademic.setVisible(true);
                btnAcademic.setBackground(Color.RED);
                btnAcademic.setForeground(Color.WHITE);
                btnNonAcademic.setBackground(new JButton().getBackground());//set default background colour
                btnNonAcademic.setForeground(new JButton().getForeground());//set default foreground colour
            }
        });
        
        //for changing to non academic panel
        btnNonAcademic.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pnlNonAcademic.setVisible(true);
                pnlAcademic.setVisible(false);
                btnNonAcademic.setBackground(Color.RED);
                btnNonAcademic.setForeground(Color.WHITE);
                btnAcademic.setBackground(new JButton().getBackground());//set default background colour
                btnAcademic.setForeground(new JButton().getForeground());//set default foreground colour
            }
        });
        
        //for adding adding academic course
        btnAcAddCourse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(txtAcCourseID.getText().isEmpty() || txtAcName.getText().isEmpty() || txtAcDuration.getText().isEmpty() || txtAcLevel.getText().isEmpty() || txtCredit.getText().isEmpty() || txtAcAssessments.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Empty fields found. Please fill them."); //check empty fields
            }
            else{
                String txt_ID = txtAcCourseID.getText();
                String txt_Name = txtAcName.getText();
                String txt_Level = txtAcLevel.getText();
                String txt_Credit = txtCredit.getText();
                
                for(Course c: academicList){
                    if(c.getCourseID().equals(txt_ID)){
                        JOptionPane.showMessageDialog(null,"The Course ID already exists. Please enter a different one.");//check duplicate course ID
                        return;
                    }
                }
                
                try{
                    txt_Duration = Integer.parseInt(txtAcDuration.getText());
                    txt_Assessments = Integer.parseInt(txtAcAssessments.getText());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Please enter Duration and Number of Assessments in integer form.");//convert duration and assessment to int
                    return;
                }
                Academicobj = new AcademicCourse(txt_ID,txt_Name,txt_Duration,txt_Level,txt_Credit,txt_Assessments);
                academicList.add(Academicobj);
                txtAcCourseID.setText("");
                txtAcDuration.setText("");
                txtAcLevel.setText("");
                txtAcName.setText("");
                txtCredit.setText("");
                txtAcAssessments.setText("");
                JOptionPane.showMessageDialog(null,"This Course is added successfully.");
            }
            }
        });
        
        //Non Academic Course Add
        btnNacAddCourse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(txtnonAcCourseID.getText().isEmpty() || txtnonAcName.getText().isEmpty() || txtnonAcDuration.getText().isEmpty() || txtnonAcPrerequisite.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Empty fields found. Please fill them.");      //check empty fields
            }
            else{
                String txt_nID = txtnonAcCourseID.getText();
                String txt_nName = txtnonAcName.getText();
                String txt_preq = txtnonAcPrerequisite.getText();
                
                for(Course c: nonacademicList){
                    if(c.getCourseID().equals(txt_nID)){
                        JOptionPane.showMessageDialog(null,"The Course ID already exists. Please enter a different one."); //check duplicate course ID
                        return;
                    }
                }
                
                try{
                    txt_nDuration = Integer.parseInt(txtnonAcDuration.getText());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Please enter Duration in integer form.");//convert duration to int
                    return;
                }
                NonAcademicobj = new NonAcademicCourse(txt_nID,txt_nName,txt_nDuration,txt_preq);
                nonacademicList.add(NonAcademicobj);
                txtnonAcCourseID.setText("");
                txtnonAcDuration.setText("");
                txtnonAcName.setText("");
                txtnonAcPrerequisite.setText("");
                JOptionPane.showMessageDialog(null,"This Course is added successfully.");
            }
            }
        });
        //academic register
        btnAcRegister.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(txtAcCourseID2.getText().isEmpty() || txtAcLeader.getText().isEmpty() || txtLecturer.getText().isEmpty() || txtAcStarting.getText().isEmpty() || txtAcCompletion.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Empty fields found. Please fill them.");
                }
                else{
                    if(academicList.size() == 0){
                        JOptionPane.showMessageDialog(null,"Please add a course first!!!");
                    }
                    else{
                        boolean check = false;
                        for(int i = 0; i < academicList.size();i ++){//loop entries in academicList
                        if((academicList.get(i).getCourseID()).equals(txtAcCourseID2.getText())){
                            AcademicCourse AcRegister = (AcademicCourse)(academicList.get(i)); 
                            if(!AcRegister.getIsRegistered()) {
                                AcRegister.Register(txtLecturer.getText(),txtAcLeader.getText(),txtAcStarting.getText(),txtAcCompletion.getText());
                                JOptionPane.showMessageDialog(null,"This course is registered successfully");
                            } 
                            else{
                                JOptionPane.showMessageDialog(null,"This course already registered!");
                            }
                            //clears text fields
                            txtAcCourseID2.setText("");
                            txtAcLeader.setText("");
                            txtLecturer.setText("");
                            txtAcStarting.setText("");
                            txtAcCompletion.setText("");
                            
                            check = true;
                        }
                    }
                    if (check == false){
                           JOptionPane.showMessageDialog(null,"Course ID does not exist!!!"); 
                        }
                    }
                }
            }
        });
        //non academic register 
        btnNacRegister.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(txtnonAcCourseID2.getText().isEmpty() || txtnonAcLeader.getText().isEmpty() || txtInstructor.getText().isEmpty() || txtnonAcStarting.getText().isEmpty() || txtnonAcCompletion.getText().isEmpty() || txtExam.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Empty fields found. Please fill them.");
                }
                else{
                    if(nonacademicList.size() == 0){
                        JOptionPane.showMessageDialog(null,"Please add a course first!!!");
                    }
                    else{
                        boolean check = false;
                        for(int i = 0; i < nonacademicList.size();i ++){//loop all entries of nonacademic list
                        if((nonacademicList.get(i).getCourseID()).equals(txtnonAcCourseID2.getText())){
                            NonAcademicCourse NonAcRegister = (NonAcademicCourse)(nonacademicList.get(i)); 
                            if(!NonAcRegister.getIsRegistered()) {
                                NonAcRegister.register(txtnonAcLeader.getText(),txtInstructor.getText(),txtnonAcStarting.getText(),txtnonAcCompletion.getText(),txtExam.getText());
                                JOptionPane.showMessageDialog(null,"This course is registered successfully");
                            } 
                            else{
                                JOptionPane.showMessageDialog(null,"This course already registered!");
                            }
                            //clears text fields
                            txtnonAcCourseID2.setText("");
                            txtnonAcLeader.setText("");
                            txtInstructor.setText("");
                            txtnonAcStarting.setText("");
                            txtnonAcCompletion.setText("");
                            txtExam.setText("");
                            
                            check = true;
                        }
                    }
                    if (check == false){
                           JOptionPane.showMessageDialog(null,"Course ID does not exist!!!"); 
                        }
                    }
                }
            }
        });
        //display for academic course
        btnDisplay.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (academicList.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No course to display."); 
                }
                else{
                    JFrame acDisplay = new JFrame();
                    acDisplay.setBounds(375,30,900,600);
                    acDisplay.setResizable(false);
                    
                    
                    DefaultTableModel display = new DefaultTableModel();
                        display.addColumn("Course ID");
                        display.addColumn("Course Name");
                        display.addColumn("Duration");
                        display.addColumn("Level");
                        display.addColumn("Credit");
                        display.addColumn("Number of Assessments");
                        display.addColumn("Course Leader");
                        display.addColumn("Lecturer Name");
                        display.addColumn("Starting Date");
                        display.addColumn("Completion Date");
                    
                    JTable table = new JTable(display);
                    table.setBounds(5,5,850,580);
                    
                    JScrollPane  scDisplay = new JScrollPane(table);
                    for(int i = 0; i < academicList.size();i ++){
                        AcademicCourse courseDetail = (AcademicCourse)(academicList.get(i));
                        display.addRow(new Object[]{courseDetail.getCourseID(),courseDetail.getCourseName(),courseDetail.getDuration(),courseDetail.getLevel(),courseDetail.getCredit(),courseDetail.getNumberOfAssessments(),courseDetail.getCourseLeader(),courseDetail.getLecturerName(),courseDetail.getStartingDate(),courseDetail.getCompletionDate()} );
                    }
                    acDisplay.add(scDisplay);
                    acDisplay.setVisible(true);
                }
            }
        });
        //display for nonAcademic course
        btnnonDisplay.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (nonacademicList.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No course to display."); 
                }
                else{
                    JFrame nacDisplay = new JFrame();
                    nacDisplay.setBounds(375,30,900,600);
                    nacDisplay.setResizable(false);
                    
                    
                    DefaultTableModel display = new DefaultTableModel();
                    display.addColumn("Course ID");
                    display.addColumn("Course Name");
                    display.addColumn("Duration");
                    display.addColumn("Prerequisite");
                    display.addColumn("Course Leader");
                    display.addColumn("Instructor Name");
                    display.addColumn("Starting Date");
                    display.addColumn("Completion Date");
                    display.addColumn("Exam Date");
                    
                    JTable table = new JTable(display);
                    table.setBounds(5,5,850,580);
                    
                    JScrollPane  scDisplay = new JScrollPane(table);
                    for(int i = 0; i < academicList.size();i ++){
                        NonAcademicCourse courseDetail = (NonAcademicCourse)(nonacademicList.get(i));
                        display.addRow(new Object[]{courseDetail.getCourseID(),courseDetail.getCourseName(),courseDetail.getDuration(),courseDetail.getPrerequisite(),courseDetail.getCourseLeader(),courseDetail.getInstructorName(),courseDetail.getStartDate(),courseDetail.getCompletionDate(),courseDetail.getExamDate()} );
                    }
                    nacDisplay.add(scDisplay);
                    nacDisplay.setVisible(true);
                }
            }
        });
        
        //remove course
        btnRemove.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(txtnonCourseID3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please enter the Course ID to remove.");
                }
                else{
                    if(nonacademicList.size() == 0){
                        JOptionPane.showMessageDialog(null,"No course is added. Please add a course first.");
                    }
                    
                    else{
                        boolean exist = false;
                        int Confirm = JOptionPane.showConfirmDialog(null, "Do you want to remove the course?","Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (Confirm == 0){
                            for(int i = 0; i < nonacademicList.size();i ++){//looping all the entries in list
                                if((nonacademicList.get(i).getCourseID()).equals(txtnonCourseID3.getText())){
                                    NonAcademicCourse Remove = (NonAcademicCourse)(nonacademicList.get(i)); 
                                    if(!Remove.getIsRemoved()) {
                                        Remove.remove();
                                        JOptionPane.showMessageDialog(null,"The Course is Removed Successfully.");
                                    }  
                                    else{
                                        JOptionPane.showMessageDialog(null,"The Course is already Removed!");
                                    }
                                    exist = true;
                                }
                            }
                            if (exist == false){
                               JOptionPane.showMessageDialog(null,"This Course ID does not exist!"); 
                            }            
                        }
                    }
                }
            }
        });
        //clear button for academic course
        btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int confirm = JOptionPane.showConfirmDialog(null,"Do you want to clear all the fields?","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);//confirm clear
                if(confirm == 0){
                    txtAcCourseID.setText("");
                    txtAcCourseID2.setText("");
                    txtAcDuration.setText("");
                    txtLecturer.setText("");
                    txtAcLevel.setText("");
                    txtAcName.setText("");
                    txtAcLeader.setText("");
                    txtAcStarting.setText("");
                    txtAcCompletion.setText("");
                    txtCredit.setText("");
                    txtAcAssessments.setText("");
                }
            }
        });
        //clear button for non academic course
        btnnonClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int confirm = JOptionPane.showConfirmDialog(null,"Do you want to clear all the fields?","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);//confirm clear
                if(confirm == 0){
                    txtnonAcCourseID.setText("");
                    txtnonAcCourseID2.setText("");
                    txtnonCourseID3.setText("");
                    txtnonAcDuration.setText("");
                    txtInstructor.setText("");
                    txtExam.setText("");
                    txtnonAcName.setText("");
                    txtnonAcLeader.setText("");
                    txtnonAcPrerequisite.setText("");
                    txtnonAcStarting.setText("");
                    txtnonAcCompletion.setText("");
                }
            }
        });
    
    }
    //main method
    public static void main(String []args)
    {
        new INGCollege();
    }
    
}