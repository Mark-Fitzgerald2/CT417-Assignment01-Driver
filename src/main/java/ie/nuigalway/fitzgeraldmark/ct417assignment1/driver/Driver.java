/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1.driver;

import ie.nuigalway.fitzgeraldmark.ct417assignment1.*;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author Mark Fitzgerald, NUI Galway
 */
public class Driver {
    public static void main(String[] args){
        Course ece = new Course("Electronic and Computer Engineering (ECE)", DateTime.parse("10/09/2018", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("10/05/2019", DateTimeFormat.forPattern("dd/MM/yyyy")));
        Course csit = new Course("Computer Science and Information Technology (CS&IT)", DateTime.parse("10/09/2018", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("10/05/2019", DateTimeFormat.forPattern("dd/MM/yyyy")));
        
        Module softEng = new Module("Software Engineering III", "CT417");
        Module ml = new Module("Machine Learning and Data Mining", "CT475");    
        Module eceFYP = new Module("Electronic and Computer Engineering Project", "CT434");
        Module tele = new Module("Telecommunications Software Applications", "EE453");
        Module dsp = new Module("Digital Signal Processing", "EE445");
        Module soc = new Module("System on Chip Design I", "EE451");
        Module csitFYP = new Module("Computer Science and Information Technology Project", "CT413");
        Module aps = new Module("Advanced Professional Skills", "CT436");
        Module graph = new Module("Graphics & Image Processing", "CT404");
        Module geom = new Module("Euclidean & Non-Euclidean Geometry", "MA3101");
        
        ece.addModule(softEng);
        ece.addModule(ml);
        ece.addModule(eceFYP);
        ece.addModule(tele);
        ece.addModule(dsp);
        ece.addModule(soc);
        csit.addModule(softEng);
        csit.addModule(ml);
        csit.addModule(csitFYP);
        csit.addModule(aps);
        csit.addModule(graph);
        csit.addModule(geom);
        
        Student rachel = new Student("Rachel Green", 21, DateTime.parse("25/05/1997", DateTimeFormat.forPattern("dd/MM/yyyy")), "154789");
        Student phoebe = new Student("Phoebe Buffay", 20, DateTime.parse("17/12/1997", DateTimeFormat.forPattern("dd/MM/yyyy")), "132654");
        Student joey = new Student("Joey Tribbiani", 25, DateTime.parse("12/01/1993", DateTimeFormat.forPattern("dd/MM/yyyy")), "198745");
        Student monica = new Student("Monica Geller", 22, DateTime.parse("30/11/1995", DateTimeFormat.forPattern("dd/MM/yyyy")), "741423");
        Student chandler = new Student("Chandler Bing", 21, DateTime.parse("02/02/1997", DateTimeFormat.forPattern("dd/MM/yyyy")), "715845");
        Student ross = new Student("Ross Geller", 29, DateTime.parse("09/06/1989", DateTimeFormat.forPattern("dd/MM/yyyy")), "012753");
        Student janice = new Student("Janice Hosenstein", 24, DateTime.parse("20/04/1994", DateTimeFormat.forPattern("dd/MM/yyyy")), "354126");
        Student ben = new Student("Ben Geller", 22, DateTime.parse("27/03/1996", DateTimeFormat.forPattern("dd/MM/yyyy")), "485269");
        Student paul = new Student("Paul Stevens", 20, DateTime.parse("01/01/1998", DateTimeFormat.forPattern("dd/MM/yyyy")), "785435");
        Student melissa = new Student("Melissa Warburton", 23, DateTime.parse("18/07/1995", DateTimeFormat.forPattern("dd/MM/yyyy")), "455164");
        
        ece.addStudent(rachel);
        ece.addStudent(phoebe);
        ece.addStudent(joey);
        ece.addStudent(monica);
        ece.addStudent(chandler);
        csit.addStudent(ross);
        csit.addStudent(janice);
        csit.addStudent(ben);
        csit.addStudent(paul);
        csit.addStudent(melissa);
        
        //print students registered for ECE
        System.out.println("*********** Registered ECE Students **********");
        ArrayList<Student> eceStudents = ece.getStudents();
        for(Student s:eceStudents){
            System.out.println(s.getUsername());
        }
        //print out modules registerd for ECE
        System.out.println("\n*********** Registered ECE Modules **********");
        ArrayList<Module> eceModules = ece.getModules();
        for(Module m:eceModules){
            System.out.println(m.getId() + " " + m.getName());
        }
        
        //print students registered for CS&IT
        System.out.println("\n*********** Registered CSIT Students **********");
        ArrayList<Student> csitStudents = csit.getStudents();
        for(Student s:csitStudents){
            System.out.println(s.getUsername());
        }
        //print out modules registerd for ECE
        System.out.println("\n*********** Registered ECE Modules **********");
        ArrayList<Module> csitModules = csit.getModules();
        for(Module m:csitModules){
            System.out.println(m.getId() + " " + m.getName());
        }
        
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(softEng);
        modules.add(ml);
        modules.add(eceFYP);
        modules.add(tele);
        modules.add(dsp);
        modules.add(soc);
        modules.add(csitFYP);
        modules.add(aps);
        modules.add(graph);
        modules.add(geom);
        
        ArrayList<Student> moduleStudents;
        ArrayList<Course> moduleCourses;
        //create a loop to go through all created modules
        for(Module m:modules){
            //store values returned in arraylist
            moduleStudents = m.getStudents();
            moduleCourses = m.getCourses();
            System.out.println("\n********** Registered students for module " + m.getId() + " " + m.getName() + " **********");
            //print out every student assigned to that module
            for(Student s : moduleStudents) {
                System.out.println(s.getUsername());
            }
            System.out.println("\n********** Registered courses for module " + m.getId() + " " + m.getName() + " **********");
            //print out every student assigned to that module
            for(Course c : moduleCourses) {
                System.out.println(c.getName());
            }
        }
    }
}
