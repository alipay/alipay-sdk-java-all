package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.info.share response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:49:50
 */
public class AlipayMerchantInfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 3663331185355493449L;

	/** 
	 * 证件地址-具体地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 证件地址-区
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 经营范围，partner_type非个人时存在
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 个人为个人证件号，单位为单位证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 表示证件照片是否存在，目前只针对partner_type为个人【PRIVATE】生效
	 */
	@ApiField("cert_pic_exist")
	private String certPicExist;

	/** 
	 * 企业主体证件类型，取值: BUSINESS_LICENSE: 营业执照 INST_RGST_CTF: 事业单位登记证书 COMM_RGST_CTF: 社会团体登记证书 NGO_CTF: 民办非企业单位证书 APRV_FILE: 党政机关批准设计文件 ORG_CERT: 全国组织机构代码证书
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 证件地址-市
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 个人为个人证件有效期，单位为单位证件有效期。格式为yyyyMMdd或者"长期"
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * 已认证 true，未认证 false
	 */
	@ApiField("is_certified")
	private Boolean isCertified;

	/** 
	 * 个人无，单位为证件上登记的法定代表人/负责人姓名
	 */
	@ApiField("legal_person_real_name")
	private String legalPersonRealName;

	/** 
	 * 个人为个人姓名，单位为单位名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 个人 PRIVATE，
个体户 INDIVIDUAL_BUSINESS，
普通企业 ENTERPRISE，
党政机关 PARTY_AND_STATE_ORGAN，
事业单位 PUBLIC_INSTITUTION，
社会组织 SOCIAL_ORGANIZATION，
其他 OTHER
	 */
	@ApiField("partner_type")
	private String partnerType;

	/** 
	 * 证件地址-省份
	 */
	@ApiField("province")
	private String province;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea( ) {
		return this.area;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getBusinessScope( ) {
		return this.businessScope;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertPicExist(String certPicExist) {
		this.certPicExist = certPicExist;
	}
	public String getCertPicExist( ) {
		return this.certPicExist;
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

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getExpireDate( ) {
		return this.expireDate;
	}

	public void setIsCertified(Boolean isCertified) {
		this.isCertified = isCertified;
	}
	public Boolean getIsCertified( ) {
		return this.isCertified;
	}

	public void setLegalPersonRealName(String legalPersonRealName) {
		this.legalPersonRealName = legalPersonRealName;
	}
	public String getLegalPersonRealName( ) {
		return this.legalPersonRealName;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}
	public String getPartnerType( ) {
		return this.partnerType;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

}
