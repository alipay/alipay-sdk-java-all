package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾事件信息
 *
 * @author auto create
 * @since 1.0, 2018-12-18 17:57:00
 */
public class EventInfo extends AlipayObject {

	private static final long serialVersionUID = 7267686411664411238L;

	/**
	 * 设备指纹token
	 */
	@ApiField("apdid_token")
	private String apdidToken;

	/**
	 * 用户证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户邮箱，用于注册保护
	 */
	@ApiField("email")
	private String email;

	/**
	 * 事件编码：
注册保护请填写：EC_REGISTER_NORMAL
营销保护请填写：EC_MARKETING_CAMPAIGN_NORMAL
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 事件发生时间
	 */
	@ApiField("gmt_occur")
	private String gmtOccur;

	/**
	 * 用户手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 活动编号/活动交易号，用于营销保护
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 操作平台：ios/android/winphone/h5/pc/other
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 用户中文姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getApdidToken() {
		return this.apdidToken;
	}
	public void setApdidToken(String apdidToken) {
		this.apdidToken = apdidToken;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getGmtOccur() {
		return this.gmtOccur;
	}
	public void setGmtOccur(String gmtOccur) {
		this.gmtOccur = gmtOccur;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
