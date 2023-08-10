class practice2 {
  public static void main(String[] args) {
    System.out.println(12 / 4 == 3);
    System.out.println(12 / 4 != 3);
    boolean bool = 3 * 9 == 27;
    System.out.println(bool);
    System.out.println(4 + 2 > 6);
    System.out.println(4 + 2 >= 6);
    System.out.println(true || false);
    System.out.println(false && true);
    System.out.println(8 < 5 && 3 >= 2);
    System.out.println(8 < 5 || 3 >= 2);
    System.out.println(!(8 < 5));
 
    int x = 5;
    if (x >2) {
      System.out.println("xは2より大きい");
    }
    if (x > 8) {
      System.out.println("xは8より大きい");
    } 
    
    
    int number = 12;
    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }
    
    int n = 1;
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      
      case 2:
        System.out.println("吉です");
        break;
    }
    
    int v = 0;
    switch (v) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("中吉です");
        break;
      // defaultを用いて、変数nの値がどのcaseにも合致しない場合の処理を記述してください
      default:
        System.out.println("凶です");
        break;
    }
    int i = 10;
    while (i > 0) {
      System.out.println(i);
      i--;
    }
    for (int l = 1; l <= 10; l++) {
      System.out.println(l + "回目のループです");
    }
    
    int k = 1;
    while (k < 10) {
      if (k % 5 == 0) {
        break;
      }
      System.out.println(k);
      k++;
    }
    for (int j = 1; j < 10; j++) {
      if (j % 3 == 0) {
        continue;
      }
      System.out.println(j);
    }
    String[] names = {"鈴木", "佐藤", "佐々木"};
    System.out.println(names[0]);
    System.out.println(names[2]);
    
    String[] languages = {"Ruby", "PHP", "Python"};
    System.out.println(languages[1]);
    languages[1] = "Java";
    System.out.println(languages[1]);
    
    for (int c = 0; c < names.length; c++) {
      System.out.println("私の名前は" + names[c] + "です");
    }
    
    for (String name : names) {
      System.out.println("私の名前は" + name + "です");
    }
    
    int[] anumbers = {1, 4, 6, 9, 13, 16};
    int oddSum = 0;
    int evenSum = 0;
    for (int anumber : anumbers) {
      if (anumber % 2 == 0) {
        evenSum += anumber;
      } else {
        oddSum += anumber;
      }
    }
    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}