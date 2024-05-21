/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * MODinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class MODinstr extends ZeroOperandInstruction {

  void execute ()
  {
    EXPRSTACK[--ESP-1] %= EXPRSTACK[ESP];
  }

  public MODinstr ()
  {
    super("MOD");
  }
}

