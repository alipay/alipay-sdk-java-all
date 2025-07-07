package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退还用户积分
 *
 * @author auto create
 * @since 1.0, 2023-07-14 09:28:53
 */
public class AlipayCommerceOperationUserPointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4268327998679846915L;

	/**
	 * 原始扣减积分的请求ID
	 */
	@ApiField("exchange_request_id")
	private String exchangeRequestId;

	/**
	 * 蚂蚁统一open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 退回原因，例如：RETURN_GOODS-退货
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 每次请求的ID。可使用唯一的业务单号，用来做幂等控制。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景代码，由行业运营平台分配，提供枚举值。 user_id + scene_code 确定退还积分的场景。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 来源渠道，行业运营平台分配，例如：linkedmall
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getExchangeRequestId() {
		return this.exchangeRequestId;
	}
	public void setExchangeRequestId(String exchangeRequestId) {
		this.exchangeRequestId = exchangeRequestId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
