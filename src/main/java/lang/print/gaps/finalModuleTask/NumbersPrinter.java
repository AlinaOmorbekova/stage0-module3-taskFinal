package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean True = number > 0;
        boolean False = number < 0;
        System.out.println((True && False) || True);

    }
}
