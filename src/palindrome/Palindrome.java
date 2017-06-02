package palindrome;
public class Palindrome {

    public static void main(String[] args) {
        int max_palindrome = 0;
        boolean flag = false;
        
        for (int i = 999*999; i>=100*100; i--){
            int opposite = 0;
            double p =i; 
            //Разбор шестизначного числа и построение "обратного" числа
            for (int k = 0; k < 6; k++){
                double m = p/10; 
                int n = (int)p/10; 
                opposite = opposite + (int) (Math.round((m - n)*10)*Math.pow(10,6-k-1)); 
                p = n;
            }
            //Проверка на "палиндромность"
            if (opposite == i){
                max_palindrome = i; 
                //Проверка наличия целых трехзначных множителей
                for (int j = 999; j>=100; j--){
                    if ((i%j == 0)&((i/j - 999)<=0)) { 
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }    
        }
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + max_palindrome);  
    } 
}