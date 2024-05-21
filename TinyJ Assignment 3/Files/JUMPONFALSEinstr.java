/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * JUMPONFALSEinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class JUMPONFALSEinstr extends OneOperandInstruction {

  void execute ()
  {
    if (EXPRSTACK[--ESP] == 0) {
      PC = operand;
    }
  }

  public JUMPONFALSEinstr (int address)
  {
    super(address, "JUMPONFALSE");
  }
}

