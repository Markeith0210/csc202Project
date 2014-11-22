package project.orm;
/**
 * abstract class describing a simple orm for a comma delimited file.
 * @author wef2888
 *
 */
public abstract class CDFORM<T extends Object> {
	private String[] splitLines(String contents, String delimiter){
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
	
	public abstract Object getObjects();
}
