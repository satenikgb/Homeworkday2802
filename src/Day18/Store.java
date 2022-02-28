package Day18;

public class Store {
    private int countOfWorkers;
    private String name;
    private int phoneNumber;
    private int[] productNumbers;
    public Store(int countOfWorkers,String name,int phoneNumber,int[] productNumbers){
        this.setCountOfWorkers();
        this.setName();
        this.phoneNumber=phoneNumber;
        this.productNumbers=productNumbers;
    }
    public int getCountOfWorkers(){
        return this.countOfWorkers;
    }
    public void setCountOfWorkers(){
        if(countOfWorkers>=2&&countOfWorkers<=50){
            this.countOfWorkers=countOfWorkers;
        }else
        {
            System.out.println("Invalid");
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        if(name.length()>=3){
            this.name=name;
        }
        else
        {
            System.out.println("Invalid name");
        }
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(){
        if(phoneNumber>=10000000&&phoneNumber<=99999999){
            this.phoneNumber=phoneNumber;
        } else
        {
            System.out.println("Invalid phonenumber");
        }
    }


}
