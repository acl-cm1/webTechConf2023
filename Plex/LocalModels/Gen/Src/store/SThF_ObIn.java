// ***************************************************************************
// 
// Product.Update.DeleteRow : SThF
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
@OBJ_SURROGATE=0x1C0000BA
@FUNCTION=Product.Update.DeleteRow
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=SThF
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Product.Update.DeleteRow
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Product.Update.DeleteRow
// ***************************************************************************

////////////////////////////////////////////////////////////////
// SThF Variable Group
public final class SThF_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public SThF_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("SThF_DeleteKey", initvarSThF_SThF_DeleteKey());
    }

    public SThF_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("SThF_DeleteKey", initvarSThF_SThF_DeleteKey());
    }

    public SThF_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("SThF_DeleteKey", initvarSThF_SThF_DeleteKey());
    }




    ////////////////////////////////////////////////////////////////
    // DeleteKey Variable
    public ObVariableX initvarSThF_SThF_DeleteKey()
    {
        ObVariableX var = new ObVariableX(this, "varSThF_SThF_DeleteKey");

        var.addField("ProdID", new ObCharFld(ObField.DUAL, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */

        return var;
    } 

    // End of DeleteKey Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
