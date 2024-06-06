package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.reconfirm.verificatecallback.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:43
 */
public class AlipaySecurityRiskReconfirmVerificatecallbackSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6328769765855259973L;

	/** 
	 * 额外返回信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

}
