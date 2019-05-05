package md50797ce461b1261b1951974e7b7c0299b;


public class SimsimiAPI
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"n_onPostExecute:(Ljava/lang/Object;)V:GetOnPostExecute_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("Chatbot.SimsimiAPI, Chatbot", SimsimiAPI.class, __md_methods);
	}


	public SimsimiAPI ()
	{
		super ();
		if (getClass () == SimsimiAPI.class)
			mono.android.TypeManager.Activate ("Chatbot.SimsimiAPI, Chatbot", "", this, new java.lang.Object[] {  });
	}

	public SimsimiAPI (md50797ce461b1261b1951974e7b7c0299b.MainActivity p0)
	{
		super ();
		if (getClass () == SimsimiAPI.class)
			mono.android.TypeManager.Activate ("Chatbot.SimsimiAPI, Chatbot", "Chatbot.MainActivity, Chatbot", this, new java.lang.Object[] { p0 });
	}


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);


	public void onPostExecute (java.lang.Object p0)
	{
		n_onPostExecute (p0);
	}

	private native void n_onPostExecute (java.lang.Object p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
