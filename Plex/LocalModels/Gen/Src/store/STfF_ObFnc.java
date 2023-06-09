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
// Product.Fetch.BlockFetch Function Class
// ***************************************************************************

public final class STfF_ObFnc extends ObFunction
{
    ////////////////////////////////////////////////////////////////////////////////
    // Construction Methods:

    //Default constructor - called by class loader
    //when class gets loaded and 'newInstance()' gets called
    public STfF_ObFnc(ObCallMgr obcallmgr)
    {
        super(obcallmgr);
        STfF_ObDat varObDat = new STfF_ObDat( this);
        super.setLocalVariable( varObDat);
        setFunctionName("Product.Fetch.BlockFetch");
        setDBConnectionName("", false);
        setVioKeys();
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Variable Access Methods:

    public ObVariableGroup getInVariable()
    {
        if( m_in == null)
            m_in  = new STfF_ObIn( this);
          return m_in;
    }
    public ObVariableGroup getOutVariable()
    {
        if( m_out == null)
            m_out  = new STfF_ObOut( this);
          return m_out;
    }
    public ObVariableGroup getDatVariable()
    {
        if( m_locVariable == null)
            m_locVariable  = new STfF_ObDat( this);
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
        ((STfF_ObDat)getDatVariable()).getVariable(m_strVarSTfF_Environment).getField(m_strFldSqmx0r6).assign(returned);
    }

    public void setReturningStatus(ObCharFld returning)
    {
        ((STfF_ObDat)getDatVariable()).getVariable(m_strVarSTfF_Environment).getField(m_strFldSqmx0r8).assign(returning);
    }

    public ObCharFld getReturningStatus()
    {
        return (ObCharFld)(((STfF_ObDat)getDatVariable()).getVariable(m_strVarSTfF_Environment).getField(m_strFldSqmx0r8));
    }

    public void setCallStatus(ObCharFld status)
    {
        ((STfF_ObDat)getDatVariable()).getVariable(m_strVarSTfF_Environment).getField(m_strFldSqmx0rg).assign(status);
    }


// ***************************************************************************
// Function:	Product.Fetch.BlockFetch
// ***************************************************************************

    public void ObRun()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

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
// Comment  23-Mar-1999	AGS	Move set of RowsFetched inside Case block.#10084029
// 			Use +DDS for Java views.#1083799
// Comment  17-May-2000	AGS	Fix Virtual Key detection code.#10147051
// Comment  12-Jun-2002	RAL	Added JDBCOracle Meta.#11989557
// Comment  02-Jul-2002	RAL	Modified JDBC and JDBCOracle Meta code to define new meta variables.#11701221
// Comment  13-Mar-2007	RAL	Added check for new UseRecordsetSize function option.#14944419
// Comment  23-Mar-1999	AGS	Set empty Position fields to High/Low values if no Restrict fields.#10087076
// Comment  13-Mar-2007	RAL	Modified Position GE/Position EQ statements to use FetchL<Maximum> if +UseRecordsetSize is defined.#14944419
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
        ObSbr_STfF1();
        if(hasReturned())
            return;

// Pre Point Execute
        {
// If  Control<Position> == <Position.Yes>
            if( in.getVariable(m_strVarSTfF_Control).getAsObCharFldField(m_strVarS5trh2n).isEqual(m_obvalfld_0) )
            {
// Go Sub  Set fetch position
                ObSbr_STfF4();
                if(hasReturned())
                    return;

            }
// Go Sub  Fetch next block
            ObSbr_STfF5();
            if(hasReturned())
                return;

        }
// Edit Point  Execute
        {
        }
// Post Point Execute
        {
// Go Sub  Terminate
            ObSbr_STfF2();
            if(hasReturned())
                return;

        }
// Sub  Initialize
// Sub  Terminate
// Sub  Send message
// Pre Point Subroutines
        {
// Sub  Set fetch position
// Sub  Fetch next block
// Sub  Fetch a row
// Sub  Set row usage
// Sub  Set positioner usage
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

    void ObSbr_STfF1()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Initialize
// Pre Point Start initialize
        {
// Set  Environment<*Returning status> = <*Returning status.*Successful>
            v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

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
// Set  FetchL<Current> = <Current.*Zero>
            v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh34).assign(m_obvalfld_2);

// Set  Control<RowsFetched> = <RowsFetched.*Zero>
            in.getVariable(m_strVarSTfF_Control).getAsObLongFldField(m_strVarS5trh30).assign(m_obvalfld_3);


// ***************************************************************************
// Set maximum to fetch
// ***************************************************************************

// Seq 
            {
// Set  Environment<*Object name> = Name of 64
                v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0xh).fromString("64");
// Cast  FetchL<Maximum>, Environment<*Object name>
                v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh32).castFrom(v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0xh));

            }

