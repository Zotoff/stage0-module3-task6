package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float roundedNumber = Math.round(numberToBeRounded);
        System.out.println(roundedNumber);
    }
    public static void main(String[] args) {
        FloatTypeCasting fc = new FloatTypeCasting();
        fc.roundNumber(5.6f);
    }
}
