package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回调物流单信息，存储运单号、物流公司等信息
 *
 * @author auto create
 * @since 1.0, 2025-01-13 18:12:07
 */
public class VerifyLogisticsDetail extends AlipayObject {

	private static final long serialVersionUID = 2238792374722137662L;

	/**
	 * 收件人或寄件人手机号后四位
	 */
	@ApiField("check_phone_no")
	private String checkPhoneNo;

	/**
	 * 用于存储物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 用于记录物流公司名称
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 用于存储快递公司物流运单号
	 */
	@ApiField("tracking_number")
	private String trackingNumber;

	public String getCheckPhoneNo() {
		return this.checkPhoneNo;
	}
	public void setCheckPhoneNo(String checkPhoneNo) {
		this.checkPhoneNo = checkPhoneNo;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

}
