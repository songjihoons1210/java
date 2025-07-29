package asd;


import java.util.Random;

public class asd {
    public static void main(String[] args) {
        Random random = new Random();
        String code = "";
        for (int i = 0; i <= 6; i++) {
            int val = random.nextInt(26) + 97; // a(97) ~ z(122);
            char ch = (char)val;
            code += ch;
        }
        System.out.println("생성된 코드 : " + code);
    }

}
