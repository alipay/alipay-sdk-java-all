package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货地址信息模型
 *
 * @author auto create
 * @since 1.0, 2025-06-03 13:32:52
 */
public class AddressInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5541463399962873399L;

	/**
	 * 详细地址信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地址区信息
	 */
	@ApiField("area")
	private String area;

	/**
	 * 地址市信息
	 */
	@ApiField("city")
	private String city;

	/**
	 * 详细收货地址信息
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 地址省份信息
	 */
	@ApiField("province")
	private String province;

	/**
	 * 收件人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件人手机号码
	 */
	@ApiField("tel_number")
	private String telNumber;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDetailedAddress() {
		return this.detailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
