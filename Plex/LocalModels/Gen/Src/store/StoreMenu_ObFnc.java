// ***************************************************************************
// 
// StoreMenu : StoreMenu
// 
// ***************************************************************************
// 
// Generated by : CA Plex r7.2.1   (Build 24.004)
// Date - Time  : Saturday, April 22, 2023 - 5:09 PM
// Group Model  : 
// Local Model  : C:\Conference 2023\Web Technology Workshop\webTechConf2023\Plex\LocalModels\store.mdl
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
@OBJ_SURROGATE=0x1C0000D9
@FUNCTION=StoreMenu
@FNCLNGSYS=Java
@IMPLEMENTATION_NAME=StoreMenu
@TYPE=EXTERNAL
@GENVRL=721
*/

package store;

import ObRun.ObRTTypes.*;
import ObRun.ObComms.*;
import ObRun.ObFunction.*;
import ObRun.ObPanel.ObCtrlData.*;
import java.lang.reflect.*;
import java.util.*;
import java.awt.event.*;

// ***************************************************************************
// StoreMenu Function Class
// ***************************************************************************

public final class StoreMenu_ObFnc extends ObFunction
{
    ////////////////////////////////////////////////////////////////////////////////
    // Construction Methods:

    //Default constructor - called by class loader
    //when class gets loaded and 'newInstance()' gets called
    public StoreMenu_ObFnc(ObCallMgr obcallmgr)
    {
        super(obcallmgr);
        StoreMenu_ObDat varObDat = new StoreMenu_ObDat( this);
        super.setLocalVariable( varObDat);
        setFunctionName("StoreMenu");
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Variable Access Methods:

    public ObVariableGroup getInVariable()
    {
        if( m_in == null)
            m_in  = new StoreMenu_ObIn( this);
          return m_in;
    }
    public ObVariableGroup getOutVariable()
    {
        if( m_out == null)
            m_out  = new StoreMenu_ObOut( this);
          return m_out;
    }
    public ObVariableGroup getDatVariable()
    {
        if( m_locVariable == null)
            m_locVariable  = new StoreMenu_ObDat( this);
          return m_locVariable;
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Environment variable access methods:

    public void setReturnedStatus(ObCharFld returned)
    {
        ((StoreMenu_ObDat)getDatVariable()).getVariable(m_strVarStoreMenu_Environment).getField(m_strFldSqmx0r6).assign(returned);
    }

    public void setReturningStatus(ObCharFld returning)
    {
        ((StoreMenu_ObDat)getDatVariable()).getVariable(m_strVarStoreMenu_Environment).getField(m_strFldSqmx0r8).assign(returning);
    }

    public ObCharFld getReturningStatus()
    {
        return (ObCharFld)(((StoreMenu_ObDat)getDatVariable()).getVariable(m_strVarStoreMenu_Environment).getField(m_strFldSqmx0r8));
    }

    public void setCallStatus(ObCharFld status)
    {
        ((StoreMenu_ObDat)getDatVariable()).getVariable(m_strVarStoreMenu_Environment).getField(m_strFldSqmx0rg).assign(status);
    }


// ***************************************************************************
// Function:	StoreMenu
// ***************************************************************************

    public void ObRun()
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (StoreMenu_ObDat)fnc.getDatVariable();
        in	= (StoreMenu_ObIn)fnc.getInVariable();
        out	= (StoreMenu_ObOut)fnc.getOutVariable();

        StoreMenu_ObPnl panel = new StoreMenu_ObPnl(this);
        ObCtrlData.setMenuitem_response(false);
        panel.getPanelData().getGuiCtrl().getPanel().setBusyCursor();
        setPanel(panel);
        panel.setUniqueName("store.StoreMenu");
        panel.start();
        panel.init();

        ObCtrlData.setMenuitem_response(true);
        panel.getPanelData().getGuiCtrl().getPanel().setNotBusyCursor();

// Comment  Copyright 2004 Computer Associates International, Inc. All Rights Reserved.

// ***************************************************************************
// Description
// ***************************************************************************

// Seq 
        {
// Pre Point Description
            {
// Call  UIBASIC/Meta.Options
// Comment  Copyright � 1994-1998 by Sterling Software, Inc. All Rights Reserved.
// Comment  Define meta variables for possible function options
// Comment  Not all of these options are used by the pattern library functions
            }
// Edit Point  Description
            {
            }
// Post Point Description
            {
// Comment  WebPlex Initialization
// Comment  Inform the runtime of our inheritance path
// API Call  Source code: WEBCLI60/JAVAStartMeta
                try {
                	panel.getClass().getMethod("getInhPath", new Class[] { })
                		.invoke(panel, new Object[] { });
                try {
                	panel.getClass().getMethod("startMeta", new Class[] { })
                		.invoke(panel, new Object[] { });
                } catch (Exception ex) {
                	throw new RuntimeException("WebClient version error.");
                }
                 
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception ex) {
                }

// Comment  try {
// 	panel.getClass().getMethod("getInhPath", new Class[] { })
// 		.invoke(panel, new Object[] { });
// try {
// 	panel.getClass().getMethod("startMeta", new Class[] { })
// 		.invoke(panel, new Object[] { });
// } catch (Exception ex) {
// 	throw new RuntimeException("WebClient version error.");
// }
//  
// } catch (RuntimeException e) {
//     throw e;
// } catch (Exception ex) {
// }

// ***************************************************************************
// 			// <*Object>	Environment<*Object>
// ***************************************************************************

// Set  Environment<*Object> = Name of WebLogMessages
                v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eu).fromString("WebLogMessages");
// API Call  Source code: WEBCLI60/JAVASetInhPath
                try {
                	panel.getClass().getMethod("addToInhPath", new Class[] { String.class })
                		.invoke(panel, new Object[] { v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eu).toString() });
                } catch (Exception ex) {
                }

// Comment  try {
// 	panel.getClass().getMethod("addToInhPath", new Class[] { String.class })
// 		.invoke(panel, new Object[] { &(1:).toString() });
// } catch (Exception ex) {
// }

// ***************************************************************************
// 			// <*Object>	Environment<*Object>
// ***************************************************************************

// Set  Environment<*Object> = Name of WebShell
                v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eu).fromString("WebShell");
// API Call  Source code: WEBCLI60/JAVASetInhPath
                try {
                	panel.getClass().getMethod("addToInhPath", new Class[] { String.class })
                		.invoke(panel, new Object[] { v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eu).toString() });
                } catch (Exception ex) {
                }

// Comment  try {
// 	panel.getClass().getMethod("addToInhPath", new Class[] { String.class })
// 		.invoke(panel, new Object[] { &(1:).toString() });
// } catch (Exception ex) {
// }
// API Call  Source code: WEBCLI60/JAVAEndMeta
                try {
                	panel.getClass().getMethod("endMeta", new Class[] { })
                		.invoke(panel, new Object[] { });
                } catch (InvocationTargetException ex) {
                	throw new RuntimeException(ex.getTargetException());
                } catch (Exception ex) {
                }

// Comment  try {
// 	panel.getClass().getMethod("endMeta", new Class[] { })
// 		.invoke(panel, new Object[] { });
// } catch (InvocationTargetException ex) {
// 	throw new RuntimeException(ex.getTargetException());
// } catch (Exception ex) {
// }
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
                }
