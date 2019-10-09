/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembly.interpreter;

import assembly.Assembly;
import static assembly.Command.*;
import assembly.AssemblyTwoAdress;

import assembly.AssemblyZeroAdress;
import java.util.Map;

/**
 *
 * @author _Nprime496_
 */
public abstract class Interpreter {
    protected InterpreterParser CommandParser;
    protected Assembly AssemblyMode;
   public void interpret(Instruction instruction)    
    {
        if(instruction instanceof InstructionOperation)
        {
            instruction=((InstructionOperation)instruction);
            if(((InstructionOperation)instruction).getOperation().equals(_ADD_))
            {
                ((AssemblyTwoAdress)this.AssemblyMode).add(((InstructionOperation)instruction).getOperands()[0],((InstructionOperation)instruction).getOperands()[1]);
            }
            else if(((InstructionOperation)instruction).getOperation().equals(_SUB_))
            {
                ((AssemblyTwoAdress)this.AssemblyMode).sub(((InstructionOperation)instruction).getOperands()[0],((InstructionOperation)instruction).getOperands()[1]);
            }
            else if(((InstructionOperation)instruction).getOperation().equals(_DIV_))
            {
                ((AssemblyTwoAdress)this.AssemblyMode).div(((InstructionOperation)instruction).getOperands()[0],((InstructionOperation)instruction).getOperands()[1]);
            }
            else if(((InstructionOperation)instruction).getOperation().equals(_MPY_));
            {
                ((AssemblyTwoAdress)this.AssemblyMode).mpy(((InstructionOperation)instruction).getOperands()[0],((InstructionOperation)instruction).getOperands()[1]);
            }
        }
    }
    void branch(String adress)
    {
        
    }
}
