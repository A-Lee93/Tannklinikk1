import java.util.ArrayList;

public class Tid
{
    private int hour;
    private int minute;
    public Tid()
    {

    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
class Hour
{
    private ArrayList<ArrayList<Integer>> hour;
    private ArrayList<Integer> minutes;

    public Hour()
    {
        minutes = new ArrayList<>();
        hour = new ArrayList<>();
        int munut = 0;
        for(int i = 0; i < 4; i++)
        {
            int minute = 15 * i;
            if(minute == 0)
            {
                minute = 00;
            }
            System.out.println("Minute added: " + minute);
            munut++;
            System.out.println("Minutes: " + munut);
            minutes.add(minute);
        }
        hour = new ArrayList<>();
        for(int i = 0; i < 12; i++)
        {
            hour.add(minutes);
        }
        System.out.println("Number of hours: " + hour.size());
    }
    public ArrayList<ArrayList<Integer>> getHour()
    {
        return hour;
    }

    public int getMinute(int indexH,int indexM)
    {
        if(indexH < 0 || indexH > 23)
        {
            System.out.println("Wront with Hour!");
            return -1;
        }
        else if(indexM < 0 || indexM > 3)
        {
            System.out.println("Wrong with minute!");
            return -1;
        }
        else
        {
            return hour.get(indexH).get(indexM);
        }
    }
    public int getHour(int indexH)
    {
        if(indexH < 0 || indexH > 23)
        {
            System.out.println("Wront with Hour!");
            return -1;
        }
        else
        {
            return indexH;
        }
    }
}
