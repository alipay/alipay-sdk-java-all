package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identify.verify response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-05 17:26:17
 */
public class AlipayUserCertifyIdentifyVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3595127344913193241L;

	/** 
	 * 校验结果，T表示满足条件，F表示不满足条件
	 */
	@ApiField("biz_code_status")
	private String bizCodeStatus;

	public void setBizCodeStatus(String bizCodeStatus) {
		this.bizCodeStatus = bizCodeStatus;
	}
	public String getBizCodeStatus( ) {
		return this.bizCodeStatus;
	}

}
