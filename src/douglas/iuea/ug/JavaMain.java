 package douglas.iuea.ug;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaMain {
	
	public static void main(String[] args) {
		
		Java2 std1 = new Java2("18/UG/154/BSCS-S","Masagazi Douglas",1997);	
		
		System.out.println("STUDENT NAME :"+std1.getName());
		
		System.out.println("STUDENT YEAR OF BIRTH :"+std1.getYOB());		
		
		System.out.println("STUDENT REGISTRATION NUMBER :"+std1.getRegNO());
		
		std1.getCourseWork();
		
		}
	
     }

