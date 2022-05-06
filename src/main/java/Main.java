public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // 1) sum
        int sum = 0;
        for(int a : arr){
            sum +=a;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");

        // 2) min max
        int min = arr[0];
        int max = arr[0];
        for(int a : arr){
            if(a<min){
                min = a;
            }
            if(a>max){
                max = a;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей");

        // 3) average
        System.out.println("Средняя сумма трат за месяц составила "+(double)sum/30+" рублей");

        // 4) names
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length-1; i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
