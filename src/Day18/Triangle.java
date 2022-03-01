package Day18;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    public Triangle(int sideA,
                    int sideB,
                    int sideC){
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }
    public int getSideA()
    {

        return this.sideA;
    }
    public void setSideA(int sideA)
    {
        this.sideA=sideA;
    }
    public int getSideB()
    {
        return this.sideB;
    }
    public void setSideB(int sideB)
    {
        this.sideB=sideB;
    }
    public int getSideC()
    {
        return this.sideC;
    }
    public void setSideC(int sideC)
    {
            this.sideC=sideC;
    }
    public boolean check(){
       return this.isTriangle();
    }

    public boolean isRighttriangle(){
        if((sideA*sideA==sideC*sideC+sideB*sideB)||
        (sideB*sideB==sideC*sideC+sideA*sideA)||
                (sideC*sideC==sideA*sideA+sideB*sideB)){
            return true;
        }
        return false;
    }

    public int calculateAreaorPerimeter(){
        if (isRighttriangle()){
            if(sideA>sideB&&sideA>sideC){
                return (sideC*sideB)/2;
            }
            if(sideB>sideA&&sideB>sideC){
                return (sideC*sideA)/2;
            }
            if(sideC>sideB&&sideC>sideA){
                return (sideA*sideB)/2;
            }
        }
        return sideA+sideB+sideC;
    }

}
