import system.patient;
import system.Doctor;
public class Main {
    public static void main(String[]args) {
        patient patient = new patient("Lynn Mary", "Diabetes treatment");
        Doctor doctor =new Doctor();
        doctor.viewPatient(patient);
        doctor.updatePatient(patient);
        System.out.println("\n---After update---");
        System.out.println("Medical History: "+patient.getMedicalHistory());
        System.out.println("\n---Receptionist view----");
        System.out.println("Patient Name: " + patient.patientName);
    }

}
