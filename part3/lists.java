package part3;

import java.util.ArrayList;
import java.util.Scanner;
public class lists {

  public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<>();
    //add method
    list.add("first");
    list.add("second");
    //get method
    System.out.println(list.get(1));

    //thirdElement
    ArrayList<String> thirdElement=new ArrayList<>();
    Scanner reader=new Scanner(System.in);

    while(true) {
      String input= reader.nextLine();

      if(input == "") {
        break;
      }
      thirdElement.add(input);
    }
    System.out.println(thirdElement.get(2));

    //secondPlusThird
    ArrayList<Integer> secondPlusThird=new ArrayList<>();
    Scanner reader1=new Scanner(System.in);

    while(true) {
      int number=Integer.valueOf(reader1.nextLine());

      if(number == 0) {
        break;
      }
      secondPlusThird.add(number);
    }
    int sum = secondPlusThird.get(1) + secondPlusThird.get(2);
    System.out.println("The sum equals: " + sum);
    //listSize
    ArrayList<String> listSize=new ArrayList<>();
    Scanner reader2=new Scanner(System.in);

    while(true) {
      String input1=reader2.nextLine();
      if(input1=="") {
        break;
      }
      listSize.add(input1);
    }
    System.out.println("In total:" + listSize.size());
    //lastInList
    ArrayList<String> lastInList=new ArrayList<>();
    Scanner reader3=new Scanner(System.in);

    while (true) {
      String input2=reader3.nextLine();
      if(input2=="") {
        break;
      }
      lastInList.add(input2);
    }
    int lastNumber=lastInList.size()-1;
    System.out.println(lastInList.get(lastNumber));
    //rememberTheseNumbers
    ArrayList<Integer> rememberTheseNumbers=new ArrayList<>();
    Scanner reader4=new Scanner(System.in);

    while(true) {
      int num=Integer.valueOf(reader4.nextLine());
      if(num==-1) {
        break;
      }
      rememberTheseNumbers.add(num);
    }
    for(int i=0;i<rememberTheseNumbers.size();i++) {
      System.out.println(rememberTheseNumbers.get(i));
    }
    //onlyTheseNumbers
    ArrayList<Integer> onlyTheseNumbers=new ArrayList<>();
    Scanner reader5=new Scanner(System.in);

    while(true) {
      int numbers=Integer.valueOf(reader5.nextLine());
      if(numbers==-1) {
        break;
      }
      onlyTheseNumbers.add(numbers);
    }
    System.out.println("From Where?");
    int fromWhere=Integer.valueOf(reader5.nextLine());
    System.out.println("To Where?");
    int toWhere=Integer.valueOf(reader5.nextLine());
    for(int i=fromWhere;i<=toWhere;i++) {
      System.out.println(onlyTheseNumbers.get(i));
    }
  //greatestInList
    ArrayList<Integer> greatestInList=new ArrayList<>();
    Scanner reader6=new Scanner(System.in);

    while(true) {
      int num1=Integer.valueOf(reader6.nextLine());
      if(num1==-1) {
        break;
      }
      greatestInList.add(num1);
    }
    int greatest=greatestInList.get(0);
    for(int i=0;i<greatestInList.size();i++) {
      int numb=greatestInList.get(i);
      if(numb>greatest) {
        greatest=numb;
      }
    }
    System.out.println(greatest);
    //indexOf
    ArrayList<Integer> indexOf=new ArrayList<>();
    Scanner reader7=new Scanner(System.in);

    while(true) {
      int numb1=Integer.valueOf(reader7.nextLine());
      if(numb1==-1) {
        break;
      }
      indexOf.add(numb1);
    }
    System.out.println("search for?");
    int value=Integer.valueOf(reader7.nextLine());
    for(int i=0;i<indexOf.size();i++) {
      if(indexOf.get(i)==value) {
        System.out.println(value + " is at index " + i);
      }
    }
    //indexOfSmallest
    ArrayList<Integer> indexOfSmallest=new ArrayList<>();
    Scanner reader8=new Scanner(System.in);

    while(true) {
      int numb2=Integer.valueOf(reader8.nextLine());
      if(numb2==9999) {
        break;
      }
      indexOfSmallest.add(numb2);
    }
    int smallest=indexOfSmallest.get(0);
    for(int i=0;i<indexOfSmallest.size();i++) {
      int numb3=indexOfSmallest.get(i);
      if(smallest>numb3) {
        smallest=numb3;
      }
    }
    for(int i=0;i<indexOfSmallest.size();i++) {
      if(smallest==indexOfSmallest.get(i)) {
        System.out.println(smallest + " is at index " + i);
      }
    }
    //sumOfList
    ArrayList<Integer> sumOfList=new ArrayList<>();
    Scanner reader9=new Scanner(System.in);

    while(true) {
      int numb4=Integer.valueOf(reader9.nextLine());
      if(numb4==-1) {
        break;
      }
      sumOfList.add(numb4);
    }
    int sum1=0;
    for(int numb5: sumOfList) {
      sum1=sum1+numb5;
    }
    System.out.println("sum= " + sum1);
    //onTheList

    ArrayList<String> onTheList=new ArrayList<>();
    Scanner reader10=new Scanner(System.in);

    while(true) {
      String input3= reader10.nextLine();
      if(input3=="") {
        break;
      }
      onTheList.add(input3);
    }
    System.out.println("search for?");
    String input4=reader10.nextLine();

    boolean found =onTheList.contains(input4);

    if(found) {
      System.out.println(input4 + " is here!");
    } else {
      System.out.println(input4 + " is not found!");
    }
    //printInRange
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(2);
    numbers.add(6);
    numbers.add(-1);
    numbers.add(5);
    numbers.add(1);

    System.out.println("The numbers in the range [0, 5]");
    printNumbersInRange(numbers, 0, 5);
    //sum
    ArrayList<Integer> numbs = new ArrayList<>();
    numbs.add(3);
    numbs.add(2);
    numbs.add(6);
    numbs.add(-1);
    System.out.println(sum(numbs));

    numbs.add(5);
    numbs.add(1);
    System.out.println(sum(numbs));
    // removeLast
      ArrayList<String> strings = new ArrayList<>();

      strings.add("First");
      strings.add("Second");
      strings.add("Third");

      System.out.println(strings);

      removeLast(strings);
      removeLast(strings);

      System.out.println(strings);

    }
  public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
    System.out.println("Numbers in range of " + lowerLimit +" and " + upperLimit);
    for(int i=0;i<numbers.size();i++) {
      if(numbers.get(i)>=lowerLimit && numbers.get(i)<=upperLimit) {
        System.out.println(numbers.get(i));
      }
    }
  }
  public static int sum(ArrayList<Integer> numbs) {
    int sum=0;
    for(int i=0;i<numbs.size();i++) {
      sum= sum+numbs.get(i);
    }
    return sum;
  }
    public static void removeLast(ArrayList<String> strings) {
      int num=strings.size()-1;
      strings.remove(num);
    }
}
