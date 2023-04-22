// ***************************************************************************
// 
// Product.Update.CheckedUpdate : STwF
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
@OBJ_SURROGATE=0x1C00001E
@FUNCTION=Product.Update.CheckedUpdate
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=STwF
@TYPE=EXTERNAL
@GENVRL=721
*/

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObComms.*;
import ObRun.ObFunction.*;
import ObRun.ObPanel.ObCtrlData.*;
import ObRun.ObDatabase.*;
import java.lang.reflect.*;
import java.util.*;
import java.awt.event.*;

// ***************************************************************************
// Product.Update.CheckedUpdate Function Class
// ***************************************************************************

public final class STwF_ObFnc extends ObFunction
{
    ////////////////////////////////////////////////////////////////////////////////
    // Construction Methods:

    //Default constructor - called by class loader
    //when class gets loaded and 'newInstance()' gets called
    public STwF_ObFnc(ObCallMgr obcallmgr)
    {
        super(obcallmgr);
        STwF_ObDat varObDat = new STwF_ObDat( this);
        super.setLocalVariable( varObDat);
        setFunctionName("Product.Update.CheckedUpdate");
        setDBConnectionName("", false);
        setVioKeys();
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Variable Access Methods:

    public ObVariableGroup getInVariable()
    {
        if( m_in == null)
            m_in  = new STwF_ObIn( this);
          return m_in;
    }
    public ObVariableGroup getOutVariable()
    {
        if( m_out == null)
            m_out  = new STwF_ObOut( this);
          return m_out;
    }
    public ObVariableGroup getDatVariable()
    {
        if( m_locVariable == null)
            m_locVariable  = new STwF_ObDat( this);
          return m_locVariable;
    }
    public void setVioKeys()
    {
        Vector<String> keySequence = new Vector<String>();
        keySequence.addElement("ProdID");
        setKeySequencex(keySequence);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Environment variable access methods:

    public void setReturnedStatus(ObCharFld returned)
    {
        ((STwF_ObDat)getDatVariable()).getVariable(m_strVarSTwF_Environment).getField(m_strFldSqmx0r6).assign(returned);
    }

    public void setReturningStatus(ObCharFld returning)
    {
        ((STwF_ObDat)getDatVariable()).getVariable(m_strVarSTwF_Environment).getField(m_strFldSqmx0r8).assign(returning);
    }

    public ObCharFld getReturningStatus()
    {
        return (ObCharFld)(((STwF_ObDat)getDatVariable()).getVariable(m_strVarSTwF_Environment).getField(m_strFldSqmx0r8));
    }

    public void setCallStatus(ObCharFld status)
    {
        ((STwF_ObDat)getDatVariable()).getVariable(m_strVarSTwF_Environment).getField(m_strFldSqmx0rg).assign(status);
    }


// ***************************************************************************
// Function:	Product.Update.CheckedUpdate
// ***************************************************************************

    public void ObRun()
    {
//  The standard set of context variables
        STwF_ObDat	v;
        STwF_ObIn	in;
        STwF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STwF_ObDat)fnc.getDatVariable();
        in	= (STwF_ObIn)fnc.getInVariable();
        out	= (STwF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Comment  Copyright 2004 Computer Associates International, Inc. All Rights Reserved.

// ***************************************************************************
// Description
// ***************************************************************************

// Seq 
        {
// Pre Point Description
            {
            }
// Edit Point  Description
            {
            }
// Post Point Description
            {
            }

// ***************************************************************************
// Modification history
// ***************************************************************************

// Seq 
            {
// Comment  07-Apr-1999	AGS	Define User meta variable for use in the message meta.#10087644
// Comment  28-Oct-1999	AGS	Define +Terminate meta variable for use in the Terminate meta.#10140727
// Comment  13-Oct-2005	CDC	Edit Point 'Terminate Processing' added to Subroutine Terminate. #12668997;02  #14346413.
// Pre Point Modification history
                {
// Comment  27-Sep-1999	AGS	Rename 'Fetch failed' edit point.#10141445
// Comment  30-Dec-1999	AGS	Set *Returning status to *View status after update.#10143875
// Comment  27-Aug-2003 Terki02 AVoid to generate "Fetch EQ UpdateKey, For update" against function that has FNC language SYS Java .#12580117
// Comment  18-Apr-2008 Terki02 AVoid to generate "Fetch EQ UpdateKey, For update" against function that has FNC language SYS C# . #16904995
// Comment  07-Apr-1999	AGS	Add Release lock if view comparision fails.#10087595
                }
// Edit Point  Modification history
                {
                }
// Post Point Modification history
                {
                }
            }
        }
// Go Sub  Initialize
        ObSbr_STwF1();
        if(hasReturned())
            return;

// Pre Point Execute
        {
// Go Sub  Fetch row
            ObSbr_STwF5();
            if(hasReturned())
                return;

// Go Sub  Update row
            ObSbr_STwF4();
            if(hasReturned())
                return;

        }
// Edit Point  Execute
        {
        }
// Post Point Execute
        {
// Go Sub  Terminate
            ObSbr_STwF2();
            if(hasReturned())
                return;

        }
// Sub  Initialize
// Sub  Terminate
// Sub  Send message
// Pre Point Subroutines
        {
// Sub  Update row
// Sub  Fetch row
        }
// Edit Point  Subroutines
        {
        }
// Post Point Subroutines
        {
        }

    }


// ***************************************************************************
// Subroutine:	Initialize
// ***************************************************************************

    void ObSbr_STwF1()
    {
//  The standard set of context variables
        STwF_ObDat	v;
        STwF_ObIn	in;
        STwF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STwF_ObDat)fnc.getDatVariable();
        in	= (STwF_ObIn)fnc.getInVariable();
        out	= (STwF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Initialize
// Pre Point Start initialize
        {
// Set  Environment<*Returning status> = <*Returning status.*Successful>
            v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_0);

        }
// Edit Point  Start initialize
        {
        }
// Post Point Start initialize
        {
        }

// ***************************************************************************
// Message handling & termination setup
// ***************************************************************************

// Seq 
        {
        }
// Pre Point End initialize
        {
        }
// Edit Point  End initialize
        {
        }
// Post Point End initialize
        {
        }
    }

// ***************************************************************************
// Subroutine:	Terminate
// ***************************************************************************

    void ObSbr_STwF2()
    {
//  The standard set of context variables
        STwF_ObDat	v;
        STwF_ObIn	in;
        STwF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STwF_ObDat)fnc.getDatVariable();
        in	= (STwF_ObIn)fnc.getInVariable();
        out	= (STwF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Terminate
// Pre Point Start terminate
        {
        }
// Edit Point  Start terminate
        {
        }
// Post Point Start terminate
        {
        }
// Comment  Terminate if the option is specified, otherwise Return
// Return
        setReturn();
        if(true) return; /* solves unreachable code compilation errors */

    }

// ***************************************************************************
// Subroutine:	Send message
// ***************************************************************************

    void ObSbr_STwF3()
    {
//  The standard set of context variables
        STwF_ObDat	v;
        STwF_ObIn	in;
        STwF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STwF_ObDat)fnc.getDatVariable();
        in	= (STwF_ObIn)fnc.getInVariable();
        out	= (STwF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Send message
// Pre Point Start send message
        {
        }
// Edit Point  Start send message
        {
        }
// Post Point Start send message
        {
        }
// Pre Point End send message
        {
        }
// Edit Point  End send message
        {
        }
// Post Point End send message
        {
        }
    }

// ***************************************************************************
// Subroutine:	Update row
// ***************************************************************************

    void ObSbr_STwF4()
    {
//  The standard set of context variables
        STwF_ObDat	v;
        STwF_ObIn	in;
        STwF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STwF_ObDat)fnc.getDatVariable();
        in	= (STwF_ObIn)fnc.getInVariable();
        out	= (STwF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Update row
// Pre Point Start update row
        {
        }
// Edit Point  Start update row
        {
        }
// Post Point Start update row
        {
// If  Environment<*Returning status> IS <State: OBJECTS/*Returning status.*Abnormal>
            if( ((v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).isNotEqual(m_obvalfld_0))) )
            {
// Pre Point Fetch for update failed
                {
                }
// Edit Point  Fetch for update failed
                {
                }
// Post Point Fetch for update failed
                {
                }
            }
// Else
            else
            {
// Set  View = UpdateData
                v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdName).assign(in.getVariable(m_strVarSTwF_UpdateData).getAsObCharFldField(m_strVarProdName));
                v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdDesc).assign(in.getVariable(m_strVarSTwF_UpdateData).getAsObCharFldField(m_strVarProdDesc));
                v.getVariable(m_strVarSTwF_View).getAsObDblFldField(m_strVarProdPrice).assign(in.getVariable(m_strVarSTwF_UpdateData).getAsObDblFldField(m_strVarProdPrice));
                v.getVariable(m_strVarSTwF_View).getAsObIntFldField(m_strVarQtyInStock).assign(in.getVariable(m_strVarSTwF_UpdateData).getAsObIntFldField(m_strVarQtyInStock));

// Pre Point Set view data for update
                {
                }
// Edit Point  Set view data for update
                {
                }
// Post Point Set view data for update
                {
                }
// Update
                keyFields = new Vector<ObField>();
                keyFields.addElement(v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdName));
                keyFields.addElement(v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdDesc));
                keyFields.addElement(v.getVariable(m_strVarSTwF_View).getAsObDblFldField(m_strVarProdPrice));
                keyFields.addElement(v.getVariable(m_strVarSTwF_View).getAsObIntFldField(m_strVarQtyInStock));
                keyFields.addElement(v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdID));
                sqlString = "UPDATE ST6V " + 
									"SET ProdName=?, ProdDesc=?, ProdPrice=?, QtyInStock=? " + 
									"WHERE " + 
									"( ProdID = ? ) "		;
                getDBMgr().updatex( sqlString, keyFields, this) ;
                getDBMgr().setViewIOStatusx((ObCharFld)v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r4), this);

