package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.userid.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:12:41
 */
public class AlipayPlatformUseridGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6374243586419176446L;

	/** 
	 * id字典，key为openId，value为userId
	 */
	@ApiField("dict")
	private String dict;

	public void setDict(String dict) {
		this.dict = dict;
	}
	public String getDict( ) {
		return this.dict;
	}

}
