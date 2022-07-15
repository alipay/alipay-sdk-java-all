package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退还用户积分
 *
 * @author auto create
 * @since 1.0, 2019-07-04 17:22:25
 */
public class AlipayInsAutoUserOilRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7824912155163595269L;

	/**
	 * 原始使用积分时候的request_id，只有使用过的积分才能返回
	 */
	@ApiField("exchange_request_id")
	private String exchangeRequestId;

	/**
	 * 退回原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 每次请求的ID。可使用唯一的业务单号，用来做幂等控制。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 来源，车险爱攒油团队分配
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

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
