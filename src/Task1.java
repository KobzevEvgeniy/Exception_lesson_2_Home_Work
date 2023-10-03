

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        boolean metodInWork = true;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        while(metodInWork){
            System.out.print("Введите дробное число: ");
            try{
                float floatNumber = Float.parseFloat(console.readLine());
                System.out.printf("Введенное число равно %f\n", floatNumber);
                metodInWork = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }

        }
    }
}