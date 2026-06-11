package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快递信息
 *
 * @author auto create
 * @since 1.0, 2025-12-29 20:13:16
 */
public class CarfinExpressInfo extends AlipayObject {

	private static final long serialVersionUID = 5514949753216567882L;

	/**
	 * 快递员姓名
	 */
	@ApiField("courier_name")
	private String courierName;

	/**
	 * 快递员手机号
	 */
	@ApiField("courier_phone")
	private String courierPhone;

	/**
	 * 寄件人信息
	 */
	@ApiField("sender_info")
	private XhExpressPostInfo senderInfo;

	/**
	 * 运单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public String getCourierName() {
		return this.courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierPhone() {
		return this.courierPhone;
	}
	public void setCourierPhone(String courierPhone) {
		this.courierPhone = courierPhone;
	}

	public XhExpressPostInfo getSenderInfo() {
		return this.senderInfo;
	}
	public void setSenderInfo(XhExpressPostInfo senderInfo) {
		this.senderInfo = senderInfo;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
