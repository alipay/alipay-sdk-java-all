package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险干系人
 *
 * @author auto create
 * @since 1.0, 2022-12-14 10:20:36
 */
public class InsPerson extends AlipayObject {

	private static final long serialVersionUID = 3482911292392632188L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 干系人地址区县编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 生日
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 投保参数;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 证件生效日期，提供给银保监会用于实名查验，"yyyy-mm-dd"格式
	 */
	@ApiField("cert_effective_date")
	private String certEffectiveDate;

	/**
	 * 证件失效日期，提供给银保监会用于实名查验，"yyyy-mm-dd"格式，若超过或等于2999-01-01代表长期生效
	 */
	@ApiField("cert_expiration_date")
	private String certExpirationDate;

	/**
	 * 证件上名称;如果渠道账号字段没填则必填
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码;如果渠道账号字段没填则必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型;如果渠道账号字段没填则必填 
100:居民身份证;102:护照;103:军官证;104:士兵证;105:港澳居民往来内地通行证;106:台湾同胞往来大陆通行证;109:警官证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * channel_user_id为支付宝id时对应的openid
	 */
	@ApiField("channel_user_open_id")
	private String channelUserOpenId;

	/**
	 * 渠道账号来源;1:支付宝账号 2:淘宝账号;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 性别;M:男 F:女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 1:卖家；2:支付人;
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * user_id为支付宝id时对应的openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 张三
	 */
	@ApiField("pronounce_name")
	private String pronounceName;

	/**
	 * 支付宝会员ID;如果是投保人则必填
	 */
	@ApiField("user_id")
	private String userId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getCertEffectiveDate() {
		return this.certEffectiveDate;
	}
	public void setCertEffectiveDate(String certEffectiveDate) {
		this.certEffectiveDate = certEffectiveDate;
	}

	public String getCertExpirationDate() {
		return this.certExpirationDate;
	}
	public void setCertExpirationDate(String certExpirationDate) {
		this.certExpirationDate = certExpirationDate;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getChannelUserId() {
		return this.channelUserId;
	}
	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

	public String getChannelUserOpenId() {
		return this.channelUserOpenId;
	}
	public void setChannelUserOpenId(String channelUserOpenId) {
		this.channelUserOpenId = channelUserOpenId;
	}

	public String getChannelUserSource() {
		return this.channelUserSource;
	}
	public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPronounceName() {
		return this.pronounceName;
	}
	public void setPronounceName(String pronounceName) {
		this.pronounceName = pronounceName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