// Set  Environment<*Returning status> = Environment<*View status>
                v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r4));

            }
        }
// Pre Point End update row
        {
        }
// Edit Point  End update row
        {
        }
// Post Point End update row
        {
        }
    }

// ***************************************************************************
// Subroutine:	Fetch row
// ***************************************************************************

    void ObSbr_STwF5()
    {
//  The standard set of context variables
        STwF_ObDat	v;
        STwF_ObIn	in;
        STwF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STwF_ObDat)fnc.getDatVariable();
        in	= (STwF_ObIn)fnc.getInVariable();
        out	= (STwF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Fetch row
// Pre Point Start fetch row
        {
        }
// Edit Point  Start fetch row
        {
        }
// Post Point Start fetch row
        {
// Fetch EQ  UpdateKey
            keyFields = new Vector<ObField>();
            keyFields.addElement(in.getVariable(m_strVarSTwF_UpdateKey).getAsObCharFldField(m_strVarProdID));
            sqlString = "SELECT ProdID, ProdName, ProdDesc, ProdPrice, QtyInStock " + 
									"FROM ST6V " + 
									"WHERE " + 
									"( ProdID = ? ) " + 
									"ORDER BY ProdID ";
            getDBMgr().fetchx(sqlString, keyFields, v.getVariable(m_strVarSTwF_View), 1, this);
            getDBMgr().setViewIOStatusx((ObCharFld)v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r4), this);

// Set  Environment<*Returning status> = Environment<*View status>
            v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r4));

        }
