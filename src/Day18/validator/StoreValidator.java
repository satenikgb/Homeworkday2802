package Day18.validator;

public final class StoreValidator {
    private StoreValidator(){
        super();
    }
    public static boolean ValidsetCountOfWorkers(int countOfWorkers)
    {
        return (countOfWorkers>=2&&countOfWorkers<=50);
    }
    public static boolean ValidSetName(String name)
    {
        return name.length()>=3;
    }
    public static boolean ValisSetPhoneNumber(int phoneNumber)
    {
        return (phoneNumber>=10000000&&phoneNumber<=99999999);
    }

}
