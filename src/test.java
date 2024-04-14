public class test {
    public static void main(String[] args) {
        double[] fractionalNums = {1.7, 3.5, 5.2, -3.2, 1.3, 9.4,4.7, -8.1, 1.8, 7.4, -5,4, 5.7};
        double average = 0.0;
        int count = 0;

        for (int a1 = 0; a1 < fractionalNums.length; a1++){
            if (fractionalNums[a1] < 0) {
                for (int a2 = a1 + 1; a2 < fractionalNums.length; a2++){
                    if (fractionalNums[a2] > 0) {
                        average = average + fractionalNums[a2];
                        count++;
                        break;


                    }
                    System.out.println("average " + average);
                    System.out.println("count " + count);
                    System.out.println("average/count " + average / count);
                }
            }
        }
    }
}