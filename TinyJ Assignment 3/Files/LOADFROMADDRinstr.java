/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * LOADFROMADDRinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;

public class LOADFROMADDRinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
       EXPRSTACK[ESP-1] = TJ.data[EXPRSTACK[ESP-1]-POINTERTAG];
  }

  public LOADFROMADDRinstr ()
  {
    super("LOADFROMADDR");
  }
}

