package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构创建快递
 *
 * @author auto create
 * @since 1.0, 2026-06-04 15:32:53
 */
public class XingheLendassistCarfinOrgexpressCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4267657145256696264L;

	/**
	 * 预约上门时间
	 */
	@ApiField("appointment_time")
	private String appointmentTime;

	/**
	 * 坐席下单：ORG_SEATS
客户下单：
ORG_CUST
	 */
	@ApiField("create_type")
	private String createType;

	/**
	 * 抵押单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	/**
	 * 收件人信息
	 */
	@ApiField("receiver_info")
	private XhExpressPostInfo receiverInfo;

	/**
	 * 寄件人信息
	 */
	@ApiField("sender_info")
	private XhExpressPostInfo senderInfo;

	public String getAppointmentTime() {
		return this.appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getCreateType() {
		return this.createType;
	}
	public void setCreateType(String createType) {
		this.createType = createType;
	}

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

	public XhExpressPostInfo getReceiverInfo() {
		return this.receiverInfo;
	}
	public void setReceiverInfo(XhExpressPostInfo receiverInfo) {
		this.receiverInfo = receiverInfo;
	}

	public XhExpressPostInfo getSenderInfo() {
		return this.senderInfo;
	}
	public void setSenderInfo(XhExpressPostInfo senderInfo) {
		this.senderInfo = senderInfo;
	}

}
