package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户业务参数。用于透传业务扩展信息。
 *
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class SaasBusinessParams extends AlipayObject {

	private static final long serialVersionUID = 4156766466339226129L;

	/**
	 * 校园卡编号
	 */
	@ApiField("campus_card")
	private String campusCard;

	public String getCampusCard() {
		return this.campusCard;
	}
	public void setCampusCard(String campusCard) {
		this.campusCard = campusCard;
	}

}
