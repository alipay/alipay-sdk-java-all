package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息，包含联系人、联系电话、地址
 *
 * @author auto create
 * @since 1.0, 2025-05-13 17:30:54
 */
public class MiniOrderAddressInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4193932436437859339L;

	/**
	 * 详细地址信息
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 标准城市区划代码，区维度的编码
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 联系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系人号码
	 */
	@ApiField("tel_number")
	private String telNumber;

	public String getDetailedAddress() {
		return this.detailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
