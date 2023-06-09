// ***************************************************************************
// 
// Order.Update.InsertRow : ST16F
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
@OBJ_SURROGATE=0xFFFFFFE4
@FUNCTION=Order.Update.InsertRow
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=ST16F
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
// Order.Update.InsertRow Function Class
// ***************************************************************************

public final class ST16F_ObFnc extends ObFunction
{
    ////////////////////////////////////////////////////////////////////////////////
    // Construction Methods:

    //Default constructor - called by class loader
    //when class gets loaded and 'newInstance()' gets called
    public ST16F_ObFnc(ObCallMgr obcallmgr)
    {
        super(obcallmgr);
        ST16F_ObDat varObDat = new ST16F_ObDat( this);
        super.setLocalVariable( varObDat);
        setFunctionName("Order.Update.InsertRow");
        setDBConnectionName("", false);
        setVioKeys();
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Variable Access Methods:

    public ObVariableGroup getInVariable()
    {
        if( m_in == null)
            m_in  = new ST16F_ObIn( this);
          return m_in;
    }
    public ObVariableGroup getOutVariable()
    {
        if( m_out == null)
            m_out  = new ST16F_ObOut( this);
          return m_out;
    }
    public ObVariableGroup getDatVariable()
    {
        if( m_locVariable == null)
            m_locVariable  = new ST16F_ObDat( this);
          return m_locVariable;
    }
    public void setVioKeys()
    {
        Vector<String> keySequence = new Vector<String>();
        keySequence.addElement("OrderID");
        setKeySequencex(keySequence);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Environment variable access methods:

    public void setReturnedStatus(ObCharFld returned)
    {
        ((ST16F_ObDat)getDatVariable()).getVariable(m_strVarST16F_Environment).getField(m_strFldSqmx0r6).assign(returned);
    }

    public void setReturningStatus(ObCharFld returning)
    {
        ((ST16F_ObDat)getDatVariable()).getVariable(m_strVarST16F_Environment).getField(m_strFldSqmx0r8).assign(returning);
    }

    public ObCharFld getReturningStatus()
    {
        return (ObCharFld)(((ST16F_ObDat)getDatVariable()).getVariable(m_strVarST16F_Environment).getField(m_strFldSqmx0r8));
    }

    public void setCallStatus(ObCharFld status)
    {
        ((ST16F_ObDat)getDatVariable()).getVariable(m_strVarST16F_Environment).getField(m_strFldSqmx0rg).assign(status);
    }


// ***************************************************************************
// Function:	Order.Update.InsertRow
// ***************************************************************************

    public void ObRun()
    {
//  The standard set of context variables
        ST16F_ObDat	v;
        ST16F_ObIn	in;
        ST16F_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST16F_ObDat)fnc.getDatVariable();
        in	= (ST16F_ObIn)fnc.getInVariable();
        out	= (ST16F_ObOut)fnc.getOutVariable();

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
// Comment  23-Mar-1999	AGS	Fix name resolution on call failure.#10084290
// Comment  17-Nov-1999	AGS	Set *Returning status on call failure.#10142243
// Comment  24-Jan-2000	AGS	Condition Format messages in message delivery being defined.#10144519
// Comment  17-Nov-1999	AGS	Set *Returning status on call failure.#10142243
// Comment  24-Jan-2000	AGS	Condition Format messages in message delivery being defined.#10144519
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
        ObSbr_ST16F1();
        if(hasReturned())
            return;

// Pre Point Execute
        {
// Go Sub  Insert row
            ObSbr_ST16F4();
            if(hasReturned())
                return;

        }
// Edit Point  Execute
        {
        }
// Post Point Execute
        {
// Go Sub  Terminate
            ObSbr_ST16F2();
            if(hasReturned())
                return;

        }
// Sub  Initialize
// Sub  Terminate
// Sub  Send message
// Pre Point Subroutines
        {
// Sub  Insert row
// Sub  Set table name
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

    void ObSbr_ST16F1()
    {
//  The standard set of context variables
        ST16F_ObDat	v;
        ST16F_ObIn	in;
        ST16F_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST16F_ObDat)fnc.getDatVariable();
        in	= (ST16F_ObIn)fnc.getInVariable();
        out	= (ST16F_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Initialize
// Pre Point Start initialize
        {
// Set  Environment<*Returning status> = <*Returning status.*Successful>
            v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_0);

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
// Go Sub  Set table name
            ObSbr_ST16F5();
            if(hasReturned())
                return;

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

    void ObSbr_ST16F2()
    {
//  The standard set of context variables
        ST16F_ObDat	v;
        ST16F_ObIn	in;
        ST16F_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST16F_ObDat)fnc.getDatVariable();
        in	= (ST16F_ObIn)fnc.getInVariable();
        out	= (ST16F_ObOut)fnc.getOutVariable();

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

    void ObSbr_ST16F3()
    {
//  The standard set of context variables
        ST16F_ObDat	v;
        ST16F_ObIn	in;
        ST16F_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST16F_ObDat)fnc.getDatVariable();
        in	= (ST16F_ObIn)fnc.getInVariable();
        out	= (ST16F_ObOut)fnc.getOutVariable();

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
// Subroutine:	Insert row
// ***************************************************************************

    void ObSbr_ST16F4()
    {
//  The standard set of context variables
        ST16F_ObDat	v;
        ST16F_ObIn	in;
        ST16F_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST16F_ObDat)fnc.getDatVariable();
        in	= (ST16F_ObIn)fnc.getInVariable();
        out	= (ST16F_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Insert row
// Pre Point Start insert row
        {
        }
// Edit Point  Start insert row
        {
        }
// Post Point Start insert row
        {
// Call  Order.Fetch.CheckRow

            getObVariableGroupX("store.ST11F_ObIn").getVariable(m_strVarST11F_CheckKey).getAsObLongFldField(m_strVarOrderID).assign(v.getVariable(m_strVarST16F_View).getAsObLongFldField(m_strVarOrderID));

            {
                ObRunnable obrun = getCallMgr().getObRunnable(fnc, getObVariableGroupX("store.ST11F_ObIn"), getObVariableGroupX("store.ST11F_ObOut"), "store.ST11F_ObFnc","External", "Java", "DefaultServer" );
                if(obrun != null)
                {
                    obrun.ObRun();
                    obrun.ObPostRun();
                }
            }

// Comment  Check if the row already exists
// Case
            // Start of CASE block
            {
// When  Environment<*Call status> IS <State: OBJECTS/*Call status.*Abnormal>
                if( ((v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0rg).isNotEqual(m_obvalfld_0))) )
                {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                    v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

// Name  Function: Order.Fetch.CheckRow, Environment<*Object>
                    v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx1eu).fromString("Order.Fetch.CheckRow");

// Pre Point Call to check row failed
                    {
                    }
// Edit Point  Call to check row failed
                    {
                    }
// Post Point Call to check row failed
                    {
                    }
// Go Sub  Send message
                    ObSbr_ST16F3();
                    if(hasReturned())
                        return;

                }
// When  Environment<*Returned status> == <*Returned status.*Instance not found>
                else
                {
                    if( v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r6).isEqual(m_obvalfld_2) )
                    {
// Set  View = InsertData
                        v.getVariable(m_strVarST16F_View).getAsObCharFldField(m_strVarProdID).assign(in.getVariable(m_strVarST16F_InsertData).getAsObCharFldField(m_strVarProdID));
                        v.getVariable(m_strVarST16F_View).getAsObCharFldField(m_strVarCustID).assign(in.getVariable(m_strVarST16F_InsertData).getAsObCharFldField(m_strVarCustID));
                        v.getVariable(m_strVarST16F_View).getAsObIntFldField(m_strVarOrderQty).assign(in.getVariable(m_strVarST16F_InsertData).getAsObIntFldField(m_strVarOrderQty));

// Pre Point Set view data for insert
                        {
                        }
// Edit Point  Set view data for insert
                        {
                        }
// Post Point Set view data for insert
                        {
                        }
// Insert
                        keyFields = new Vector<ObField>();
                        keyFields.addElement(v.getVariable(m_strVarST16F_View).getAsObLongFldField(m_strVarOrderID));
                        keyFields.addElement(v.getVariable(m_strVarST16F_View).getAsObCharFldField(m_strVarProdID));
                        keyFields.addElement(v.getVariable(m_strVarST16F_View).getAsObCharFldField(m_strVarCustID));
                        keyFields.addElement(v.getVariable(m_strVarST16F_View).getAsObIntFldField(m_strVarOrderQty));
                        sqlString = "INSERT INTO ST13V ( OrderID, ProdID, CustID, OrderQty ) " + 
									"VALUES ( ?, ?, ?, ? ) "		;
                        getDBMgr().insertx( sqlString, keyFields, this) ;
                        getDBMgr().setViewIOStatusx((ObCharFld)v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r4), this);

// Set  Environment<*Returning status> = Environment<*View status>
                        v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r4));

                    }
// When  Environment<*Returned status> == <*Returned status.*Successful>
                    else
                    {
                        if( v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r6).isEqual(m_obvalfld_0) )
                        {
// Set  Environment<*Returning status> = <*Returning status.*Instance exists>
                            v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_3);

// Pre Point Row to insert exists
                            {
                            }
// Edit Point  Row to insert exists
                            {
                            }
// Post Point Row to insert exists
                            {
                            }
                        }
// Otherwise
                        else
                        {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                            v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

// Pre Point Unknown failure
                            {
                            }
// Edit Point  Unknown failure
                            {
                            }
// Post Point Unknown failure
                            {
                            }
                        }
                    }
                }
            }
            // End of CASE block
        }
