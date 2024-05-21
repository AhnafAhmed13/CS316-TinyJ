/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * WRITELNOPinstr.java
 */

package TJasn.virtualMachine;

public class WRITELNOPinstr extends ZeroOperandInstruction {

  void execute ()
  {
    System.out.println();
  }

  public WRITELNOPinstr ()
  {
    super("WRITELNOP");
  }
}
