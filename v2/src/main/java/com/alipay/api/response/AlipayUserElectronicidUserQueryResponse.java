package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.electronicid.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:22
 */
public class AlipayUserElectronicidUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7144911854882627761L;

	/** 
	 * 地址。用机构的AES加密后值。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 出生年月日(yyyyMMdd)。用机构的AES加密后值。
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 18位身份证号。用机构的AES加密后值。
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件本人相片。base64。
	 */
	@ApiField("cert_picture")
	private String certPicture;

	/** 
	 * 性别(男，女)。用机构的AES加密后值。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 姓名。用机构的AES加密后值。
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 民族。用机构的AES加密后值。
	 */
	@ApiField("nation")
	private String nation;

	/** 
	 * 当前人脸照片。base64。用机构的AES加密后值。敏感生物特征默认不输出，如特需请提供相应书面政策法规内容由BD向法务审批。
	 */
	@ApiField("picture")
	private String picture;

	/** 
	 * 机构AES秘钥，用商家RSA秘钥加密后的字符串，即数字信封。
	 */
	@ApiField("secret_key")
	private String secretKey;

	/** 
	 * 签发机关。用机构的AES加密后值。
	 */
	@ApiField("sign_org")
	private String signOrg;

	/** 
	 * 有效期开始(yyyyMMdd)。用机构的AES加密后值。
	 */
	@ApiField("valid_begin_date")
	private String validBeginDate;

	/** 
	 * 有效期截止(yyyyMMdd)。用机构的AES加密后值。
	 */
	@ApiField("valid_end_date")
	private String validEndDate;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday( ) {
		return this.birthday;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertPicture(String certPicture) {
		this.certPicture = certPicture;
	}
	public String getCertPicture( ) {
		return this.certPicture;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNation( ) {
		return this.nation;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPicture( ) {
		return this.picture;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getSecretKey( ) {
		return this.secretKey;
	}

	public void setSignOrg(String signOrg) {
		this.signOrg = signOrg;
	}
	public String getSignOrg( ) {
		return this.signOrg;
	}

	public void setValidBeginDate(String validBeginDate) {
		this.validBeginDate = validBeginDate;
	}
	public String getValidBeginDate( ) {
		return this.validBeginDate;
	}

	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}
	public String getValidEndDate( ) {
		return this.validEndDate;
	}

}
