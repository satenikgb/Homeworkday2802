package Day18.validator;

import Day18.Triangle;

public final class TriangleValidator {
    private TriangleValidator(){
        super();
    }
    public static boolean IsValidSideA(int sideA){
        return sideA>=1&&sideA<=20;
    }
    public static boolean IsValidSideB(int sideB){
        return sideB>=1&&sideB<=20;
    }
    public static boolean IsValidSideC(int sideC){
        return sideC>=1&&sideC<=20;
    }
    public static boolean IsValidTriangle(int sideA, int sideB, int sideC)
    {
        return sideA+sideB>sideC&&
                sideB+sideC>sideA&&
                sideC+sideA>sideB;
    }

}
