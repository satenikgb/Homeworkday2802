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

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        if(firstName.length()>=3&&firstName.length()<=15) {
            this.firstName = firstName;
        }
        else {
            System.out.println("Invalid firstName");

        }

    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        if(lastName.length()>=6&&lastName.length()<=20) {
            this.lastName = lastName;
        }else {
            System.out.println("Invalid Lastname");
        }
    }
    public String getPassportId(){
        return this.passportId;
    }
    public void setPassportId(String passportId){
        boolean b=true;
        for(int i=2;i<passportId.length();i++) {
            char ch=passportId.charAt(i);
            b = b && Character.isDigit(ch);

            if(!b){
                break;
            }

        }
        if(passportId.length()==8&&passportId.startsWith("AN")&&b){
            this.passportId=passportId;
        }else {
            System.out.println("Invalid passportId");
        }

    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age>=18&&age<=99) {
            this.age = age;
        }else {
            System.out.println("Invalid Age");
        }

    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        if (gender.compareToIgnoreCase("male") == 0||gender.compareToIgnoreCase("female")==0 ){
            this.gender=gender;
    }else
    {
        System.out.println("Invalid gender");
        }
    }
    public String getNationality(){
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
