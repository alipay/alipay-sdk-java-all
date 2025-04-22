package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收银员信息
 *
 * @author auto create
 * @since 1.0, 2024-10-09 11:27:01
 */
public class MrchCashierInfo extends AlipayObject {

	private static final long serialVersionUID = 5131537362149679161L;

	/**
	 * 收银员Id
	 */
	@ApiField("cashier_id")
	private String cashierId;

	/**
	 * 收银员名称
	 */
	@ApiField("cashier_name")
	private String cashierName;

	/**
	 * 电话号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 所属门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCashierId() {
		return this.cashierId;
	}
	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}

	public String getCashierName() {
		return this.cashierName;
	}
	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
