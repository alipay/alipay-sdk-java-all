package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家证件信息
 *
 * @author auto create
 * @since 1.0, 2024-09-05 11:58:30
 */
public class MdCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 5734122354183967985L;

	/**
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号的具体值
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件的类型，如身份证、营业执照号等
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 证件正面图片地址
	 */
	@ApiField("cert_url")
	private String certUrl;

	/**
	 * 格式为 mmnn/yy/dd
	 */
	@ApiField("gmt_invalid")
	private String gmtInvalid;

	/**
	 * 格式为 mmnn/yy/dd
	 */
	@ApiField("gmt_valid")
	private String gmtValid;

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

	public String getCertUrl() {
		return this.certUrl;
	}
	public void setCertUrl(String certUrl) {
		this.certUrl = certUrl;
	}

	public String getGmtInvalid() {
		return this.gmtInvalid;
	}
	public void setGmtInvalid(String gmtInvalid) {
		this.gmtInvalid = gmtInvalid;
	}

	public String getGmtValid() {
		return this.gmtValid;
	}
	public void setGmtValid(String gmtValid) {
		this.gmtValid = gmtValid;
	}

}
