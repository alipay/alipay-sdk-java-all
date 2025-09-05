package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车用户取车同步
 *
 * @author auto create
 * @since 1.0, 2023-12-05 14:27:25
 */
public class AlipayEcoMycarRentcarUserpickupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3485779514539367426L;

	/**
	 * 实际取车时间
	 */
	@ApiField("actual_pick_up_time")
	private Date actualPickUpTime;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getActualPickUpTime() {
		return this.actualPickUpTime;
	}
	public void setActualPickUpTime(Date actualPickUpTime) {
		this.actualPickUpTime = actualPickUpTime;
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
