/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * PUSHLOCADDRinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class PUSHLOCADDRinstr extends OneOperandInstruction {

  void execute ()
  {
     EXPRSTACK[ESP++] = FP + operand;
  }


  public PUSHLOCADDRinstr (int stackFrameOffset)
  {
    super(stackFrameOffset, "PUSHLOCADDR");
  }
}

