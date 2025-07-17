package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单收货地址模型
 *
 * @author auto create
 * @since 1.0, 2025-07-04 14:14:08
 */
public class MiniReceiverAddressInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6212246593448212328L;

	/**
	 * 不包含省、市、区的详细地址
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
	 * 收货地址信息
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 地址的省份信息
	 */
	@ApiField("province")
	private String province;

	/**
	 * 标准城市域码
	 */
	@ApiField("receiver_division_code")
	private String receiverDivisionCode;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货邮编地址
	 */
	@ApiField("receiver_zip")
	private String receiverZip;

	/**
	 * 收货人手机号
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

	public String getReceiverDivisionCode() {
		return this.receiverDivisionCode;
	}
	public void setReceiverDivisionCode(String receiverDivisionCode) {
		this.receiverDivisionCode = receiverDivisionCode;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverZip() {
		return this.receiverZip;
	}
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}

	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

}
