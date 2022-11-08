package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户反洗钱风险检查发现的风险，包含命中的实体类型和命中详情等信息。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class MerchantScreenHit extends AlipayObject {

	private static final long serialVersionUID = 4394945888519551349L;

	/**
	 * 送检的实体类型，如CEO，控股人，等
	 */
	@ApiField("input_type")
	private String inputType;

	/**
	 * 命中详情
	 */
	@ApiField("risk_detail")
	private String riskDetail;

	public String getInputType() {
		return this.inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public String getRiskDetail() {
		return this.riskDetail;
	}
	public void setRiskDetail(String riskDetail) {
		this.riskDetail = riskDetail;
	}

}
