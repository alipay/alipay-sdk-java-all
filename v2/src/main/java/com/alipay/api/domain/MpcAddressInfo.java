package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:13:48
 */
public class MpcAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 7325288299671982788L;

	/**
	 * 详细地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 地址id
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 四级地址code
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 收货人
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 收货人电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 五级地址code
	 */
	@ApiField("town_division_code")
	private String townDivisionCode;

	public String getAddressDetail() {
		return this.addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getTownDivisionCode() {
		return this.townDivisionCode;
	}
	public void setTownDivisionCode(String townDivisionCode) {
		this.townDivisionCode = townDivisionCode;
	}

}
