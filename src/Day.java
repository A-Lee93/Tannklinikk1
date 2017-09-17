import java.util.ArrayList;
import java.util.Calendar;

public class Day
{
    private ArrayList<Appointment> appointments;
    private Calendar time;

    public Day()
    {
        appointments = new ArrayList<>();
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment appointment)
    {
        appointments.add(appointment);
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }
}
