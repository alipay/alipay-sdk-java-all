package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠券商家群活动内容模型
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:57:44
 */
public class CouponActivityContentVO extends AlipayObject {

	private static final long serialVersionUID = 8442812784171578435L;

	/**
	 * 优惠券Id。传入活动id后可支持在群内发优惠券消息。请先通过<a href="https://opendocs.alipay.com/open/7ad3a7bf_alipay.marketing.activity.ordervoucher.create?scene=a0667e04ac87431eb7e6adc5f13cc8ba&pathHash=3262435d">优惠券创建接口</a>创建优惠券 并获取activity_id优惠券id作为这个入参的值。
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
