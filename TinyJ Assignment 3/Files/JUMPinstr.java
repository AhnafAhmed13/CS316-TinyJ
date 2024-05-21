/*
 * Name: Ahnaf Ahmed
 * CS 316
 * Spring 2024
 * Dr. T. Yung Kong
 * TinyJ Assignment 3
 * JUMPinstr.java
 */

package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class JUMPinstr extends OneOperandInstruction {

  void execute ()
  {
    PC = operand;
  }

  public JUMPinstr (int address)
  {
    super(address, "JUMP");
  }
}

