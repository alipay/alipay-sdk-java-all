package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单查询
 *
 * @author auto create
 * @since 1.0, 2026-07-02 14:17:56
 */
public class AlipayUserUgshoppingOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4475389777443124172L;

	/**
	 * 渠道号
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 订单创建最大时间
	 */
	@ApiField("max_order_create_time")
	private String maxOrderCreateTime;

	/**
	 * 订单创建最小时间
	 */
	@ApiField("min_order_create_time")
	private String minOrderCreateTime;

	/**
	 * 开放平台用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getMaxOrderCreateTime() {
		return this.maxOrderCreateTime;
	}
	public void setMaxOrderCreateTime(String maxOrderCreateTime) {
		this.maxOrderCreateTime = maxOrderCreateTime;
	}

	public String getMinOrderCreateTime() {
		return this.minOrderCreateTime;
	}
	public void setMinOrderCreateTime(String minOrderCreateTime) {
		this.minOrderCreateTime = minOrderCreateTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
