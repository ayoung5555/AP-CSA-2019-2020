
public class CheckupTester {
	public static void main(String[] args) {
		Checkup patient1 = new Checkup();
		patient1.setPatientNumber(123456);
		patient1.setDiastolicPressure(74);
		patient1.setSystolicPressure(128);
		patient1.setHDL(140);
		patient1.setLDL(100);
		double ratio = patient1.computeRatio();
		System.out.println(ratio); // 0.7142857142857143
		System.out.println(patient1.displayPatientStats());
		System.out.println(patient1.displayHealthStatus()); // Healthy
		System.out.println();

		Checkup patient2 = new Checkup();
		patient2.setPatientNumber(123456);
		patient2.setDiastolicPressure(65);
		patient2.setSystolicPressure(123);
		patient2.setHDL(85);
		patient2.setLDL(400);
		ratio = patient2.computeRatio();
		System.out.println(ratio); // 4.705882352941177
		System.out.println(patient2.displayPatientStats());
		System.out.println(patient2.displayHealthStatus()); // See a doctor

	}
}
