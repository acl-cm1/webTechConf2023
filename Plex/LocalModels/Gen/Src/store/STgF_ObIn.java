// ***************************************************************************
// 
// Product.Fetch.SingleFetch : STgF
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
@OBJ_SURROGATE=0x1C0000C1
@FUNCTION=Product.Fetch.SingleFetch
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=STgF
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Product.Fetch.SingleFetch
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Product.Fetch.SingleFetch
// ***************************************************************************

////////////////////////////////////////////////////////////////
// STgF Variable Group
public final class STgF_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public STgF_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("STgF_FetchKey", initvarSTgF_STgF_FetchKey());
    }

    public STgF_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("STgF_FetchKey", initvarSTgF_STgF_FetchKey());
    }

    public STgF_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("STgF_FetchKey", initvarSTgF_STgF_FetchKey());
    }




    ////////////////////////////////////////////////////////////////
    // FetchKey Variable
    public ObVariableX initvarSTgF_STgF_FetchKey()
    {
        ObVariableX var = new ObVariableX(this, "varSTgF_STgF_FetchKey");

        var.addField("ProdID", new ObCharFld(ObField.DUAL, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */

        return var;
    } 

    // End of FetchKey Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
