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
        Scanner input = new Scanner(System.in);
        System.out.println("\u001B[35mПоиск в строке.");
        System.out.println("\u001B[36mВведите текст:\u001B[32m");
        String answer1 = input.nextLine();
        System.out.println("\u001B[0m");
        System.out.println("\u001B[36mВведите текст:\u001B[32m");
        String answer2 = input.nextLine();
        System.out.println("\u001B[0m");
        int i = answer1.indexOf(answer2);
        StringBuilder sbStr = new StringBuilder(answer1);
        System.out.printf("\u001B[36mИскомая строка начинается на %d позиции%n%n", i);
        System.out.println("\u001B[35mЗадачи:");
        System.out.println("\u001B[36m(0) - Выйти из программы.");
        System.out.println("\u001B[36m(1) - Удалить искомую строку из исходной строки");
        System.out.println("\u001B[36m(2) - Заменить искомую строку на другую");
        System.out.println("\u001B[36m(3) - Удалить все теги из html документа");
        System.out.println("\u001B[36m(4) - Удалить конкректный тег из html документа");
        System.out.print("\u001B[35mВыберите задачу: ");
        String work = input.nextLine();
        int startIndex = answer1.indexOf(answer2);
        int endIndex = startIndex + answer2.length();
        switch (work) {
            case "0":
                System.out.println("\u001B[0m\u001B[35mВыбрана задача: 0\n\u001B[36mВыход из программы.");
                break;
                
            case "1":
                System.out.println("\u001B[35mВыбрана задача: 1\n\u001B[36mУдаление искомой строки: ");
                sbStr.delete(startIndex, endIndex);
                System.out.println("\u001B[35mРезультат: ");
                System.out.println(sbStr.toString());
                break;
                
            case "2":
                System.out.println("\u001B[32mВыбрана задача: 2\n\u001B[36mЗамена искомой строки");
                sbStr.replace(startIndex, endIndex, answer2);
                System.out.println("\u001B[35mРезультат: ");
                System.out.println(sbStr.toString());
                break;
                
            case "3":
                System.out.println("\u001B[35mВыбрана задача: 3\n\u001B[36mУдаление всех тегов из html документа");
                
                break;
                
            case "4":
                System.out.println("\u001B[35mВыбрана задача: 4\n\u001B[36mУдаление конкретного тега из html документа");
                
                break;
        }
    }
    
}
