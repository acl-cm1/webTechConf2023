// ***************************************************************************
// 
// StoreSurrogates.Fetch.SingleFetch : ST1cF
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
@OBJ_SURROGATE=0xFFFFFF6E
@FUNCTION=StoreSurrogates.Fetch.SingleFetch
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=ST1cF
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: StoreSurrogates.Fetch.SingleFetch
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: StoreSurrogates.Fetch.SingleFetch
// ***************************************************************************

////////////////////////////////////////////////////////////////
// ST1cF Variable Group
public final class ST1cF_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public ST1cF_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("ST1cF_FetchKey", initvarST1cF_ST1cF_FetchKey());
    }

    public ST1cF_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("ST1cF_FetchKey", initvarST1cF_ST1cF_FetchKey());
    }

    public ST1cF_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("ST1cF_FetchKey", initvarST1cF_ST1cF_FetchKey());
    }




    ////////////////////////////////////////////////////////////////
    // FetchKey Variable
    public ObVariableX initvarST1cF_ST1cF_FetchKey()
    {
        ObVariableX var = new ObVariableX(this, "varST1cF_ST1cF_FetchKey");

        var.addField("S5tri34", new ObCharFld(ObField.DUAL, 32, 'c', "TABLENAME", false, false, false, "", m_obapp, false)); /* TableName */

        return var;
    } 

    // End of FetchKey Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
