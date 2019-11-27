package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短信模板内含参数
 *
 * @author auto create
 * @since 1.0, 2019-05-30 19:17:50
 */
public class MessageTemplateDTO extends AlipayObject {

	private static final long serialVersionUID = 5545733416141843318L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 店家电话号码
	 */
	@ApiField("phoneNumber")
	private String phoneNumber;

	/**
	 * 取件码
	 */
	@ApiField("pickCode")
	private String pickCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPickCode() {
		return this.pickCode;
	}
	public void setPickCode(String pickCode) {
		this.pickCode = pickCode;
	}

}
