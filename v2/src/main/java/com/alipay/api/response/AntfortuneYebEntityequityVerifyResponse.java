package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BaseWebResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.yeb.entityequity.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:51:55
 */
public class AntfortuneYebEntityequityVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3611664977741975728L;

	/** 
	 * web层返回对象封装
	 */
	@ApiField("response")
	private BaseWebResponse response;

	public void setResponse(BaseWebResponse response) {
		this.response = response;
	}
	public BaseWebResponse getResponse( ) {
		return this.response;
	}

}
