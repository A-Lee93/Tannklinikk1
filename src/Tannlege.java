import java.util.ArrayList;
import java.util.Calendar;

public class Tannlege extends Person
{
    private int lonn;
    private String spesialitet;
    private static int ansattID = 0;
    private ArrayList<Appointment> appointments;

    public Tannlege(String fornavn, String etternavn, String adresse, int telefon, Calendar birthdate, int lonn, String spesialitet)
    {
        super(fornavn,etternavn,adresse,telefon,birthdate);
        appointments = new ArrayList<>();
        this.lonn = lonn;
        this.spesialitet = spesialitet;
        ansattID++;
    }

    public String getInfo()
    {
        return super.getInfoDate() + "\nLønn: " + getLonn();
    }
    public void endreLonn(int lonn)
    {
        if(lonn <= 0)
        {
            System.out.println("Du kan ikke sette et negativ tall eller ingenting som lønn!");
        }
        else
        {
            this.lonn = lonn;
        }
    }
    public int getLonn()
    {
        return lonn;
    }
    public void addAppointment(Appointment appointment)
    {
        boolean exist = false;
        for(Appointment app : appointments)
        {
            if(appointment.getAppointment().equalsIgnoreCase(app.getAppointment()))
            {
                exist = true;
                break;
            }
        }
        if(exist == true)
        {
            System.out.println("Cannot add appointment at this time! One already exist");
        }
        else
        {
            appointments.add(appointment);
            System.out.println("Appointment added");
        }
    }
    public ArrayList<Appointment> getAppointments()
    {
        return appointments;
    }
}
