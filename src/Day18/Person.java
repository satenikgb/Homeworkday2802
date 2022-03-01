package Day18;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person(
            String firstName,
            String lastName,
            String passportId,
            int age,
            String gender,
            String nationality){
       this.setFirstName(firstName);
       this.setLastName(lastName);
       this.setPassportId(passportId);
       this.setAge(age);
       this.setGender(gender);
       this.nationality=nationality;

    }
    public Person(){
        super();
    }

    public String getFirstName()
    {
        return this.firstName;

    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;

    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getPassportId()
    {
        return this.passportId;

    }
    public void setPassportId(String passportId)
    {
        this.passportId=passportId;

    }
    public int getAge()
    {
        return this.age;

    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getGender()
    {
        return this.gender;

    }
    public void setGender(String gender)
    {
        this.gender=gender;

    }
    public String getNationality()
    {

        return this.nationality;
    }
    public void setNationality(String nationality){

        this.nationality=nationality;
    }
    public void display(){
        System.out.println("FirstName is "+this.firstName+'\n'+"Lastname is "+this.lastName+'\n'
        +"PassportId is "+this.passportId+'\n'+
                "Age is "+this.age+'\n'+
                "Gender is "+this.gender+'\n'+
                "Nationality is "+this.nationality);
    }


}
