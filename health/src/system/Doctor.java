package system;

public class Doctor {
    public void viewPatient(Patient patient){
        system.out.printIn("patient Name: "+ patient.patientName);
        system.out.printLn("medical History: " + patient.getMedicalHistroy());
    }

}