// Edit Point  Modification history
                {
// Comment  31-Oct-2003 PauloCD issue star 12832186 - For Java, panel caption is now set through Java runtime
// Comment  09-Mar-2004 PauloCD issue star 12832186 - Undo previous check in to bring the old behaviour back.
// Comment  16-Jly-2010 TERKI02 Implemented support for C# Generator
                }
// Post Point Modification history
                {
                }
            }
        }
// Go Sub  Initialize
        ObSbr_StoreMenu1();
        if(hasReturned())
            return;

// Pre Point Execute
        {
        }
// Edit Point  Execute
        {
// Events Handler
        panel.startPanel();
        if(hasReturned())
            return;
        }
// Post Point Execute
        {
        }
// Sub  Initialize
// Sub  Terminate
// Sub  Send message
// Pre Point Subroutines
        {
// Sub  Close
// Sub  Set panel caption
// Sub  Prompt request
        }
// Edit Point  Subroutines
        {
        }
// Post Point Subroutines
        {
        }


        panel.postProcess();
        if(true)
            return;
    }

    ////////////////////////////////////////////////////////////////////////////////
    // ObPnl class

    final class StoreMenu_ObPnl extends ObPanel
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        // Control Declarations
        ObPushbuttonData m_ObPushbuttonData3151 = null; /* Products */
        ObPushbuttonData m_ObPushbuttonData3152 = null; /* X */
        ObPushbuttonData m_ObPushbuttonData3153 = null; /* Customers */
        ObPushbuttonData m_ObPushbuttonData3154 = null; /* Orders */
        ObPushbuttonData m_ObPushbuttonData3155 = null; /* Create Orders */


        public StoreMenu_ObPnl(ObFunction fnc)
        {
            super(fnc, "StoreMenu", 150, "Panel");

//  Initialise the standard set of context variables
            v	= (StoreMenu_ObDat)fnc.getDatVariable();
            in	= (StoreMenu_ObIn)fnc.getInVariable();
            out	= (StoreMenu_ObOut)fnc.getOutVariable();

        }

        public void clearReferences()
        {
            if(m_ObPushbuttonData3151 != null) m_ObPushbuttonData3151.clearReferences();
            m_ObPushbuttonData3151 = null; /* Products */
            if(m_ObPushbuttonData3152 != null) m_ObPushbuttonData3152.clearReferences();
            m_ObPushbuttonData3152 = null; /* X */
            if(m_ObPushbuttonData3153 != null) m_ObPushbuttonData3153.clearReferences();
            m_ObPushbuttonData3153 = null; /* Customers */
            if(m_ObPushbuttonData3154 != null) m_ObPushbuttonData3154.clearReferences();
            m_ObPushbuttonData3154 = null; /* Orders */
            if(m_ObPushbuttonData3155 != null) m_ObPushbuttonData3155.clearReferences();
            m_ObPushbuttonData3155 = null; /* Create Orders */

            v = null;
            in = null;
            out = null;
            super.clearReferences();
        }

        public void init()
        {
            setState(12288); /* Panel */
            load();

            m_ObPushbuttonData3151 = (ObPushbuttonData)bindControl(3151,12289); /* Products */
            m_ObPushbuttonData3151.setUniqueName("m_ObPushbuttonData3151");
// Event: Products -> Products 
            m_ObPushbuttonData3151.registerEvent(ObCtrlData.PRESSED, 3157, "Products");

            m_ObPushbuttonData3152 = (ObPushbuttonData)bindControl(3152,12290); /* X */
            m_ObPushbuttonData3152.setUniqueName("m_ObPushbuttonData3152");
// Event: X -> Close 
            m_ObPushbuttonData3152.registerEvent(ObCtrlData.PRESSED, 3159, "Close");

            m_ObPushbuttonData3153 = (ObPushbuttonData)bindControl(3153,12291); /* Customers */
            m_ObPushbuttonData3153.setUniqueName("m_ObPushbuttonData3153");
// Event: Customers -> Customers 
            m_ObPushbuttonData3153.registerEvent(ObCtrlData.PRESSED, 3161, "Customers");

            m_ObPushbuttonData3154 = (ObPushbuttonData)bindControl(3154,12292); /* Orders */
            m_ObPushbuttonData3154.setUniqueName("m_ObPushbuttonData3154");
// Event: Orders -> Orders 
            m_ObPushbuttonData3154.registerEvent(ObCtrlData.PRESSED, 3163, "Orders");

            m_ObPushbuttonData3155 = (ObPushbuttonData)bindControl(3155,12293); /* Create Orders */
            m_ObPushbuttonData3155.setUniqueName("m_ObPushbuttonData3155");
// Event: Create Orders -> Create Orders 
            m_ObPushbuttonData3155.registerEvent(ObCtrlData.PRESSED, 3165, "Create Orders");


            accessPanel(ObCtrlData.WRITE);
            layoutWindow();

            getPanelData().registerLogicalEvent(3165, "Create Orders");
            getPanelData().registerLogicalEvent(3161, "Customers");
            getPanelData().registerLogicalEvent(3163, "Orders");
            getPanelData().registerLogicalEvent(3157, "Products");
            getPanelData().registerLogicalEvent(3166, "Prompt");
            getPanelData().registerLogicalEvent(3159, "Close");
// KeyBoard Event: Prompt 
            getPanelData().registerKeyboardEvent("F4", 3166);
// Event:  -> Close 
            getPanelData().registerEvent(ObCtrlData.QUERYCLOSE, 3159, "Close");

        }

        public void startPanel()
        {
            show();
        }

