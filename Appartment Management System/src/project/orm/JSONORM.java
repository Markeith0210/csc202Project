package project.orm;

import java.util.regex.Pattern;

/**
 * abstract class describing a simple json implementation
 * @author wef2888
 *
 */
public abstract class JSONORM<T extends Object> {
	Pattern brackets = Pattern.compile("{([.]*)}");
	private String[] splitJSONObjects(String contents){
		//brackets.matcher(contents).
		return null;
	}
	private String[] splitComma(String contents, String delimiter){
		return null;
	}
	private String[] splitOther(String contents, String delimiter){
		return null;
	}
	private String getFileContents(){
		return null;
	}
	
	public abstract T getObjects();
}
