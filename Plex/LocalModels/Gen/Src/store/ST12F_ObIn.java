// ***************************************************************************
// 
// Order.Fetch.SingleFetch : ST12F
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
@OBJ_SURROGATE=0xFFFFFFE9
@FUNCTION=Order.Fetch.SingleFetch
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=ST12F
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Order.Fetch.SingleFetch
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Order.Fetch.SingleFetch
// ***************************************************************************

////////////////////////////////////////////////////////////////
// ST12F Variable Group
public final class ST12F_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public ST12F_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("ST12F_FetchKey", initvarST12F_ST12F_FetchKey());
    }

    public ST12F_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("ST12F_FetchKey", initvarST12F_ST12F_FetchKey());
    }

    public ST12F_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("ST12F_FetchKey", initvarST12F_ST12F_FetchKey());
    }




    ////////////////////////////////////////////////////////////////
    // FetchKey Variable
    public ObVariableX initvarST12F_ST12F_FetchKey()
    {
        ObVariableX var = new ObVariableX(this, "varST12F_ST12F_FetchKey");

        var.addField("OrderID", new ObLongFld(ObField.DUAL, 9, 0, 'p', "OrderID", "", m_obapp)); /* OrderID */

        return var;
    } 

    // End of FetchKey Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