// ***************************************************************************
// The panel action handler
// ***************************************************************************


        public void eventsHandler()
        {
            ObFunction fnc = getFunction();

// Events Handler
// Event 
            if( true /*In any event*/ )
            {
// Comment  Processing when any event is triggered
// Pre Point Any event
                {
                }
// Edit Point  Any event
                {
                }
// Post Point Any event
                {
                }
            }
// Event  Event: Close
            if( getCurrentAction() == 3159 /* Close */ )
            {
// Go Sub  Close
                ObSbr_StoreMenu4();
                if(hasReturned())
                    return;

            }
// Pre Point Events
            {
// Event  Event: Prompt
                if( getCurrentAction() == 3166 /* Prompt */ )
                {
// Go Sub  Prompt request
                    ObSbr_StoreMenu6();
                    if(hasReturned())
                        return;

                }
// Event  Event: Products
                if( getCurrentAction() == 3157 /* Products */ )
                {
// Call  Product.Edit


                    {
                        ObRunnable obrun = getCallMgr().getObRunnable(fnc, getObVariableGroupX("store.ST8F_ObIn"), getObVariableGroupX("store.ST8F_ObOut"), "store.ST8F_ObFnc","External", "Java", "" );
                        if(obrun != null)
                        {
                            obrun.ObRun();
                            obrun.ObPostRun();
                        }
                    }

                }
// Event  Event: Customers
                if( getCurrentAction() == 3161 /* Customers */ )
                {
// Call  Customer.Edit


                    {
                        ObRunnable obrun = getCallMgr().getObRunnable(fnc, getObVariableGroupX("store.ST7F_ObIn"), getObVariableGroupX("store.ST7F_ObOut"), "store.ST7F_ObFnc","External", "Java", "" );
                        if(obrun != null)
                        {
                            obrun.ObRun();
                            obrun.ObPostRun();
                        }
                    }

                }
// Event  Event: Orders
                if( getCurrentAction() == 3163 /* Orders */ )
                {
// Call  Order.Edit


                    {
                        ObRunnable obrun = getCallMgr().getObRunnable(fnc, getObVariableGroupX("store.STyF_ObIn"), getObVariableGroupX("store.STyF_ObOut"), "store.STyF_ObFnc","External", "Java", "" );
                        if(obrun != null)
                        {
                            obrun.ObRun();
                            obrun.ObPostRun();
                        }
                    }

                }
// Event  Event: Create Orders
                if( getCurrentAction() == 3165 /* Create Orders */ )
                {
// Call  Order.CreateOrderUI


                    {
                        ObRunnable obrun = getCallMgr().getObRunnable(fnc, getObVariableGroupX("store.STxF_ObIn"), getObVariableGroupX("store.STxF_ObOut"), "store.STxF_ObFnc","External", "Java", "" );
                        if(obrun != null)
                        {
                            obrun.ObRun();
                            obrun.ObPostRun();
                        }
                    }

                }
            }
// Edit Point  Events
            {
            }
// Post Point Events
            {
            }
        }

        ////////////////////////////////////////////////////////////////////////////////
        // Access Methods

        protected boolean accessPanel(byte accessMode)
        {
            boolean result = false;

            return result;
        }

    }


