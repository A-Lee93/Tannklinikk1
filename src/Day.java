import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Day {
    private Calendar time;
    private ArrayList<Tannlege> tannleger;
    private int mndTall, dag;
    private String dagNavn, week, mnd;
    private ArrayList<ArrayList<Integer>> hours;
    private Hour hour;

    public Day(Calendar time, ArrayList<Tannlege> tannleger) {
        this.hours = new Hour().getHour();
        this.hour = new Hour();
        this.time = time;
        this.tannleger = tannleger;
        this.dagNavn = formatToDateName(0);
        this.mndTall = time.get(time.MONTH);
        this.dag = time.get(time.DATE);
        this.mnd = formatToDateName(1);
        this.week = Integer.toString(time.get(time.WEEK_OF_YEAR));
    }

    public ArrayList<Tannlege> getTannleger() {
        return tannleger;
    }

    public String getDagNavn() {
        return dagNavn;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String testOutput() {
        return "Dag: " + dagNavn + "\nUke: " + week + "\nMåned: " + mnd;
    }

    public String formatToDateName(int choise)
    {
        if (choise == 0) {
            String dato =  new SimpleDateFormat("EEEE", Locale.ENGLISH).format(new Date(getTime().get(getTime().YEAR), getTime().get(getTime().MONTH),
                    getTime().get(getTime().DATE)));
            switch (dato)
            {
                case "Monday" :
                {
                    return "Mandag";
                }
                case "Tuesday" :
                {
                    return "Tirsdag";
                }
                case "Wednesday" :
                {
                    return "Onsdag";
                }
                case "Thursday" :
                {
                    return "Torsdag";
                }
                case "Friday" :
                {
                    return "Fredag";
                }
                case "Saturday" :
                {
                    return "Lørdag";
                }
                case "Sunday" :
                {
                    return "Søndag";
                }
                default :
                    return "error";
            }
        }
        else
        {
            switch (getTime().get(getTime().MONTH))
            {
                case 0:
                {
                    return "Januar";

                }
                case 1: {
                    return "Februar";

                }
                case 2: {
                    return "Mars";

                }
                case 3: {
                    return "April";

                }
                case 4: {
                    return "Mai";

                }
                case 5: {
                    return "Juni";

                }
                case 6: {
                    return "July";

                }
                case 7: {
                    return "August";

                }
                case 8: {
                    return "September";

                }
                case 9: {
                    return "Oktober";

                }
                case 10: {
                    return "November";

                }
                case 11: {
                    return "Desember";

                }
                default:
                    return "lol";
            }
        }
    }

    public String getWeek() {
        return week;
    }

    public int getMnd() {
        return mndTall;
    }

    public int getDag() {
        return dag;
    }
}
