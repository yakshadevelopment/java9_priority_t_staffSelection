package edu.yaksha.staffSelection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
	

    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of applicants:");
        int no=Integer.parseInt(scanner.nextLine());
        ArrayList<Applicant> applicantList=new ArrayList<Applicant>();
        /*
         * Your Code
         */
         
         
         for(Applicant app:applicantList)
        	 System.out.println(app);
         
       
        	
    }
}
