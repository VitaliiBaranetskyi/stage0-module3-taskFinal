package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        System.out.println(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(0))) +
                Integer.parseInt(String.valueOf(String.valueOf(number).charAt(1))) +
                Integer.parseInt(String.valueOf(String.valueOf(number).charAt(2))) +
                        Integer.parseInt(String.valueOf(String.valueOf(number).charAt(3))));
    }
}
