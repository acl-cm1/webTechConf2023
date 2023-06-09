// ***************************************************************************
// 
// StoreSurrogates.Update.InsertRow : ST1fF
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
@OBJ_SURROGATE=0xFFFFFF69
@FUNCTION=StoreSurrogates.Update.InsertRow
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=ST1fF
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
// StoreSurrogates.Update.InsertRow Function Class
// ***************************************************************************

public final class ST1fF_ObFnc extends ObFunction
{
    ////////////////////////////////////////////////////////////////////////////////
    // Construction Methods:

    //Default constructor - called by class loader
    //when class gets loaded and 'newInstance()' gets called
    public ST1fF_ObFnc(ObCallMgr obcallmgr)
    {
        super(obcallmgr);
        ST1fF_ObDat varObDat = new ST1fF_ObDat( this);
        super.setLocalVariable( varObDat);
        setFunctionName("StoreSurrogates.Update.InsertRow");
        setDBConnectionName("", false);
        setVioKeys();
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Variable Access Methods:

    public ObVariableGroup getInVariable()
    {
        if( m_in == null)
            m_in  = new ST1fF_ObIn( this);
          return m_in;
    }
    public ObVariableGroup getOutVariable()
    {
        if( m_out == null)
            m_out  = new ST1fF_ObOut( this);
          return m_out;
    }
    public ObVariableGroup getDatVariable()
    {
        if( m_locVariable == null)
            m_locVariable  = new ST1fF_ObDat( this);
          return m_locVariable;
    }
    public void setVioKeys()
    {
        Vector<String> keySequence = new Vector<String>();
        keySequence.addElement("TABLENAME");
        setKeySequencex(keySequence);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Environment variable access methods:

    public void setReturnedStatus(ObCharFld returned)
    {
        ((ST1fF_ObDat)getDatVariable()).getVariable(m_strVarST1fF_Environment).getField(m_strFldSqmx0r6).assign(returned);
    }

    public void setReturningStatus(ObCharFld returning)
    {
        ((ST1fF_ObDat)getDatVariable()).getVariable(m_strVarST1fF_Environment).getField(m_strFldSqmx0r8).assign(returning);
    }

    public ObCharFld getReturningStatus()
    {
        return (ObCharFld)(((ST1fF_ObDat)getDatVariable()).getVariable(m_strVarST1fF_Environment).getField(m_strFldSqmx0r8));
    }

    public void setCallStatus(ObCharFld status)
    {
        ((ST1fF_ObDat)getDatVariable()).getVariable(m_strVarST1fF_Environment).getField(m_strFldSqmx0rg).assign(status);
    }


// ***************************************************************************
// Function:	StoreSurrogates.Update.InsertRow
// ***************************************************************************

    public void ObRun()
    {
//  The standard set of context variables
        ST1fF_ObDat	v;
        ST1fF_ObIn	in;
        ST1fF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST1fF_ObDat)fnc.getDatVariable();
        in	= (ST1fF_ObIn)fnc.getInVariable();
        out	= (ST1fF_ObOut)fnc.getOutVariable();

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
        ObSbr_ST1fF1();
        if(hasReturned())
            return;

// Pre Point Execute
        {
// Go Sub  Insert row
            ObSbr_ST1fF4();
            if(hasReturned())
                return;

        }
// Edit Point  Execute
        {
        }
// Post Point Execute
        {
// Go Sub  Terminate
            ObSbr_ST1fF2();
            if(hasReturned())
                return;

        }
// Sub  Initialize
// Sub  Terminate
// Sub  Send message
// Pre Point Subroutines
        {
// Sub  Insert row
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

    void ObSbr_ST1fF1()
    {
//  The standard set of context variables
        ST1fF_ObDat	v;
        ST1fF_ObIn	in;
        ST1fF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST1fF_ObDat)fnc.getDatVariable();
        in	= (ST1fF_ObIn)fnc.getInVariable();
        out	= (ST1fF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Initialize
// Pre Point Start initialize
        {
// Set  Environment<*Returning status> = <*Returning status.*Successful>
            v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_0);

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

    void ObSbr_ST1fF2()
    {
//  The standard set of context variables
        ST1fF_ObDat	v;
        ST1fF_ObIn	in;
        ST1fF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST1fF_ObDat)fnc.getDatVariable();
        in	= (ST1fF_ObIn)fnc.getInVariable();
        out	= (ST1fF_ObOut)fnc.getOutVariable();

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

    void ObSbr_ST1fF3()
    {
//  The standard set of context variables
        ST1fF_ObDat	v;
        ST1fF_ObIn	in;
        ST1fF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST1fF_ObDat)fnc.getDatVariable();
        in	= (ST1fF_ObIn)fnc.getInVariable();
        out	= (ST1fF_ObOut)fnc.getOutVariable();

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

    void ObSbr_ST1fF4()
    {
//  The standard set of context variables
        ST1fF_ObDat	v;
        ST1fF_ObIn	in;
        ST1fF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (ST1fF_ObDat)fnc.getDatVariable();
        in	= (ST1fF_ObIn)fnc.getInVariable();
        out	= (ST1fF_ObOut)fnc.getOutVariable();

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
// Call  StoreSurrogates.Fetch.CheckRow

            getObVariableGroupX("store.ST1bF_ObIn").getVariable(m_strVarST1bF_CheckKey).getAsObCharFldField(m_strVarS5tri34).assign(in.getVariable(m_strVarST1fF_InsertData).getAsObCharFldField(m_strVarS5tri34));

            {
                ObRunnable obrun = getCallMgr().getObRunnable(fnc, getObVariableGroupX("store.ST1bF_ObIn"), getObVariableGroupX("store.ST1bF_ObOut"), "store.ST1bF_ObFnc","External", "Java", "DefaultServer" );
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
                if( ((v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0rg).isNotEqual(m_obvalfld_0))) )
                {
// Set  Environment<*Returning status> = <*Returning status.*Error>
                    v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

// Name  Function: StoreSurrogates.Fetch.CheckRow, Environment<*Object>
                    v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx1eu).fromString("StoreSurrogates.Fetch.CheckRow");

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
                    ObSbr_ST1fF3();
                    if(hasReturned())
                        return;

                }
// When  Environment<*Returned status> == <*Returned status.*Instance not found>
                else
                {
                    if( v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r6).isEqual(m_obvalfld_2) )
                    {
// Set  View = InsertData
                        v.getVariable(m_strVarST1fF_View).getAsObCharFldField(m_strVarS5tri34).assign(in.getVariable(m_strVarST1fF_InsertData).getAsObCharFldField(m_strVarS5tri34));
                        v.getVariable(m_strVarST1fF_View).getAsObLongFldField(m_strVarS5trhe3).assign(in.getVariable(m_strVarST1fF_InsertData).getAsObLongFldField(m_strVarS5trhe3));

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
                        keyFields.addElement(v.getVariable(m_strVarST1fF_View).getAsObCharFldField(m_strVarS5tri34));
                        keyFields.addElement(v.getVariable(m_strVarST1fF_View).getAsObLongFldField(m_strVarS5trhe3));
                        sqlString = "INSERT INTO ST1dV ( TABLENAME, SURROGATE ) " + 
									"VALUES ( ?, ? ) "		;
                        getDBMgr().insertx( sqlString, keyFields, this) ;
                        getDBMgr().setViewIOStatusx((ObCharFld)v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r4), this);

// Set  Environment<*Returning status> = Environment<*View status>
                        v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r4));

                    }
// When  Environment<*Returned status> == <*Returned status.*Successful>
                    else
                    {
                        if( v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r6).isEqual(m_obvalfld_0) )
                        {
// Set  Environment<*Returning status> = <*Returning status.*Instance exists>
                            v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_3);

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
                            v.getVariable(m_strVarST1fF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

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
        }
    }

// ***************************************************************************
// The variables used by: StoreSurrogates.Update.InsertRow
// ***************************************************************************

