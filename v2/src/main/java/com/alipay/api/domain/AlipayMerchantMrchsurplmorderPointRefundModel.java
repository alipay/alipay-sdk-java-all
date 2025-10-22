package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * LinkedMall订单失败退回商家积分
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:53:24
 */
public class AlipayMerchantMrchsurplmorderPointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8233415757111254518L;

	/**
	 * LinkedMall分配的业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 原始扣减积分的请求ID
	 */
	@ApiField("deducted_request_id")
	private String deductedRequestId;

	/**
	 * LinkedMall的订单ID
	 */
	@ApiField("lm_order_id")
	private Long lmOrderId;

	/**
	 * 请求表示
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeductedRequestId() {
		return this.deductedRequestId;
	}
	public void setDeductedRequestId(String deductedRequestId) {
		this.deductedRequestId = deductedRequestId;
	}

	public Long getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(Long lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
