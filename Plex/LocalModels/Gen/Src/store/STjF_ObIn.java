// ***************************************************************************
// 
// Product.Update.UpdateRow : STjF
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
@OBJ_SURROGATE=0x1C0000BE
@FUNCTION=Product.Update.UpdateRow
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=STjF
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Product.Update.UpdateRow
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Product.Update.UpdateRow
// ***************************************************************************

////////////////////////////////////////////////////////////////
// STjF Variable Group
public final class STjF_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public STjF_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("STjF_UpdateData", initvarSTjF_STjF_UpdateData());
        addVariable("STjF_UpdateKey", initvarSTjF_STjF_UpdateKey());
    }

    public STjF_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("STjF_UpdateData", initvarSTjF_STjF_UpdateData());
        addVariable("STjF_UpdateKey", initvarSTjF_STjF_UpdateKey());
    }

    public STjF_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("STjF_UpdateData", initvarSTjF_STjF_UpdateData());
        addVariable("STjF_UpdateKey", initvarSTjF_STjF_UpdateKey());
    }




    ////////////////////////////////////////////////////////////////
    // UpdateData Variable
    public ObVariableX initvarSTjF_STjF_UpdateData()
    {
        ObVariableX var = new ObVariableX(this, "varSTjF_STjF_UpdateData");

        var.addField("ProdName", new ObCharFld(ObField.DUAL, 40, 'c', "ProdName", false, false, false, "", m_obapp, false)); /* ProductName */
        var.addField("ProdDesc", new ObCharFld(ObField.DUAL, 1024, 'c', "ProdDesc", true, true, false, "", m_obapp, false)); /* ProductDescription */
        var.addField("ProdPrice", new ObDblFld(ObField.DUAL, 9, 2, 'p', "ProdPrice", "", m_obapp)); /* ProductPrice */
        var.addField("QtyInStock", new ObIntFld(ObField.DUAL, 4, 0, 'p', "QtyInStock", "", m_obapp)); /* QtyInStock */

        return var;
    } 

    // End of UpdateData Variable
    ////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////
    // UpdateKey Variable
    public ObVariableX initvarSTjF_STjF_UpdateKey()
    {
        ObVariableX var = new ObVariableX(this, "varSTjF_STjF_UpdateKey");

        var.addField("ProdID", new ObCharFld(ObField.DUAL, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */

        return var;
    } 

    // End of UpdateKey Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
