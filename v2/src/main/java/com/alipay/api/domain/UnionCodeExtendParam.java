package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码付扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-04-01 21:16:25
 */
public class UnionCodeExtendParam extends AlipayObject {

	private static final long serialVersionUID = 4146915424783484211L;

	/**
	 * 签约人身份信息
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 外部身份信息类型字符串
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 医保一码付，国家局决策渠道id
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * ip所在的城市（拼音即可）
	 */
	@ApiField("city")
	private String city;

	/**
	 * 用户当前的登录IP
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 外部凭证的生码时间
格式：yyyy-MM-dd HH:mm:ss
2024-03-03 20:39:00
	 */
	@ApiField("code_create_time")
	private String codeCreateTime;

	/**
	 * ip所在的国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 当展码人与签约人为同一个人时，填本人；否则填写展码人与签约人的关系，如子女、父母、夫妻、其他（汉字即可）
	 */
	@ApiField("exhibit_role")
	private String exhibitRole;

	/**
	 * 当展码人与签约人不是同一个人时，填写展码人的证件信息
	 */
	@ApiField("exhibit_role_cert_no")
	private String exhibitRoleCertNo;

	/**
	 * 外部身份证件类型
	 */
	@ApiField("exhibit_role_cert_type")
	private String exhibitRoleCertType;

	/**
	 * 当展码人与签约人不是同一个人时，填写展码人的姓名
	 */
	@ApiField("exhibit_role_name")
	private String exhibitRoleName;

	/**
	 * 设备类型
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * ip所在的省份（拼音即可）
	 */
	@ApiField("province")
	private String province;

	/**
	 * 签约人姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getCodeCreateTime() {
		return this.codeCreateTime;
	}
	public void setCodeCreateTime(String codeCreateTime) {
		this.codeCreateTime = codeCreateTime;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getExhibitRole() {
		return this.exhibitRole;
	}
	public void setExhibitRole(String exhibitRole) {
		this.exhibitRole = exhibitRole;
	}

	public String getExhibitRoleCertNo() {
		return this.exhibitRoleCertNo;
	}
	public void setExhibitRoleCertNo(String exhibitRoleCertNo) {
		this.exhibitRoleCertNo = exhibitRoleCertNo;
	}

	public String getExhibitRoleCertType() {
		return this.exhibitRoleCertType;
	}
	public void setExhibitRoleCertType(String exhibitRoleCertType) {
		this.exhibitRoleCertType = exhibitRoleCertType;
	}

	public String getExhibitRoleName() {
		return this.exhibitRoleName;
	}
	public void setExhibitRoleName(String exhibitRoleName) {
		this.exhibitRoleName = exhibitRoleName;
	}

	public String getMachineType() {
		return this.machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
