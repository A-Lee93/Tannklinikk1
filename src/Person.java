import java.sql.Time;
import java.time.Year;
import java.util.Calendar;


public class Person
{
    private String fornavn, etternavn, adresse;
    private int telefon, dag, mnd, aar;
    private Calendar birthdate;

    public Person()
    {

    }
    public Person(String fornavn, String etternavn, String adresse, int telefon, int dag, int mnd, int aar)
    {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefon = telefon;
        this.dag = dag;
        this.mnd = mnd;
        this.aar = aar;
    }
    public Person(String fornavn, String etternavn, String adresse, int telefon, Calendar birthdate)
    {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefon = telefon;
        this.birthdate = birthdate;
    }
    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public int getMnd() {
        return mnd;
    }

    public void setMnd(int mnd) {
        this.mnd = mnd;
    }

    public int getAar() {
        return aar;
    }

    public void setAar(int aar) {
        this.aar = aar;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }
    public String getInfo()
    {
        return "Fornavn: " + getFornavn() + "\nEtternavn: " + getEtternavn() + "\nAlder: " + getAlder() + "\nAdresse: " + getAdresse() +
                "\nTelefon " + getTelefon();
    }
    public String getInfoDate()
    {
        return "Fornavn: " + getFornavn() + "\nEtternavn: " + getEtternavn() + "\nAlder: " + getAlder() + "\nAdresse: " + getAdresse() +
                "\nTelefon " + getTelefon() + "\nFødselsdato: " + birthdate.getTime();
    }
    public int getAlder()
    {
        return Year.now().getValue() - aar;
    }
}
