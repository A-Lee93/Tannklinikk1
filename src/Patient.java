import java.util.Calendar;

public class Patient extends Person
{
    public Patient(String firstname, String lastname, String adress, int phone, Calendar birthdate)
    {
        super(firstname,lastname,adress,phone,birthdate);
    }
    public String getPatientInfo()
    {
        return super.getInfoDate();
    }
}
