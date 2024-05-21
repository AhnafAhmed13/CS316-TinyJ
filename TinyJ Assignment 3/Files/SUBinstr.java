/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * SUBinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;
import TJasn.TJ;

public class SUBinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
    EXPRSTACK[--ESP-1] -= EXPRSTACK[ESP];
  }

  public SUBinstr ()
  {
    super("SUB");
  }
}
