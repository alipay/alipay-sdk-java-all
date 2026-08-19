package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车费查询
 *
 * @author auto create
 * @since 1.0, 2026-08-18 21:47:57
 */
public class AlipayCommerceTransportParkingFeeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1527318736312261153L;

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
	 * 车牌号，与停车事件唯一编码二选一必填
	 */
	@ApiField("license_plate_no")
	private String licensePlateNo;

	/**
	 * 查询渠道值
	 */
	@ApiField("request_channel")
	private String requestChannel;

	/**
	 * 停车事件唯一编码，与车牌号二选一必填
	 */
	@ApiField("serial_no")
	private String serialNo;

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

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