    ////////////////////////////////////////////////////////////////
    // ObDat Variable Group
    final class ST1fF_ObDat extends ObVariableGroupX
    {
        ////////////////////////////////////////////////////////////////
        // Members

        ////////////////////////////////////////////////////////////////
        // Constructors
        public ST1fF_ObDat(ObFunction fnc)
        {
            super(ObVariableGroup.VT_LOCAL, fnc);
            addVariable("ST1fF_Environment", initvarST1fF_ST1fF_Environment());
            addVariable("ST1fF_View", initvarST1fF_ST1fF_View());
        }

        public ST1fF_ObDat(ObApplication obapp)
        {
            super(obapp, ObVariableGroup.VT_LOCAL);
            addVariable("ST1fF_Environment", initvarST1fF_ST1fF_Environment());
            addVariable("ST1fF_View", initvarST1fF_ST1fF_View());
        }

        public ST1fF_ObDat()
        {
            super(ObVariableGroup.VT_LOCAL, null);
            addVariable("ST1fF_Environment", initvarST1fF_ST1fF_Environment());
            addVariable("ST1fF_View", initvarST1fF_ST1fF_View());
        }






        ////////////////////////////////////////////////////////////////
        // Environment Variable
        public ObVariableX initvarST1fF_ST1fF_Environment()
        {
            ObVariableX var = new ObVariableX(this, "varST1fF_ST1fF_Environment");

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
        public ObVariableX initvarST1fF_ST1fF_View()
        {
            ObVariableX var = new ObVariableX(this, "varST1fF_ST1fF_View");

            var.addField("S5tri34", new ObCharFld(ObField.VIEW_KEY, 32, 'c', "TABLENAME", false, false, false, "", m_obapp, false)); /* TableName */
            var.addField("S5trhe3", new ObLongFld(ObField.VIEW_COL, 9, 0, 'p', "SURROGATE", "", m_obapp)); /* Surrogate */

            return var;
        } 

        // End of View Variable
        ////////////////////////////////////////////////////////////////
    }
    // End Of StoreSurrogates.Update.InsertRow Variable Group
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

        public final String m_strFldSqmx0rg = "Sqmx0rg";
        public final String m_strVarSqmx1eu = "Sqmx1eu";
        public final String m_strVarSqmx0r8 = "Sqmx0r8";
        public final String m_strFldSqmx0r8 = "Sqmx0r8";
        public final String m_strVarSqmx0r6 = "Sqmx0r6";
        public final String m_strVarST1fF_View = "ST1fF_View";
        public final String m_strVarST1fF_InsertData = "ST1fF_InsertData";
        public final String m_strVarSqmx0r4 = "Sqmx0r4";
        public final String m_strVarS5trhe3 = "S5trhe3";
        public final String m_strVarST1fF_Environment = "ST1fF_Environment";
        public final String m_strVarSqmx0rg = "Sqmx0rg";
        public final String m_strVarST1bF_CheckKey = "ST1bF_CheckKey";
        public final String m_strFldSqmx0r6 = "Sqmx0r6";
        public final String m_strVarS5tri34 = "S5tri34";
    // End Of Variable and Field Names
    ////////////////////////////////////////////////////////////////////////////////
}
// ***************************************************************************
