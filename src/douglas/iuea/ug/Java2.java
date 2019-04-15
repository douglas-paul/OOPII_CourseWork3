 package douglas.iuea.ug;

import java.util.Scanner;

public class Java2 {
	private String RegNO;
	private String Name;
	private int YOB;
	
	int sum;
	private String []units;
	public Java2(String RegNO,String Name, int YOB ){
		this.RegNO = RegNO;
		this.Name = Name;
		this.YOB = YOB;
		
	}
	public String getRegNO() {
		return RegNO;
	}
	public void setRegNO(int regNO) {
		RegNO = RegNO;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYOB() {
		return YOB;
	}
	public void setYOB(int yOB) {
		YOB = yOB;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	Scanner scan = new Scanner(System.in);
	private void courseWork() {
		return;
	}
	public void getCourseWork() {	

		System.out.println("           STUDENT'S COURSE UNITS: ");		
		 int n=7;
		  String units[] = {"Research Methods", "Networking" ,"OOP II","Calculus","OperatingSystems","Systems Analysis And Design","Web Design II"};
		  int []p = new int[n];	
		int sum = 0;
		 int Avg = 0;
		
		for(int i = 0; i< n; i++) {
			System.out.println(units[i]);	
			int scan = new Scanner(System.in).nextInt();
				
		 for(int j = 0; j< n; j++) {
			int q  = scan; 
			p[j] =  q;	
		   }						
		}
		
		for( int k : p) {
			sum = sum +k;
		   
			int y = 7;
			Avg = sum/y;
		}	
		
			System.out.println("TOTAL: "+sum);
			System.out.println("AVERAGE: "+Avg);
		
	}
		
	public void setRegNO(String regNO) {
		RegNO = regNO;
		
	}
	public int getSum() {
		return sum;
		
	}
	public void setSum(int sum) {
		this.sum = sum;
		
	}
	public String[] getunits() {
		return units;
		
	}
	public void setC(String[] units) {
		this.units = units;
	}
	


}
