package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅营销券创建
 *
 * @author auto create
 * @since 1.0, 2026-05-26 10:07:49
 */
public class AlipayTradePromotionCouponCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8818562853335491753L;

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
