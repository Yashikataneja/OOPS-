import java.util.ArrayList;

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        patients.add(p);
        p.doctors.add(this);
        System.out.println("Doctor " + name + " consulted patient " + p.name);
    }
}

class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    String name;

    Hospital(String name) {
        this.name = name;
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Verma");
        Doctor d2 = new Doctor("Dr. Gupta");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Neha");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
