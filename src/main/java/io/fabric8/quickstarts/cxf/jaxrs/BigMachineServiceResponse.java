package io.fabric8.quickstarts.cxf.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BigMachine")
public class BigMachineServiceResponse {
	
	
	private String success;
	private String message;
	private String errorMessages;
	private String returnCode;
	private String hasError;
	private String POMethod;
	private String ZZEDI_EDITTED;
	private String currentEnv;
	
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(String errorMessages) {
		this.errorMessages = errorMessages;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getHasError() {
		return hasError;
	}
	public void setHasError(String hasError) {
		this.hasError = hasError;
	}
	public String getPOMethod() {
		return POMethod;
	}
	public void setPOMethod(String pOMethod) {
		POMethod = pOMethod;
	}
	public String getZZEDI_EDITTED() {
		return ZZEDI_EDITTED;
	}
	public void setZZEDI_EDITTED(String zZEDI_EDITTED) {
		ZZEDI_EDITTED = zZEDI_EDITTED;
	}
	public String getCurrentEnv() {
		return currentEnv;
	}
	public void setCurrentEnv(String currentEnv) {
		this.currentEnv = currentEnv;
	}
	

}
