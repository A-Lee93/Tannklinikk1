import java.lang.reflect.Array;
import java.rmi.activation.ActivationGroup_Stub;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
        Tannlege Dhyia = new Tannlege("Dhyia","Aksal", "Test Adresse 1", 22222222, birth, 220,"Trekk");
        Tannlege Amer = new Tannlege("Amer", "Maqbool", "Test Adresse 2", 2222222, birth, 220, "Implantat");
        Tannlege Fatiha = new Tannlege("Fatiha", "Allayouti", "Jens Bjelkes Gate 77", 2222222,birth,220,"Klaging");
        Tannlege Fatima = new Tannlege("Fatima", "El Hatri", "Jens Bjelkes Gate 77", 222222222, birth, 220, "Tegning");

        System.out.println(p1.getInfo());
        System.out.println(p2.getInfoDate());
        ArrayList<Integer> testing = new ArrayList<>();
        Calendar test = Calendar.getInstance();
        ArrayList<Day> days = new ArrayList<>();
        ArrayList<Month> months = new ArrayList<>();
        ArrayList<Tannlege> tannleger = new ArrayList<>();
        tannleger.add(one);
        tannleger.add(Dhyia);
        tannleger.add(Amer);
        tannleger.add(Fatiha);
        tannleger.add(Fatima);

        int i = 0;
        int month = test.get(test.MONTH);
        String tiden;
        Day day;
        while(i < 1000)
        {
            Appointment appointment = new Appointment(one,one2,test);
            Appointment appointment2 = new Appointment(one,one2,test);
            Appointment appointment3 = new Appointment(one,one2,test);
            day = new Day(test,tannleger);
            days.add(day);
            //System.out.println(test.getTime());
            System.out.println(day.testOutput());
            test.add(test.DATE,1);
            if(month != test.get(test.MONTH))
            {
                month = test.get(test.MONTH);
                months.add(new Month(days));
                days = new ArrayList<>();
                System.out.println(test.get(test.MONTH));
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
            System.out.print((t.getHour() + 8) + ":");
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
        Calendar calTest = Calendar.getInstance();
        calTest.set(calTest.get(calTest.YEAR), calTest.get(calTest.MONTH),28, 18,30 );
        Appointment testApp = new Appointment(one, one2, calTest);
        System.out.println(testApp.getAppointment());
        one.addAppointment(testApp);
        one.addAppointment(testApp);
        Fatiha.addAppointment(testApp);
        Fatiha.addAppointment(testApp);
        for(Day d : months.get(0).getDays())
        {
            for(Tannlege t : d.getTannleger())
            {
                for (Appointment a : t.getAppointments())
                {
                    if(a.getAppointmentDate().get(a.getAppointmentDate().MONTH) == d.getMnd() && a.getAppointmentDate().get(
                            a.getAppointmentDate().DATE
                    ) == d.getDag())
                    {
                        System.out.println("Appointment at: " + a.getAppointmentDate().getTime() + "\nTannlege: " + t.getFornavn());
                    }
                }
            }
        }
    }
}
