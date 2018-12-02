public class Easy {


  public static void main(String[] args) {

    //1.Заданы 2 произвольных строки. Из этих строк создать одну объединенную без первых символов в каждой из строк.
  String str1 = "FHEL";
  String str2 = "LLO";
//    System.out.println(str1.substring(1) + str2.substring(1));
    System.out.println(str1.substring(1).concat(str2.substring(1)));


    //2.Задана строка с нечетным количеством символов. Создайте строку, состоящую из 3-х символов,
    // например: “Candy” -> “and”, “solving” -> “lvi”.
    String str3 = "Candy";
    String str4 = "solving";
    for (int i = str3.length()/2-1; i <= str3.length()/2+1; i++)
      System.out.print(str3.charAt(i));
    System.out.println();
    for (int i = str4.length()/2-1; i <= str4.length()/2+1; i++)
      System.out.print(str4.charAt(i));
    System.out.println();

    //3.      Задана строка произвольного размера. Создайте из этой строки новую,
    // в которой 2 последних символа исходной строки перенесены в начало.
    String str5 = "Hello, my friend!!!";
    int index = str5.length()-2;
    String str51 = str5.substring(index).concat(str5.substring(0, index));
    System.out.println(str51);

    //















  }





}
