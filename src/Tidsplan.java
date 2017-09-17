import java.util.ArrayList;

public class Tidsplan
{
    private ArrayList<Tid> tidsplan;

    public Tidsplan()
    {
        tidsplan = new ArrayList<>();
        Hour hour = new Hour();
        for(int i = 0; i < hour.getHour().size(); i++)
        {
            Tid tid;
            for(int j = 0; j < hour.getHour().get(i).size(); j++)
            {
                tid = new Tid();
                tid.setHour(hour.getHour(i));
                tid.setMinute(hour.getMinute(i,j));
                tidsplan.add(tid);
            }
        }
    }
    public ArrayList<Tid> getTidsplan()
    {
        return tidsplan;
    }
}