// ***************************************************************************
// Set view language
// ***************************************************************************

// Seq 
            {
// Comment  Use SQL SelectWhere for ODBC, Oracle, ODBCWinNT, OracleWinNT, JDBC and JDBCOracle language variants...
// Comment  Define additional meta fields based on non-ODBC language variants
            }

// ***************************************************************************
// Set maximum recordset size usage
// ***************************************************************************

// Seq 
            {
            }
// Set  FetchL<UsePosition> = <UsePosition.No>
            v.getVariable(m_strVarSTfF_FetchL).getAsObCharFldField(m_strVarS5trh9i).assign(m_obvalfld_4);

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

    void ObSbr_STfF2()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

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

    void ObSbr_STfF3()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

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
// Subroutine:	Set fetch position
// ***************************************************************************

    void ObSbr_STfF4()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Set fetch position
// Pre Point Start set fetch position
        {
        }
// Edit Point  Start set fetch position
        {
        }
// Post Point Start set fetch position
        {
// If  FetchL<UsePosition> == <UsePosition.Override>
            if( v.getVariable(m_strVarSTfF_FetchL).getAsObCharFldField(m_strVarS5trh9i).isEqual(m_obvalfld_5) )
            {
// Pre Point Override position
                {
                }
// Edit Point  Override position
                {
                }
// Post Point Override position
                {
                }
            }
// Else
            else
            {
// Go Sub  Set positioner usage
                ObSbr_STfF8();
                if(hasReturned())
                    return;

// If  FetchL<UsePosition> == <UsePosition.Yes>
                if( v.getVariable(m_strVarSTfF_FetchL).getAsObCharFldField(m_strVarS5trh9i).isEqual(m_obvalfld_0) )
                {
// Position GE  Position
                    keyFields = new Vector<ObField>();
                    keyFields.addElement(in.getVariable(m_strVarSTfF_Position).getAsObCharFldField(m_strVarProdID));
                    sqlString = "SELECT ProdID, ProdName, ProdDesc, ProdPrice, QtyInStock " + 
									"FROM ST5V " + 
									"WHERE " + 
									"( ( ProdID >= ? ) ) " + 
									"ORDER BY ProdID ";
                    getDBMgr().positionx(sqlString, keyFields, v.getVariable(m_strVarSTfF_View), 1, this);
                    getDBMgr().setViewIOStatusx((ObCharFld)v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4), this);

                }
            }
// Pre Point Process after position
            {
            }
// Edit Point  Process after position
            {
            }
// Post Point Process after position
            {
            }
// Set  Environment<*Returning status> = Environment<*View status>
            v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4));

// Case
            // Start of CASE block
            {
// When  Environment<*View status> == <*View status.*Error>
                if( v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4).isEqual(m_obvalfld_6) )
                {
// Pre Point Initial row position failed
                    {
                    }
// Edit Point  Initial row position failed
                    {
                    }
// Post Point Initial row position failed
                    {
                    }
// Go Sub  Terminate
                    ObSbr_STfF2();
                    if(hasReturned())
                        return;

                }
// When  Environment<*View status> == <*View status.*Instance locked>
                else
                {
                    if( v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4).isEqual(m_obvalfld_7) )
                    {
// Pre Point Initial row locked
                        {
                        }
// Edit Point  Initial row locked
                        {
                        }
// Post Point Initial row locked
                        {
                        }
                    }
// When  Environment<*View status> == <*View status.*Instance not found>
                    else
                    {
                        if( v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4).isEqual(m_obvalfld_8) )
                        {
// Set  Environment<*Returning status> = <*View status.*Successful>
                            v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(m_obvalfld_1);

// Comment  No row found - use next
                        }
                    }
                }
            }
            // End of CASE block
        }
// Pre Point End set fetch position
        {
        }
// Edit Point  End set fetch position
        {
        }
// Post Point End set fetch position
        {
        }
    }

// ***************************************************************************
// Subroutine:	Fetch next block
// ***************************************************************************

    void ObSbr_STfF5()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Fetch next block
// Pre Point Start fetch next block
        {
        }
// Edit Point  Start fetch next block
        {
        }
// Post Point Start fetch next block
        {
        }
// Set  Restrict = Position

