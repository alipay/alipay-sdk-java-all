package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.user.billkey.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppIndustryUserBillkeyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2879945554784675916L;

	/** 
	 * 扩展属性，JSON格式
	 */
	@ApiField("extend_field")
	private String extendField;

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

}
