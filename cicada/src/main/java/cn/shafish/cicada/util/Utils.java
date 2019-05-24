package cn.shafish.cicada.util;
import java.util.Random;

public class Utils {
	public  static String  getRandomNum(){
        Random random=new Random();
        String randomNum = random.nextInt(1000000) + "";
        if(randomNum.length()!=6){
            System.out.println("6位伪随机数："+randomNum);
            return  getRandomNum();
        }
        System.out.println("6位随机数："+randomNum);
        return randomNum;
    }
	
    /**
     * 生成数字验证码
     * @param number
     * @return
     */
    public static String getRandomNumCode(int number){
        String codeNum = "";
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            //目的是产生足够随机的数，避免产生的数字重复率高的问题
            int next = random.nextInt(10000);
            codeNum+=numbers[next%10];
        }
        System.out.println(codeNum);
        return codeNum;
    }

    /**
     * 生成数字+字母的验证码
     * @param number
     * @return
     */
    public static String getRandomCode(int number){
        String codeNum = "";
        int [] code = new int[3];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int num = random.nextInt(10) + 48;
            int uppercase = random.nextInt(26) + 65;
            int lowercase = random.nextInt(26) + 97;
            code[0] = num;
            code[1] = uppercase;
            code[2] = lowercase;
            codeNum+=(char)code[random.nextInt(3)];
        }
        System.out.println(codeNum);

        return codeNum;
    }
    
}
