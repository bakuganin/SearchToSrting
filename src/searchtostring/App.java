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
class App {

    void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("\u001B[35mПоиск в строке.");
        System.out.println("\u001B[36mВведите исходный текст:\u001B[32m");
        String answer1 = input.nextLine();
        System.out.println("\u001B[0m");
        System.out.println("\u001B[35mЗадачи:");
        System.out.println("\u001B[36m(\u001B[35m0\u001B[36m) - Выйти из программы.");
        System.out.println("\u001B[36m(\u001B[35m1\u001B[36m) - Удалить искомую строку из исходной строки");
        System.out.println("\u001B[36m(\u001B[35m2\u001B[36m) - Заменить искомую строку на другую");
        System.out.println("\u001B[36m(\u001B[35m3\u001B[36m) - Удалить все теги из html документа");
        System.out.println("\u001B[36m(\u001B[35m4\u001B[36m) - Удалить конкректный тег из html документа");
        System.out.println(" ");
        System.out.println("\u001B[35mВыберите задачу: " + "\u001B[32m");
        String work = input.nextLine();
        System.out.println(" ");
        switch (work) {
            case "0":
                System.out.println("\u001B[35mВыбрана задача: \u001B[32m0\n\u001B[36mВыход из программы.");
                break;
                
            case "1":
                System.out.println("\u001B[35mВыбрана задача: \u001B[32m1\n\u001B[36mВведите удаляемую строку: ");
                String answer2 = input.nextLine();
                System.out.println("\u001B[35mРезультат: ");
                System.out.println("\u001B[32m" + deleteString(answer1, answer2));
                break;
                
            case "2":
                System.out.println("\u001B[35mВыбрана задача: \u001B[32m2\n\u001B[36mЧто заменяем?\u001B[32m");
                String searchStr = input.nextLine();
                System.out.println(" ");
                System.out.println("\u001B[36mНа что заменяем?\u001B[32m");
                String replaseText = input.nextLine();
                System.out.println(" ");
                System.out.println("\u001B[35mРезультат: ");
                System.out.println("\u001B[32m" + replaceText(answer1,searchStr,replaseText) + "\n");
                break;
                
            case "3":
                System.out.println("\u001B[35mВыбрана задача: \u001B[32m3\n\u001B[36mУдаление всех тегов из html документа");
                
                break;
                
            case "4":
                System.out.println("\u001B[35mВыбрана задача: \u001B[32m4\n\u001B[36mУдаление конкретного тега из html документа");
                
                break;
        }
    }
    private String deleteString(String str, String delString){
        //находим индех вхождения строки.
        int startIndex = str.indexOf(delString);
        // находим index окончания строки
        int endIndex = startIndex + delString.length();
        StringBuilder sbStr = new StringBuilder(str);
        sbStr.delete(startIndex, endIndex);
        return sbStr.toString();
    }
    private String replaceText(String answer1, String answer2, String replaceText){
        //находим индех вхождения строки.
        int startIndex = answer1.indexOf(answer2);
        int endIndex = startIndex + answer2.length();
        if(startIndex > -1){
//            System.out.printf("\u001B[36mИскомая строка есть и начинается на %d позиции %n", startIndex);
        } else { 
            System.out.println("\u001B[31mИскомая строка не найдена.");
            System.out.println("\u001B[31m--- конец программы --- ");
            System.exit(0);
        }
        StringBuilder sbStr = new StringBuilder(answer1);
        sbStr.replace(startIndex, endIndex, replaceText);
        return sbStr.toString();
    }
    
}
