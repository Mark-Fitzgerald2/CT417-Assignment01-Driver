/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1.driver;

import ie.nuigalway.fitzgeraldmark.ct417assignment1.*;
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
        
        System.out.println(ece.getName());
        System.out.println(ece.getStartDate());
        System.out.println(ece.getEndDate());
        System.out.println(csit.getName());
        System.out.println(csit.getStartDate());
        System.out.println(csit.getEndDate());
    }
}
