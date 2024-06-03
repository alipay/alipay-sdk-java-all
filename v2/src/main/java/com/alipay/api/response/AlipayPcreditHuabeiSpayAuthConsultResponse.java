package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiStagePayInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.spay.auth.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:05
 */
public class AlipayPcreditHuabeiSpayAuthConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1776259772597866462L;

	/** 
	 * 是否通过了鉴权的校验，通过了为true，没有通过为false
	 */
	@ApiField("auth_approved")
	private Boolean authApproved;

	/** 
	 * 分次支付的支付信息，内部包含明细
	 */
	@ApiField("multi_stage_pay_info")
	private MultiStagePayInfo multiStagePayInfo;

	/** 
	 * 用户没有通过鉴权的接口校验，未能通过的原因;如果用户是可用的，那么这个字段为空；
	 */
	@ApiField("refuse_desc")
	private String refuseDesc;

	public void setAuthApproved(Boolean authApproved) {
		this.authApproved = authApproved;
	}
	public Boolean getAuthApproved( ) {
		return this.authApproved;
	}

	public void setMultiStagePayInfo(MultiStagePayInfo multiStagePayInfo) {
		this.multiStagePayInfo = multiStagePayInfo;
	}
	public MultiStagePayInfo getMultiStagePayInfo( ) {
		return this.multiStagePayInfo;
	}

	public void setRefuseDesc(String refuseDesc) {
		this.refuseDesc = refuseDesc;
	}
	public String getRefuseDesc( ) {
		return this.refuseDesc;
	}

}
