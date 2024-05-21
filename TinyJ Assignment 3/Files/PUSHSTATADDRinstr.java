/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * PUSHSTATADDRinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;

public class PUSHSTATADDRinstr extends OneOperandInstruction {

  void execute ()
  {
    EXPRSTACK[ESP++] = operand + POINTERTAG;
  }

  public PUSHSTATADDRinstr (int offset)
  {
    super(offset, "PUSHSTATADDR");
  }
}

