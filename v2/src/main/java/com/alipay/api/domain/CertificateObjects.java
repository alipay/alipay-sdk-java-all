package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-18 13:32:36
 */
public class CertificateObjects extends AlipayObject {

	private static final long serialVersionUID = 3322572582952859449L;

	/**
	 * 若证书类型为资格证书，则必要
中华人民共和国文化和旅游部
	 */
	@ApiField("authority")
	private String authority;

	/**
	 * 证书Id
	 */
	@ApiField("certificate_code")
	private String certificateCode;

	/**
	 * 证书名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 证书对应工种
	 */
	@ApiField("profession")
	private String profession;

	/**
	 * 证书类型
	 */
	@ApiField("type")
	private String type;

	public String getAuthority() {
		return this.authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getCertificateCode() {
		return this.certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return this.profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
