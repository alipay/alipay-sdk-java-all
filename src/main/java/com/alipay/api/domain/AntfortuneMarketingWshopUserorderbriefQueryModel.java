package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户基金订单简报
 *
 * @author auto create
 * @since 1.0, 2018-12-06 09:31:50
 */
public class AntfortuneMarketingWshopUserorderbriefQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2253565189273657269L;

	/**
	 * 交易时间区间-结束（默认当前时间）java.util.Date
	 */
	@ApiField("end_trade_time")
	private Date endTradeTime;

	/**
	 * 交易时间区间-起始（不能跨度超过半年）java.util.Date
	 */
	@ApiField("start_trade_time")
	private Date startTradeTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndTradeTime() {
		return this.endTradeTime;
	}
	public void setEndTradeTime(Date endTradeTime) {
		this.endTradeTime = endTradeTime;
	}

	public Date getStartTradeTime() {
		return this.startTradeTime;
	}
	public void setStartTradeTime(Date startTradeTime) {
		this.startTradeTime = startTradeTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
