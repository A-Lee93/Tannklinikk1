import java.util.ArrayList;

public class Year
{
    private ArrayList<Month> months;
    private int year;
    public Year(int year, ArrayList<Month> months)
    {
        this.year = year;
        this.months = months;
    }
    public int getYear()
    {
        return year;
    }
    public Month getMonth(int month)
    {
        return months.get(month);
    }
}
