package part3;

import java.util.Scanner;

public class arrays {

  public static void main(String[] args) {
    //swap
    Scanner reader=new Scanner(System.in);
    int[] swapArray=new int[5];

    swapArray[0]=1;
    swapArray[1]=3;
    swapArray[2]=5;
    swapArray[3]=7;
    swapArray[4]=9;

    for(int i=0;i< swapArray.length;i++) {
      System.out.println(swapArray[i]);
    }
    int indice1=Integer.valueOf(reader.nextLine());
    int indice2=Integer.valueOf(reader.nextLine());

    int emptyGlass=swapArray[indice1];
    swapArray[indice1]=swapArray[indice2];
    swapArray[indice2]=emptyGlass;

    for(int i=0;i< swapArray.length;i++) {
      System.out.println(swapArray[i]);
    }
    //indexWasNotFound
    Scanner reader1=new Scanner(System.in);
    int[] indexWasNotFound=new int[5];

    indexWasNotFound[0]=1;
    indexWasNotFound[1]=3;
    indexWasNotFound[2]=5;
    indexWasNotFound[3]=7;
    indexWasNotFound[4]=9;

    System.out.println("search for?");
    int value=Integer.valueOf(reader1.nextLine());
    int counter=0;

    for(int i=0;i<indexWasNotFound.length;i++) {
      if(indexWasNotFound[i]==value) {
        System.out.println(value + " is at index " + i);
        counter++;
      }
    }
    if(counter==0) {
      System.out.println(value + " was not found");
    }
    //sumOfNumbersInArray
    int[] numbers = {5, 1, 3, 4, 2};
    System.out.println(sumOfNumbersInArray(numbers));
    //printArrayInStars
    int[] arrayStars={1, 2, 3, 4, 5};
    arrayInStars(arrayStars);
  }
  public static int sumOfNumbersInArray(int[] array)  {
    int sum=0;
    for(int i=0;i<array.length;i++) {
       sum=sum+array[i];
    }
    return sum;
  }
  public static void arrayInStars(int[] array) {
    for(int i=0;i<array.length;i++) {
      int num=0;
      num=array[i];
      for(int j=0;j<num;j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

