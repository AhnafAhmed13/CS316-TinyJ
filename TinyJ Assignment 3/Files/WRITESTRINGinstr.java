/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * WRITESTRINGinstr.java
 */

package TJasn.virtualMachine;

import TJasn.TJ;

public class WRITESTRINGinstr extends TwoOperandInstruction {

  void execute ()
  {
    for (int i = firstOperand; i <= secondOperand; i++) {
      System.out.print((char)TJ.data[i]);
    }
  }

  public WRITESTRINGinstr (int startOffset, int endOffset)
  {
    super(startOffset, endOffset, "WRITESTRING");
  }
}

