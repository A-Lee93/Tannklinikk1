import java.util.Calendar;

public class Sekretaer extends Person
{
    private int lonn;
    private static int ansattID = 0;

    public Sekretaer(String fornavn, String etternavn, String adresse, int telefon, Calendar birthdate, int lonn)
    {
        super(fornavn,etternavn,adresse,telefon,birthdate);
        this.lonn = lonn;
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
}
