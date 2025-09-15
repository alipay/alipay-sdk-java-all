package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证件信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:07:17
 */
public class BizOpenCertificateInfoForEntry extends AlipayObject {

	private static final long serialVersionUID = 6163797141482683827L;

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
	 * 证件图片类型
	 */
	@ApiField("cert_pic_url_type")
	private String certPicUrlType;

	/**
	 * 证件图片地址
	 */
	@ApiListField("cert_pic_urls")
	@ApiField("string")
	private List<String> certPicUrls;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 失效时间
	 */
	@ApiField("gmt_invalid")
	private String gmtInvalid;

	/**
	 * 生效时间
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

	public String getCertPicUrlType() {
		return this.certPicUrlType;
	}
	public void setCertPicUrlType(String certPicUrlType) {
		this.certPicUrlType = certPicUrlType;
	}

	public List<String> getCertPicUrls() {
		return this.certPicUrls;
	}
	public void setCertPicUrls(List<String> certPicUrls) {
		this.certPicUrls = certPicUrls;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
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
