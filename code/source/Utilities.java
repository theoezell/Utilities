

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class Utilities

{
	// ---( internal utility methods )---

	final static Utilities _instance = new Utilities();

	static Utilities _newInstance() { return new Utilities(); }

	static Utilities _cast(Object o) { return (Utilities)o; }

	// ---( server methods )---




	public static final void waitForGodot (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(waitForGodot)>> ---
		// @sigtype java 3.5
		// [i] field:0:required key
		// [o] field:0:required value
		IDataCursor pipeCursor = pipeline.getCursor();
		// input
		IData input = IDataFactory.create();
		IDataCursor inputCursor = input.getCursor();
		IDataUtil.put( inputCursor, "key", IDataUtil.getString(pipeCursor, "key") );
		inputCursor.destroy();
		
		// output
		IData 	output = IDataFactory.create();
		try{
			Service.doThreadInvoke( "Utilities", "notifier", input );
		}catch( Exception e){}
		IDataCursor outputCursor = output.getCursor();
		
			// value
			IData	value = IDataUtil.getIData( outputCursor, "value" );
			if ( value != null)
			{
			}
		outputCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

