
class practice {
  public static void main(String[] args) {
    System.out.println("Hello java");
    int number;
    number = 3;
    System.out.println(number);
    String name;
    name = "Wanko";
    System.out.println(name);
    
    number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);
    number = 9;
    System.out.println(number);
    text = "Java";
    System.out.println(text);
    
    number *= 7;
    System.out.println(number);
    number ++;
    System.out.println(number);
    
    int length = 6;
    int height = 8;
    int rectangleArea = length * height;
    System.out.println(rectangleArea);
    int triangleArea = length * height / 2;
    System.out.println(triangleArea);
    
    double number1 = 8.5;
    double number2 = 3.4;
    System.out.println(number1 + number2);
    System.out.println(number1 - number2);
    
    int month = 12;
    int date = 31;
    System.out.println(month + "月" + date + "日");
    System.out.println(7 / 2);
    System.out.println(7.0 / 2.0);
    System.out.println(7 / 2.0);
    
    int number3 = 7;
    int number4 = 2;
    System.out.println(number3 / number4);
    System.out.println((double)number3 / number4);
    
    String userName = "佐藤";
    int userAge = 30;
    double userHeight = 1.7;
    double userWeight = 70.0;
    double bmi = userWeight / userHeight / userHeight;
    System.out.println("名前は" + userName + "です");
    System.out.println("年齢は" + userAge + "です");
    System.out.println("身長は" + userHeight + "です");
    System.out.println("体重は" + userWeight + "です");
    System.out.println("BMIは" + bmi + "です");
    
  }
}

