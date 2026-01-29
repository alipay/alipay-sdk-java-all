package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车费查询
 *
 * @author auto create
 * @since 1.0, 2026-01-15 10:07:43
 */
public class AlipayCommerceTransportParkingFeeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7875418417285393766L;

	/**
	 * 用户唯一身份ID
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 用户身份ID类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 查询的车牌号
	 */
	@ApiField("license_plate_no")
	private String licensePlateNo;

	/**
	 * 查询渠道值
	 */
	@ApiField("request_channel")
	private String requestChannel;

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public String getRequestChannel() {
		return this.requestChannel;
	}
	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

}
