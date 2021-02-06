public class varr{
    //задать ограничетели
    public int num;
    public void setLimits(int number) {
        int count = 1;
        while (count !=0) {
            if ((number < 1) || (number > 10)) {
                System.out.println("value is out of range. please try again");
                break;
            } else {
                this.num = number;
                count = 0
            }
        }

    }
}
