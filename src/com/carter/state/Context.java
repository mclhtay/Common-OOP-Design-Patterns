package com.carter.state;
// Context: part of the state object, connected through weak aggregation
public class Context {
	public GovAlertState alert;
	
	public Context() {
		alert = new AmberAlert();
	}
	
	public void setAlert(GovAlertState newAlert) {
		this.alert = newAlert;
	}
	
	//alerts are accessed through the context	 i.e. handled through the context
	public void alert() {
		this.alert.alert();
	}
}
