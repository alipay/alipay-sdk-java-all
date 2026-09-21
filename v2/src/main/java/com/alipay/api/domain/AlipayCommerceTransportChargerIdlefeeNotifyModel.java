package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知超时占位费支付状态
 *
 * @author auto create
 * @since 1.0, 2026-08-20 11:47:55
 */
public class AlipayCommerceTransportChargerIdlefeeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2243148124169751672L;

	/**
	 * 支付宝用户OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户占位费订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 占位费支付状态
PAID: 已完成支付
UNPAID: 未完成支付，即支付取消或者超时关闭，需重新发起支付
PAID_BY_OTHER: 用户通过其他渠道完成支付
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 占位费支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
