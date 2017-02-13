package com.zen.smi.exception;

import com.zen.smi.generic.utils.MessageBO;

public class BusinessException extends Exception {

    public static final long serialVersionUID = -1;

    private String errorText;
    
    /**
     * Error context String
     */
    private String errorContext;

    /**
     * Error code String
     */
    private String errorCode;

    /**
     * Constructor
     * @param e Exception
     */
    public BusinessException(Throwable e) {
    	super(e);
    	this.errorText = e.getMessage();
    }
    
    public BusinessException(MessageBO messageBO) {
    	if(messageBO != null)
    	{
    		this.errorText = messageBO.getTextEn();
    		this.errorCode = messageBO.getCode();
    	    this.errorContext = messageBO.getName();
    	}
    	
    }
    
    public BusinessException(MessageBO messageBO, Throwable e) {
    	super(e);
    	if(messageBO != null)
    	{
    		this.errorText = messageBO.getTextEn();
    		this.errorCode = messageBO.getCode();
    	    this.errorContext = messageBO.getName();
    	}
    	
    }
    
    /**
     * Constructor
     * @param errorContext String
     * @param errorCode String
     * @param errorText String
     */
    public BusinessException(String errorContext, String errorCode,
                               String errorText) {
    	super(errorText);
    	this.errorText = errorText;
        this.errorContext = errorContext;
        this.errorCode = errorCode;
    }

    /**
     * Constructor
     * @param errorContext String
     * @param errorCode String
     * @param errorText String
     * @param cause Throwable
     */
    public BusinessException(String errorContext, String errorCode,
                               String errorText, Throwable cause) {
        super(errorText, cause);
        this.errorText = errorText;
        this.errorContext = errorContext;
        this.errorCode = errorCode;
    }

	/**
	 * returns Error Text
	 * @return errorText
	 */
	public String getErrorText() {
		return errorText;
	}
	/**
	 * sets The ErrorText
	 * @param errorText String
	 */
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
	/**
	 * returns Error context
	 * @return errorContext String
	 */
	public String getErrorContext() {
		return errorContext;
	}

	/**
	 * Sets Error context
	 * @param errorContext String 
	 */
	public void setErrorContext(String errorContext) {
		this.errorContext = errorContext;
	}

	/**
	 * Returns the error code.
	 * @return errorCode String
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Sets the error code.
	 * @param errorCode String
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}



}
