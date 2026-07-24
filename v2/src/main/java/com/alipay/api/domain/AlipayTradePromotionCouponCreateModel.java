package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅营销优惠创建
 *
 * @author auto create
 * @since 1.0, 2026-06-08 20:37:55
 */
public class AlipayTradePromotionCouponCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5696961984399391936L;

	/**
	 * 优惠信息
	 */
	@ApiField("request_info")
	private PromotionCoupon requestInfo;

	public PromotionCoupon getRequestInfo() {
		return this.requestInfo;
	}
	public void setRequestInfo(PromotionCoupon requestInfo) {
		this.requestInfo = requestInfo;
	}

}
