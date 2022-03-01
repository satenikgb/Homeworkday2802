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
    public int getCountOfWorkers()
    {

        return this.countOfWorkers;
    }
    public void setCountOfWorkers(){

            this.countOfWorkers=countOfWorkers;

    }
    public String getName()
    {
        return this.name;
    }
    public void setName()
    {
        this.name=name;
    }
    public int getPhoneNumber()
    {
        return this.phoneNumber;

    }
    public void setPhoneNumber()
    {

            this.phoneNumber=phoneNumber;

    }
    public int getProductNumbers(){
        return this.phoneNumber;
    }
    public void setProductNumbers()
    {
        this.productNumbers=productNumbers;
    }


}
