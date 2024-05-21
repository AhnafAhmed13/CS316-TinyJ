/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * INITSTKFRMinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;

public class INITSTKFRMinstr extends OneOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
     TJ.data[ASP++ - POINTERTAG] = FP;
     FP = ASP - 1;
     ASP += operand;
  }

  public INITSTKFRMinstr (int locationsNeededForLocalVars)
  {
    super(locationsNeededForLocalVars, "INITSTKFRM");
  }
}

