/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * NOTinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class NOTinstr extends ZeroOperandInstruction {

  void execute ()
  {
    EXPRSTACK[ESP-1] ^= 1;
  }

  public NOTinstr ()
  {
    super("NOT");
  }
}
