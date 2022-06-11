public class Calc {
    int var1;
    int var2;
    public Calc(int x, int y) {
        this.var1 = x;
        this.var2 = y;
    }
    public void sum() {
        System.out.printf("X + Y = %d  \n", var1+var2);
    }
    public void subtract() {
        System.out.printf("X - Y = %d  \n", var1-var2);
    }
    public void multiply() {
        if (var1 == 0) {
            System.out.println("X * Y = ZERO");
        } else if (var2 == 0) {
            System.out.println("X * Y = ZERO");
        } else {
            System.out.printf("X * Y = %d  \n", var1 * var2);
        }
    }
    public void divide() {
        float temp_var1 = (float) var1;
        float temp_var2 = (float) var2;

        if (var1 == 0) {
            System.out.println("X / Y = ZERO");
        } else if (var2 == 0) {
            System.out.println("X / Y = !ERROR! Can't divide by zero.");
        } else {
            System.out.println("X / Y = " + temp_var1 / temp_var2);
        }
    }
}
