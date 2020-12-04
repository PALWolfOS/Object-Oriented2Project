/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2project;
        
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.*;
/**
 *
 * @author 816013790
 */
public class StudentPortal extends javax.swing.JFrame implements CourseStrategy{
    
    public HashMap<String, String> Elective = new HashMap<String, String>();                                 //Course calls the Student object, boolean is for if the course was selected
    public ArrayList<String> Core = new ArrayList<String>();                                      //
    public ArrayList<String> RegisteredCourses = new ArrayList<String>();
    public ArrayList<Student> Students = new ArrayList<Student>();
    
    /**
     * Creates new form RegistrationGUI
     */
    public int name_max;                                     //primitive obsession: unneeded
    public int ID_max;
    public int max_courses;
    public int num_courses;
    public String[] Name = new String[name_max];
    public String[] ID = new String[ID_max];                      //this string has to be in all numbers and 9 at a time 816013790
    //public jPanel Core = StudentPortal.add(new CorePanel());
    //private Object controls;
    //private Student c1;
    
    
    public StudentPortal() {
        /*
        *    Invariably, the initcomponents() initializes all of the Java swing components objects that your front-end GUI uses using the NetBeans GUI Builder.
        *    These swing components are automatically generated in your Java class whenever you make changes to the design of your GUI using the GUI builder.
        *    As a general rule of thumb, you should never change any aspect of the code within this method as this method is inextricably linked to the front-end NetBeans GUI builder.
        */
        initComponents(); 
        this.max_courses = 5;
        this.num_courses = 0;
        this.ID_max = 9;
        this.name_max = 20;
        RecommendedPanel.setVisible(false);
        StudentPortalPanel.setVisible(true);
        SelectCoursesPanel.setVisible(true);
        ElectivesPanel.setVisible(false);
        CorePanel.setVisible(true);
        RegistryPanel.setVisible(false);
        //setSize(600, 800);
        
        Elective.put("COMP 2606", "");
        
        Elective.put("COMP 3601", "COMP 2611");
        
        Elective.put("COMP 3601", "COMP 2611");

        Elective.put("COMP 3603", "COMP 2606");
        
        Elective.put("COMP 3605", "MATH 2250");
        
        Elective.put("COMP 3606", "COMP 2602"); 
        
        Elective.put("COMP 3607", "COMP 2603"); 
        
        Elective.put("COMP 3608", "COMP 2611");
        
        Elective.put("COMP 3608", "MATH 2250");
        
        Elective.put("COMP 3609", "COMP 2603"); 
        Elective.put("COMP 3609", "COMP 2606"); 
        
        Elective.put("COMP 3610", "COMP 3605"); 
        
        Elective.put("COMP 3611", "MATH 2250"); 
        
        Elective.put("COMP 3612", "COMP 2611"); 
        Elective.put("COMP 3612", "COMP 2603");
        
        Elective.put("COMP 3613", "COMP 2606"); 
        
        Elective.put("INFO 2602", ""); 
        
        Elective.put("INFO 2604", "");
        
        Elective.put("INFO 2605", ""); 
        
        Elective.put("INFO 3600", "COMP 2605"); 
        
        Elective.put("INFO 3605", "COMP 2604"); 
        
        Elective.put("INFO 3604", "COMP 2606"); 
        
        Elective.put("INFO 3606", "COMP 2605"); 
        
        Elective.put("INFO 3607", "COMP 2604"); 
        Elective.put("INFO 3607", "INFO 2601"); 
        
        Elective.put("INFO 3608", "COMP 2606"); 
        Elective.put("INFO 3609", "COMP 2606"); 
        
        Elective.put("INFO 3610", "COMP 2606"); 
        
        Elective.put("INFO 3611", "COMP 2605"); 
        
        Core.add("COMP 2601");
        
        Core.add("COMP 2602"); 
        
        Core.add("COMP 2603"); 
        
        Core.add("COMP 2604"); 
        
        Core.add("COMP 2605"); 
        
        Core.add("COMP 2611"); 
        
        Core.add("MGMT 2008"); 
        
        Core.add("MGMT 2021"); 
        
        Core.add("MGMT 2032"); 
        
        Core.add("MKTG 2001"); 
        
        Core.add("FOUN 1301"); 
        
        Core.add("ACCT 2017"); 
        
        Core.add("MGMT 2012"); 
        
        Core.add("MGMT 2023"); 
        
        Core.add("MKTG 3000"); 
        
    }
    
    

    public void UnCheckAllAction() {
        Component[] components = (Component[]) 
        getContentPane().getComponents();

        for (Component comp : components) {

            if (comp instanceof JCheckBox) {
                JCheckBox box = (JCheckBox) comp;
                box.setSelected(false);
            }
        }            
    }
    
