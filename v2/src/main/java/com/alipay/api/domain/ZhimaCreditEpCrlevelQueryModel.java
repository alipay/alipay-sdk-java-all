package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业信用CR等级
 *
 * @author auto create
 * @since 1.0, 2023-06-29 09:04:57
 */
public class ZhimaCreditEpCrlevelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7651681236822699137L;

	/**
	 * 外部授权记录编号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 外部授权记录URL链接
	 */
	@ApiField("auth_url")
	private String authUrl;

	/**
	 * 企业法人证件号
	 */
	@ApiField("cognizant_cert_no")
	private String cognizantCertNo;

	/**
	 * 法定代表人姓名
	 */
	@ApiField("cognizant_name")
	private String cognizantName;

	/**
	 * 企业社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getAuthUrl() {
		return this.authUrl;
	}
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	public String getCognizantCertNo() {
		return this.cognizantCertNo;
	}
	public void setCognizantCertNo(String cognizantCertNo) {
		this.cognizantCertNo = cognizantCertNo;
	}

	public String getCognizantName() {
		return this.cognizantName;
	}
	public void setCognizantName(String cognizantName) {
		this.cognizantName = cognizantName;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

}
