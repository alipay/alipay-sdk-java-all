package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商积分退还
 *
 * @author auto create
 * @since 1.0, 2022-09-22 20:14:13
 */
public class MybankMarketingCampaignBkpromosceneorderPointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4795646165121646384L;

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
	 * 请求ID
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
