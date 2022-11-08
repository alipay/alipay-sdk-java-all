package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.org.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 18:12:40
 */
public class AlipayUserCertifyOrgIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3346875851618146211L;

	/** 
	 * 企业主体证件上记载的地址(详细地址)
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 企业主体证件上记载的经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 企业主体证件上的名称，也就是企业名称
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 企业主体证件的编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 企业主体证件类型，取值:
BUSINESS_LICENSE: 营业执照
INST_RGST_CTF: 事业单位登记证书
COMM_RGST_CTF: 社会团体登记证书
NGO_CTF: 民办非企业单位证书
APRV_FILE: 党政机关批准设计文件
ORG_CERT: 全国组织机构代码证书
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 企业主体证件上记载的地址(市)
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 企业主体证件有效期，格式为yyyyMMdd或者"长期"
	 */
	@ApiField("expiry_date")
	private String expiryDate;

	/** 
	 * 企业主体证件上记载的法定代表人/负责人姓名
	 */
	@ApiField("legal_person_real_name")
	private String legalPersonRealName;

	/** 
	 * 企业主体证件上记载的地址(省份)
	 */
	@ApiField("province")
	private String province;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getBusinessScope( ) {
		return this.businessScope;
	}

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

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getExpiryDate( ) {
		return this.expiryDate;
	}

	public void setLegalPersonRealName(String legalPersonRealName) {
		this.legalPersonRealName = legalPersonRealName;
	}
	public String getLegalPersonRealName( ) {
		return this.legalPersonRealName;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

}