// ***************************************************************************
// Subroutine:	Initialize
// ***************************************************************************

    void ObSbr_StoreMenu1()
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (StoreMenu_ObDat)fnc.getDatVariable();
        in	= (StoreMenu_ObIn)fnc.getInVariable();
        out	= (StoreMenu_ObOut)fnc.getOutVariable();

        StoreMenu_ObPnl panel = (StoreMenu_ObPnl)getPanel();

// Sub  Initialize
// Pre Point Start initialize
        {
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
// Set  Environment<*Message delivery> = <*Message delivery.*Dialog>
            v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eq).assign(m_obvalfld_0);

        }
// Pre Point End initialize
        {
// Go Sub  Set panel caption
            ObSbr_StoreMenu5();
            if(hasReturned())
                return;

// Call  UIBASIC/Meta.Options
// Comment  Copyright � 1994-1998 by Sterling Software, Inc. All Rights Reserved.
// Comment  Define meta variables for possible function options
// Comment  Not all of these options are used by the pattern library functions
// Pre Point Process options
            {
            }
// Edit Point  Process options
            {
            }
// Post Point Process options
            {
            }
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

    void ObSbr_StoreMenu2()
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (StoreMenu_ObDat)fnc.getDatVariable();
        in	= (StoreMenu_ObIn)fnc.getInVariable();
        out	= (StoreMenu_ObOut)fnc.getOutVariable();

        StoreMenu_ObPnl panel = (StoreMenu_ObPnl)getPanel();

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

    void ObSbr_StoreMenu3()
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (StoreMenu_ObDat)fnc.getDatVariable();
        in	= (StoreMenu_ObIn)fnc.getInVariable();
        out	= (StoreMenu_ObOut)fnc.getOutVariable();

        StoreMenu_ObPnl panel = (StoreMenu_ObPnl)getPanel();

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
// Comment  No message handling if *Message delivery undefined
// Case
        // Start of CASE block
        {
// When  Environment<*Message delivery> == <*Message delivery.*Dialog>
            if( v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eq).isEqual(m_obvalfld_0) )
            {
// Dialog Message  Message: OBJECTS/Message
                {
                    Object[] msgParms = new Object[1];
                    msgParms[0] = new String(v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1ed).toString()) ;
                    getApp().logx(getLocalisationProperty("String.100"), msgParms, ObApplication.DIALOG);
                }

// Comment  &(1:)
            }
