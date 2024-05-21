/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * RETURNinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;

public class RETURNinstr extends OneOperandInstruction {

  void execute ()
  {
    ASP = FP + 1;
    FP = TJ.data[--ASP - POINTERTAG];
    PC = TJ.data[--ASP - POINTERTAG];
    ASP -= operand;
  }

  public RETURNinstr (int operand)
  {
    super(operand, "RETURN");
  }
}

