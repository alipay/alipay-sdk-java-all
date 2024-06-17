package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.role.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:55
 */
public class MybankCreditUserRoleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7689122394646742941L;

	/** 
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，100：身份证；201：全国法人营业执照；2011：全国法人营业执照(多证合一)
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 客户IP_ID
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * 客户的IP_ROLE_ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 参与者类型；1：自然人，2：企业，3：金融机构，4：其它组织
	 */
	@ApiField("ip_type")
	private String ipType;

	/** 
	 * 站点会员
	 */
	@ApiField("site")
	private String site;

	/** 
	 * 站点登录ID
	 */
	@ApiField("site_login_id")
	private String siteLoginId;

	/** 
	 * 站点的会员ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}
	public String getIpId( ) {
		return this.ipId;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setIpType(String ipType) {
		this.ipType = ipType;
	}
	public String getIpType( ) {
		return this.ipType;
	}

	public void setSite(String site) {
		this.site = site;
	}
	public String getSite( ) {
		return this.site;
	}

	public void setSiteLoginId(String siteLoginId) {
		this.siteLoginId = siteLoginId;
	}
	public String getSiteLoginId( ) {
		return this.siteLoginId;
	}

	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}
	public String getSiteUserId( ) {
		return this.siteUserId;
	}

}
