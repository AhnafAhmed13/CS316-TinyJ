/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * CALLSTATMETHODinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;

public class CALLSTATMETHODinstr extends OneOperandInstruction {

  void execute ()
  {
    TJ.data[ASP++ - POINTERTAG] = PC;
    PC = operand;
  }

  public CALLSTATMETHODinstr (int startAddr)
  {
    super(startAddr, "CALLSTATMETHOD");
  }
}