// When  Environment<*Message delivery> == <*Message delivery.*Status>
            else
            {
                if( v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eq).isEqual(m_obvalfld_1) )
                {
// Status Message  Message: OBJECTS/Message
                    {
                        Object[] msgParms = new Object[1];
                        msgParms[0] = new String(v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1ed).toString()) ;
                        getApp().logx(getLocalisationProperty("String.101"), msgParms, ObApplication.STATUS);
                    }

// Comment  &(1:)
                }
// When  Environment<*Message delivery> == <*Message delivery.*Log>
                else
                {
                    if( v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eq).isEqual(m_obvalfld_2) )
                    {
// Log Message  Message: OBJECTS/Message
                        {
                            Object[] msgParms = new Object[1];
                            msgParms[0] = new String(v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1ed).toString()) ;
                            getApp().logx(getLocalisationProperty("String.102"), msgParms, ObApplication.LOG);
                        }

// Comment  &(1:)
                    }
// When  Environment<*Message delivery> == <*Message delivery.*None>
                    else
                    {
                        if( v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eq).isEqual(m_obvalfld_3) )
                        {
                        }
// Otherwise
                        else
                        {
// Pre Point Handle message
                            {
                            }
// Edit Point  Handle message
                            {
                            }
// Post Point Handle message
                            {
                            }
                        }
                    }
                }
            }
        }
        // End of CASE block
// Set  Environment<*Message ID> = <*Message ID.Null>
        v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1g5).assign(m_obvalfld_4);

// Set  Environment<*Message text> = <*Message text.*Blank>
        v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1ed).assign(m_obvalfld_5);

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
// Subroutine:	Close
// ***************************************************************************

    void ObSbr_StoreMenu4()
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (StoreMenu_ObDat)fnc.getDatVariable();
        in	= (StoreMenu_ObIn)fnc.getInVariable();
        out	= (StoreMenu_ObOut)fnc.getOutVariable();

        StoreMenu_ObPnl panel = (StoreMenu_ObPnl)getPanel();

// Sub  Close
// Comment  Process the Close event
// Pre Point Start Close
        {
        }
// Edit Point  Start Close
        {
        }
// Post Point Start Close
        {
        }
// Go Sub  Terminate
        ObSbr_StoreMenu2();
        if(hasReturned())
            return;

// Pre Point End Close
        {
        }
// Edit Point  End Close
        {
        }
// Post Point End Close
        {
        }
    }

// ***************************************************************************
// Subroutine:	Set panel caption
// ***************************************************************************

    void ObSbr_StoreMenu5()
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (StoreMenu_ObDat)fnc.getDatVariable();
        in	= (StoreMenu_ObIn)fnc.getInVariable();
        out	= (StoreMenu_ObOut)fnc.getOutVariable();

        StoreMenu_ObPnl panel = (StoreMenu_ObPnl)getPanel();

// Sub  Set panel caption
// Pre Point Start set panel caption
        {
        }
// Edit Point  Start set panel caption
        {
        }
// Post Point Start set panel caption
        {
        }
// Comment  Set the panel caption from the scoped message text
// Name  Function: StoreMenu, Environment<*Object>, .Language
        v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eu).fromString("StoreMenu");

// Format Message  Message: StoreMenu.Caption, Environment<*Message text>
        {
            Object[] msgParms = new Object[1];
            msgParms[0] = new String(v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1eu).toString()) ; 
                                  
            v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1ed).formatMessage(getLocalisationProperty("String.103"), msgParms);
        }

