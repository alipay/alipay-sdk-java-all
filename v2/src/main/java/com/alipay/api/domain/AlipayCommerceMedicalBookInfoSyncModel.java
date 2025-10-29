package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单预约时间同步
 *
 * @author auto create
 * @since 1.0, 2025-09-19 18:00:09
 */
public class AlipayCommerceMedicalBookInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4426885328484678362L;

	/**
	 * 预约时间
	 */
	@ApiField("book_time")
	private Date bookTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBookTime() {
		return this.bookTime;
	}
	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
