package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁单扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-06-05 15:58:54
 */
public class RentOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8134841261425687678L;

	/**
	 * 用户和租赁商合同上约定的租赁价格
	 */
	@ApiField("order_sign_price")
	private String orderSignPrice;

	/**
	 * 用户租赁的结束时间
	 */
	@ApiField("rent_end_time")
	private Date rentEndTime;

	/**
	 * 租赁的模式：到期归还/到期即送/到期买断
	 */
	@ApiField("rent_mode")
	private String rentMode;

	/**
	 * 用户租赁开始的时间
	 */
	@ApiField("rent_start_time")
	private Date rentStartTime;

	public String getOrderSignPrice() {
		return this.orderSignPrice;
	}
	public void setOrderSignPrice(String orderSignPrice) {
		this.orderSignPrice = orderSignPrice;
	}

	public Date getRentEndTime() {
		return this.rentEndTime;
	}
	public void setRentEndTime(Date rentEndTime) {
		this.rentEndTime = rentEndTime;
	}

	public String getRentMode() {
		return this.rentMode;
	}
	public void setRentMode(String rentMode) {
		this.rentMode = rentMode;
	}

	public Date getRentStartTime() {
		return this.rentStartTime;
	}
	public void setRentStartTime(Date rentStartTime) {
		this.rentStartTime = rentStartTime;
	}

}
