import java.util.Calendar;

public class Appointment
{
    private Tannlege tannlege;
    private Patient patient;
    private int hour, minute, day, month, year;

    public Appointment(Tannlege tannlege, Patient patient, Calendar calendar)
    {
        this.tannlege = tannlege;
        this.patient = patient;
        this.hour = calendar.get(calendar.HOUR);
        this.minute = calendar.get(calendar.MINUTE);
        this.day = calendar.get(calendar.DATE);
        this.month = calendar.get(calendar.MONTH);
        this.year = calendar.get(calendar.YEAR);
    }
    public String getAppointment()
    {
        return "Appointment at: " + hour + ":" + minute;
    }
    public Calendar getAppointmentDate()
    {
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,day,hour,minute,0);
        return cal;
    }

}
