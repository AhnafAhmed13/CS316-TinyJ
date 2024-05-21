/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * WRITEINTinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class WRITEINTinstr extends ZeroOperandInstruction {

  void execute ()
  {
    System.out.print(EXPRSTACK[--ESP]);
  }

  public WRITEINTinstr ()
  {
    super("WRITEINT");
  }
}

