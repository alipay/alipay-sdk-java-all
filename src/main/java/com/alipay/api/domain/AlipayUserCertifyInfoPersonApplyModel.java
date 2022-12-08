package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝个人认证信息申请接口
 *
 * @author auto create
 * @since 1.0, 2022-11-08 15:19:47
 */
public class AlipayUserCertifyInfoPersonApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5218946413343667737L;

	/**
	 * 用户详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 用于识别是哪个业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 证件过期时间
	 */
	@ApiField("cert_expired_date")
	private String certExpiredDate;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型,例如身份证类型是IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 证件ID，标识证件档案中心的一次采集流水ID
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 用户住址的城市名称
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家信息
	 */
	@ApiField("country")
	private String country;

	/**
	 * 证件人像页图片SFS地址
	 */
	@ApiField("face_url")
	private String faceUrl;

	/**
	 * 用户联系手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用户在应用（AppId）下的用户唯一标识。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户地址的省份信息
	 */
	@ApiField("province")
	private String province;

	/**
	 * 男性：m,女性：f
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 国微页图片SFS地址，如果非身份证类型，可不必传(例如护照，没有此页)
	 */
	@ApiField("verso_url")
	private String versoUrl;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getCertExpiredDate() {
		return this.certExpiredDate;
	}
	public void setCertExpiredDate(String certExpiredDate) {
		this.certExpiredDate = certExpiredDate;
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

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFaceUrl() {
		return this.faceUrl;
	}
	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVersoUrl() {
		return this.versoUrl;
	}
	public void setVersoUrl(String versoUrl) {
		this.versoUrl = versoUrl;
	}

}
