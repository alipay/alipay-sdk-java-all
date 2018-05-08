package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.electronicid.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-12 14:10:00
 */
public class AlipayUserElectronicidUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1551872272873389745L;

	/** 
	 * 18位身份证号。用机构的AES加密后值。
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 姓名。用机构的AES加密后值。
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 当前人脸照片。base64。用机构的AES加密后值。
	 */
	@ApiField("picture")
	private String picture;

	/** 
	 * 机构AES秘钥，用商家RSA秘钥加密后的字符串，即数字信封。
	 */
	@ApiField("secret_key")
	private String secretKey;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
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

}