// Pre Point End fetch row
        {
// If  Environment<*View status> == <*View status.*Successful>
            if( v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r4).isEqual(m_obvalfld_0) )
            {
// Comment  Check each field for changes since the row was read

// If  Original<ProductID> NE  View<ProductID>
                if( in.getVariable(m_strVarSTwF_Original).getAsObCharFldField(m_strVarProdID).isNotEqual(v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdID)) )
                {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                        v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

                }

// Comment  Check each field for changes since the row was read

// If  Original<ProductName> NE  View<ProductName>
                if( in.getVariable(m_strVarSTwF_Original).getAsObCharFldField(m_strVarProdName).isNotEqual(v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdName)) )
                {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                        v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

                }

// Comment  Check each field for changes since the row was read

// If  Original<ProductDescription> NE  View<ProductDescription>
                if( in.getVariable(m_strVarSTwF_Original).getAsObCharFldField(m_strVarProdDesc).isNotEqual(v.getVariable(m_strVarSTwF_View).getAsObCharFldField(m_strVarProdDesc)) )
                {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                        v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

                }

// Comment  Check each field for changes since the row was read

// If  Original<ProductPrice> NE  View<ProductPrice>
                if( in.getVariable(m_strVarSTwF_Original).getAsObDblFldField(m_strVarProdPrice).isNotEqual(v.getVariable(m_strVarSTwF_View).getAsObDblFldField(m_strVarProdPrice)) )
                {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                        v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

                }

