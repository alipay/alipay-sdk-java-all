package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CheckBizData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.miniprogram.verifyidentity.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:41:42
 */
public class AlipaySecurityRiskMiniprogramVerifyidentityConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4847359397337532438L;

	/** 
	 * 返回给调用方的数据集合，具体数据由对接过程中双方共同确认
	 */
	@ApiField("biz_data")
	private CheckBizData bizData;

	/** 
	 * 身份核验结果
	 */
	@ApiField("verify_result")
	private String verifyResult;

	public void setBizData(CheckBizData bizData) {
		this.bizData = bizData;
	}
	public CheckBizData getBizData( ) {
		return this.bizData;
	}

	public void setVerifyResult(String verifyResult) {
		this.verifyResult = verifyResult;
	}
	public String getVerifyResult( ) {
		return this.verifyResult;
	}

}
