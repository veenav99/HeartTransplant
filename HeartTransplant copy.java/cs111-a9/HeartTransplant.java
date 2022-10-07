/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 * 
 * @author Veena Vrushi, vv274@scarletmail.rutgers.edu, vv274
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {

        // WRITE YOUR CODE HERE
        patients = null;
        survivabilityByAge = null;
        survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        // WRITE YOUR CODE HERE
        return patients;
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        // WRITE YOUR CODE HERE
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        // WRITE YOUR CODE HERE
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        // WRITE YOUR CODE HERE
        patients = new Patient[numberOfLines];
        for (int v = 0; v < patients.length; v++){
            int ID = Stdln.readInt();
            int Ethnicity = Stdln.readInt();
            int Gender = Stdln.readInt();
            int Age = Stdln.readInt();
            int Cause = Stdln.readInt();
            int Urgency = Stdln.readInt();
            int StateOfHealth = Stdln.readInt();
            patients[v] = new Patient(ID, Ethnicity, Gender, Age, Cause, Urgency, StateOfHealth);
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        // WRITE YOUR CODE HERE
        survivabilityByAge = new SurvivabilityByAge();
        for (int v = 0; v < numberOfLines; v++){
            int Age = Stdln.readInt();
            int Year = Stdln.readInt();
            double Rate = Stdln.readDouble();
            survivabilityByCause.addData(Age, Year, Rate);
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // WRITE YOUR CODE HERE
        survivabilityByCause = new SurvivabiltyByCause();
        for (int v = 0; v < numberOfLines; v++){
            int Cause = Stdln.readInt();
            int Year = Stdln.readInt();
            double Rate = Stdln.readDouble();
            survivabilityByCause.addData(Cause, Year, Rate);
        }
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        // WRITE YOUR CODE HERE
        Patient[] patientsAboveAge;
        int K = 0;
        for (Patient patient : patient){
            if (patient != null && patient.getAge() > age){
                K++;
            }
        }
        patientsAboveAge = new Patient[I];
        int v = 0;
        for (Patient patient : patients){
            if (patient != null && patient.getAge() > age){
                patientsAboveAge[v] = patient;
                v++;
            }
        }
        return patientsAboveAge;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {
        Patient[] patientsByHeartConditionCause;
        int distance = 0;
        for (Patient patient : patients){
            if (patient != null && patient.getCause() == cause){
                distance++;
            }
        }
        patientsByHeartConditionCause = new Patient[length];
        int v = 0;
        for (Patient patient : patients){
            if (patient != null && patient.getCause() == cause){
                patientsByHeartConditionCause[v] = patient;
                v++;
            }
        }
        return patientsByHeartConditionCause;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {
        // WRITE YOUR CODE HERE
        Patient[] patientsByUrgency;
        int distance = 0;
        for (Patient patient : patients){
            if (patient != null && patient.getUrgency() >= urgency){
                distance++;
            }
        }
        patientsByUrgency = new Patient[length];
        int v = 0;
        for (Patient patient: patients){
            if (patient != null && patient.getUrgency() >= urgency){
                patientsByUrgency[v] = patient;
                v++;
            }
        }
	return patientsByUrgency;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {
	// WRITE YOUR CODE HERE
    Patient[] patientsByUrgency = getPatientsByUrgency(1);
    double [] sRates = new double[patientsByUrgency.length];
    for (int j = 0; j < sRates.length; j++){
        sRates[j] = (surviabilityByAge.getRate(patientsByUrgency[j].getAge(), 3) + survivabilityByCause.getRate(patientsByUrgency[j].getCause(), 3))/2;
    }

    int MaximumIndex = 0;
    for (int j = 0; j < sRates.length; j++){
        if (sRates[j] > sRates[MaximumIndex] && patientsByUrgency[j].getNeedHeart()){
            MaximumIndex = j;   
        }
    }

    patientsByUrgency[MaximumIndex].setNeedHeart(false);
	return patientsByUrgency[MaximumIndex];
    }
}