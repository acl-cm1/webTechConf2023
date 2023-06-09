// ***************************************************************************
// 
// Product.Edit : ST8F
// 
// ***************************************************************************
// 
// Generated by : CA Plex r7.2.1   (Build 24.004)
// Date - Time  : Sunday, April 16, 2023 - 1:53 PM
// Group Model  : C:\Development\Conferences\2023 Boca Raton\Web Tech Workshop\Plex\GroupModels\Store
// Local Model  : C:\Development\Conferences\2023 Boca Raton\Web Tech Workshop\Plex\LocalModels\store.mdl
// User         : Admin
// Version      : Base
// Level        : Base
// Variant      : Base
// Language     : Base
// 
// ***************************************************************************
// 
// Make Processing Support:
/*
@OBJ_SURROGATE=0x1C0000F4
@FUNCTION=Product.Edit
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=ST8F
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Product.Edit
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Product.Edit
// ***************************************************************************

////////////////////////////////////////////////////////////////
// ST8F Variable Group
public final class ST8F_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public ST8F_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("ST8F_Input", initvarST8F_ST8F_Input());
    }

    public ST8F_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("ST8F_Input", initvarST8F_ST8F_Input());
    }

    public ST8F_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("ST8F_Input", initvarST8F_ST8F_Input());
    }




    ////////////////////////////////////////////////////////////////
    // Input Variable
    public ObVariableX initvarST8F_ST8F_Input()
    {
        ObVariableX var = new ObVariableX(this, "varST8F_ST8F_Input");


        return var;
    } 

    // End of Input Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
