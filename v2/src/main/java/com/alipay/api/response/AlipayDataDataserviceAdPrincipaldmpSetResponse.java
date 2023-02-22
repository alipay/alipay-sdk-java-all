package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principaldmp.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:29:36
 */
public class AlipayDataDataserviceAdPrincipaldmpSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5464914125262369898L;

	/** 
	 * 操作结果：true-成功；false-失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