// Comment  Check each field for changes since the row was read

// If  Original<QtyInStock> NE  View<QtyInStock>
                if( in.getVariable(m_strVarSTwF_Original).getAsObIntFldField(m_strVarQtyInStock).isNotEqual(v.getVariable(m_strVarSTwF_View).getAsObIntFldField(m_strVarQtyInStock)) )
                {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                        v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

                }

// If  Environment<*Returning status> == <*Returning status.*Error>
                if( v.getVariable(m_strVarSTwF_Environment).getAsObCharFldField(m_strVarSqmx0r8).isEqual(m_obvalfld_1) )
                {
// Release Lock
// Release lock is not implemented

                }
            }
        }
// Edit Point  End fetch row
        {
        }
// Post Point End fetch row
        {
        }
    }

// ***************************************************************************
// The variables used by: Product.Update.CheckedUpdate
// ***************************************************************************

    ////////////////////////////////////////////////////////////////
    // ObDat Variable Group
    final class STwF_ObDat extends ObVariableGroupX
    {
        ////////////////////////////////////////////////////////////////
        // Members

        ////////////////////////////////////////////////////////////////
        // Constructors
        public STwF_ObDat(ObFunction fnc)
        {
            super(ObVariableGroup.VT_LOCAL, fnc);
            addVariable("STwF_Environment", initvarSTwF_STwF_Environment());
            addVariable("STwF_View", initvarSTwF_STwF_View());
        }

        public STwF_ObDat(ObApplication obapp)
        {
            super(obapp, ObVariableGroup.VT_LOCAL);
            addVariable("STwF_Environment", initvarSTwF_STwF_Environment());
            addVariable("STwF_View", initvarSTwF_STwF_View());
        }

        public STwF_ObDat()
        {
            super(ObVariableGroup.VT_LOCAL, null);
            addVariable("STwF_Environment", initvarSTwF_STwF_Environment());
            addVariable("STwF_View", initvarSTwF_STwF_View());
        }






        ////////////////////////////////////////////////////////////////
        // Environment Variable
        public ObVariableX initvarSTwF_STwF_Environment()
        {
            ObVariableX var = new ObVariableX(this, "varSTwF_STwF_Environment");

            var.addField("Sqmx1ac", new ObCharFld(ObField.ENVIRONMENT, 1, 'c', "Sqmx1ac", false, false, false, "", m_obapp, false)); /* *Focus set */
            var.addField("Sqmx1bm", new ObCharFld(ObField.ENVIRONMENT, 32, 'c', "Sqmx1bm", false, false, false, "", m_obapp, false)); /* *Database */
            var.addField("Sqmx1bo", new ObCharFld(ObField.ENVIRONMENT, 32, 'c', "Sqmx1bo", false, false, false, "", m_obapp, false)); /* *System */
            var.addField("Sqmx1c9", new ObCharFld(ObField.ENVIRONMENT, 512, 'c', "Sqmx1c9", false, false, false, "", m_obapp, false)); /* *Message */
            var.addField("Sqmx1e9", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx1e9", false, false, false, "", m_obapp, false)); /* *Validation */
            var.addField("Sqmx1ed", new ObCharFld(ObField.ENVIRONMENT, 256, 'c', "Sqmx1ed", false, true, false, "", m_obapp, false)); /* *Message text */
            var.addField("Sqmx1eq", new ObCharFld(ObField.ENVIRONMENT, 1, 'c', "Sqmx1eq", false, false, false, "", m_obapp, false)); /* *Message delivery */
            var.addField("Sqmx1eu", new ObCharFld(ObField.ENVIRONMENT, 128, 'c', "Sqmx1eu", false, true, false, "", m_obapp, false)); /* *Object */
            var.addField("Sqmx1g5", new ObCharFld(ObField.ENVIRONMENT, 32, 'c', "Sqmx1g5", false, false, false, "", m_obapp, false)); /* *Message ID */
            var.addField("Sqmx0r4", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx0r4", false, false, false, "", m_obapp, false)); /* *View status */
            var.addField("Sqmx0r6", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx0r6", false, false, false, "", m_obapp, false)); /* *Returned status */
            var.addField("Sqmx0r8", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx0r8", false, false, false, "", m_obapp, false)); /* *Returning status */
            var.addField("Sqmx0ra", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx0ra", false, false, false, "", m_obapp, false)); /* *Report status */
            var.addField("Sqmx0rc", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx0rc", false, false, false, "", m_obapp, false)); /* *Panel status */
            var.addField("Sqmx0re", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx0re", false, false, false, "", m_obapp, false)); /* *Error status */
            var.addField("Sqmx0rg", new ObCharFld(ObField.ENVIRONMENT, 7, 'c', "Sqmx0rg", false, false, false, "", m_obapp, false)); /* *Call status */
            var.addField("Sqmx0s3", new ObCharFld(ObField.ENVIRONMENT, 1, 'c', "Sqmx0s3", false, false, false, "", m_obapp, false)); /* *Boolean */
            var.addField("Sqmx0xh", new ObCharFld(ObField.ENVIRONMENT, 32, 'c', "Sqmx0xh", false, false, false, "", m_obapp, false)); /* *Object name */

            return var;
        } 

        // End of Environment Variable
        ////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////
        // View Variable
        public ObVariableX initvarSTwF_STwF_View()
        {
            ObVariableX var = new ObVariableX(this, "varSTwF_STwF_View");

            var.addField("ProdID", new ObCharFld(ObField.VIEW_KEY, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */
            var.addField("ProdName", new ObCharFld(ObField.VIEW_COL, 40, 'c', "ProdName", false, false, false, "", m_obapp, false)); /* ProductName */
            var.addField("ProdDesc", new ObCharFld(ObField.VIEW_COL, 1024, 'c', "ProdDesc", true, true, false, "", m_obapp, false)); /* ProductDescription */
            var.addField("ProdPrice", new ObDblFld(ObField.VIEW_COL, 9, 2, 'p', "ProdPrice", "", m_obapp)); /* ProductPrice */
            var.addField("QtyInStock", new ObIntFld(ObField.VIEW_COL, 4, 0, 'p', "QtyInStock", "", m_obapp)); /* QtyInStock */

            return var;
        } 

        // End of View Variable
        ////////////////////////////////////////////////////////////////
    }
    // End Of Product.Update.CheckedUpdate Variable Group
    ////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Field Values:

        ObCharFld m_obvalfld_0 = new ObCharFld(" ", 7);
        ObCharFld m_obvalfld_1 = new ObCharFld("ERR", 7);
    // End Of Field Values
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Variable and Field Names:

        public final String m_strFldSqmx0rg = "Sqmx0rg";
        public final String m_strVarSTwF_Environment = "STwF_Environment";
        public final String m_strVarQtyInStock = "QtyInStock";
        public final String m_strVarProdPrice = "ProdPrice";
        public final String m_strVarSqmx0r8 = "Sqmx0r8";
        public final String m_strFldSqmx0r8 = "Sqmx0r8";
        public final String m_strVarSTwF_UpdateKey = "STwF_UpdateKey";
        public final String m_strVarProdDesc = "ProdDesc";
        public final String m_strVarSTwF_Original = "STwF_Original";
        public final String m_strVarSqmx0r4 = "Sqmx0r4";
        public final String m_strVarProdName = "ProdName";
        public final String m_strVarProdID = "ProdID";
        public final String m_strVarSTwF_UpdateData = "STwF_UpdateData";
        public final String m_strFldSqmx0r6 = "Sqmx0r6";
        public final String m_strVarSTwF_View = "STwF_View";
    // End Of Variable and Field Names
    ////////////////////////////////////////////////////////////////////////////////
}
// ***************************************************************************
