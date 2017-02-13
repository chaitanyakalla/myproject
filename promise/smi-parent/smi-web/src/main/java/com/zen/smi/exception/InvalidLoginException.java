package com.zen.smi.exception;

public class InvalidLoginException extends Exception {

    
    public static final long serialVersionUID = -1;

    
    private String errorText;
    
    
    private String errorContext;

   
    private String errorCode;

    public InvalidLoginException(Exception e) {
    	super(e);
    	this.errorText = e.getMessage();
    }
    
    
    public InvalidLoginException(String errorText, Throwable cause) {
    	super(errorText, cause);
    	this.errorText = errorText;
    }
    
    
    public InvalidLoginException(String errorContext, String errorCode,
                               String errorText) {
    	super(errorText);
    	this.errorText = errorText;
        this.errorContext = errorContext;
        this.errorCode = errorCode;
    }

    
    public InvalidLoginException(String errorContext, String errorCode,
                               String errorText, Throwable cause) {
        super(errorText, cause);
        this.errorText = errorText;
        this.errorContext = errorContext;
        this.errorCode = errorCode;
    }

	
	public String getErrorText() {
		return errorText;
	}
	
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
	
	public String getErrorContext() {
		return errorContext;
	}

		public void setErrorContext(String errorContext) {
		this.errorContext = errorContext;
	}

	
	public String getErrorCode() {
		return errorCode;
	}

	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}



}
