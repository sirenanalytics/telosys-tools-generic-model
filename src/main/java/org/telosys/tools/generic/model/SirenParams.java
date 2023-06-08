package org.telosys.tools.generic.model;

import java.util.HashMap;

public class SirenParams {
	
	public static final String NoBlanks = "NoBlanks";
	public static final String ArabicOrEnglishOnlyConstraint = "ArabicOrEnglishOnlyConstraint";
	
	public static final String Exists = "Exists";
	public static final String Message = "Message";
	
	private HashMap<String, Object> sirenParams;
	
	public Object getSirenParam(String annotation, String key) {
		Object value = null;
		if (sirenParams != null) {
			value = sirenParams.get(annotation+"."+key);
		}
		return value;
	}

	public void setSirenParam(String annotation, String key, Object object) {
		if (sirenParams == null) {
			sirenParams = new HashMap<String, Object>();
		}
		sirenParams.put(annotation+"."+key, object);
	}

}
