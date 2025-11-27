package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单签约芝麻信用拓展参数
 *
 * @author auto create
 * @since 1.0, 2025-11-21 16:35:23
 */
public class RentCreditExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1593265879557627674L;

	/**
	 * 纯代扣签约场景该订单是否使用租安盾风控。不传默认不使用
	 */
	@ApiField("fee_risk_model")
	private String feeRiskModel;

	/**
	 * 对应芝麻免押风控进阶参数freezeFlagRentOnline
	 */
	@ApiField("freeze_flag_rent_online")
	private String freezeFlagRentOnline;

	/**
	 * 对应芝麻免押风控进阶参数preRiskFlagRentOnline
	 */
	@ApiField("pre_risk_flag_rent_online")
	private String preRiskFlagRentOnline;

	public String getFeeRiskModel() {
		return this.feeRiskModel;
	}
	public void setFeeRiskModel(String feeRiskModel) {
		this.feeRiskModel = feeRiskModel;
	}

	public String getFreezeFlagRentOnline() {
		return this.freezeFlagRentOnline;
	}
	public void setFreezeFlagRentOnline(String freezeFlagRentOnline) {
		this.freezeFlagRentOnline = freezeFlagRentOnline;
	}

	public String getPreRiskFlagRentOnline() {
		return this.preRiskFlagRentOnline;
	}
	public void setPreRiskFlagRentOnline(String preRiskFlagRentOnline) {
		this.preRiskFlagRentOnline = preRiskFlagRentOnline;
	}

}