// Pre Point End insert row
        {
        }
// Edit Point  End insert row
        {
        }
// Post Point End insert row
        {
// Set  Output<OrderID> = View<OrderID>
            out.getVariable(m_strVarST16F_Output).getAsObLongFldField(m_strVarOrderID).assign(v.getVariable(m_strVarST16F_View).getAsObLongFldField(m_strVarOrderID));

        }
    }

// ***************************************************************************
// Subroutine:	Set table name
// ***************************************************************************

    void ObSbr_ST16F5()
    {
//  The standard set of context variables
        ST16F_ObDat	v;
        ST16F_ObIn	in;
        ST16F_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST16F_ObDat)fnc.getDatVariable();
        in	= (ST16F_ObIn)fnc.getInVariable();
        out	= (ST16F_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Set table name
// Pre Point Start set table name
        {
        }
// Edit Point  Start set table name
        {
        }
// Post Point Start set table name
        {
        }
// Set  Local<TableName> = Name of CustOrder
        v.getVariable(m_strVarST16F_Local).getAsObCharFldField(m_strVarS5tri34).fromString("CustOrder");
// Pre Point Override table name
        {
        }
// Edit Point  Override table name
        {
        }
// Post Point Override table name
        {
        }
// Call  StoreSurrogates.Update.NextSurrogate

        getObVariableGroupX("store.ST1gF_ObIn").getVariable(m_strVarST1gF_Input).getAsObCharFldField(m_strVarS5tri34).assign(v.getVariable(m_strVarST16F_Local).getAsObCharFldField(m_strVarS5tri34));
        getObVariableGroupX("store.ST1gF_ObIn").getVariable(m_strVarST1gF_Input).getAsObLongFldField(m_strVarS5trhe3).assign(v.getVariable(m_strVarST16F_View).getAsObLongFldField(m_strVarOrderID));

        {
            ObRunnable obrun = getCallMgr().getObRunnable(fnc, getObVariableGroupX("store.ST1gF_ObIn"), getObVariableGroupX("store.ST1gF_ObOut"), "store.ST1gF_ObFnc","External", "Java", "DefaultServer" );
            if(obrun != null)
            {
                obrun.ObRun();
                obrun.ObPostRun();
            }
        }
        v.getVariable(m_strVarST16F_View).getAsObLongFldField(m_strVarOrderID).assign(getObVariableGroupX("store.ST1gF_ObIn").getVariable(m_strVarST1gF_Input).getAsObLongFldField(m_strVarS5trhe3));

// If  Environment<*Call status> IS <State: OBJECTS/*Call status.*Abnormal> OR Environment<*Returned status> IS <State: OBJECTS/*Returned status.*Abnormal>
        if( (((v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0rg).isNotEqual(m_obvalfld_0)))) || (((v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r6).isNotEqual(m_obvalfld_0)))) )
        {
// Name  Function: StoreSurrogates.Update.NextSurrogate, Environment<*Object>
            v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx1eu).fromString("StoreSurrogates.Update.NextSurrogate");

