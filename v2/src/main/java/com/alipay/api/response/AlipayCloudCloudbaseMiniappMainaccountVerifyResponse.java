package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.miniapp.mainaccount.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:11:51
 */
public class AlipayCloudCloudbaseMiniappMainaccountVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8313725791157727511L;

	/** 
	 * 校验结果
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
