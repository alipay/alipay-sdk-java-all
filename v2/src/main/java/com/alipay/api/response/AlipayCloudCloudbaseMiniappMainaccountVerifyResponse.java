package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.miniapp.mainaccount.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 11:32:02
 */
public class AlipayCloudCloudbaseMiniappMainaccountVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8821299487649366337L;

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
