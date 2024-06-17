package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生证书
 *
 * @author auto create
 * @since 1.0, 2021-01-08 15:51:01
 */
public class StudentCertificate extends AlipayObject {

	private static final long serialVersionUID = 6472263657263228341L;

	/**
	 * 证书大分类
	 */
	@ApiField("cert_category")
	private String certCategory;

	/**
	 * 证书头编码
	 */
	@ApiField("cert_code")
	private String certCode;

	/**
	 * 证书名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 外部证书编码
	 */
	@ApiField("cert_num")
	private String certNum;

	/**
	 * 证书类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 证书描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 过期时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 证书有效期开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 证书图片地址，oss永久地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 证书图片类型，pdf、png、jpg
	 */
	@ApiField("url_type")
	private String urlType;

	public String getCertCategory() {
		return this.certCategory;
	}
	public void setCertCategory(String certCategory) {
		this.certCategory = certCategory;
	}

	public String getCertCode() {
		return this.certCode;
	}
	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNum() {
		return this.certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlType() {
		return this.urlType;
	}
	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

}
