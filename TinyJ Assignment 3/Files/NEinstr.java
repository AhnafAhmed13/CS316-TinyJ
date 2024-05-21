/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * NEinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class NEinstr extends ZeroOperandInstruction {

  void execute ()
  {
     EXPRSTACK[--ESP-1] = (EXPRSTACK[ESP-1] != EXPRSTACK[ESP]) ? 1 : 0;
  }

  public NEinstr ()
  {
    super("NE");
  }
}