    public void UnCheckRegisteredAction() {
        Component[] components = regcoursesPanel.getComponents();

        for (Component comp : components) {

            if (comp instanceof JCheckBox) {
                JCheckBox box = (JCheckBox) comp;
                box.setSelected(false);
            }
        }            
    }
    
    public void RegisterAction() {
        Component[] components = regcoursesPanel.getComponents();
        int max = this.max_courses;
        int a;

        for (Component comp : components) {

            if (comp instanceof JCheckBox) {
                JCheckBox box = (JCheckBox) comp;
                if(box.isSelected()){
                    
                }
            }
        }        
        if
    }
    
    //public int getMaxValue(){
    //    return
    //}
    
    boolean registerStudent(String ID, String name, String course, String semester, String year){
        if((ID.equals("") == false) && (name.equals("") == false) && (course.equals("") == false) && (semester.equals("<Select Semester>") == false) && (year.equals("<Select Year>") == false)){
            Student s = new Student(ID, name, course, semester, year);
            Students.add(s);
            return true;
        }
        return false;
    }
    
    boolean boolcheckfordupes(String line){
        int count = 0;
        for (HashMap.Entry me : Elective.entrySet()) {
            if (me.getKey() == line){
                count++;
            }
        }
        if(count > 1){
            return true;
        }
        return false;
    }
    
