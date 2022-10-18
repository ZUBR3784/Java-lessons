package homeWorks.homeWork8.secondtLevel;

public class Quest5_2 {
    public static void main(String[] args) {
        String str = "91234560";
        int d =str.length();
        int sum =0;
        int sum2 =0;

        for (int i = 0; i <d ; i++) {
            char num = str.charAt(i);
            int transf =Integer.parseInt(String.valueOf(num));
            if (i<d/2){
                sum =sum + transf;
            }else {
                sum2 = sum2 + transf;
            }
        }
        if (sum==sum2){
            System.out.println(" да ");
        } else {
            System.out.println(" нет ");
        }


    }
}
//Дана строка из 6-ти цифр. Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр.
// Если это так - выведите 'да', в противном случае выведите 'нет'.
