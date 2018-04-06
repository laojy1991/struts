package laojy;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.err.println("hello world");
		return super.execute();
	}
	
	
	public String laojy() throws Exception {
		System.err.println("hello laojy");
		return super.execute();
	}
	
	

}
