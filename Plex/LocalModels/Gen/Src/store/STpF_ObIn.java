// ***************************************************************************
// 
// Customer.Fetch.SingleFetch : STpF
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
@OBJ_SURROGATE=0x1C00004D
@FUNCTION=Customer.Fetch.SingleFetch
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=STpF
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Customer.Fetch.SingleFetch
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Customer.Fetch.SingleFetch
// ***************************************************************************

////////////////////////////////////////////////////////////////
// STpF Variable Group
public final class STpF_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public STpF_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("STpF_FetchKey", initvarSTpF_STpF_FetchKey());
    }

    public STpF_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("STpF_FetchKey", initvarSTpF_STpF_FetchKey());
    }

    public STpF_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("STpF_FetchKey", initvarSTpF_STpF_FetchKey());
    }




    ////////////////////////////////////////////////////////////////
    // FetchKey Variable
    public ObVariableX initvarSTpF_STpF_FetchKey()
    {
        ObVariableX var = new ObVariableX(this, "varSTpF_STpF_FetchKey");

        var.addField("CustID", new ObCharFld(ObField.DUAL, 10, 'c', "CustID", false, false, false, "", m_obapp, false)); /* CustomerID */

        return var;
    } 

    // End of FetchKey Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
