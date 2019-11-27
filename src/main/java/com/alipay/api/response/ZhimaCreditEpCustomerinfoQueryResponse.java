package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.customerinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditEpCustomerinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7331263771356639533L;

	/** 
	 * 企业法人证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 企业法人姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 企业证件号
	 */
	@ApiField("org_cert_no")
	private String orgCertNo;

	/** 
	 * 企业名称
	 */
	@ApiField("org_name")
	private String orgName;

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

	public void setOrgCertNo(String orgCertNo) {
		this.orgCertNo = orgCertNo;
	}
	public String getOrgCertNo( ) {
		return this.orgCertNo;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgName( ) {
		return this.orgName;
	}

}