    @Override                       //this is for remaining courses
    public void PrintCoursesCore() {
        Component[] components = CorePanel.getComponents();
        String remaining = "";
        String result = "";
        String recommended = "";
        String reason = "";

        for (Component comp : components) {

            if (comp instanceof JCheckBox) {
                JCheckBox box = (JCheckBox) comp;
                if(box.isSelected()){
                    result = result + box.getText() + "\n";
                }else {
                    remaining = remaining + box.getText() + "\n";
                }
            }
        }  
        
        try (Scanner scanner = new Scanner(result)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (String me : Core) {
                    if(me.equals(line)){
                        recommended = recommended + me + "\n";
                        reason = reason + "Because " + me + " requires no prior completed course./n";
                    }
                }
                for (HashMap.Entry me : Elective.entrySet()) {
                    String test = "" + me.getKey();
                    if(me.getValue() == line && boolcheckfordupes(test) == false){
                        recommended = recommended + me.getKey() + "\n";
                        if(me.getValue() == ""){
                            reason = reason + "Because " + me.getKey() + " requires no prior completed course./n";
                        }else{
                            reason = reason + "Because " + me.getKey() + " requires " + me.getValue() + "to be completed./n";
                            
                        }
                    }  
                }
                
            }
        }
        displayArea.setText(remaining);
        jTextArea2.setText(recommended);
        jTextArea1.setText(reason);
    }
    
    @Override
    public void PrintCoursesElective() {
        Component[] components = ElectivePanel.getComponents();
        String remaining = "";
        String result = "";
        String recommended = "";
        String reason = "";

        for (Component comp : components) {

            if (comp instanceof JCheckBox) {
                JCheckBox box = (JCheckBox) comp;
                if(box.isSelected()){
                    result = result + box.getText() + "\n";
                }else {
                    remaining = remaining + box.getText() + "\n";
                }
            }
        }  
        
        
        BufferedReader bufReader = new BufferedReader(new StringReader(result));
        String line = null;
            while ((line =bufReader.readLine()) != null) {
                for (String me : Core) {
                    if(me.equals(line)){
                        recommended = recommended + me + "\n";
                        reason = reason + "Because " + me + " requires no prior completed course./n";
                    }
                }
                for (HashMap.Entry me : Elective.entrySet()) {
                    String test = "" + me.getKey();
                    if(me.getValue() == line && boolcheckfordupes(test) == false){
                        recommended = recommended + me.getKey() + "\n";
                        if(me.getValue() == ""){
                            reason = reason + "Because " + me.getKey() + " requires no prior completed course./n";
                        }else{
                            reason = reason + "Because " + me.getKey() + " requires " + me.getValue() + "to be completed./n";
                            
                        }
                    }  
                }
                
            }
        }
        displayArea.setText(remaining);
        jTextArea2.setText(recommended);
        jTextArea1.setText(reason);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecommendedPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        returnfromrecommendedButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        StudentPortalPanel = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        SuggestedButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CompletedLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GPATextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NumRecommendedLabel = new javax.swing.JLabel();
        displayArea = new javax.swing.JTextArea();
        registrationButton = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        SelectCoursesPanel = new javax.swing.JPanel();
        CorePanel = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        ElectivesPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox23 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox25 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jCheckBox26 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jLabel49 = new javax.swing.JLabel();
        jCheckBox40 = new javax.swing.JCheckBox();
        jLabel50 = new javax.swing.JLabel();
        RegistryPanel = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        NameLabel1 = new javax.swing.JLabel();
        NameTextField1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        IDTextField1 = new javax.swing.JTextField();
        CompletedLabel1 = new javax.swing.JLabel();
        CurrentSemesterLabel1 = new javax.swing.JLabel();
        SemesterComboBox1 = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();
        RegClearButton = new javax.swing.JButton();
        regcoursesPanel = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jCheckBox41 = new javax.swing.JCheckBox();
        jScrollBar3 = new javax.swing.JScrollBar();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jCheckBox67 = new javax.swing.JCheckBox();
        jLabel80 = new javax.swing.JLabel();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox79 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        RegisterButton = new javax.swing.JButton();
        DeregisterButton = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        YearComboBox1 = new javax.swing.JComboBox<>();
        jLabel94 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 1028));
        getContentPane().setLayout(new java.awt.CardLayout());

        RecommendedPanel.setPreferredSize(new java.awt.Dimension(600, 800));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        returnfromrecommendedButton.setText("Return");
        returnfromrecommendedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnfromrecommendedButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("RECOMMENDED COURSES FOR THE NEW SEMESTER:");

        jLabel3.setText("Reasoning:");

        jLabel4.setText("COMPUTER SCIENCE WITH MANAGEMENT ACADEMIC ADVISING SIMULATOR ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout RecommendedPanelLayout = new javax.swing.GroupLayout(RecommendedPanel);
        RecommendedPanel.setLayout(RecommendedPanelLayout);
        RecommendedPanelLayout.setHorizontalGroup(
            RecommendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecommendedPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(RecommendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RecommendedPanelLayout.createSequentialGroup()
                        .addGroup(RecommendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecommendedPanelLayout.createSequentialGroup()
                                .addGroup(RecommendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                                .addGap(20, 20, 20)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RecommendedPanelLayout.createSequentialGroup()
                        .addGroup(RecommendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnfromrecommendedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 644, Short.MAX_VALUE))))
        );
        RecommendedPanelLayout.setVerticalGroup(
            RecommendedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecommendedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(returnfromrecommendedButton)
                .addContainerGap())
        );

        getContentPane().add(RecommendedPanel, "card3");

        StudentPortalPanel.setPreferredSize(new java.awt.Dimension(1200, 800));

        clearButton.setText("Clear Form");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        SuggestedButton.setText("See Recommended Courses");
        SuggestedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuggestedButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("COMPUTER SCIENCE WITH MANAGEMENT ACADEMIC ADVISING SIMULATOR ");

        CompletedLabel.setText("Select Completed Courses:");

        jLabel5.setText("Current GPA:");

        GPATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPATextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("REMAINING COURSES IN PROGRAMME: ");

        NumRecommendedLabel.setText("RECOMMENDED NUMBER OF COURSES THIS SEMESTER: (2, 4, 5) ");

        displayArea.setEditable(false);
        displayArea.setColumns(20);
        displayArea.setRows(5);

        registrationButton.setText("Go to Registration");
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Core/Elective");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        SelectCoursesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SelectCoursesPanel.setPreferredSize(new java.awt.Dimension(523, 163));
        SelectCoursesPanel.setLayout(new java.awt.CardLayout());

        jCheckBox1.setText("COMP 2601 ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("COMP 2602 ");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox12.setText("ACCT 2017 ");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setText("MGMT 2012 ");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setText("MGMT 2023 ");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setText("MKTG 3000 ");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("COMP 2603 ");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("COMP 2604 ");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("COMP 2605 ");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("COMP 2611 ");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jLabel22.setText("CORE COURSES:");

        jCheckBox7.setText("MGMT 2008");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jLabel23.setText("PRE-REQUISITE");

        jCheckBox8.setText("MGMT 2021 ");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("MGMT 2032 ");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("MKTG 2001 ");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setText("FOUN 1301 ");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CorePanelLayout = new javax.swing.GroupLayout(CorePanel);
        CorePanel.setLayout(CorePanelLayout);
        CorePanelLayout.setHorizontalGroup(
            CorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorePanelLayout.createSequentialGroup()
                        .addComponent(jCheckBox8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CorePanelLayout.createSequentialGroup()
                        .addGroup(CorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorePanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                                .addComponent(jLabel23))
                            .addGroup(CorePanelLayout.createSequentialGroup()
                                .addGroup(CorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(CorePanelLayout.createSequentialGroup()
                        .addGroup(CorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox10))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        CorePanelLayout.setVerticalGroup(
            CorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addGap(1, 1, 1)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15))
        );

        SelectCoursesPanel.add(CorePanel, "card3");

        ElectivesPanel.setPreferredSize(new java.awt.Dimension(400, 690));

        jLabel27.setText("COURSE");

        jCheckBox16.setText("INFO 2605");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jCheckBox17.setText("INFO 3600");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jCheckBox18.setText("INFO 3605");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jCheckBox19.setText("INFO 3604");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jCheckBox20.setText("COMP 2606");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });

        jCheckBox21.setText("INFO 3606");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setText("INFO 3607");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });

        jLabel24.setText("COMP 2611");

        jCheckBox23.setText("INFO 3608");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jLabel25.setText("COMP 2606");

        jCheckBox24.setText("INFO 3609");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jLabel26.setText("MATH 2250");

        jCheckBox25.setText("INFO 3610");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });

        jLabel28.setText("COMP 2602");

        jCheckBox26.setText("INFO 3611");
        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });

        jLabel29.setText("COMP 2603");

        jCheckBox27.setText("COMP 3601");
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });

        jCheckBox28.setText("COMP 3602");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });

        jCheckBox29.setText("COMP 3603");
        jCheckBox29.setToolTipText("");
        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });

        jCheckBox30.setText("COMP 3605");
        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });

        jCheckBox31.setText("COMP 3606");
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });

        jLabel30.setText("COMP 2611, MATH 2250");

        jLabel31.setText("COMP 2603, COMP 2606");

        jLabel32.setText("COMP 3605");

        jLabel33.setText("MATH 2250");

        jLabel34.setText("COMP 2611, COMP 2603");

        jLabel35.setText("COMP 2606");

        jLabel39.setText("COMP 2605");

        jLabel41.setText("COMP 2604");

        jLabel42.setText("COMP 2606");

        jLabel43.setText("COMP 2605");

        jLabel44.setText("COMP 2604, INFO 2601");

        jLabel45.setText("COMP 2606");

        jLabel46.setText("COMP 2606");

        jLabel47.setText("COMP 2606");

        jLabel48.setText("COMP 2605");

        jCheckBox32.setText("COMP 3607");
        jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox32ActionPerformed(evt);
            }
        });

        jCheckBox33.setText("COMP 3608");
        jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox33ActionPerformed(evt);
            }
        });

        jCheckBox34.setText("COMP 3609");
        jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox34ActionPerformed(evt);
            }
        });

        jCheckBox35.setText("COMP3610");
        jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox35ActionPerformed(evt);
            }
        });

        jCheckBox36.setText("COMP 3611");
        jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox36ActionPerformed(evt);
            }
        });

        jCheckBox37.setText("COMP 3612");
        jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox37ActionPerformed(evt);
            }
        });

        jCheckBox38.setText("COMP 3613");
        jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox38ActionPerformed(evt);
            }
        });

        jCheckBox39.setText("INFO 2602");
        jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox39ActionPerformed(evt);
            }
        });

        jLabel49.setText("PRE-REQUISITE");

        jCheckBox40.setText("INFO 2604");
        jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox40ActionPerformed(evt);
            }
        });

        jLabel50.setText("COMP 2611");

        javax.swing.GroupLayout ElectivesPanelLayout = new javax.swing.GroupLayout(ElectivesPanel);
        ElectivesPanel.setLayout(ElectivesPanelLayout);
        ElectivesPanelLayout.setHorizontalGroup(
            ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectivesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ElectivesPanelLayout.createSequentialGroup()
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox37)
                            .addComponent(jCheckBox26)
                            .addComponent(jCheckBox25)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox22)
                            .addComponent(jCheckBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox19)
                            .addComponent(jCheckBox21))
                        .addGap(68, 68, 68)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ElectivesPanelLayout.setVerticalGroup(
            ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ElectivesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20)
                .addGap(4, 4, 4)
                .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox27)
                    .addComponent(jLabel50))
                .addGap(0, 0, 0)
                .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ElectivesPanelLayout.createSequentialGroup()
                        .addComponent(jCheckBox28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox29)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox30)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox31)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox32)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox33)
                            .addComponent(jLabel30))
                        .addGap(3, 3, 3)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox34)
                            .addComponent(jLabel31))
                        .addGap(3, 3, 3)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox35)
                            .addComponent(jLabel32))
                        .addGap(4, 4, 4)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox36)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox37)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox38)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox17)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox18)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jCheckBox19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jCheckBox21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jCheckBox22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jCheckBox23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jCheckBox24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jCheckBox25)))
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ElectivesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox26)
                    .addComponent(jLabel48))
                .addContainerGap())
        );

        SelectCoursesPanel.add(ElectivesPanel, "card2");

        javax.swing.GroupLayout StudentPortalPanelLayout = new javax.swing.GroupLayout(StudentPortalPanel);
        StudentPortalPanel.setLayout(StudentPortalPanelLayout);
        StudentPortalPanelLayout.setHorizontalGroup(
            StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                        .addGroup(StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                                .addComponent(CompletedLabel)
                                .addGap(142, 142, 142)
                                .addComponent(jToggleButton1))
                            .addComponent(SelectCoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(GPATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NumRecommendedLabel)
                            .addComponent(jLabel7)
                            .addComponent(displayArea, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton)
                            .addComponent(SuggestedButton)
                            .addComponent(registrationButton))
                        .addContainerGap(107, Short.MAX_VALUE))
                    .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        StudentPortalPanelLayout.setVerticalGroup(
            StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CompletedLabel)
                    .addGroup(StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton1)
                        .addComponent(jLabel5)
                        .addComponent(GPATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(StudentPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                        .addComponent(NumRecommendedLabel)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(displayArea)
                        .addGap(79, 79, 79)
                        .addComponent(clearButton)
                        .addGap(18, 18, 18)
                        .addComponent(SuggestedButton)
                        .addGap(18, 18, 18)
                        .addComponent(registrationButton)
                        .addGap(175, 175, 175))
                    .addGroup(StudentPortalPanelLayout.createSequentialGroup()
                        .addComponent(SelectCoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(101, Short.MAX_VALUE))))
        );

        getContentPane().add(StudentPortalPanel, "card2");

        jLabel52.setText("                                             REGISTRATION");
        jLabel52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        NameLabel1.setText("Name:");

        NameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextField1ActionPerformed(evt);
            }
        });

        jLabel53.setText("ID:");

        CompletedLabel1.setText("Select Remaining Courses:");

        CurrentSemesterLabel1.setText("Current Semester");

        SemesterComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Semester>", "Semester 1", "Semester 2", "Semester 3", "Summer" }));
        SemesterComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterComboBox1ActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RegClearButton.setText("Clear");
        RegClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegClearButtonActionPerformed(evt);
            }
        });

        jLabel51.setText("COMP 2606 - Software Engineering");

        jCheckBox41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox41ActionPerformed(evt);
            }
        });

        jLabel54.setText("COMP 3601 - Design and Analysis of Algorithms");

        jLabel55.setText("COMP 3602 - Theory of Computing");

        jLabel56.setText("COMP 3603 - Human-Computer Interaction");

        jLabel57.setText("COMP 3605 - Introduction to Data Analytics");

        jLabel58.setText("COMP 3606 - Wireless and Mobile Computing");

        jCheckBox42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox42ActionPerformed(evt);
            }
        });

        jCheckBox43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox43ActionPerformed(evt);
            }
        });

        jCheckBox44.setToolTipText("");
        jCheckBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox44ActionPerformed(evt);
            }
        });

        jCheckBox45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox45ActionPerformed(evt);
            }
        });

        jCheckBox46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox46ActionPerformed(evt);
            }
        });

        jLabel59.setText("COMP 3607 - Object-Oriented Programming II");

        jLabel60.setText("COMP 3608 - Intelligent Systems");

        jLabel61.setText("COMP 3609 - Game Programming");

        jLabel62.setText("COMP 3610 - Big Data Analytics");

        jLabel63.setText("COMP 3611 - Modelling and Simulation");

        jLabel64.setText("COMP 3612 - Special Topics in Computer Science");

        jLabel65.setText("COMP 3613 - Software Engineering II");

        jLabel66.setText("INFO 2602 - Web Programming and Technologies I");

        jLabel67.setText("INFO 2604 - Information Systems Security");

        jLabel68.setText("INFO 2605 - Professional Ethics and Law");

        jLabel69.setText("INFO 3600 - Business Information Systems");

        jLabel70.setText("INFO 3605 - Fundamentals of LAN Technologies");

        jLabel71.setText("INFO 3604 - Project");

        jLabel72.setText("INFO 3606 - Cloud Computing");

        jLabel73.setText("INFO 3607 - Fundamentals of WAN Technologies");

        jLabel74.setText("INFO 3608 - E-Commerce");

        jLabel75.setText("INFO 3609 - Internship I");

        jLabel76.setText("INFO 3610 - Internship II");

        jLabel77.setText("INFO 3611 -Database Administration for Professionals");

        jCheckBox66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox66ActionPerformed(evt);
            }
        });

        jLabel78.setText("COMP 2601 - Computer Architecture");

        jLabel79.setText("COMP 2602 - Computer Networks");

        jCheckBox67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox67ActionPerformed(evt);
            }
        });

        jLabel80.setText("COMP 2603 - Object-Oriented Programming I");

        jCheckBox68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox68ActionPerformed(evt);
            }
        });

        jCheckBox69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox69ActionPerformed(evt);
            }
        });

        jCheckBox70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox70ActionPerformed(evt);
            }
        });

        jCheckBox71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox71ActionPerformed(evt);
            }
        });

        jCheckBox72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox72ActionPerformed(evt);
            }
        });

        jCheckBox73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox73ActionPerformed(evt);
            }
        });

        jCheckBox74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox74ActionPerformed(evt);
            }
        });

        jCheckBox75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox75ActionPerformed(evt);
            }
        });

        jCheckBox76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox76ActionPerformed(evt);
            }
        });

        jCheckBox77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox77ActionPerformed(evt);
            }
        });

        jCheckBox78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox78ActionPerformed(evt);
            }
        });

        jCheckBox79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox79ActionPerformed(evt);
            }
        });

        jCheckBox80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox80ActionPerformed(evt);
            }
        });

        jLabel81.setText("COMP 2604 - Operating Systems");

        jLabel82.setText("COMP 2605 - Enterprise Database Systems");

        jLabel83.setText("COMP 2611 - Data Structures");

        jLabel84.setText("MGMT 2008 - Organisational Behaviour");

        jLabel85.setText("MGMT 2021 - Business Law");

        jLabel86.setText("MGMT 2032 - Managerial Economics");

        jLabel87.setText("MKTG 2001 - Principles of Marketing");

        jLabel88.setText("FOUN 1301 - Law, Governance, Economy and Society");

        jLabel89.setText("ACCT 2017 - Management Accounting");

        jLabel90.setText("MGMT 2012 - Quantitative Methods");

        jLabel91.setText("MGMT 2023 - Financial Management");

        jLabel92.setText("MKTG 3000 - Marketing Management");

        javax.swing.GroupLayout regcoursesPanelLayout = new javax.swing.GroupLayout(regcoursesPanel);
        regcoursesPanel.setLayout(regcoursesPanelLayout);
        regcoursesPanelLayout.setHorizontalGroup(
            regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regcoursesPanelLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(jLabel57)
                            .addComponent(jLabel56)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox41)
                            .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCheckBox49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox50))
                            .addComponent(jCheckBox51)))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox52))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox53))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox54))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox55))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox56))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox57))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox58))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox59))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox60))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox61))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox62))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox63))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox64))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jCheckBox65))
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80)
                            .addComponent(jLabel78))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox66, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox67)
                                .addComponent(jCheckBox68, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel92)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox80)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        regcoursesPanelLayout.setVerticalGroup(
            regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regcoursesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jCheckBox41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jCheckBox42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jCheckBox43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jCheckBox44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jCheckBox45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jCheckBox46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jCheckBox47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox49)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox50)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jCheckBox51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jCheckBox52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jCheckBox53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jCheckBox54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jCheckBox55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jCheckBox57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jCheckBox58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jCheckBox59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jCheckBox60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jCheckBox61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jCheckBox62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jCheckBox63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jCheckBox64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jCheckBox65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                                                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                                                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                            .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                                                                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                    .addGroup(regcoursesPanelLayout.createSequentialGroup()
                                                                                                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                            .addComponent(jCheckBox66)
                                                                                                            .addComponent(jLabel78))
                                                                                                        .addGap(4, 4, 4)
                                                                                                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                                                                                                                .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regcoursesPanelLayout.createSequentialGroup()
                                                                                                                        .addGroup(regcoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                            .addComponent(jLabel79)
                                                                                                                            .addComponent(jCheckBox67))
                                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                        .addComponent(jCheckBox68))
                                                                                                                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jCheckBox69))
                                                                                                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jCheckBox70))
                                                                                                    .addComponent(jLabel82))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jCheckBox71))
                                                                                            .addComponent(jLabel83))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jCheckBox72))
                                                                                    .addComponent(jLabel84))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jCheckBox73))
                                                                            .addComponent(jLabel85))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jCheckBox74))
                                                                    .addComponent(jLabel86))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox75))
                                                            .addComponent(jLabel87))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox76))
                                                    .addComponent(jLabel88))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox77))
                                            .addComponent(jLabel89))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox78))
                                    .addComponent(jLabel90))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox79))
                            .addComponent(jLabel91))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox80))
                    .addComponent(jLabel92))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        DeregisterButton.setText("Deregister");

        jLabel93.setText("Registered Courses:");

        YearComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Year>", "2019/2020", "2020/2021", "2021/2022", "2022/2023" }));
        YearComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearComboBox1ActionPerformed(evt);
            }
        });

        jLabel94.setText("Year of Study");

        javax.swing.GroupLayout RegistryPanelLayout = new javax.swing.GroupLayout(RegistryPanel);
        RegistryPanel.setLayout(RegistryPanelLayout);
        RegistryPanelLayout.setHorizontalGroup(
            RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistryPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistryPanelLayout.createSequentialGroup()
                        .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(NameLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(162, 162, 162))
                    .addGroup(RegistryPanelLayout.createSequentialGroup()
                        .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistryPanelLayout.createSequentialGroup()
                                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CurrentSemesterLabel1)
                                    .addComponent(jLabel94))
                                .addGap(229, 229, 229)
                                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(YearComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SemesterComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RegistryPanelLayout.createSequentialGroup()
                        .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CompletedLabel1)
                            .addComponent(jLabel93)
                            .addComponent(regcoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistryPanelLayout.createSequentialGroup()
                                .addComponent(RegisterButton)
                                .addGap(330, 330, 330)
                                .addComponent(DeregisterButton))
                            .addComponent(RegClearButton)
                            .addComponent(BackButton))
                        .addGap(0, 587, Short.MAX_VALUE))))
        );
        RegistryPanelLayout.setVerticalGroup(
            RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel1)
                    .addComponent(NameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(IDTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentSemesterLabel1)
                    .addComponent(SemesterComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(YearComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CompletedLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regcoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton)
                    .addComponent(DeregisterButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(RegClearButton)
                .addGap(31, 31, 31)
                .addComponent(BackButton)
                .addGap(70, 70, 70))
        );

        getContentPane().add(RegistryPanel, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuggestedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuggestedButtonActionPerformed
        
        StudentPortalPanel.setVisible(false);
        RecommendedPanel.setVisible(true);   
    }//GEN-LAST:event_SuggestedButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        SemesterComboBox1.setSelectedIndex(0); 
        SemesterComboBox1.setSelectedIndex(0);  
        NumRecommendedLabel.setText("RECOMMENDED NUMBER OF COURSES THIS SEMESTER: (2, 4, 5) ");
        UnCheckAllAction();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void GPATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPATextFieldActionPerformed
        
        final String text = GPATextField.getText();
        double GPA = Double.parseDouble(text);
        NumRecommendedLabel.setText("RECOMMENDED NUMBER OF COURSES THIS SEMESTER: (2, 4, 5) ");
        if (GPA >= 3.0){
            NumRecommendedLabel.setText("RECOMMENDED NUMBER OF COURSES THIS SEMESTER: 5");
            this.max_courses = 5;
        }else if (GPA > 2.0){
            NumRecommendedLabel.setText("RECOMMENDED NUMBER OF COURSES THIS SEMESTER: 4");
            this.max_courses = 4;
        }else{
            NumRecommendedLabel.setText("RECOMMENDED NUMBER OF COURSES THIS SEMESTER: 2");
            this.max_courses = 2;
        }
    }//GEN-LAST:event_GPATextFieldActionPerformed

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed
        
        StudentPortalPanel.setVisible(false);
        RegistryPanel.setVisible(true);
    }//GEN-LAST:event_registrationButtonActionPerformed

   
    private void returnfromrecommendedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnfromrecommendedButtonActionPerformed
        
        RecommendedPanel.setVisible(false);
        StudentPortalPanel.setVisible(true);
    }//GEN-LAST:event_returnfromrecommendedButtonActionPerformed

    //core
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        
        PrintCoursesCore();
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        if(jToggleButton1.isSelected()){
            CorePanel.setVisible(false);
            ElectivesPanel.setVisible(true);
        }
        else{
            ElectivesPanel.setVisible(false);
            CorePanel.setVisible(true);   
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void NameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextField1ActionPerformed
        
    }//GEN-LAST:event_NameTextField1ActionPerformed

    private void SemesterComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterComboBox1ActionPerformed
        
    }//GEN-LAST:event_SemesterComboBox1ActionPerformed

    private void RegClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegClearButtonActionPerformed
        
        SemesterComboBox1.setSelectedIndex(0); 
    }//GEN-LAST:event_RegClearButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        StudentPortalPanel.setVisible(true);
        RegistryPanel.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    
    //register courses
    private void jCheckBox41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox41ActionPerformed
        
    }//GEN-LAST:event_jCheckBox41ActionPerformed

    private void jCheckBox42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox42ActionPerformed
        
    }//GEN-LAST:event_jCheckBox42ActionPerformed

    private void jCheckBox43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox43ActionPerformed
        
    }//GEN-LAST:event_jCheckBox43ActionPerformed

    private void jCheckBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox44ActionPerformed
        
    }//GEN-LAST:event_jCheckBox44ActionPerformed

    private void jCheckBox45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox45ActionPerformed
        
    }//GEN-LAST:event_jCheckBox45ActionPerformed

    private void jCheckBox46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox46ActionPerformed
        
    }//GEN-LAST:event_jCheckBox46ActionPerformed

    private void jCheckBox66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox66ActionPerformed
        
    }//GEN-LAST:event_jCheckBox66ActionPerformed

    private void jCheckBox67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox67ActionPerformed
        
    }//GEN-LAST:event_jCheckBox67ActionPerformed

    private void jCheckBox68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox68ActionPerformed
        
    }//GEN-LAST:event_jCheckBox68ActionPerformed

    private void jCheckBox69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox69ActionPerformed
        
    }//GEN-LAST:event_jCheckBox69ActionPerformed

    private void jCheckBox70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox70ActionPerformed
        
    }//GEN-LAST:event_jCheckBox70ActionPerformed

    private void jCheckBox71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox71ActionPerformed
        
    }//GEN-LAST:event_jCheckBox71ActionPerformed

    private void jCheckBox72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox72ActionPerformed
        
    }//GEN-LAST:event_jCheckBox72ActionPerformed

    private void jCheckBox73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox73ActionPerformed
        
    }//GEN-LAST:event_jCheckBox73ActionPerformed

    private void jCheckBox74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox74ActionPerformed
        
    }//GEN-LAST:event_jCheckBox74ActionPerformed

    private void jCheckBox75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox75ActionPerformed
        
    }//GEN-LAST:event_jCheckBox75ActionPerformed

    private void jCheckBox76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox76ActionPerformed
        
    }//GEN-LAST:event_jCheckBox76ActionPerformed

    private void jCheckBox77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox77ActionPerformed
        
    }//GEN-LAST:event_jCheckBox77ActionPerformed

    private void jCheckBox78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox78ActionPerformed
        
    }//GEN-LAST:event_jCheckBox78ActionPerformed

    private void jCheckBox79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox79ActionPerformed
        
    }//GEN-LAST:event_jCheckBox79ActionPerformed

    private void jCheckBox80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox80ActionPerformed
        
    }//GEN-LAST:event_jCheckBox80ActionPerformed

    private void YearComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearComboBox1ActionPerformed
        
    }//GEN-LAST:event_YearComboBox1ActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        RegisterAction();
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox34ActionPerformed
        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox34ActionPerformed

    private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox39ActionPerformed
        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox39ActionPerformed

    private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox37ActionPerformed
        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox37ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    //electives:
    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox29ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox29ActionPerformed

    private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox33ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox33ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox32ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox32ActionPerformed

    private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox35ActionPerformed
        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox35ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox38ActionPerformed
        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox38ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox36ActionPerformed
        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox36ActionPerformed

    private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox40ActionPerformed
        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox40ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed

        PrintCoursesElective();
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPortal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CompletedLabel;
    private javax.swing.JLabel CompletedLabel1;
    private javax.swing.JPanel CorePanel;
    private javax.swing.JLabel CurrentSemesterLabel1;
    private javax.swing.JButton DeregisterButton;
    private javax.swing.JPanel ElectivesPanel;
    private javax.swing.JTextField GPATextField;
    private javax.swing.JTextField IDTextField1;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JTextField NameTextField1;
    private javax.swing.JLabel NumRecommendedLabel;
    private javax.swing.JPanel RecommendedPanel;
    private javax.swing.JButton RegClearButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JPanel RegistryPanel;
    private javax.swing.JPanel SelectCoursesPanel;
    private javax.swing.JComboBox<String> SemesterComboBox1;
    private javax.swing.JPanel StudentPortalPanel;
    private javax.swing.JButton SuggestedButton;
    private javax.swing.JComboBox<String> YearComboBox1;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel regcoursesPanel;
    private javax.swing.JButton registrationButton;
    private javax.swing.JButton returnfromrecommendedButton;
    // End of variables declaration//GEN-END:variables
}
