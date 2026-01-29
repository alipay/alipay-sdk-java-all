package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务单用户收货地址
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:47:36
 */
public class RentServiceTicketReceiverAddressInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7255126527456188562L;

	/**
	 * 地址市区
	 */
	@ApiField("city")
	private String city;

	/**
	 * 收货地址信息
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 地址区县
	 */
	@ApiField("district")
	private String district;

	/**
	 * 地址省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人手机号
	 */
	@ApiField("tel_number")
	private String telNumber;

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

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
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
