package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅营销券创建
 *
 * @author auto create
 * @since 1.0, 2026-05-11 20:26:19
 */
public class AlipayTradePromotionCouponCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2819137299385721226L;

	/**
	 * 优惠券信息
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
