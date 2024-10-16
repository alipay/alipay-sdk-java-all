package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费订单查询接口
 *
 * @author auto create
 * @since 1.0, 2023-08-21 12:39:19
 */
public class AlipayEbppJfEbillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3479155327917493988L;

	/**
	 * 缴费的订单唯一标识
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
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
