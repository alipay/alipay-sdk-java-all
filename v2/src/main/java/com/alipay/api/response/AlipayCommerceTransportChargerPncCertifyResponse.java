package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.pnc.certify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:12:28
 */
public class AlipayCommerceTransportChargerPncCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7535242769717838238L;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 绑定的手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/** 
	 * 车辆车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 车架号
	 */
	@ApiField("vin")
	private String vin;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber( ) {
		return this.phoneNumber;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo( ) {
		return this.plateNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVin( ) {
		return this.vin;
	}

}
