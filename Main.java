package sergiy.dmb;

public class Main {

    public static void main(String[] args) {
	    int x, y;
	    double div, sum, diff, multi, xd, yd;
	    x = 10;
	    y = 20;
	    xd = 7.3;
	    yd = 8.5;

        //Операции на целочислеными числами
	    System.out.println("Арифметические операции над числами: "
                                                    + x + " и " + y);
        sum = x + y;
	System.out.println("Сумма = " + sum);
	diff = x - y;
        System.out.println("Разность = " + diff);
        multi = x * y;
        System.out.println("Произведение = " + multi);
        div = x / y;
        System.out.println("Частное = " + div);

        //Операции над дробными числами
        System.out.println("Арифметические операции над числами: "
                + xd + " и " + yd);
        sum = xd + yd;
        System.out.println("Сумма = " + sum);
        diff = xd - yd;
        System.out.println("Разность = " + diff);
        multi = xd * yd;
        System.out.println("Произведение = " + multi);
        div = xd / yd;
        System.out.println("Частное = " + div);
    }
}
