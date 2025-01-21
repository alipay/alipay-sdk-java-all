package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约产品属性
 *
 * @author auto create
 * @since 1.0, 2024-07-30 23:23:16
 */
public class ProdParams extends AlipayObject {

	private static final long serialVersionUID = 7581733467935443476L;

	/**
	 * 预授权业务信息
	 */
	@ApiField("auth_biz_params")
	private String authBizParams;

	/**
	 * 前置营销信息，由商户接入前置收银台后生成，在拉起独立签约时传递
	 */
	@ApiField("pay_operation_info")
	private String payOperationInfo;

	/**
	 * 前置收银id，商户接入前置收银台咨询时生成
	 */
	@ApiField("pre_consult_id")
	private String preConsultId;

	public String getAuthBizParams() {
		return this.authBizParams;
	}
	public void setAuthBizParams(String authBizParams) {
		this.authBizParams = authBizParams;
	}

	public String getPayOperationInfo() {
		return this.payOperationInfo;
	}
	public void setPayOperationInfo(String payOperationInfo) {
		this.payOperationInfo = payOperationInfo;
	}

	public String getPreConsultId() {
		return this.preConsultId;
	}
	public void setPreConsultId(String preConsultId) {
		this.preConsultId = preConsultId;
	}

}
