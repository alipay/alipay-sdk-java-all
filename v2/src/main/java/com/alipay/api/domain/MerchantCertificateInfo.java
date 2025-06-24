package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户证件信息
 *
 * @author auto create
 * @since 1.0, 2025-06-17 20:22:08
 */
public class MerchantCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 5231958195441513726L;

	/**
	 * 证件背面url，图片通过通过 ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id
	 */
	@ApiField("back_cert_url")
	private String backCertUrl;

	/**
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 证件url，图片通过通过 ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id
	 */
	@ApiField("cert_url")
	private String certUrl;

	/**
	 * 失效时间 日期格式 yyyy-mm-dd
	 */
	@ApiField("gmt_invalid")
	private String gmtInvalid;

	/**
	 * 生效时间 日期格式 yyyy-mm-dd
	 */
	@ApiField("gmt_valid")
	private String gmtValid;

	public String getBackCertUrl() {
		return this.backCertUrl;
	}
	public void setBackCertUrl(String backCertUrl) {
		this.backCertUrl = backCertUrl;
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
