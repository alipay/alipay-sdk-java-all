package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用等级无授权场景
 *
 * @author auto create
 * @since 1.0, 2023-03-17 12:49:34
 */
public class CreditRateNoAuth extends AlipayObject {

	private static final long serialVersionUID = 2447717379168494684L;

	/**
	 * 信用等级名称
	 */
	@ApiField("cr_rank_title")
	private String crRankTitle;

	public String getCrRankTitle() {
		return this.crRankTitle;
	}
	public void setCrRankTitle(String crRankTitle) {
		this.crRankTitle = crRankTitle;
	}

}
