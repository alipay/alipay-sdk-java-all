package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.nucleicacid.code.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:51:41
 */
public class AlipayEbppIndustryNucleicacidCodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6652695669424543188L;

	/** 
	 * 机构业务号，用于关联机构侧存储的用户信息，核验失败时可能为空
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 核酸码值核验结果
	 */
	@ApiField("verify_result")
	private Boolean verifyResult;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setVerifyResult(Boolean verifyResult) {
		this.verifyResult = verifyResult;
	}
	public Boolean getVerifyResult( ) {
		return this.verifyResult;
	}

}
