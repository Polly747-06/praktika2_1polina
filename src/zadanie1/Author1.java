package zadanie1;

public class Author1 {

    private String Name;
    private String Email;
    private char Gender;

    public Author1(String name, String email, char gender) {
        this.Name = name;
        this.Email = email;
        this.Gender = gender;
    }

    public String GetName(String name) {
        return name;
    }

    public String GetEmail(String email) {
        return email;
    }

    public void SetEmail(String email) {
        this.Email = email;
    }

    public char GetGender() {
        return this.Gender;
    }

    public String toString() {
        return this.Name + this.Email + this.Gender;
    }

    public void out()
    {
        System.out.println("Имя - " + this.Name + "; Почта - " + this.Email + "; Гендер - " + this.Gender + ";");
    }
}
