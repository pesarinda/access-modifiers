package system;

public class Doctor {
    public void viewPatient(Patient patient){
        system.out.printIn("patient Name: "+ patient.patientName);
        system.out.printLn("medical History: " + patient.getMedicalHistroy());
    }
    public void updatePatient(Patient patient){
        patient.updateMedicalHistory("updated:Patient is recovering.");
    }

}
