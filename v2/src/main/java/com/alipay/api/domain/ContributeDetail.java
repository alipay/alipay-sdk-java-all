package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资方明细
 *
 * @author auto create
 * @since 1.0, 2023-07-11 20:41:37
 */
public class ContributeDetail extends AlipayObject {

	private static final long serialVersionUID = 6373931254737589969L;

	/**
	 * 出资方金额
	 */
	@ApiField("contribute_amount")
	private String contributeAmount;

	/**
	 * 出资方类型
	 */
	@ApiField("contribute_type")
	private String contributeType;

	public String getContributeAmount() {
		return this.contributeAmount;
	}
	public void setContributeAmount(String contributeAmount) {
		this.contributeAmount = contributeAmount;
	}

	public String getContributeType() {
		return this.contributeType;
	}
	public void setContributeType(String contributeType) {
		this.contributeType = contributeType;
	}

}
