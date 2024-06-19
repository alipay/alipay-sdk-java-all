package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InitBizData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.miniprogram.verifyidentity.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 09:12:04
 */
public class AlipaySecurityRiskMiniprogramVerifyidentityInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5297251343498496839L;

	/** 
	 * 返回给调用方的数据集合，具体数据由对接过程中双方共同确认
	 */
	@ApiField("biz_data")
	private InitBizData bizData;

	/** 
	 * 核身校验token，核身会话中唯一性token，用于后续核身结果二次校验时参数传入
	 */
	@ApiField("verify_token")
	private String verifyToken;

	/** 
	 * 核身页面url
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	public void setBizData(InitBizData bizData) {
		this.bizData = bizData;
	}
	public InitBizData getBizData( ) {
		return this.bizData;
	}

	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}
	public String getVerifyToken( ) {
		return this.verifyToken;
	}

	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

}
