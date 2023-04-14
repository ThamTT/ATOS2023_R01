package lanhD.testng;

import com.beust.jcommander.Parameters;
import com.google.common.annotations.VisibleForTesting;

import org.testng.annotations.Test;

import java.util.Scanner;

public class checkPassFail {
    @Test

  //  @Parameters({"mark"})

    public  void checkpassfail(int mark){
        if (mark>=50){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }


    }
//    public static void main(String[] args) {
//
//
//        Scanner sc= new Scanner(System.in);
//        int mark;
//        System.out.println("nhap vao gia tri mark: ");
//        mark=sc.nextInt();
//      //  checkPassFail(n);
//        checkpassfail(mark);
//
//    }
}
