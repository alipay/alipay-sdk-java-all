package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动关联优惠券信息（可能多个奖品）
 *
 * @author auto create
 * @since 1.0, 2025-04-22 21:56:15
 */
public class CouponDTO extends AlipayObject {

	private static final long serialVersionUID = 4359373432122298622L;

	/**
	 * 优惠券ID
	 */
	@ApiField("prize_instance_id")
	private String prizeInstanceId;

	public String getPrizeInstanceId() {
		return this.prizeInstanceId;
	}
	public void setPrizeInstanceId(String prizeInstanceId) {
		this.prizeInstanceId = prizeInstanceId;
	}

}
