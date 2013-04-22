package hx.controller.struts;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8096346480410784202L;
	private String username;
	private String password;


	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		if("aaa".equals(username) && "bbb".equals(password)){
			return SUCCESS;
		}
		if("aaa".equals(username) && "aaa".equals(password)){
			throw new Exception(" aaa exception   ");
			
		}
		
		return INPUT;
		
		
		
		
	}
}
