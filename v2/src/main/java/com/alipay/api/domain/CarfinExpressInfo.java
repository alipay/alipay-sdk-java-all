package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快递信息
 *
 * @author auto create
 * @since 1.0, 2026-06-25 21:33:25
 */
public class CarfinExpressInfo extends AlipayObject {

	private static final long serialVersionUID = 4718577779638666834L;

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
	 * 快递公司
	 */
	@ApiField("express_org_name")
	private String expressOrgName;

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

	public String getExpressOrgName() {
		return this.expressOrgName;
	}
	public void setExpressOrgName(String expressOrgName) {
		this.expressOrgName = expressOrgName;
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
