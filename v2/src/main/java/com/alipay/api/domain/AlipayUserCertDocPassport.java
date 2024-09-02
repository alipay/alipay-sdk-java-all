package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证照中心护照
 *
 * @author auto create
 * @since 1.0, 2017-05-25 14:02:44
 */
public class AlipayUserCertDocPassport extends AlipayObject {

	private static final long serialVersionUID = 8395698116254841336L;

	/**
	 * base64编码后的主页照片
	 */
	@ApiField("encoded_img")
	private String encodedImg;

	/**
	 * 失效日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 姓氏，拼音
	 */
	@ApiField("family_name")
	private String familyName;

	/**
	 * 名，拼音
	 */
	@ApiField("given_name")
	private String givenName;

	/**
	 * 证件号码
	 */
	@ApiField("number")
	private String number;

	public String getEncodedImg() {
		return this.encodedImg;
	}
	public void setEncodedImg(String encodedImg) {
		this.encodedImg = encodedImg;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getFamilyName() {
		return this.familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return this.givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
