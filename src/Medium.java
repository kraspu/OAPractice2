import java.util.ArrayList;

public class Medium {

  public static void main(String[] args) {

    //4. Из заданной строки составьте новую, в которой каждый исходный символ
    // представлен двумя, например “Candy” -> “CCaannddyy”.

    String str1 = "Candy";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str1.length(); i++) {

      sb.append(str1.charAt(i)).append(str1.charAt(i));

    }
    System.out.print(sb);
    System.out.println("\n----------------------------------");

    //5. Найдите все вхождения строки "b*b" (* - любой символ) в заданной строке
    //    без использования регулярных выражений, например “bob is bab” -> 2 .

    String str2 = "Aobob bob obib i bo";
    int count = 0;
    for (int i = 2; i < str2.length(); i++) {
      if (str2.charAt(i) == str2.charAt(i - 2) && str2.charAt(i) == 'b')
        count++;
    }
    System.out.println(str2 + " -> " + count);
    System.out.println("---------------------------------------------");


    //6. Создайте подстроку из исходной строки, где в каждом слово, содержащем символ “*”
    // удалены соседние левый и правый символы, например “th*is is sum*mer” -> “ts is suer”.

    String str3 = "th*is is sum*mer";
    String[] li = str3.split(" ");
    for (int i = 0; i < li.length; i++) {
      if (li[i].contains("*")) {
        StringBuilder s = new StringBuilder(li[i]);
        for (int j = 1; j < li[i].length() - 1; j++) {
          if (li[i].charAt(j) == '*') {
            s.deleteCharAt(j-1);
            s.deleteCharAt(j-1);
            s.deleteCharAt(j-1);
          }
        }
        System.out.print(s + " ");
      }else System.out.print(li[i]+ " ");

    }
  }
}