// While  FetchL<Current> << FetchL<Maximum>
        while( v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh34).isLessThan(v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh32)) )
        {
// Go Sub  Fetch a row
            ObSbr_STfF6();
            if(hasReturned())
                return;

// Case
            // Start of CASE block
            {
// When  Environment<*View status> == <*View status.*Successful>
                if( v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4).isEqual(m_obvalfld_1) )
                {
// Go Sub  Set row usage
                    ObSbr_STfF7();
                    if(hasReturned())
                        return;

// If  FetchL<UseRow> == <UseRow.Yes>
                    if( v.getVariable(m_strVarSTfF_FetchL).getAsObCharFldField(m_strVarS5trh3x).isEqual(m_obvalfld_0) )
                    {
// Comment  Count the numer of rows fetched
// Set  FetchL<Current> = FetchL<Current> + <Current.*One>
                        v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh34).assign(v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh34).add(m_obvalfld_9));

// Set  Control<RowsFetched> = FetchL<Current>
                        in.getVariable(m_strVarSTfF_Control).getAsObLongFldField(m_strVarS5trh30).assign(v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh34));

// Use  FetchedData, FetchL<Current>
                        v.Output_STfF_FetchedData_STfF = (v.getVariable(m_strVarSTfF_FetchL).getAsObIntFldField(m_strVarS5trh34).toObIntFld().getValue() - 1);

// Set  FetchedData = View
                        out.getVariableArray(m_strVarSTfF_FetchedData)[v.Output_STfF_FetchedData_STfF].getAsObCharFldField(m_strVarProdID).assign(v.getVariable(m_strVarSTfF_View).getAsObCharFldField(m_strVarProdID));
                        out.getVariableArray(m_strVarSTfF_FetchedData)[v.Output_STfF_FetchedData_STfF].getAsObCharFldField(m_strVarProdName).assign(v.getVariable(m_strVarSTfF_View).getAsObCharFldField(m_strVarProdName));
                        out.getVariableArray(m_strVarSTfF_FetchedData)[v.Output_STfF_FetchedData_STfF].getAsObCharFldField(m_strVarProdDesc).assign(v.getVariable(m_strVarSTfF_View).getAsObCharFldField(m_strVarProdDesc));
                        out.getVariableArray(m_strVarSTfF_FetchedData)[v.Output_STfF_FetchedData_STfF].getAsObDblFldField(m_strVarProdPrice).assign(v.getVariable(m_strVarSTfF_View).getAsObDblFldField(m_strVarProdPrice));
                        out.getVariableArray(m_strVarSTfF_FetchedData)[v.Output_STfF_FetchedData_STfF].getAsObIntFldField(m_strVarQtyInStock).assign(v.getVariable(m_strVarSTfF_View).getAsObIntFldField(m_strVarQtyInStock));

// Call  STORAGE/Meta.SetDerivedData
// Comment  Copyright � 2000 Computer Associates International, Inc. All Rights Reserved.
// Comment  11-Oct-1997	AGS	Create.
// Comment  Calculate values for derived fields.
// Comment  Enclose this in a view defining meta loop.
// Pre Point Process fetched row
                        {
                        }
// Edit Point  Process fetched row
                        {
                        }
// Post Point Process fetched row
                        {
                        }
                    }
                }
// When  Environment<*View status> == <*View status.*Instance not found> OR Environment<*View status> == <*View status.*End of view>
                else
                {
                    if( (v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4).isEqual(m_obvalfld_8)) || (v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4).isEqual(m_obvalfld_10)) )
                    {
// Pre Point Last row processed
                        {
                        }
// Edit Point  Last row processed
                        {
                        }
// Post Point Last row processed
                        {
                        }
// Exit Sub
                        if(true)return;

                    }
// Otherwise
                    else
                    {
// Pre Point Fetch failed
                        {
                        }
// Edit Point  Fetch failed
                        {
                        }
// Post Point Fetch failed
                        {
                        }
// Exit Sub
                        if(true)return;

                    }
                }
            }
            // End of CASE block
        }
// Pre Point End fetch next block
        {
        }
// Edit Point  End fetch next block
        {
        }
// Post Point End fetch next block
        {
        }
    }

// ***************************************************************************
// Subroutine:	Fetch a row
// ***************************************************************************

    void ObSbr_STfF6()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Fetch a row
// Pre Point Start fetch a row
        {
        }
// Edit Point  Start fetch a row
        {
        }
