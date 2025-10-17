package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单签约芝麻信用拓展参数
 *
 * @author auto create
 * @since 1.0, 2025-09-24 11:20:40
 */
public class RentCreditExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5459627282874446587L;

	/**
	 * 纯代扣签约场景该订单是否使用租安盾风控。不传默认不使用
	 */
	@ApiField("fee_risk_model")
	private String feeRiskModel;

	public String getFeeRiskModel() {
		return this.feeRiskModel;
	}
	public void setFeeRiskModel(String feeRiskModel) {
		this.feeRiskModel = feeRiskModel;
	}

}
