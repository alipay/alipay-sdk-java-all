package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询新能源充电芝麻先享签约状态
 *
 * @author auto create
 * @since 1.0, 2026-09-21 11:07:57
 */
public class AlipayCommerceTransportChargerZhimaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2896236312922146391L;

	/**
	 * 用户设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 身份证号，暂不支持
	 */
	@ApiField("id_num")
	private String idNum;

	/**
	 * 用户设备IP
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户外部协议号，全局唯一协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 用户手机号
	 */
	@ApiField("phone_num")
	private String phoneNum;

	/**
	 * 芝麻信用服务ID
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIdNum() {
		return this.idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