// Post Point Start fetch a row
        {
// FetchNext  Restrict
            keyFields = new Vector<ObField>();
            getDBMgr().fetchNextx(v.getVariable(m_strVarSTfF_View), this, keyFields);
            getDBMgr().setViewIOStatusx((ObCharFld)v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4), this);

// Set  Environment<*Returning status> = Environment<*View status>
            v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r8).assign(v.getVariable(m_strVarSTfF_Environment).getAsObCharFldField(m_strVarSqmx0r4));

// Pre Point Process after fetch
            {
            }
// Edit Point  Process after fetch
            {
            }
// Post Point Process after fetch
            {
            }
        }
// Pre Point End fetch a row
        {
        }
// Edit Point  End fetch a row
        {
        }
// Post Point End fetch a row
        {
        }
    }

// ***************************************************************************
// Subroutine:	Set row usage
// ***************************************************************************

    void ObSbr_STfF7()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Set row usage
// Pre Point Start set row usage
        {
        }
// Edit Point  Start set row usage
        {
        }
// Post Point Start set row usage
        {
        }
// Set  FetchL<UseRow> = <UseRow.Yes>
        v.getVariable(m_strVarSTfF_FetchL).getAsObCharFldField(m_strVarS5trh3x).assign(m_obvalfld_0);

// Pre Point End set row usage
        {
        }
// Edit Point  End set row usage
        {
        }
// Post Point End set row usage
        {
        }
    }

// ***************************************************************************
// Subroutine:	Set positioner usage
// ***************************************************************************

    void ObSbr_STfF8()
    {
//  The standard set of context variables
        STfF_ObDat	v;
        STfF_ObIn	in;
        STfF_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (STfF_ObDat)fnc.getDatVariable();
        in	= (STfF_ObIn)fnc.getInVariable();
        out	= (STfF_ObOut)fnc.getOutVariable();

        String sqlString;
        String whereString;
        Vector<ObField> keyFields;

// Sub  Set positioner usage
// Pre Point Start set positioner usage
        {
        }
// Edit Point  Start set positioner usage
        {
        }
// Post Point Start set positioner usage
        {
        }
// Comment  An ascending key so if null/empty, Position field will be set to Low Val if one exists

// If  Position<ProductID> is empty
        if( in.getVariable(m_strVarSTfF_Position).getAsObCharFldField(m_strVarProdID).isEmpty() )
        {
        }

// Set  FetchL<UsePosition> = <UsePosition.Yes>
        v.getVariable(m_strVarSTfF_FetchL).getAsObCharFldField(m_strVarS5trh9i).assign(m_obvalfld_0);

// Pre Point End set positioner usage
        {
        }
// Edit Point  End set positioner usage
        {
        }
// Post Point End set positioner usage
        {
        }
    }

