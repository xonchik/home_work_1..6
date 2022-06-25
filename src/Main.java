public class Main {
    public static void main(String[] args) {
        int[] arr = {167924, 129276, 130804, 194709, 131340, 178326, 192432, 178859, 180693, 108946, 147623,
                150359, 138081, 182311, 181128, 108300, 184836, 135065, 128554, 160424, 132715, 190676, 100780,
                173811, 166279, 178987, 186779, 128818, 109997, 156115};
        int minSum = 200_001;
        int maxSum = 99_999;
        int allSum = 0;
        for (int i = 0; i < arr.length; i++) {
            allSum = allSum + arr[i];
            if(minSum > arr[i]){
                minSum = arr[i];
            }
            if(maxSum < arr[i]){
                maxSum = arr[i];
            }
        }
        float averageSum = allSum / 30f;
        System.out.println("Сумма трат за месяц составила " + allSum + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей." +
                "Максимальная сумма трат за день составила " + maxSum + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + averageSum +" рублей.");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}