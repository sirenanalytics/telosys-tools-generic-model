package org.telosys.tools.generic.model;

import java.util.HashMap;

public class SirenParams {
	
	public static final String NoBlanks = "NoBlanks";
	public static final String NoNulls = "NoNulls";
	public static final String KeyNotNull = "KeyNotNull";
	public static final String ArabicOrEnglishOnlyConstraint = "ArabicOrEnglishOnlyConstraint";
	public static final String NumbersGreaterThanZeroOnlyConstraint = "NumbersGreaterThanZeroOnlyConstraint";
	public static final String LebaneseMobileConstraint = "LebaneseMobileConstraint";
	public static final String EmailConstraint = "EmailConstraint";
	public static final String MinMaxSize = "MinMaxSize";
	public static final String MinSize = "MinSize";
	public static final String MaxSize = "MaxSize";
	
	public static final String Exists = "Exists";
	public static final String Message = "Message";
	public static final String Min = "Min";
	public static final String Max = "Max";
	
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