// ***************************************************************************
// The variables used by: Product.Fetch.BlockFetch
// ***************************************************************************

    ////////////////////////////////////////////////////////////////
    // ObDat Variable Group
    final class STfF_ObDat extends ObVariableGroupX
    {
        ////////////////////////////////////////////////////////////////
        // Members

        ////////////////////////////////////////////////////////////////
        // Constructors
        public STfF_ObDat(ObFunction fnc)
        {
            super(ObVariableGroup.VT_LOCAL, fnc);
            addVariable("STfF_Restrict", initvarSTfF_STfF_Restrict());
            addVariable("STfF_FetchL", initvarSTfF_STfF_FetchL());
            addVariable("STfF_Environment", initvarSTfF_STfF_Environment());
            addVariable("STfF_View", initvarSTfF_STfF_View());
        }

        public STfF_ObDat(ObApplication obapp)
        {
            super(obapp, ObVariableGroup.VT_LOCAL);
            addVariable("STfF_Restrict", initvarSTfF_STfF_Restrict());
            addVariable("STfF_FetchL", initvarSTfF_STfF_FetchL());
            addVariable("STfF_Environment", initvarSTfF_STfF_Environment());
            addVariable("STfF_View", initvarSTfF_STfF_View());
        }

        public STfF_ObDat()
        {
            super(ObVariableGroup.VT_LOCAL, null);
            addVariable("STfF_Restrict", initvarSTfF_STfF_Restrict());
            addVariable("STfF_FetchL", initvarSTfF_STfF_FetchL());
            addVariable("STfF_Environment", initvarSTfF_STfF_Environment());
            addVariable("STfF_View", initvarSTfF_STfF_View());
        }





        public int Output_STfF_FetchedData_STfF = 0; /* FetchedData  Var^1 */
        public int Output_STfF_FetchedData_STfF_save = 0; /* Product.Fetch.BlockFetch/STORAGE/FetchedData_save */

        ////////////////////////////////////////////////////////////////
        // Restrict Variable
        public ObVariableX initvarSTfF_STfF_Restrict()
        {
            ObVariableX var = new ObVariableX(this, "varSTfF_STfF_Restrict");


            return var;
        } 

        // End of Restrict Variable
        ////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////
        // FetchL Variable
        public ObVariableX initvarSTfF_STfF_FetchL()
        {
            ObVariableX var = new ObVariableX(this, "varSTfF_STfF_FetchL");

            var.addField("S5trh9a", new ObCharFld(ObField.LOCAL, 1, 'c', "S5trh9a", false, false, false, "", m_obapp, false)); /* ViewOpen */
            var.addField("S5trh9i", new ObCharFld(ObField.LOCAL, 1, 'c', "S5trh9i", false, false, false, "", m_obapp, false)); /* UsePosition */
            var.addField("S5trh34", new ObIntFld(ObField.LOCAL, 4, 0, 'p', "S5trh34", "", m_obapp)); /* Current */
            var.addField("S5trh32", new ObIntFld(ObField.LOCAL, 4, 0, 'p', "S5trh32", "", m_obapp)); /* Maximum */
            var.addField("S5trh3x", new ObCharFld(ObField.LOCAL, 1, 'c', "S5trh3x", false, false, false, "", m_obapp, false)); /* UseRow */

            return var;
        } 

        // End of FetchL Variable
        ////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////
        // Environment Variable
        public ObVariableX initvarSTfF_STfF_Environment()
        {
            ObVariableX var = new ObVariableX(this, "varSTfF_STfF_Environment");

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
        public ObVariableX initvarSTfF_STfF_View()
        {
            ObVariableX var = new ObVariableX(this, "varSTfF_STfF_View");

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
    // End Of Product.Fetch.BlockFetch Variable Group
    ////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Field Values:

        ObCharFld m_obvalfld_8 = new ObCharFld("INF", 7);
        ObCharFld m_obvalfld_0 = new ObCharFld("Y", 1);
        ObIntFld m_obvalfld_9 = new ObIntFld(1);
        ObCharFld m_obvalfld_5 = new ObCharFld("O", 1);
        ObCharFld m_obvalfld_4 = new ObCharFld("N", 1);
        ObIntFld m_obvalfld_2 = new ObIntFld(0);
        ObCharFld m_obvalfld_7 = new ObCharFld("LCK", 7);
        ObCharFld m_obvalfld_1 = new ObCharFld(" ", 7);
        ObLongFld m_obvalfld_3 = new ObLongFld(0L);
        ObCharFld m_obvalfld_10 = new ObCharFld("EOV", 7);
        ObCharFld m_obvalfld_6 = new ObCharFld("ERR", 7);
    // End Of Field Values
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Variable and Field Names:

        public final String m_strFldSqmx0rg = "Sqmx0rg";
        public final String m_strVarSTfF_Environment = "STfF_Environment";
        public final String m_strVarQtyInStock = "QtyInStock";
        public final String m_strVarProdPrice = "ProdPrice";
        public final String m_strVarSqmx0r8 = "Sqmx0r8";
        public final String m_strFldSqmx0r8 = "Sqmx0r8";
        public final String m_strVarSTfF_View = "STfF_View";
        public final String m_strVarProdDesc = "ProdDesc";
        public final String m_strVarS5trh34 = "S5trh34";
        public final String m_strVarProdName = "ProdName";
        public final String m_strVarSqmx0r4 = "Sqmx0r4";
        public final String m_strVarSTfF_FetchL = "STfF_FetchL";
        public final String m_strVarProdID = "ProdID";
        public final String m_strVarS5trh32 = "S5trh32";
        public final String m_strVarSqmx0xh = "Sqmx0xh";
        public final String m_strVarS5trh2n = "S5trh2n";
        public final String m_strVarS5trh30 = "S5trh30";
        public final String m_strVarSTfF_Position = "STfF_Position";
        public final String m_strVarSTfF_Control = "STfF_Control";
        public final String m_strVarS5trh3x = "S5trh3x";
        public final String m_strVarS5trh9i = "S5trh9i";
        public final String m_strFldSqmx0r6 = "Sqmx0r6";
        public final String m_strVarSTfF_FetchedData = "STfF_FetchedData";
    // End Of Variable and Field Names
    ////////////////////////////////////////////////////////////////////////////////
}
// ***************************************************************************
