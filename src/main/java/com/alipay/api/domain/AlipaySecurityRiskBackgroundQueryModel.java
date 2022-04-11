package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人员风险背景调查
 *
 * @author auto create
 * @since 1.0, 2020-02-01 11:36:03
 */
public class AlipaySecurityRiskBackgroundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6552291985573453691L;

	/**
	 * params+用于背调查询的输入信息+用户传入
	 */
	@ApiField("params")
	private String params;

	/**
	 * partner_name+唯一+作为标识调用者身份的字段+用户填入
	 */
	@ApiField("partner_name")
	private String partnerName;

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
