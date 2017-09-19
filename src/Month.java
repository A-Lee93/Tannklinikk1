import java.util.ArrayList;

public class Month
{
    private ArrayList<Day> days;
    private int mnd;
    private String mndNavn;

    public Month(ArrayList<Day> days)
    {
        this.days = days;

    }
    public Day getDay(int day)
    {
        return days.get(day);
    }

    public ArrayList<Day> getDays()
    {
        return days;
    }
    public int getAmmountOfDays()
    {
        return days.size();
    }
}
