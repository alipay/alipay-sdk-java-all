package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资方明细
 *
 * @author auto create
 * @since 1.0, 2020-03-18 19:11:19
 */
public class ContributeDetail extends AlipayObject {

	private static final long serialVersionUID = 2678268847244254173L;

	/**
	 * 出资方金额
	 */
	@ApiField("contribute_amount")
	private String contributeAmount;

	/**
	 * 出资方类型，如品牌商出资、支付宝平台出资等
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
