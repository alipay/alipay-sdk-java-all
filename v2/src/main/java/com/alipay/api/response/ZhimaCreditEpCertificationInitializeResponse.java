package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.certification.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 09:02:04
 */
public class ZhimaCreditEpCertificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2672392138251559674L;

	/** 
	 * 一次认证的唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 商户唯一业务流水号，由大小写字母和数字构成
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}
	public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

}
