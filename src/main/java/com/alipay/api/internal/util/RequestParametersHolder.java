package com.alipay.api.internal.util;

public class RequestParametersHolder {
	private AlipayHashMap protocalMustParams;
	private AlipayHashMap protocalOptParams;
	private AlipayHashMap applicationParams;

	public AlipayHashMap getProtocalMustParams() {
		return protocalMustParams;
	}
	public void setProtocalMustParams(AlipayHashMap protocalMustParams) {
		this.protocalMustParams = protocalMustParams;
	}
	public AlipayHashMap getProtocalOptParams() {
		return protocalOptParams;
	}
	public void setProtocalOptParams(AlipayHashMap protocalOptParams) {
		this.protocalOptParams = protocalOptParams;
	}
	public AlipayHashMap getApplicationParams() {
		return applicationParams;
	}
	public void setApplicationParams(AlipayHashMap applicationParams) {
		this.applicationParams = applicationParams;
	}
	
}
