/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchtostring;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SearchToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Поиск в строке.");
        System.out.println("Введите текст");
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        System.out.println("Введите текст: \n");
        String answer2 = input.nextLine();
        int i = 0;
        
        System.out.printf("Искомая строка начинается на %d позиции%n", i);
        
        
    }
    
}
