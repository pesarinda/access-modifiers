package system;

public class patient {
    public String patientName;
    private String medicalHistory;
    String insuranceDetails;
    protected String doctorNotes;
    public patient (String name, String history) {
        patientName=name;
        medicalHistory= history;
        insuranceDetails="Private Insurance";
        doctorNotes="Needs regular check-up";
    }

}
