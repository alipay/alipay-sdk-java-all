package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单发货地址
 *
 * @author auto create
 * @since 1.0, 2026-09-16 19:51:31
 */
public class RentOrderShipperAddressInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4175652973624896914L;

	/**
	 * 发货地址信息
	 */
	@ApiField("detailed_shipper_address")
	private String detailedShipperAddress;

	/**
	 * 发货人姓名
	 */
	@ApiField("shipper_name")
	private String shipperName;

	/**
	 * 发货人手机号
	 */
	@ApiField("shipper_tel_number")
	private String shipperTelNumber;

	public String getDetailedShipperAddress() {
		return this.detailedShipperAddress;
	}
	public void setDetailedShipperAddress(String detailedShipperAddress) {
		this.detailedShipperAddress = detailedShipperAddress;
	}

	public String getShipperName() {
		return this.shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getShipperTelNumber() {
		return this.shipperTelNumber;
	}
	public void setShipperTelNumber(String shipperTelNumber) {
		this.shipperTelNumber = shipperTelNumber;
	}

}
