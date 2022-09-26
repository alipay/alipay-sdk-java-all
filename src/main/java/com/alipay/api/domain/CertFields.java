package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件字段信息
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class CertFields extends AlipayObject {

	private static final long serialVersionUID = 7583325364194666229L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 生日
	 */
	@ApiField("birth")
	private String birth;

	/**
	 * 证件号码
	 */
	@ApiField("certno")
	private String certno;

	/**
	 * 有效期
	 */
	@ApiField("expires")
	private String expires;

	/**
	 * 有效期结束日期
	 */
	@ApiField("expiresend")
	private String expiresend;

	/**
	 * 有效期开始时间
	 */
	@ApiField("expiresstart")
	private String expiresstart;

	/**
	 * 签发机关
	 */
	@ApiField("issuingauthority")
	private String issuingauthority;

	/**
	 * 名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 编号
	 */
	@ApiField("number")
	private String number;

	/**
	 * 民族
	 */
	@ApiField("race")
	private String race;

	/**
	 * 换证次数
	 */
	@ApiField("renewalnum")
	private String renewalnum;

	/**
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return this.birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCertno() {
		return this.certno;
	}
	public void setCertno(String certno) {
		this.certno = certno;
	}

	public String getExpires() {
		return this.expires;
	}
	public void setExpires(String expires) {
		this.expires = expires;
	}

	public String getExpiresend() {
		return this.expiresend;
	}
	public void setExpiresend(String expiresend) {
		this.expiresend = expiresend;
	}

	public String getExpiresstart() {
		return this.expiresstart;
	}
	public void setExpiresstart(String expiresstart) {
		this.expiresstart = expiresstart;
	}

	public String getIssuingauthority() {
		return this.issuingauthority;
	}
	public void setIssuingauthority(String issuingauthority) {
		this.issuingauthority = issuingauthority;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getRace() {
		return this.race;
	}
	public void setRace(String race) {
		this.race = race;
	}

	public String getRenewalnum() {
		return this.renewalnum;
	}
	public void setRenewalnum(String renewalnum) {
		this.renewalnum = renewalnum;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
