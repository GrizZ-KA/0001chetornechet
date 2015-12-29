import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chetornechet {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите пожалуйста четное или нечетное число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        try{
            if (num.toLowerCase().contains(".")){
                System.out.println("Вы ввели дробное число");
            }else{
                int anum = Integer.parseInt(num);
                if (anum % 2 == 0) {
                    System.out.println("Вы ввели четное число");
                }else{
                    System.out.println("Вы ввели не четное число");
                }
            }
        }catch(NumberFormatException e){
        }

    }


}