package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证件信息
 *
 * @author auto create
 * @since 1.0, 2025-03-11 11:07:56
 */
public class CertificateInfoForEntry extends AlipayObject {

	private static final long serialVersionUID = 4556641179411311213L;

	/**
	 * 经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

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

	/**
	 * 注册地址
	 */
	@ApiField("reg_capital")
	private String regCapital;

	public String getBusinessScope() {
		return this.businessScope;
	}
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
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

	public String getRegCapital() {
		return this.regCapital;
	}
	public void setRegCapital(String regCapital) {
		this.regCapital = regCapital;
	}

}
