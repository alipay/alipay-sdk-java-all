package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日历房房态信息
 *
 * @author auto create
 * @since 1.0, 2024-01-25 17:52:38
 */
public class CalendarRoomPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 7654131556992794322L;

	/**
	 * 入住酒店日期
	 */
	@ApiField("check_in_date")
	private Date checkInDate;

	/**
	 * 所属商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	public Date getCheckInDate() {
		return this.checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
