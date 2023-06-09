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
public final class ST12F_ObOut extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public ST12F_ObOut(ObFunction fnc)
    {
        super(ObVariableGroup.VT_OUTPUT, fnc);
        addVariable("ST12F_FetchedData", initvarST12F_ST12F_FetchedData());
    }

    public ST12F_ObOut(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_OUTPUT);
        addVariable("ST12F_FetchedData", initvarST12F_ST12F_FetchedData());
    }

    public ST12F_ObOut()
    {
        super(ObVariableGroup.VT_OUTPUT, null);
        addVariable("ST12F_FetchedData", initvarST12F_ST12F_FetchedData());
    }




    ////////////////////////////////////////////////////////////////
    // FetchedData Variable
    public ObVariableX initvarST12F_ST12F_FetchedData()
    {
        ObVariableX var = new ObVariableX(this, "varST12F_ST12F_FetchedData");

        var.addField("OrderID", new ObLongFld(ObField.OUTPUT, 9, 0, 'p', "OrderID", "", m_obapp)); /* OrderID */
        var.addField("ProdID", new ObCharFld(ObField.OUTPUT, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */
        var.addField("ProdName", new ObCharFld(ObField.OUTPUT, 40, 'c', "ProdName", false, false, false, "", m_obapp, false)); /* ProductName */
        var.addField("CustID", new ObCharFld(ObField.OUTPUT, 10, 'c', "CustID", false, false, false, "", m_obapp, false)); /* CustomerID */
        var.addField("CustName", new ObCharFld(ObField.OUTPUT, 40, 'c', "CustName", false, false, false, "", m_obapp, false)); /* CustomerName */
        var.addField("OrderQty", new ObIntFld(ObField.OUTPUT, 4, 0, 'p', "OrderQty", "", m_obapp)); /* OrderQty */

        return var;
    } 

    // End of FetchedData Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
