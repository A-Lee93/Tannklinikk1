import java.lang.reflect.Array;
import java.rmi.activation.ActivationGroup_Stub;
import java.util.ArrayList;
import java.util.Calendar;

public class Hoved
{
    public static void main(String... args)
    {
        Calendar birth = Calendar.getInstance();
        birth.set(1966,7,7);
        Person p1 = new Person("Ali", "El Hatri", "Jens Bjelkes Gate 77", 98082434, 25,02,1993 );
        Person p2 = new Person("Fatiha", "Allayouti", "Jens Bjelkes Gate 77", 48357804, birth);
        Tannlege one = new Tannlege(p1.getFornavn(), p1.getEtternavn(), p1.getAdresse(),p1.getTelefon(),p1.getBirthdate(),220,"Implantat");
        Patient one2 = new Patient(p2.getFornavn(),p2.getEtternavn(),p2.getAdresse(),p2.getTelefon(),p2.getBirthdate());

        System.out.println(p1.getInfo());
        System.out.println(p2.getInfoDate());
        ArrayList<Integer> testing = new ArrayList<>();
        Calendar test = Calendar.getInstance();
        ArrayList<Day> days = new ArrayList<>();
        ArrayList<Month> months = new ArrayList<>();

        int i = 0;
        int month = test.get(test.MONTH);
        while(i < 1000)
        {
            Appointment appointment = new Appointment(one,one2);
            Appointment appointment2 = new Appointment(one,one2);
            Appointment appointment3 = new Appointment(one,one2);
            Day day = new Day();
            day.setAppointments(appointment);
            day.setAppointments(appointment2);
            day.setAppointments(appointment3);
            days.add(day);
            //System.out.println(test.getTime());
            test.add(test.DATE,1);
            if(month != test.get(test.MONTH))
            {
                month = test.get(test.MONTH);
                months.add(new Month(days));
                days = new ArrayList<>();
               // System.out.println(test.get(test.MONTH));
            }
            i++;
        }
        /*System.out.println("Antall mnder: " + months.size());
        System.out.println("Antall dager per mnd: ");
        for(Month m : months)
        {
            System.out.println(m.getAmmountOfDays());
        }*/
        Tidsplan tid = new Tidsplan();
        for(Tid t : tid.getTidsplan())
        {
            System.out.print(t.getHour() + ":");
            if(t.getMinute() == 0)
            {
                System.out.print("00");
            }
            else
            {
                System.out.print(t.getMinute());
            }
            System.out.println();
        }
    }
}
