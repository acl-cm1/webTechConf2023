// ***************************************************************************
// 
// Order.Update.DeleteRow : ST15F
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
@OBJ_SURROGATE=0xFFFFFFE5
@FUNCTION=Order.Update.DeleteRow
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=ST15F
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Order.Update.DeleteRow
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Order.Update.DeleteRow
// ***************************************************************************

////////////////////////////////////////////////////////////////
// ST15F Variable Group
public final class ST15F_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public ST15F_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("ST15F_DeleteKey", initvarST15F_ST15F_DeleteKey());
    }

    public ST15F_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("ST15F_DeleteKey", initvarST15F_ST15F_DeleteKey());
    }

    public ST15F_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("ST15F_DeleteKey", initvarST15F_ST15F_DeleteKey());
    }




    ////////////////////////////////////////////////////////////////
    // DeleteKey Variable
    public ObVariableX initvarST15F_ST15F_DeleteKey()
    {
        ObVariableX var = new ObVariableX(this, "varST15F_ST15F_DeleteKey");

        var.addField("OrderID", new ObLongFld(ObField.DUAL, 9, 0, 'p', "OrderID", "", m_obapp)); /* OrderID */

        return var;
    } 

    // End of DeleteKey Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
