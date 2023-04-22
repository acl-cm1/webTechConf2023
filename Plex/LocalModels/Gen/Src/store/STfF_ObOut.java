// ***************************************************************************
// 
// Product.Fetch.BlockFetch : STfF
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
@OBJ_SURROGATE=0x1C0000BC
@FUNCTION=Product.Fetch.BlockFetch
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=STfF
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Product.Fetch.BlockFetch
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Product.Fetch.BlockFetch
// ***************************************************************************

////////////////////////////////////////////////////////////////
// STfF Variable Group
public final class STfF_ObOut extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public STfF_ObOut(ObFunction fnc)
    {
        super(ObVariableGroup.VT_OUTPUT, fnc);
        ObVariableX[] STfF_FetchedData = new ObVariableX[64];
        for(int i = 0; i < 64; i++)
            STfF_FetchedData[i] = initvarSTfF_STfF_FetchedData();
        addVariableArray("STfF_FetchedData", STfF_FetchedData);
    }

    public STfF_ObOut(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_OUTPUT);
        ObVariableX[] STfF_FetchedData = new ObVariableX[64];
        for(int i = 0; i < 64; i++)
            STfF_FetchedData[i] = initvarSTfF_STfF_FetchedData();
        addVariableArray("STfF_FetchedData", STfF_FetchedData);
    }

    public STfF_ObOut()
    {
        super(ObVariableGroup.VT_OUTPUT, null);
        ObVariableX[] STfF_FetchedData = new ObVariableX[64];
        for(int i = 0; i < 64; i++)
            STfF_FetchedData[i] = initvarSTfF_STfF_FetchedData();
        addVariableArray("STfF_FetchedData", STfF_FetchedData);
    }




    ////////////////////////////////////////////////////////////////
    // FetchedData Variable
    public ObVariableX initvarSTfF_STfF_FetchedData()
    {
        ObVariableX var = new ObVariableX(this, "varSTfF_STfF_FetchedData");

        var.addField("ProdID", new ObCharFld(ObField.OUTPUT, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */
        var.addField("ProdName", new ObCharFld(ObField.OUTPUT, 40, 'c', "ProdName", false, false, false, "", m_obapp, false)); /* ProductName */
        var.addField("ProdDesc", new ObCharFld(ObField.OUTPUT, 1024, 'c', "ProdDesc", true, true, false, "", m_obapp, false)); /* ProductDescription */
        var.addField("ProdPrice", new ObDblFld(ObField.OUTPUT, 9, 2, 'p', "ProdPrice", "", m_obapp)); /* ProductPrice */
        var.addField("QtyInStock", new ObIntFld(ObField.OUTPUT, 4, 0, 'p', "QtyInStock", "", m_obapp)); /* QtyInStock */

        return var;
    } 

    // End of FetchedData Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
