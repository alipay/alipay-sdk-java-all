package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享出行行业查询用户芝麻先享签约状态
 *
 * @author auto create
 * @since 1.0, 2026-10-09 10:17:57
 */
public class AlipayCommerceTransportTrafficshareZhimaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7728434168263576536L;

	/**
	 * 用户设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 用户设备IP
	 */
	@ApiField("ip_address")
	private String ipAddress;

	/**
	 * open_id
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
	 * 开通芝麻先享成功后待跳转的商户页面url
	 */
	@ApiField("skip_link_url")
	private String skipLinkUrl;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

	public String getSkipLinkUrl() {
		return this.skipLinkUrl;
	}
	public void setSkipLinkUrl(String skipLinkUrl) {
		this.skipLinkUrl = skipLinkUrl;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
