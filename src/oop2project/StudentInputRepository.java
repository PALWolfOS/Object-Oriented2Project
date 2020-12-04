/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2project;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author joshu_000
 */
public class StudentInputRepository implements Container{
    
    private int x;
    
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    public String IDs[] = {"815012897" , "816013790" ,"811120393" , "811176654"};
    public String semesters[] = {"Semester 1" , "Semester 2" ,"Summer" , "Summer"};
    public String years[] = {"2019/2020" , "2020/2021" ,"2020/2021" , "2020/2021"};
    public String courses[] = {"COMP 2606" , "COMP 3602" ,"COMP 3605" , "COMP 2611"};
    
    public StudentInputRepository(){

    }
    

    @Override
    public Iterator getIterator() {
        return new InputIterator();
   }

    private class InputIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
      
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object nextname() {
      
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }	
        
        @Override
        public Object nextID() {
      
            if(this.hasNext()){
                return IDs[index++];
            }
            return null;
        }
        
        @Override
        public Object nextyear() {
      
            if(this.hasNext()){
                return years[index++];
            }
            return null;
        }
        
        @Override
        public Object nextsemester() {
      
            if(this.hasNext()){
                return semesters[index++];
            }
            return null;
        }
        
        @Override
        public Object nextcourse() {
      
            if(this.hasNext()){
                return courses[index++];
            }
            return null;
        }
   }
}
    
    
         
    


