package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.authorization.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 15:42:35
 */
public class AlipayEbppIndustrySupervisionAuthorizationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4812489598597739959L;

	/** 
	 * 外部申请请求流水号，外部请求的唯一标识
	 */
	@ApiField("apply_request_no")
	private String applyRequestNo;

	/** 
	 * 签约地址
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setApplyRequestNo(String applyRequestNo) {
		this.applyRequestNo = applyRequestNo;
	}
	public String getApplyRequestNo( ) {
		return this.applyRequestNo;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
