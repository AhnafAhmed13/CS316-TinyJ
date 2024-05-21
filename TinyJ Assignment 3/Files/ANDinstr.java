/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * ANDinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class ANDinstr extends ZeroOperandInstruction {

  void execute ()
  {
    EXPRSTACK[--ESP-1] &= EXPRSTACK[ESP];
  }

  public ANDinstr ()
  {
    super("AND");
  }
}
