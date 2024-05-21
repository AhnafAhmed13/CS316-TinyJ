/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * LTinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class LTinstr extends ZeroOperandInstruction {

  void execute ()
  {
    EXPRSTACK[--ESP-1] = (EXPRSTACK[ESP-1] < EXPRSTACK[ESP]) ? 1 : 0;
  }

  public LTinstr ()
  {
    super("LT");
  }
}
