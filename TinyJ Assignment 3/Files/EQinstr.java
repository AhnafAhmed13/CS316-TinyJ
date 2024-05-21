/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * EQinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class EQinstr extends ZeroOperandInstruction {

  void execute ()
  {
    EXPRSTACK[--ESP-1] = (EXPRSTACK[ESP-1] == EXPRSTACK[ESP]) ? 1 : 0;
  }

  public EQinstr ()
  {
    super("EQ");
  }
}

