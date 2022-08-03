package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principaldmp.set response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-08 11:46:05
 */
public class AlipayDataDataserviceAdPrincipaldmpSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2759671647579541631L;

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
