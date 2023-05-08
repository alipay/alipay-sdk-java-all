package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展数据
 *
 * @author auto create
 * @since 1.0, 2023-03-07 12:03:22
 */
public class ParticipantBizParam extends AlipayObject {

	private static final long serialVersionUID = 4313534712925235475L;

	/**
	 * 出资比例
	 */
	@ApiField("fund_ratio")
	private String fundRatio;

	/**
	 * 出资类型
	 */
	@ApiField("fund_type")
	private String fundType;

	public String getFundRatio() {
		return this.fundRatio;
	}
	public void setFundRatio(String fundRatio) {
		this.fundRatio = fundRatio;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

}
