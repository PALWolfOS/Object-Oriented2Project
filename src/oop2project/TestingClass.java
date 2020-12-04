/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2project;

/**
 *
 * @author joshu_000
 */
public class TestingClass {
    
    public static void main(String[] args) {
        StudentInputRepository rep = new StudentInputRepository();
        StudentPortal gui = new StudentPortal();
        gui.setVisible(true);

        for(Iterator iter = rep.getIterator(); iter.hasNext();){
            String name = (String)iter.nextname();
            String ID = (String)iter.nextID();
            String year = (String)iter.nextyear();
            String semester = (String)iter.nextsemester();
            String course = (String)iter.nextcourse();
         
         
            System.out.println("Name : " + name);
        } 	
   }
}
