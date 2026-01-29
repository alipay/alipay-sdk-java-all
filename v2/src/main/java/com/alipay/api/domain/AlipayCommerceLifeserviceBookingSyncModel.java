package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活服务预约信息回传
 *
 * @author auto create
 * @since 1.0, 2026-01-28 16:47:42
 */
public class AlipayCommerceLifeserviceBookingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7525479371582762356L;

	/**
	 * 操作动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * null
	 */
	@ApiListField("booking_attr")
	@ApiField("life_service_attr")
	private List<LifeServiceAttr> bookingAttr;

	/**
	 * 预约单id
	 */
	@ApiField("booking_id")
	private String bookingId;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<LifeServiceAttr> getBookingAttr() {
		return this.bookingAttr;
	}
	public void setBookingAttr(List<LifeServiceAttr> bookingAttr) {
		this.bookingAttr = bookingAttr;
	}

	public String getBookingId() {
		return this.bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
