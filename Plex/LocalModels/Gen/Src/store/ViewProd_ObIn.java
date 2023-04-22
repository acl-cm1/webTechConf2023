// ***************************************************************************
// 
// Product.ViewProduct : ViewProd
// 
// ***************************************************************************
// 
// Generated by : CA Plex r7.2.1   (Build 24.004)
// Date - Time  : Friday, April 21, 2023 - 1:28 PM
// Group Model  : C:\Development\Conferences\2023 Boca Raton\Web Tech Workshop\2023 Plex2E Conference Preparation\Plex\GroupModels\Store
// Local Model  : C:\Development\Conferences\2023 Boca Raton\Web Tech Workshop\2023 Plex2E Conference Preparation\Plex\LocalModels\store.mdl
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
@OBJ_SURROGATE=0xFFFFFFF7
@FUNCTION=Product.ViewProduct
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=ViewProd
@TYPE=EXTERNAL
@GENVRL=721
*/


// ***************************************************************************
// External Function: Product.ViewProduct
// ***************************************************************************

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObFunction.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;


// ***************************************************************************
// The variables used by: Product.ViewProduct
// ***************************************************************************

////////////////////////////////////////////////////////////////
// ViewProd Variable Group
public final class ViewProd_ObIn extends ObVariableGroupX
{
    ////////////////////////////////////////////////////////////////
    // Members

    ////////////////////////////////////////////////////////////////
    // Constructors
    public ViewProd_ObIn(ObFunction fnc)
    {
        super(ObVariableGroup.VT_INPUT, fnc);
        addVariable("ViewProd_Input", initvarViewProd_ViewProd_Input());
    }

    public ViewProd_ObIn(ObApplication obapp)
    {
        super(obapp, ObVariableGroup.VT_INPUT);
        addVariable("ViewProd_Input", initvarViewProd_ViewProd_Input());
    }

    public ViewProd_ObIn()
    {
        super(ObVariableGroup.VT_INPUT, null);
        addVariable("ViewProd_Input", initvarViewProd_ViewProd_Input());
    }




    ////////////////////////////////////////////////////////////////
    // Input Variable
    public ObVariableX initvarViewProd_ViewProd_Input()
    {
        ObVariableX var = new ObVariableX(this, "varViewProd_ViewProd_Input");

        var.addField("ProdID", new ObCharFld(ObField.INPUT, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */

        return var;
    } 

    // End of Input Variable
    ////////////////////////////////////////////////////////////////


}

// ***************************************************************************
