package part3;

import java.util.Scanner;
public class strings {

  public static void main(String[] args) {
    //splitingAString
    String text="once upon a time in hollywood";
    String[] pieces=text.split(" ");

    for(int i=0;i<pieces.length;i++) {
      System.out.println(pieces[i]);
    }
    //avClub
    Scanner reader=new Scanner(System.in);
    String text1=reader.nextLine();
    String[] pieces1=text1.split(" ");

    for(int i=0; i<pieces1.length;i++) {
      if(pieces1[i].contains("av")) {
        System.out.println(pieces1[i]);
      }
    }
  }
}
