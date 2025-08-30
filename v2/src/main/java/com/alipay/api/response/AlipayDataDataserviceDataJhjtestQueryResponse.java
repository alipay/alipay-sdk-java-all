package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.data.jhjtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-25 16:07:07
 */
public class AlipayDataDataserviceDataJhjtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4661193937773417396L;

	/** 
	 * test
	 */
	@ApiField("test_out_other")
	private String testOutOther;

	/** 
	 * test
	 */
	@ApiField("test_out_string")
	private String testOutString;

	/** 
	 * tse
	 */
	@ApiField("test_out_string_yincang")
	private String testOutStringYincang;

	public void setTestOutOther(String testOutOther) {
		this.testOutOther = testOutOther;
	}
	public String getTestOutOther( ) {
		return this.testOutOther;
	}

	public void setTestOutString(String testOutString) {
		this.testOutString = testOutString;
	}
	public String getTestOutString( ) {
		return this.testOutString;
	}

	public void setTestOutStringYincang(String testOutStringYincang) {
		this.testOutStringYincang = testOutStringYincang;
	}
	public String getTestOutStringYincang( ) {
		return this.testOutStringYincang;
	}

}
