package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸三要素信息响应
 *
 * @author auto create
 * @since 1.0, 2022-01-22 14:15:56
 */
public class IotIdentityOrgUserSpiResponse extends AlipayObject {

	private static final long serialVersionUID = 8368867663267752456L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，1身份证2护照3学生学号4工号
	 */
	@ApiField("cert_type")
	private Long certType;

	/**
	 * json格式的额外参数
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 证件上的名称
	 */
	@ApiField("name")
	private String name;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Long getCertType() {
		return this.certType;
	}
	public void setCertType(Long certType) {
		this.certType = certType;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
