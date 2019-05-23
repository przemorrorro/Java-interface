import java.util.Scanner;

public class Hospital {

    private final int maxPatientsNumber = 10; //maxymalna liczba pacjentów
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int registered =0;

    public void addPatient(Patient patient){
        if(registered<maxPatientsNumber){
            patients[registered]=patient;
            registered++;
        }
    }

    public void printPatients(){
        for (int i=0; i<registered;i++){
            System.out.println("Pacjent nr "+i+": ");
            System.out.println(patients[i].getName() + " "
                    + patients[i].getLastName() + " "
                    + patients[i].getPesel());
        }
    }

}
