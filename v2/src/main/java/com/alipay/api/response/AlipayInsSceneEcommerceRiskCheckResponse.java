package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.risk.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-03 17:27:27
 */
public class AlipayInsSceneEcommerceRiskCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1343888238471666955L;

	/** 
	 * 风控是否准入
	 */
	@ApiField("access")
	private Boolean access;

	/** 
	 * 风控拒绝原因
	 */
	@ApiField("reject_reason_code")
	private String rejectReasonCode;

	/** 
	 * 拒绝原因详情
	 */
	@ApiField("reject_reason_detail")
	private String rejectReasonDetail;

	public void setAccess(Boolean access) {
		this.access = access;
	}
	public Boolean getAccess( ) {
		return this.access;
	}

	public void setRejectReasonCode(String rejectReasonCode) {
		this.rejectReasonCode = rejectReasonCode;
	}
	public String getRejectReasonCode( ) {
		return this.rejectReasonCode;
	}

	public void setRejectReasonDetail(String rejectReasonDetail) {
		this.rejectReasonDetail = rejectReasonDetail;
	}
	public String getRejectReasonDetail( ) {
		return this.rejectReasonDetail;
	}

}
