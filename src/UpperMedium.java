import java.util.Scanner;

public class UpperMedium {

  public static void main(String[] args) {

    // 7.  В заданной строке подсчитайте количество слов, заканчивающихся на ‘a’ или ‘s’,
    //     без учета регистра символов.

    int count;
    char ch;
    String str;
    Scanner sc = new Scanner(System.in);

    do {
      count = 0;
      System.out.println("Введите текст на английском языке: ");
      str = sc.nextLine().toLowerCase();
      String[] words = str.split(" ");

      for (int i = 0; i < words.length; i++) {
        if (words[i].charAt(words[i].length() - 1) == 'a' || words[i].charAt(words[i].length() - 1) == 's') {
          count++;
        }
      }
      System.out.println(count + " - количество слов оканчивающихся на буквы \'a\' и \'s\'!");
      System.out.println("Еще раз? (для продолжения нажмите \'y\', для выхода - любую клавишу)");
      ch = sc.nextLine().charAt(0);
    } while (ch == 'y');


    //8. Заданы две строки. Создайте новую строку, состоящую из первой строки,
    //   в которой удалены все вхождения второй строки.
    //   P.S. (the same symbols except Spaces)

    System.out.println("Введите 1ую строку: ");
    String str1 = sc.nextLine();

    StringBuilder overlap = new StringBuilder("");
    StringBuilder diffChar = new StringBuilder("");

    System.out.println("Введите 2ую строку: ");
    String str2 = sc.nextLine();

    for (int i = 0; i < str1.length(); i++) {
        boolean overLap = false;
        for (int j = 0; j < str2.length(); j++) {
            if (str1.charAt(i) != ' ' && str1.charAt(i) == str2.charAt(j)) {
              overlap.append(str1.charAt(i));
              overLap = true;
            }
        }
        if (!overLap) {diffChar.append(str1.charAt(i));}
    }
    System.out.println("Совпадения символов кроме пробела: " + overlap);
    System.out.println("Новая строка без совпадений: " + diffChar);
  }
}
