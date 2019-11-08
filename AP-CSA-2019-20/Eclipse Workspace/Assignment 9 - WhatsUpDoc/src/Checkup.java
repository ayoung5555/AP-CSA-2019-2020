//Andrew Young
//Assignment 9
//Checkup.java 
//5-21-19
public class Checkup {
	
	private int patNum, diaPres, sysPres;
	private double hdlNum, ldlNum;
	
	public Checkup() { //overloading stuff
		int p = 123333;
		int x = 999;
		int y = 97;
		double h = 99.1;
		double l = 9.1;
		
	}
	
	public Checkup(int p, int x, int y, double h, double l) {
		patNum = p;
		diaPres = x;
		sysPres = y; //sets vars usable in different constructors
		hdlNum = h;
		ldlNum = l;
	}
	
	
	void setPatientNumber(int in) {	//		\
		patNum = in; 				//		 \
	}								//		  |
				//							  |
	void setSystolicPressure(int in) { //	  |
		sysPres = in;			//			  |
	}			//							  |
	//										  |
	void setDiastolicPressure(int in) {	//	  |
		diaPres = in; //					  |
	} //									  \
//											   |- If parameters are given, it sets
	void setHDL(double in) { //				  /	  the defaults to those instead
		hdlNum = in; //						  |
	} //									  |
	//										  |
	void setLDL(double in) { //				  |
		ldlNum = in;//						  |
	}					//					  |
	//										  |
	double computeRatio() { //				  |
		return ldlNum/hdlNum; //			  |
	}//										 /
	//										/
	String displayPatientStats() {
		return ("Patient Num: " + Integer.toString(patNum) +"\nDiastolic Pressure: " + Integer.toString(diaPres) + "\nSystolic Pressure: " + Integer.toString(sysPres) + "\nHDL: " + Double.toString(hdlNum) + "\nLDL: " + Double.toString(ldlNum));
		// ^ combines the variables to a single string and prints it	
	}
	
	
	String displayHealthStatus() {
		if ((ldlNum/hdlNum < 3.5) && (sysPres < 129) && (diaPres < 89)) {
			return "Healthy"; //checks the values for the vars and returns them if they fit
		} else {
			return "See a doctor ASAP"; // uh oh
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