// Set  Environment<*Returning status> = <*Returning status.*Error>
            v.getVariable(m_strVarST16F_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

// Pre Point Get next surrogate failed
            {
            }
// Edit Point  Get next surrogate failed
            {
            }
// Post Point Get next surrogate failed
            {
            }
// Go Sub  Send message
            ObSbr_ST16F3();
            if(hasReturned())
                return;

// Go Sub  Terminate
            ObSbr_ST16F2();
            if(hasReturned())
                return;

        }
// Pre Point End set table name
        {
        }
// Edit Point  End set table name
        {
        }
// Post Point End set table name
        {
        }
    }

// ***************************************************************************
// The variables used by: Order.Update.InsertRow
// ***************************************************************************

    ////////////////////////////////////////////////////////////////
    // ObDat Variable Group
    final class ST16F_ObDat extends ObVariableGroupX
    {
        ////////////////////////////////////////////////////////////////
        // Members

        ////////////////////////////////////////////////////////////////
        // Constructors
        public ST16F_ObDat(ObFunction fnc)
        {
            super(ObVariableGroup.VT_LOCAL, fnc);
            addVariable("ST16F_Local", initvarST16F_ST16F_Local());
            addVariable("ST16F_Environment", initvarST16F_ST16F_Environment());
            addVariable("ST16F_View", initvarST16F_ST16F_View());
        }

        public ST16F_ObDat(ObApplication obapp)
        {
            super(obapp, ObVariableGroup.VT_LOCAL);
            addVariable("ST16F_Local", initvarST16F_ST16F_Local());
            addVariable("ST16F_Environment", initvarST16F_ST16F_Environment());
            addVariable("ST16F_View", initvarST16F_ST16F_View());
        }

        public ST16F_ObDat()
        {
            super(ObVariableGroup.VT_LOCAL, null);
            addVariable("ST16F_Local", initvarST16F_ST16F_Local());
            addVariable("ST16F_Environment", initvarST16F_ST16F_Environment());
            addVariable("ST16F_View", initvarST16F_ST16F_View());
        }






        ////////////////////////////////////////////////////////////////
        // Local Variable
        public ObVariableX initvarST16F_ST16F_Local()
        {
            ObVariableX var = new ObVariableX(this, "varST16F_ST16F_Local");

            var.addField("S5tri34", new ObCharFld(ObField.LOCAL, 32, 'c', "S5tri34", false, false, false, "", m_obapp, false)); /* TableName */

            return var;
        } 

        // End of Local Variable
        ////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////
        // Environment Variable
        public ObVariableX initvarST16F_ST16F_Environment()
        {
            ObVariableX var = new ObVariableX(this, "varST16F_ST16F_Environment");

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
        public ObVariableX initvarST16F_ST16F_View()
        {
            ObVariableX var = new ObVariableX(this, "varST16F_ST16F_View");

            var.addField("OrderID", new ObLongFld(ObField.VIEW_KEY, 9, 0, 'p', "OrderID", "", m_obapp)); /* OrderID */
            var.addField("ProdID", new ObCharFld(ObField.VIEW_COL, 10, 'c', "ProdID", false, false, false, "", m_obapp, false)); /* ProductID */
            var.addField("CustID", new ObCharFld(ObField.VIEW_COL, 10, 'c', "CustID", false, false, false, "", m_obapp, false)); /* CustomerID */
            var.addField("OrderQty", new ObIntFld(ObField.VIEW_COL, 4, 0, 'p', "OrderQty", "", m_obapp)); /* OrderQty */

            return var;
        } 

        // End of View Variable
        ////////////////////////////////////////////////////////////////
    }
    // End Of Order.Update.InsertRow Variable Group
    ////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Field Values:

        ObCharFld m_obvalfld_3 = new ObCharFld("IEX", 7);
        ObCharFld m_obvalfld_2 = new ObCharFld("INF", 7);
        ObCharFld m_obvalfld_0 = new ObCharFld(" ", 7);
        ObCharFld m_obvalfld_1 = new ObCharFld("ERR", 7);
    // End Of Field Values
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Variable and Field Names:

        public final String m_strVarOrderID = "OrderID";
        public final String m_strFldSqmx0rg = "Sqmx0rg";
        public final String m_strVarSqmx1eu = "Sqmx1eu";
        public final String m_strVarSqmx0r8 = "Sqmx0r8";
        public final String m_strFldSqmx0r8 = "Sqmx0r8";
        public final String m_strVarSqmx0r6 = "Sqmx0r6";
        public final String m_strVarST16F_InsertData = "ST16F_InsertData";
        public final String m_strVarST16F_View = "ST16F_View";
        public final String m_strVarS5trhe3 = "S5trhe3";
        public final String m_strVarSqmx0r4 = "Sqmx0r4";
        public final String m_strVarST16F_Environment = "ST16F_Environment";
        public final String m_strVarProdID = "ProdID";
        public final String m_strVarST16F_Local = "ST16F_Local";
        public final String m_strVarSqmx0rg = "Sqmx0rg";
        public final String m_strVarST11F_CheckKey = "ST11F_CheckKey";
        public final String m_strFldSqmx0r6 = "Sqmx0r6";
        public final String m_strVarST16F_Output = "ST16F_Output";
        public final String m_strVarOrderQty = "OrderQty";
        public final String m_strVarS5tri34 = "S5tri34";
        public final String m_strVarST1gF_Input = "ST1gF_Input";
        public final String m_strVarCustID = "CustID";
    // End Of Variable and Field Names
    ////////////////////////////////////////////////////////////////////////////////
}
// ***************************************************************************
