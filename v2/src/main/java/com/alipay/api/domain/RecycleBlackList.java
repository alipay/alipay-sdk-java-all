package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收黑名单信息
 *
 * @author auto create
 * @since 1.0, 2025-08-14 14:39:26
 */
public class RecycleBlackList extends AlipayObject {

	private static final long serialVersionUID = 8659495884168775988L;

	/**
	 * 地址黑名单
	 */
	@ApiField("address")
	private RecyleBlackAddress address;

	/**
	 * 拉黑原因
	 */
	@ApiField("forbidden_reason")
	private String forbiddenReason;

	/**
	 * 拉黑时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("forbidden_time")
	private Date forbiddenTime;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public RecyleBlackAddress getAddress() {
		return this.address;
	}
	public void setAddress(RecyleBlackAddress address) {
		this.address = address;
	}

	public String getForbiddenReason() {
		return this.forbiddenReason;
	}
	public void setForbiddenReason(String forbiddenReason) {
		this.forbiddenReason = forbiddenReason;
	}

	public Date getForbiddenTime() {
		return this.forbiddenTime;
	}
	public void setForbiddenTime(Date forbiddenTime) {
		this.forbiddenTime = forbiddenTime;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