// Comment  &(1:)
// Pre Point Set panel caption text
        {
        }
// Edit Point  Set panel caption text
        {
        }
// Post Point Set panel caption text
        {
        }
// API Call  Source code: JAVAAPI/SetCaption
        ObUserAPI.setWindowTitle(getFunction(), v.getVariable(m_strVarStoreMenu_Environment).getAsObCharFldField(m_strVarSqmx1ed).toString());

// Comment  ObUserAPI.setWindowTitle(getFunction(), &(1:).toString());
// Comment  16-Jly-2010 TERKI02 Implemented support for C# Generator
// Pre Point End set panel caption
        {
        }
// Edit Point  End set panel caption
        {
        }
// Post Point End set panel caption
        {
        }
    }

// ***************************************************************************
// Subroutine:	Prompt request
// ***************************************************************************

    void ObSbr_StoreMenu6()
    {
//  The standard set of context variables
        StoreMenu_ObDat	v;
        StoreMenu_ObIn	in;
        StoreMenu_ObOut	out;

        ObFunction fnc = this;

//  Initialise the standard set of context variables
        v	= (StoreMenu_ObDat)fnc.getDatVariable();
        in	= (StoreMenu_ObIn)fnc.getInVariable();
        out	= (StoreMenu_ObOut)fnc.getOutVariable();

        StoreMenu_ObPnl panel = (StoreMenu_ObPnl)getPanel();

// Sub  Prompt request
// Pre Point Start prompt processing
        {
        }
// Edit Point  Start prompt processing
        {
        }
// Post Point Start prompt processing
        {
        }
// Pre Point End prompt processing
        {
        }
// Edit Point  End prompt processing
        {
        }
// Post Point End prompt processing
        {
        }
    }

// ***************************************************************************
// The variables used by: StoreMenu
// ***************************************************************************

    ////////////////////////////////////////////////////////////////
    // ObDat Variable Group
    final class StoreMenu_ObDat extends ObVariableGroupX
    {
        ////////////////////////////////////////////////////////////////
        // Members

        ////////////////////////////////////////////////////////////////
        // Constructors
        public StoreMenu_ObDat(ObFunction fnc)
        {
            super(ObVariableGroup.VT_LOCAL, fnc);
            addVariable("StoreMenu_Environment", initvarStoreMenu_StoreMenu_Environment());
        }

        public StoreMenu_ObDat(ObApplication obapp)
        {
            super(obapp, ObVariableGroup.VT_LOCAL);
            addVariable("StoreMenu_Environment", initvarStoreMenu_StoreMenu_Environment());
        }

        public StoreMenu_ObDat()
        {
            super(ObVariableGroup.VT_LOCAL, null);
            addVariable("StoreMenu_Environment", initvarStoreMenu_StoreMenu_Environment());
        }






        ////////////////////////////////////////////////////////////////
        // Environment Variable
        public ObVariableX initvarStoreMenu_StoreMenu_Environment()
        {
            ObVariableX var = new ObVariableX(this, "varStoreMenu_StoreMenu_Environment");

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
    }
    // End Of StoreMenu Variable Group
    ////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Field Values:

        ObCharFld m_obvalfld_3 = new ObCharFld("N", 1);
        ObCharFld m_obvalfld_5 = new ObCharFld("", 256);
        ObCharFld m_obvalfld_1 = new ObCharFld("S", 1);
        ObCharFld m_obvalfld_0 = new ObCharFld("D", 1);
        ObCharFld m_obvalfld_4 = new ObCharFld(" ", 32);
        ObCharFld m_obvalfld_2 = new ObCharFld("L", 1);
    // End Of Field Values
    ////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////
    // Variable and Field Names:

        public final String m_strFldSqmx0rg = "Sqmx0rg";
        public final String m_strVarSqmx1eu = "Sqmx1eu";
        public final String m_strFldSqmx0r8 = "Sqmx0r8";
        public final String m_strVarSqmx1ed = "Sqmx1ed";
        public final String m_strVarSqmx1g5 = "Sqmx1g5";
        public final String m_strVarStoreMenu_Environment = "StoreMenu_Environment";
        public final String m_strFldSqmx0r6 = "Sqmx0r6";
        public final String m_strVarSqmx1eq = "Sqmx1eq";
    // End Of Variable and Field Names
    ////////////////////////////////////////////////////////////////////////////////
}
// ***************************************************************************
