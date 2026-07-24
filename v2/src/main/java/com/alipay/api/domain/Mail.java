package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快递信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:39:28
 */
public class Mail extends AlipayObject {

	private static final long serialVersionUID = 3293975895689412855L;

	/**
	 * 快递员姓名
	 */
	@ApiField("courier_name")
	private String courierName;

	/**
	 * 快递员电话号码
	 */
	@ApiField("courier_phone_num")
	private String courierPhoneNum;

	/**
	 * 物流公司编码
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * 邮递时间
	 */
	@ApiField("delivery_time")
	private String deliveryTime;

	/**
	 * 物流单号
	 */
	@ApiField("mail_no")
	private String mailNo;

	public String getCourierName() {
		return this.courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierPhoneNum() {
		return this.courierPhoneNum;
	}
	public void setCourierPhoneNum(String courierPhoneNum) {
		this.courierPhoneNum = courierPhoneNum;
	}

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public String getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getMailNo() {
		return this.mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

}
