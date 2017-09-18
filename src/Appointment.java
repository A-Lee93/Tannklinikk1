import java.util.Calendar;

public class Appointment
{
    private Tannlege tannlege;
    private Patient patient;
    private int hour, minute;

    public Appointment(Tannlege tannlege, Patient patient, Calendar calendar)
    {
        this.tannlege = tannlege;
        this.patient = patient;
        this.hour = calendar.get(calendar.HOUR);
        this.minute = calendar.get(calendar.MINUTE);
    }
    public String getAppointment()
    {
        return "Appointment at: " + hour + ":" + minute;
    }

}
